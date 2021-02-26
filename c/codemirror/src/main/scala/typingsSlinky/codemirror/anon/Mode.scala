package typingsSlinky.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends StObject {
  
  var mode: typingsSlinky.codemirror.mod.Mode[_] = js.native
  
  var state: js.Any = js.native
}
object Mode {
  
  @scala.inline
  def apply(mode: typingsSlinky.codemirror.mod.Mode[_], state: js.Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: typingsSlinky.codemirror.mod.Mode[_]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
