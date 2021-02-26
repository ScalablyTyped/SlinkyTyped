package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a window. */
@js.native
trait WindowDescriptor extends StObject {
  
  /**
    * specifies the position and size of the window.
    *
    * This member is ignored if the window attribute is {@link com.sun.star.awt.WindowAttribute.FULLSIZE} .
    */
  var Bounds: Rectangle = js.native
  
  /**
    * specifies the parent of the component.
    *
    * If `Parent == 0 && ParentIndex == -1` , then the window is on the desktop.
    */
  var Parent: XWindowPeer = js.native
  
  /**
    * specifies the index of the parent window, if available.
    *
    * If `Parent == 0` and this struct is a member of an array, then this is the offset from the beginning of the array to the parent. A value of -1 means
    * desktop.
    */
  var ParentIndex: Double = js.native
  
  /** specifies the type of window. */
  var Type: WindowClass = js.native
  
  /**
    * specifies the window attributes.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.WindowAttribute} .
    */
  var WindowAttributes: Double = js.native
  
  /**
    * specifies the name of the component service.
    *
    * A zero length name means that the VCL creates a blank top, a container, or a simple window. The following service names are defined: ;
    * spinbuttonspinfieldsplittersplitwindowstatusbarsystemchildwindowtabcontroltabdialogtabpagetimeboxtimefieldtoolboxtristateboxwarningboxwindowworkwindow
    */
  var WindowServiceName: String = js.native
}
object WindowDescriptor {
  
  @scala.inline
  def apply(
    Bounds: Rectangle,
    Parent: XWindowPeer,
    ParentIndex: Double,
    Type: WindowClass,
    WindowAttributes: Double,
    WindowServiceName: String
  ): WindowDescriptor = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentIndex = ParentIndex.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WindowAttributes = WindowAttributes.asInstanceOf[js.Any], WindowServiceName = WindowServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowDescriptor]
  }
  
  @scala.inline
  implicit class WindowDescriptorMutableBuilder[Self <: WindowDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Rectangle): Self = StObject.set(x, "Bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: XWindowPeer): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIndex(value: Double): Self = StObject.set(x, "ParentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WindowClass): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowAttributes(value: Double): Self = StObject.set(x, "WindowAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowServiceName(value: String): Self = StObject.set(x, "WindowServiceName", value.asInstanceOf[js.Any])
  }
}
