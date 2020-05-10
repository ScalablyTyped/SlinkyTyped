package typingsSlinky.dojo.dojox.gfx

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/canvas_attach.html
  *
  * This the graphics rendering bridge for W3C Canvas compliant browsers.
  * Since Canvas is an immediate mode graphics api, with no object graph or
  * eventing capabilities, use of this module alone will only add in drawing support.
  * The additional module, canvasWithEvents extends this module with additional support
  * for handling events on Canvas.  By default, the support for events is now included
  * however, if only drawing capabilities are needed, canvas event module can be disabled
  * using the dojoConfig option, canvasEvents:true|false.
  * The id of the Canvas renderer is 'canvas'.  This id can be used when switch Dojo's
  * graphics context between renderer implementations.  See dojox/gfx/_base.switchRenderer
  * API.
  *
  */
@js.native
trait canvasAttach extends js.Object {
  /**
    *
    */
  def Circle(): Unit = js.native
  /**
    *
    */
  def Ellipse(): Unit = js.native
  /**
    *
    */
  def Group(): Unit = js.native
  /**
    *
    */
  def Image(): Unit = js.native
  /**
    *
    */
  def Line(): Unit = js.native
  /**
    *
    */
  def Path(): Unit = js.native
  /**
    *
    */
  def Polyline(): Unit = js.native
  /**
    *
    */
  def Rect(): Unit = js.native
  /**
    *
    */
  def Shape(): Unit = js.native
  /**
    *
    */
  def Surface(): Unit = js.native
  /**
    *
    */
  def Text(): Unit = js.native
  /**
    *
    */
  def TextPath(): Unit = js.native
  /**
    *
    */
  def attachNode(): Unit = js.native
  /**
    *
    */
  def attachSurface(): Unit = js.native
  /**
    * creates a surface (Canvas)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): js.Any = js.native
}

object canvasAttach {
  @scala.inline
  def apply(
    Circle: () => Unit,
    Ellipse: () => Unit,
    Group: () => Unit,
    Image: () => Unit,
    Line: () => Unit,
    Path: () => Unit,
    Polyline: () => Unit,
    Rect: () => Unit,
    Shape: () => Unit,
    Surface: () => Unit,
    Text: () => Unit,
    TextPath: () => Unit,
    attachNode: () => Unit,
    attachSurface: () => Unit,
    createSurface: (HTMLElement, String, String) => js.Any
  ): canvasAttach = {
    val __obj = js.Dynamic.literal(Circle = js.Any.fromFunction0(Circle), Ellipse = js.Any.fromFunction0(Ellipse), Group = js.Any.fromFunction0(Group), Image = js.Any.fromFunction0(Image), Line = js.Any.fromFunction0(Line), Path = js.Any.fromFunction0(Path), Polyline = js.Any.fromFunction0(Polyline), Rect = js.Any.fromFunction0(Rect), Shape = js.Any.fromFunction0(Shape), Surface = js.Any.fromFunction0(Surface), Text = js.Any.fromFunction0(Text), TextPath = js.Any.fromFunction0(TextPath), attachNode = js.Any.fromFunction0(attachNode), attachSurface = js.Any.fromFunction0(attachSurface), createSurface = js.Any.fromFunction3(createSurface))
    __obj.asInstanceOf[canvasAttach]
  }
  @scala.inline
  implicit class canvasAttachOps[Self <: canvasAttach] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Circle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEllipse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLine(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPolyline(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polyline")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShape(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSurface(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTextPath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAttachNode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAttachSurface(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachSurface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateSurface(value: (HTMLElement, String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSurface")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

