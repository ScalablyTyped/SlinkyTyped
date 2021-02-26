package typingsSlinky.reactToastify

import typingsSlinky.reactToastify.anon.Collection
import typingsSlinky.reactToastify.typesMod.Id
import typingsSlinky.reactToastify.typesMod.Toast
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useToastContainerMod {
  
  @JSImport("react-toastify/dist/hooks/useToastContainer", "useToastContainer")
  @js.native
  def useToastContainer(props: ToastContainerProps): Collection = js.native
  
  @js.native
  trait ContainerInstance extends StObject {
    
    var containerId: js.UndefOr[Id | Null] = js.native
    
    var displayedToast: Double = js.native
    
    def getToast(id: Id): Toast | Null = js.native
    
    def isToastActive(toastId: Id): Boolean = js.native
    
    var props: ToastContainerProps = js.native
    
    var toastKey: Double = js.native
  }
  object ContainerInstance {
    
    @scala.inline
    def apply(
      displayedToast: Double,
      getToast: Id => Toast | Null,
      isToastActive: Id => Boolean,
      props: ToastContainerProps,
      toastKey: Double
    ): ContainerInstance = {
      val __obj = js.Dynamic.literal(displayedToast = displayedToast.asInstanceOf[js.Any], getToast = js.Any.fromFunction1(getToast), isToastActive = js.Any.fromFunction1(isToastActive), props = props.asInstanceOf[js.Any], toastKey = toastKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerInstance]
    }
    
    @scala.inline
    implicit class ContainerInstanceMutableBuilder[Self <: ContainerInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerIdNull: Self = StObject.set(x, "containerId", null)
      
      @scala.inline
      def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      @scala.inline
      def setDisplayedToast(value: Double): Self = StObject.set(x, "displayedToast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetToast(value: Id => Toast | Null): Self = StObject.set(x, "getToast", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsToastActive(value: Id => Boolean): Self = StObject.set(x, "isToastActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProps(value: ToastContainerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastKey(value: Double): Self = StObject.set(x, "toastKey", value.asInstanceOf[js.Any])
    }
  }
}
