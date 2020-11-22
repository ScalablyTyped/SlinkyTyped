package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentLine
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.CommentLine = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentLine")
@js.native
object CommentLine extends TopLevel[Type[CommentLine]]
