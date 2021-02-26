package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.Line = js.native
}
object Line {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Line")
  @js.native
  val ^ : Type[Line] = js.native
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.Line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
