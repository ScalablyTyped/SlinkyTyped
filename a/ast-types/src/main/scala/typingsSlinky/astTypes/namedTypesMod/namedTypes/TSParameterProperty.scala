package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.`private`
import typingsSlinky.astTypes.astTypesStrings.`protected`
import typingsSlinky.astTypes.astTypesStrings.public
import typingsSlinky.astTypes.kindsMod.AssignmentPatternKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
@js.native
trait TSParameterProperty
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var parameter: IdentifierKind | AssignmentPatternKind = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSParameterProperty = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSParameterProperty")
@js.native
object TSParameterProperty extends TopLevel[Type[TSParameterProperty]]

