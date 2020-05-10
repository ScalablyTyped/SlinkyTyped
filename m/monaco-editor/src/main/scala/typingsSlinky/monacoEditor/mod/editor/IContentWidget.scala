package typingsSlinky.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContentWidget extends js.Object {
  /**
    * Render this content widget in a location where it could overflow the editor's view dom node.
    */
  var allowEditorOverflow: js.UndefOr[Boolean] = js.native
  var suppressMouseDown: js.UndefOr[Boolean] = js.native
  /**
    * Get the dom node of the content widget.
    */
  def getDomNode(): HTMLElement = js.native
  /**
    * Get a unique identifier of the content widget.
    */
  def getId(): String = js.native
  /**
    * Get the placement of the content widget.
    * If null is returned, the content widget will be placed off screen.
    */
  def getPosition(): IContentWidgetPosition | Null = js.native
}

object IContentWidget {
  @scala.inline
  def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IContentWidgetPosition | Null
  ): IContentWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IContentWidget]
  }
  @scala.inline
  implicit class IContentWidgetOps[Self <: IContentWidget] (val x: Self) extends AnyVal {
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
    def withGetPosition(value: () => IContentWidgetPosition | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllowEditorOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditorOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditorOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditorOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMouseDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMouseDown")(js.undefined)
        ret
    }
  }
  
}

