package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridResponsiveMethods extends StObject {
  
  /**
    * Destroys the responsive widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the currently active responsive mode.
    */
  def getCurrentResponsiveMode(): Unit = js.native
}
object IgGridResponsiveMethods {
  
  @scala.inline
  def apply(destroy: () => Unit, getCurrentResponsiveMode: () => Unit): IgGridResponsiveMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getCurrentResponsiveMode = js.Any.fromFunction0(getCurrentResponsiveMode))
    __obj.asInstanceOf[IgGridResponsiveMethods]
  }
  
  @scala.inline
  implicit class IgGridResponsiveMethodsMutableBuilder[Self <: IgGridResponsiveMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentResponsiveMode(value: () => Unit): Self = StObject.set(x, "getCurrentResponsiveMode", js.Any.fromFunction0(value))
  }
}
