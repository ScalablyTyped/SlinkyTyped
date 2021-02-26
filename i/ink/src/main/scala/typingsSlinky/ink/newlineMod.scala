package typingsSlinky.ink

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newlineMod extends Shortcut {
  
  /**
    * Adds one or more newline (\n) characters. Must be used within <Text> components.
    */
  @JSImport("ink/build/components/Newline", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Number of newlines to insert.
      *
      * @default 1
      */
    val count: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[Props]
  
  /* This means you don't have to write `default`, but can instead just say `newlineMod.foo` */
  override def _to: ReactComponentClass[Props] = default
}
