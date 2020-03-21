package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.PrivateNameKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ClassProperty, 'type' | 'key' | 'value'> */
trait ClassPrivateProperty
  extends ASTNode
     with ClassPropertyKind
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: PrivateNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateProperty
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  var value: js.UndefOr[ExpressionKind | Null] = js.undefined
  var variance: js.UndefOr[VarianceKind | plus | minus] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateProperty")
@js.native
object ClassPrivateProperty extends TopLevel[Type[ClassPrivateProperty]]

