package typingsSlinky.dojo.dojox.gfx

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg.html
  *
  * This the graphics rendering bridge for browsers compliant with W3C SVG1.0.
  * This is the preferred renderer to use for interactive and accessible graphics.
  *
  */
@js.native
trait svg extends js.Object {
  /**
    *
    */
  var dasharray: js.Object = js.native
  /**
    *
    */
  var useSvgWeb: Boolean = js.native
  /**
    *
    */
  var xmlns: js.Object = js.native
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
    * creates a shape from a Node
    *
    * @param node an SVG node
    */
  def attachNode(node: HTMLElement): Unit = js.native
  /**
    * creates a surface from a Node
    *
    * @param node an SVG node
    */
  def attachSurface(node: HTMLElement): Unit = js.native
  /**
    *
    * @param parentNode
    * @param width
    * @param height
    */
  def createSurface(parentNode: js.Any, width: js.Any, height: js.Any): Unit = js.native
  /**
    * Adds the gfxElement to event.gfxTarget if none exists. This new
    * property will carry the GFX element associated with this event.
    *
    * @param event The current input event (MouseEvent or TouchEvent)
    * @param gfxElement The GFX target element
    */
  def fixTarget(event: js.Object, gfxElement: js.Object): Unit = js.native
  /**
    * looks up a node by its external name
    *
    * @param name an SVG external reference
    */
  def getRef(name: String): js.Any = js.native
}

object svg {
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
    attachNode: HTMLElement => Unit,
    attachSurface: HTMLElement => Unit,
    createSurface: (js.Any, js.Any, js.Any) => Unit,
    dasharray: js.Object,
    fixTarget: (js.Object, js.Object) => Unit,
    getRef: String => js.Any,
    useSvgWeb: Boolean,
    xmlns: js.Object
  ): svg = {
    val __obj = js.Dynamic.literal(Circle = js.Any.fromFunction0(Circle), Ellipse = js.Any.fromFunction0(Ellipse), Group = js.Any.fromFunction0(Group), Image = js.Any.fromFunction0(Image), Line = js.Any.fromFunction0(Line), Path = js.Any.fromFunction0(Path), Polyline = js.Any.fromFunction0(Polyline), Rect = js.Any.fromFunction0(Rect), Shape = js.Any.fromFunction0(Shape), Surface = js.Any.fromFunction0(Surface), Text = js.Any.fromFunction0(Text), TextPath = js.Any.fromFunction0(TextPath), attachNode = js.Any.fromFunction1(attachNode), attachSurface = js.Any.fromFunction1(attachSurface), createSurface = js.Any.fromFunction3(createSurface), dasharray = dasharray.asInstanceOf[js.Any], fixTarget = js.Any.fromFunction2(fixTarget), getRef = js.Any.fromFunction1(getRef), useSvgWeb = useSvgWeb.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[svg]
  }
  @scala.inline
  implicit class svgOps[Self <: svg] (val x: Self) extends AnyVal {
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
    def withAttachNode(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachSurface(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachSurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateSurface(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSurface")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDasharray(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixTarget(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRef(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseSvgWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSvgWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlns(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

