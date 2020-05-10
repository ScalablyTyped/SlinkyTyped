package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.constructor
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.method
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FunctionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'body'> */
@js.native
trait ClassPrivateMethod
  extends ASTNode
     with DeclarationKind
     with FunctionKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `abstract`: js.UndefOr[Boolean | Null] = js.native
  var access: js.UndefOr[public | `private` | `protected` | Null] = js.native
  var accessibility: js.UndefOr[public | `private` | `protected` | Null] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var body: BlockStatementKind = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var computed: js.UndefOr[Boolean] = js.native
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.native
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.native
  var expression: js.UndefOr[Boolean] = js.native
  var generator: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[IdentifierKind] = js.native
  var key: PrivateNameKind = js.native
  var kind: js.UndefOr[get | set | method | constructor] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var optional: js.UndefOr[Boolean | Null] = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: js.UndefOr[IdentifierKind] = js.native
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.native
  var static: js.UndefOr[Boolean | Null] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateMethod = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateMethod")
@js.native
object ClassPrivateMethod extends TopLevel[Type[ClassPrivateMethod]]

