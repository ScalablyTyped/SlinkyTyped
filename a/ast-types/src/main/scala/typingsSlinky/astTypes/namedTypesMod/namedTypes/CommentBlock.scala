package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentBlock
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsSlinky.astTypes.astTypesStrings.CommentBlock = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentBlock")
@js.native
object CommentBlock extends TopLevel[Type[CommentBlock]]

