package typingsSlinky.extjs.Ext.draw

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.dd.IDragSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpriteDD extends IDragSource {
  /** [Method] Returns a reference to the actual element to drag
  		* @param e Object
  		* @returns HTMLElement the html element
  		*/
  @JSName("getDragEl")
  var getDragEl_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], HTMLElement]] = js.native
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
  		* @param e Object
  		*/
  @JSName("onDrag")
  var onDrag_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th  */
  @JSName("setDragElPos")
  var setDragElPos_ISpriteDD: js.UndefOr[js.Function0[Unit]] = js.native
}

object ISpriteDD {
  @scala.inline
  def apply(): ISpriteDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpriteDD]
  }
  @scala.inline
  implicit class ISpriteDDOps[Self <: ISpriteDD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDragEl(value: /* e */ js.UndefOr[js.Any] => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragEl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDragEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragEl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDragElPos(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDragElPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetDragElPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDragElPos")(js.undefined)
        ret
    }
  }
  
}

