package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentBlock
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.CommentBlock = js.native
}
object CommentBlock {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.CommentBlock")
  @js.native
  val ^ : Type[CommentBlock] = js.native
  
  @scala.inline
  implicit class CommentBlockMutableBuilder[Self <: CommentBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.CommentBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
