package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TSModuleBlockKind
import typingsSlinky.astTypes.kindsMod.TSModuleDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
@js.native
trait TSModuleDeclaration extends ASTNode {
  var body: TSModuleBlockKind | TSModuleDeclarationKind | Null = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var declare: Boolean = js.native
  var global: Boolean = js.native
  var id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSModuleDeclaration = js.native
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    declare: Boolean,
    global: Boolean,
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSModuleDeclaration
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration]
  }
  @scala.inline
  implicit class TSModuleDeclarationOps[Self <: TSModuleDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: StringLiteralKind | IdentifierKind | TSQualifiedNameKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.astTypes.astTypesStrings.TSModuleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: TSModuleBlockKind | TSModuleDeclarationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
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
  }
  
}

