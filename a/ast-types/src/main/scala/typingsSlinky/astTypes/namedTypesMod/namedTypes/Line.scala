package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsSlinky.astTypes.astTypesStrings.Line = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Line")
@js.native
object Line extends TopLevel[Type[Line]]

