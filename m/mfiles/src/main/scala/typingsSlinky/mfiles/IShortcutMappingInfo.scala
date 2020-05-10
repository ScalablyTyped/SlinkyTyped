package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShortcutMappingInfo extends js.Object {
  var ObjectTypeGUID: String = js.native
  var ObjectTypeID: Double = js.native
  var ObjectTypeName: String = js.native
  var ObjectTypeSemanticAliases: ISemanticAliases = js.native
}

object IShortcutMappingInfo {
  @scala.inline
  def apply(
    ObjectTypeGUID: String,
    ObjectTypeID: Double,
    ObjectTypeName: String,
    ObjectTypeSemanticAliases: ISemanticAliases
  ): IShortcutMappingInfo = {
    val __obj = js.Dynamic.literal(ObjectTypeGUID = ObjectTypeGUID.asInstanceOf[js.Any], ObjectTypeID = ObjectTypeID.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any], ObjectTypeSemanticAliases = ObjectTypeSemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutMappingInfo]
  }
  @scala.inline
  implicit class IShortcutMappingInfoOps[Self <: IShortcutMappingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectTypeGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeSemanticAliases(value: ISemanticAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeSemanticAliases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

