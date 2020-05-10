package typingsSlinky.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildRelationship extends js.Object {
  var cascadeDelete: Boolean = js.native
  var childSObject: String = js.native
  var deprecatedAndHidden: Boolean = js.native
  var field: String = js.native
  var junctionIdListNames: js.Array[String] = js.native
  var junctionReferenceTo: js.Array[String] = js.native
  var relationshipName: js.UndefOr[maybe[String]] = js.native
  var restrictedDelete: Boolean = js.native
}

object ChildRelationship {
  @scala.inline
  def apply(
    cascadeDelete: Boolean,
    childSObject: String,
    deprecatedAndHidden: Boolean,
    field: String,
    junctionIdListNames: js.Array[String],
    junctionReferenceTo: js.Array[String],
    restrictedDelete: Boolean
  ): ChildRelationship = {
    val __obj = js.Dynamic.literal(cascadeDelete = cascadeDelete.asInstanceOf[js.Any], childSObject = childSObject.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], junctionIdListNames = junctionIdListNames.asInstanceOf[js.Any], junctionReferenceTo = junctionReferenceTo.asInstanceOf[js.Any], restrictedDelete = restrictedDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRelationship]
  }
  @scala.inline
  implicit class ChildRelationshipOps[Self <: ChildRelationship] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascadeDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildSObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childSObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedAndHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedAndHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJunctionIdListNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("junctionIdListNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJunctionReferenceTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("junctionReferenceTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictedDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationshipName(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationshipName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipName")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationshipNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationshipName")(null)
        ret
    }
  }
  
}

