package typingsSlinky.loadableWebpackPlugin.mod

import typingsSlinky.loadableWebpackPlugin.anon.Filename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  /**
    * The stats filename.
    *
    * @default loadable-stats.json
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * @default true
    */
  var outputAsset: js.UndefOr[Boolean] = js.native
  /**
    * Always write stats file to disk.
    *
    * @default false
    */
  var writeToDisk: js.UndefOr[Boolean | Filename] = js.native
}

object PluginOptions {
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
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
    def withOutputAsset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAsset")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteToDisk(value: Boolean | Filename): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteToDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(js.undefined)
        ret
    }
  }
  
}

