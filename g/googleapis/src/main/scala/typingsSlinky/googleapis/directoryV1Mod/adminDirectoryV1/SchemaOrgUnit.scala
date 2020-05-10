package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Org Unit resource in Directory API.
  */
@js.native
trait SchemaOrgUnit extends js.Object {
  /**
    * Should block inheritance
    */
  var blockInheritance: js.UndefOr[Boolean] = js.native
  /**
    * Description of OrgUnit
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of OrgUnit
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Id of OrgUnit
    */
  var orgUnitId: js.UndefOr[String] = js.native
  /**
    * Path of OrgUnit
    */
  var orgUnitPath: js.UndefOr[String] = js.native
  /**
    * Id of parent OrgUnit
    */
  var parentOrgUnitId: js.UndefOr[String] = js.native
  /**
    * Path of parent OrgUnit
    */
  var parentOrgUnitPath: js.UndefOr[String] = js.native
}

object SchemaOrgUnit {
  @scala.inline
  def apply(): SchemaOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnit]
  }
  @scala.inline
  implicit class SchemaOrgUnitOps[Self <: SchemaOrgUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockInheritance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockInheritance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockInheritance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockInheritance")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnitPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitPath")(js.undefined)
        ret
    }
    @scala.inline
    def withParentOrgUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentOrgUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentOrgUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentOrgUnitId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentOrgUnitPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentOrgUnitPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentOrgUnitPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentOrgUnitPath")(js.undefined)
        ret
    }
  }
  
}

