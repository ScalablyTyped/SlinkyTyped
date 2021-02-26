package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
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
object CommentLine {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.CommentLine")
  @js.native
  val ^ : Type[CommentLine] = js.native
  
  @scala.inline
  implicit class CommentLineMutableBuilder[Self <: CommentLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.CommentLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
