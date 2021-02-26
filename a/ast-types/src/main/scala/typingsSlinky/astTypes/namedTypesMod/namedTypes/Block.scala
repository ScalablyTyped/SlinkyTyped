package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.Block = js.native
}
object Block {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Block")
  @js.native
  val ^ : Type[Block] = js.native
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.Block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
