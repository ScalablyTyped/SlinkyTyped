package typingsSlinky.extjs.Ext.panel

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.dd.IDragSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDD extends IDragSource {
  /** [Method] Returns a reference to the actual element to drag
  		* @param e Object
  		* @returns HTMLElement the html element
  		*/
  @JSName("getDragEl")
  var getDragEl_IDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], HTMLElement]] = js.native
}

object IDD {
  @scala.inline
  def apply(): IDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDD]
  }
  @scala.inline
  implicit class IDDOps[Self <: IDD] (val x: Self) extends AnyVal {
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
  }
  
}

