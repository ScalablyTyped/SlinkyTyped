package typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.rendering.XCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pane is an abstraction of a window and is one of the resources managed by the drawing framework.
  *
  * Apart from the area that displays a view a pane may contain other parts like title, menu, closer button.
  *
  * The URL prefix of panes is `private:resource/floater`
  */
@js.native
trait XPane extends XResource {
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  val Canvas: XCanvas = js.native
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  val Window: XWindow = js.native
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  def getCanvas(): XCanvas = js.native
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  def getWindow(): XWindow = js.native
}

object XPane {
  @scala.inline
  def apply(
    Canvas: XCanvas,
    ResourceId: XResourceId,
    Window: XWindow,
    getCanvas: () => XCanvas,
    getResourceId: () => XResourceId,
    getWindow: () => XWindow,
    isAnchorOnly: () => Boolean
  ): XPane = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], getCanvas = js.Any.fromFunction0(getCanvas), getResourceId = js.Any.fromFunction0(getResourceId), getWindow = js.Any.fromFunction0(getWindow), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly))
    __obj.asInstanceOf[XPane]
  }
  @scala.inline
  implicit class XPaneOps[Self <: XPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvas(value: XCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: XWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCanvas(value: () => XCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWindow(value: () => XWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindow")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

