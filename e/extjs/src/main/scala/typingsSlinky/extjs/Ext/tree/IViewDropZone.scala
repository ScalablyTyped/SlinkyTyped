package typingsSlinky.extjs.Ext.tree

import typingsSlinky.extjs.Ext.view.IDropZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewDropZone extends IDropZone {
  /** [Config Option] (Boolean) */
  var allowContainerDrop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.native
  /** [Method] Moved out of the DropZone without dropping  */
  @JSName("notifyOut")
  var notifyOut_IViewDropZone: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] The mouse is no longer over a tree node so dropping is not valid
  		* @param n Object
  		* @param dd Object
  		* @param e Object
  		* @param data Object
  		*/
  @JSName("onNodeOut")
  var onNodeOut_IViewDropZone: js.UndefOr[
    js.Function4[
      /* n */ js.UndefOr[js.Any], 
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IViewDropZone {
  @scala.inline
  def apply(): IViewDropZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewDropZone]
  }
  @scala.inline
  implicit class IViewDropZoneOps[Self <: IViewDropZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowContainerDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContainerDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowContainerDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContainerDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowParentInserts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowParentInserts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowParentInserts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowParentInserts")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNotifyOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeOut(
      value: (/* n */ js.UndefOr[js.Any], /* dd */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeOut")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnNodeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeOut")(js.undefined)
        ret
    }
  }
  
}

