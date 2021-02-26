package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a function to retrieve a special purpose interface dependent on the user interface element type.
  *
  * The type of the interface depends on the real type of the user interface element. A menubar user interface element provides access to its
  * com::sun::star::awt::XSystemDependentMenuBarPeer which supports to retrieve the system dependent menu handle. A floating window or a toolbar user
  * interface element return a {@link com.sun.star.awt.XWindow} interface.
  */
@js.native
trait XUIElement extends XInterface {
  
  /**
    * determines the document frame to which this element is bound to.
    *
    * The life time of a user interface element does not explicitly depend on the frame itself but on the visible component attached to the frame. It is
    * possible to exchange the visible component of a frame and that will lead to the end of life of all user interface elements.
    */
  var Frame: XFrame = js.native
  
  /**
    * returns an interface to get access to user interface type specific functions.
    * @returns a special purpose interface which depends on the type of the user interface element.
    */
  val RealInterface: XInterface = js.native
  
  /** a resource URL which is a unique identifier of a user interface element. */
  var ResourceURL: String = js.native
  
  /**
    * determines the type of the user interface element.
    * @see UIElementType
    */
  var Type: Double = js.native
  
  /**
    * returns an interface to get access to user interface type specific functions.
    * @returns a special purpose interface which depends on the type of the user interface element.
    */
  def getRealInterface(): XInterface = js.native
}
object XUIElement {
  
  @scala.inline
  def apply(
    Frame: XFrame,
    RealInterface: XInterface,
    ResourceURL: String,
    Type: Double,
    acquire: () => Unit,
    getRealInterface: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIElement = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], RealInterface = RealInterface.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRealInterface = js.Any.fromFunction0(getRealInterface), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIElement]
  }
  
  @scala.inline
  implicit class XUIElementMutableBuilder[Self <: XUIElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRealInterface(value: () => XInterface): Self = StObject.set(x, "getRealInterface", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRealInterface(value: XInterface): Self = StObject.set(x, "RealInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceURL(value: String): Self = StObject.set(x, "ResourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
