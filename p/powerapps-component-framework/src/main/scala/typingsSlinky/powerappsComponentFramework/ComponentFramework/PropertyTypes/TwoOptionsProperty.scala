package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.TwoOptionMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is TwoOptions
		 */
@js.native
trait TwoOptionsProperty extends Property {
  var attributes: js.UndefOr[TwoOptionMetadata] = js.native
  @JSName("raw")
  var raw_TwoOptionsProperty: Boolean = js.native
}

object TwoOptionsProperty {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, raw: Boolean, `type`: String): TwoOptionsProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoOptionsProperty]
  }
  @scala.inline
  implicit class TwoOptionsPropertyOps[Self <: TwoOptionsProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: TwoOptionMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
  }
  
}

