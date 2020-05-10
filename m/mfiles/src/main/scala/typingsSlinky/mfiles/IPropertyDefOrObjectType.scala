package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyDefOrObjectType extends js.Object {
  var ID: Double = js.native
  var PropertyDef: Boolean = js.native
  def Clone(): IPropertyDefOrObjectType = js.native
  def GetAsExpression(): IExpression = js.native
}

object IPropertyDefOrObjectType {
  @scala.inline
  def apply(
    Clone: () => IPropertyDefOrObjectType,
    GetAsExpression: () => IExpression,
    ID: Double,
    PropertyDef: Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsExpression = js.Any.fromFunction0(GetAsExpression), ID = ID.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
  @scala.inline
  implicit class IPropertyDefOrObjectTypeOps[Self <: IPropertyDefOrObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyDefOrObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAsExpression(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

