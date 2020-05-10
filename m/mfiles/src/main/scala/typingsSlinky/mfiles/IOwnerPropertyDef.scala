package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFDependencyRelation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOwnerPropertyDef extends js.Object {
  var DependencyRelation: MFDependencyRelation = js.native
  var ID: Double = js.native
  var IndexForAutomaticFilling: Double = js.native
  val IsRelationFiltering: Boolean = js.native
}

object IOwnerPropertyDef {
  @scala.inline
  def apply(
    DependencyRelation: MFDependencyRelation,
    ID: Double,
    IndexForAutomaticFilling: Double,
    IsRelationFiltering: Boolean
  ): IOwnerPropertyDef = {
    val __obj = js.Dynamic.literal(DependencyRelation = DependencyRelation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IndexForAutomaticFilling = IndexForAutomaticFilling.asInstanceOf[js.Any], IsRelationFiltering = IsRelationFiltering.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOwnerPropertyDef]
  }
  @scala.inline
  implicit class IOwnerPropertyDefOps[Self <: IOwnerPropertyDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencyRelation(value: MFDependencyRelation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DependencyRelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexForAutomaticFilling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexForAutomaticFilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRelationFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRelationFiltering")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

