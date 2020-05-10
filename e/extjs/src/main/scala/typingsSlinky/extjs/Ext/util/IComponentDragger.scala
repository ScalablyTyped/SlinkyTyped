package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.dd.IDragTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponentDragger extends IDragTracker {
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var constrainDelegate: js.UndefOr[Boolean] = js.native
  /** [Method] Move either the ghost Component or the target Component to its new position on drag
  		* @param e Object
  		*/
  @JSName("onDrag")
  var onDrag_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onEnd")
  var onEnd_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method which should be overridden by each DragTracker instance
  		* @param e Object
  		*/
  @JSName("onStart")
  var onStart_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}

object IComponentDragger {
  @scala.inline
  def apply(): IComponentDragger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentDragger]
  }
  @scala.inline
  implicit class IComponentDraggerOps[Self <: IComponentDragger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainDelegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainDelegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainDelegate")(js.undefined)
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
    def withOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
  }
  
}

