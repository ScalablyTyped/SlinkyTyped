package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.astTypesStrings.`type`
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportSpecifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  var importKind: js.UndefOr[value | `type`] = js.native
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  var source: LiteralKind = js.native
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.native
}

object ImportKind {
  @scala.inline
  def apply(source: LiteralKind): ImportKind = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKind]
  }
  @scala.inline
  implicit class ImportKindOps[Self <: ImportKind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: LiteralKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[CommentKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(null)
        ret
    }
    @scala.inline
    def withImportKind(value: value | `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importKind")(js.undefined)
        ret
    }
    @scala.inline
    def withLoc(value: SourceLocationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withLocNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(null)
        ret
    }
    @scala.inline
    def withSpecifiers(value: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specifiers")(js.undefined)
        ret
    }
  }
  
}

