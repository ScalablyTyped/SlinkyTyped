package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A workspace entity that may represent a tag, trigger, variable, or folder
  * in addition to its status in the workspace.
  */
@js.native
trait SchemaEntity extends js.Object {
  /**
    * Represents how the entity has been changed in the workspace.
    */
  var changeStatus: js.UndefOr[String] = js.native
  /**
    * The Folder being represented by the entity.
    */
  var folder: js.UndefOr[SchemaFolder] = js.native
  /**
    * The tag being represented by the entity.
    */
  var tag: js.UndefOr[SchemaTag] = js.native
  /**
    * The trigger being represented by the entity.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.native
  /**
    * The variable being represented by the entity.
    */
  var variable: js.UndefOr[SchemaVariable] = js.native
}

object SchemaEntity {
  @scala.inline
  def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  @scala.inline
  implicit class SchemaEntityOps[Self <: SchemaEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFolder(value: SchemaFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: SchemaTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: SchemaTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: SchemaVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

