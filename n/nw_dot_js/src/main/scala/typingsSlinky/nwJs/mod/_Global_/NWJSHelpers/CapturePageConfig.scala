package typingsSlinky.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for nw.Window.get().capturePage().
  */
@js.native
trait CapturePageConfig extends js.Object {
  /**
    *  (Optional) It supports three types: "raw", "buffer" and "datauri". If ignored, it’s "datauri" by default.
    */
  var datatype: js.UndefOr[String] = js.native
  /**
    * (Optional) The image format used to generate the image. It supports two formats: "png" and "jpeg". If ignored, it’s "jpeg" by default.
    */
  var format: js.UndefOr[String] = js.native
}

object CapturePageConfig {
  @scala.inline
  def apply(): CapturePageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapturePageConfig]
  }
  @scala.inline
  implicit class CapturePageConfigOps[Self <: CapturePageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatatype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

