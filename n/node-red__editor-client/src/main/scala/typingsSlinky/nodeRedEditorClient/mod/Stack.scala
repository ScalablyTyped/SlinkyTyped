package typingsSlinky.nodeRedEditorClient.mod

import typingsSlinky.nodeRedEditorClient.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stack extends StObject {
  
  def create(options: Fill): StackInstance = js.native
}
object Stack {
  
  @scala.inline
  def apply(create: Fill => StackInstance): Stack = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Stack]
  }
  
  @scala.inline
  implicit class StackMutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Fill => StackInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
