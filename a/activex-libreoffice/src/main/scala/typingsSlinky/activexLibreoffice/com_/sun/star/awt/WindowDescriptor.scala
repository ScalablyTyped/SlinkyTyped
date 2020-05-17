package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a window. */
@js.native
trait WindowDescriptor extends js.Object {
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
  implicit class WindowDescriptorOps[Self <: WindowDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: XWindowPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WindowClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowAttributes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowServiceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

