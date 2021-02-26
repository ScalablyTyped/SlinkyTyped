package typingsSlinky.ink

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorOverviewMod extends Shortcut {
  
  @JSImport("ink/build/components/ErrorOverview", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    val error: js.Error = js.native
  }
  object Props {
    
    @scala.inline
    def apply(error: js.Error): Props = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[Props]
  
  /* This means you don't have to write `default`, but can instead just say `errorOverviewMod.foo` */
  override def _to: ReactComponentClass[Props] = default
}
