package typingsSlinky.reactSketchapp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedBoxProps extends StObject {
  
  /** A JavaScript Error object */
  var error: js.Error = js.native
}
object RedBoxProps {
  
  @scala.inline
  def apply(error: js.Error): RedBoxProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedBoxProps]
  }
  
  @scala.inline
  implicit class RedBoxPropsMutableBuilder[Self <: RedBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
