package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimate extends IBase {
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
}

object IAnimate {
  @scala.inline
  def apply(): IAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimate]
  }
  @scala.inline
  implicit class IAnimateOps[Self <: IAnimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHasActiveFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasActiveFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveFx")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSequenceFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceFx")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAnimation(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withStopFx(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFx")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFx")(js.undefined)
        ret
    }
  }
  
}

