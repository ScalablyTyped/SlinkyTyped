package typingsSlinky.monacoEditor.anon

import typingsSlinky.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  var target: Uri = js.native
  
  var value: String = js.native
}
object Target {
  
  @scala.inline
  def apply(target: Uri, value: String): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: Uri): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
