package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait SchemaImageConfig extends js.Object {
  /**
    * If true, all text found in the image is redacted.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
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
    def withRedactAllText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactAllText")(js.undefined)
        ret
    }
  }
  
}

