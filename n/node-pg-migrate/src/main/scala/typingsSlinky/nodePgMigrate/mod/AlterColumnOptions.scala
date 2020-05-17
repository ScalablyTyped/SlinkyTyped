package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.anon.precedenceALWAYSBYDEFAULT
import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterColumnOptions extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.native
  var collation: js.UndefOr[String] = js.native
  var comment: js.UndefOr[String | Null] = js.native
  var default: js.UndefOr[Value] = js.native
  var generated: js.UndefOr[Null | `false` | precedenceALWAYSBYDEFAULT] = js.native
  var notNull: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var using: js.UndefOr[String] = js.native
}

object AlterColumnOptions {
  @scala.inline
  def apply(): AlterColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterColumnOptions]
  }
  @scala.inline
  implicit class AlterColumnOptionsOps[Self <: AlterColumnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(js.undefined)
        ret
    }
    @scala.inline
    def withCollation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(null)
        ret
    }
    @scala.inline
    def withDefault(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(null)
        ret
    }
    @scala.inline
    def withGenerated(value: `false` | precedenceALWAYSBYDEFAULT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generated")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generated")(null)
        ret
    }
    @scala.inline
    def withNotNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notNull")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(js.undefined)
        ret
    }
  }
  
}

