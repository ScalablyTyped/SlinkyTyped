package typingsSlinky.extjs.Ext.view

import typingsSlinky.extjs.Ext.util.IKeyNav
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBoundListKeyNav extends IKeyNav {
  /** [Config Option] (Ext.view.BoundList) */
  var boundList: js.UndefOr[IBoundList] = js.native
  /** [Method] Highlights the item at the given index
  		* @param index Number
  		*/
  var highlightAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Triggers selection of the currently highlighted item according to the behavior of the configured SelectionModel
  		* @param e Object
  		*/
  var selectHighlighted: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}

object IBoundListKeyNav {
  @scala.inline
  def apply(): IBoundListKeyNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundListKeyNav]
  }
  @scala.inline
  implicit class IBoundListKeyNavOps[Self <: IBoundListKeyNav] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundList(value: IBoundList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundList")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightAt(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHighlightAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectHighlighted(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHighlighted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHighlighted")(js.undefined)
        ret
    }
  }
  
}

