package typingsSlinky.pkijs.otherKeyAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherKeyAttribute extends js.Object {
  var keyAttr: js.Any = js.native
  var keyAttrId: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object OtherKeyAttribute {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyAttr: js.Any,
    keyAttrId: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherKeyAttribute = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyAttr = keyAttr.asInstanceOf[js.Any], keyAttrId = keyAttrId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherKeyAttribute]
  }
  @scala.inline
  implicit class OtherKeyAttributeOps[Self <: OtherKeyAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyAttr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAttrId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAttrId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

