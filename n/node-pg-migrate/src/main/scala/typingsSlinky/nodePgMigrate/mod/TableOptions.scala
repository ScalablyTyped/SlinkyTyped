package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
  var comment: js.UndefOr[String | Null] = js.native
  var constraints: js.UndefOr[ConstraintOptions] = js.native
  var ifNotExists: js.UndefOr[Boolean] = js.native
  var inherits: js.UndefOr[Name] = js.native
  var like: js.UndefOr[Name | Options] = js.native
  var temporary: js.UndefOr[Boolean] = js.native
}

object TableOptions {
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConstraints(value: ConstraintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withIfNotExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfNotExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(js.undefined)
        ret
    }
    @scala.inline
    def withInherits(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(js.undefined)
        ret
    }
    @scala.inline
    def withLike(value: Name | Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporary")(js.undefined)
        ret
    }
  }
  
}

