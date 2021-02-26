package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterViewInit extends StObject {
  
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of a component's view.
    * It is invoked only once when the view is instantiated.
    *
    */
  def ngAfterViewInit(): Unit = js.native
}
object AfterViewInit {
  
  @scala.inline
  def apply(ngAfterViewInit: () => Unit): AfterViewInit = {
    val __obj = js.Dynamic.literal(ngAfterViewInit = js.Any.fromFunction0(ngAfterViewInit))
    __obj.asInstanceOf[AfterViewInit]
  }
  
  @scala.inline
  implicit class AfterViewInitMutableBuilder[Self <: AfterViewInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgAfterViewInit(value: () => Unit): Self = StObject.set(x, "ngAfterViewInit", js.Any.fromFunction0(value))
  }
}
