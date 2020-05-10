package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is Enum
		 */
@js.native
trait EnumProperty[EnumType] extends js.Object {
  var raw: EnumType = js.native
  var `type`: String = js.native
}

object EnumProperty {
  @scala.inline
  def apply[EnumType](raw: EnumType, `type`: String): EnumProperty[EnumType] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumProperty[EnumType]]
  }
  @scala.inline
  implicit class EnumPropertyOps[Self[enumtype] <: EnumProperty[enumtype], EnumType] (val x: Self[EnumType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EnumType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EnumType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EnumType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EnumType] with Other]
    @scala.inline
    def withRaw(value: EnumType): Self[EnumType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[EnumType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

