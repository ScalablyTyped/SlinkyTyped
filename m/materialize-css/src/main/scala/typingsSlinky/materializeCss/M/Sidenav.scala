package typingsSlinky.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SidenavOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ @js.native
trait Sidenav extends StObject {
  
  /**
    * Closes Sidenav
    */
  def close(): Unit = js.native
  
  /**
    * Describes if Sidenav is being dragged
    */
  var isDragged: Boolean = js.native
  
  /**
    * Describes if sidenav is fixed
    */
  var isFixed: Boolean = js.native
  
  /**
    * Describes open/close state of Sidenav
    */
  var isOpen: Boolean = js.native
  
  /**
    * Opens Sidenav
    */
  def open(): Unit = js.native
}
object Sidenav {
  
  @scala.inline
  def apply(close: () => Unit, isDragged: Boolean, isFixed: Boolean, isOpen: Boolean, open: () => Unit): Sidenav = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isDragged = isDragged.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Sidenav]
  }
  
  @scala.inline
  implicit class SidenavMutableBuilder[Self <: Sidenav] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
