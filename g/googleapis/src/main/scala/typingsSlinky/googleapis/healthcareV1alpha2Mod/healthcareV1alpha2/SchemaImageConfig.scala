package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait SchemaImageConfig extends js.Object {
  /**
    * Determines how to redact text from image.
    */
  var textRedactionMode: js.UndefOr[String] = js.native
}

object SchemaImageConfig {
  @scala.inline
  def apply(): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfig]
  }
  @scala.inline
  implicit class SchemaImageConfigOps[Self <: SchemaImageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextRedactionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRedactionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRedactionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRedactionMode")(js.undefined)
        ret
    }
  }
  
}

