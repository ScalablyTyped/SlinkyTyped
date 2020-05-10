package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.FULL
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencesOptions extends js.Object {
  var `match`: js.UndefOr[FULL | SIMPLE] = js.native
  var onDelete: js.UndefOr[Action] = js.native
  var onUpdate: js.UndefOr[Action] = js.native
  var references: js.UndefOr[Name] = js.native
  var referencesConstraintComment: js.UndefOr[String] = js.native
  var referencesConstraintName: js.UndefOr[String] = js.native
}

object ReferencesOptions {
  @scala.inline
  def apply(): ReferencesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferencesOptions]
  }
  @scala.inline
  implicit class ReferencesOptionsOps[Self <: ReferencesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatch(value: FULL | SIMPLE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDelete(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencesConstraintComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesConstraintComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencesConstraintComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesConstraintComment")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencesConstraintName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesConstraintName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencesConstraintName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesConstraintName")(js.undefined)
        ret
    }
  }
  
}

