package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.OptionSetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is OptionSet
		 */
@js.native
trait OptionSetProperty extends Property {
  var attributes: js.UndefOr[OptionSetMetadata] = js.native
  @JSName("raw")
  var raw_OptionSetProperty: Double | Null = js.native
}

object OptionSetProperty {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, `type`: String): OptionSetProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionSetProperty]
  }
  @scala.inline
  implicit class OptionSetPropertyOps[Self <: OptionSetProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: OptionSetMetadata): Self = {
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
    @scala.inline
    def withRaw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(null)
        ret
    }
  }
  
}

