package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayWidget extends js.Object {
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement = js.native
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String = js.native
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null = js.native
}

object IOverlayWidget {
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IOverlayWidgetPosition | Null
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IOverlayWidget]
  }
  @scala.inline
  implicit class IOverlayWidgetOps[Self <: IOverlayWidget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDomNode(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDomNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => IOverlayWidgetPosition | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

