package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.NoopKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TSHasOptionalTypeParametersKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeParameters */
@js.native
trait TSDeclareMethod
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeParametersKind {
  var `abstract`: js.UndefOr[Boolean] = js.native
  var access: js.UndefOr[public | `private` | `protected`] = js.native
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var computed: js.UndefOr[Boolean] = js.native
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.native
  var generator: js.UndefOr[Boolean] = js.native
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind = js.native
  var kind: js.UndefOr[get | set | method | constructor] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var params: js.Array[PatternKind] = js.native
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSDeclareMethod = js.native
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSDeclareMethod")
@js.native
object TSDeclareMethod extends TopLevel[Type[TSDeclareMethod]]

