package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTypeColumnMapping extends js.Object {
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var Ordinal: Double = js.native
  var PartOfInsert: Boolean = js.native
  var PartOfUpdate: Boolean = js.native
  var SourceField: String = js.native
  var TargetPropertyDef: Double = js.native
  var Type: Double = js.native
  def Clone(): IObjectTypeColumnMapping = js.native
}

object IObjectTypeColumnMapping {
  @scala.inline
  def apply(
    Clone: () => IObjectTypeColumnMapping,
    ObjectType: MFBuiltInObjectType | Double,
    Ordinal: Double,
    PartOfInsert: Boolean,
    PartOfUpdate: Boolean,
    SourceField: String,
    TargetPropertyDef: Double,
    Type: Double
  ): IObjectTypeColumnMapping = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjectType = ObjectType.asInstanceOf[js.Any], Ordinal = Ordinal.asInstanceOf[js.Any], PartOfInsert = PartOfInsert.asInstanceOf[js.Any], PartOfUpdate = PartOfUpdate.asInstanceOf[js.Any], SourceField = SourceField.asInstanceOf[js.Any], TargetPropertyDef = TargetPropertyDef.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeColumnMapping]
  }
  @scala.inline
  implicit class IObjectTypeColumnMappingOps[Self <: IObjectTypeColumnMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjectTypeColumnMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjectType(value: MFBuiltInObjectType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrdinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ordinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartOfInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartOfInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartOfUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartOfUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPropertyDef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetPropertyDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

