package typingsSlinky.awsSdk.iniLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadFileOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var isConfig: js.UndefOr[Boolean] = js.native
}

object LoadFileOptions {
  @scala.inline
  def apply(): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadFileOptions]
  }
  @scala.inline
  implicit class LoadFileOptionsOps[Self <: LoadFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfig")(js.undefined)
        ret
    }
  }
  
}

