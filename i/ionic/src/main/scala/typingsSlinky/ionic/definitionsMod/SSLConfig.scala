package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLConfig extends js.Object {
  var cafile: js.UndefOr[String | js.Array[String]] = js.native
  var certfile: js.UndefOr[String | js.Array[String]] = js.native
  var keyfile: js.UndefOr[String | js.Array[String]] = js.native
}

object SSLConfig {
  @scala.inline
  def apply(): SSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfig]
  }
  @scala.inline
  implicit class SSLConfigOps[Self <: SSLConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCafile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cafile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCafile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cafile")(js.undefined)
        ret
    }
    @scala.inline
    def withCertfile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certfile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyfile(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyfile")(js.undefined)
        ret
    }
  }
  
}

