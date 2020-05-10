package typingsSlinky.ionicReact

import typingsSlinky.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentCanBeDestroyed extends js.Object {
  var componentCanBeDestroyedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var ionViewDidEnterCallbacks: js.Array[LifeCycleCallback] = js.native
  var ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
  var ionViewWillEnterCallbacks: js.Array[LifeCycleCallback] = js.native
  var ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback] = js.native
  def componentCanBeDestroyed(): Unit = js.native
  def ionViewDidEnter(): Unit = js.native
  def ionViewDidLeave(): Unit = js.native
  def ionViewWillEnter(): Unit = js.native
  def ionViewWillLeave(): Unit = js.native
  def onComponentCanBeDestroyed(callback: js.Function0[Unit]): Unit = js.native
  def onIonViewDidEnter(callback: LifeCycleCallback): Unit = js.native
  def onIonViewDidLeave(callback: LifeCycleCallback): Unit = js.native
  def onIonViewWillEnter(callback: LifeCycleCallback): Unit = js.native
  def onIonViewWillLeave(callback: LifeCycleCallback): Unit = js.native
}

object AnonComponentCanBeDestroyed {
  @scala.inline
  def apply(
    componentCanBeDestroyed: () => Unit,
    ionViewDidEnter: () => Unit,
    ionViewDidEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewDidLeave: () => Unit,
    ionViewDidLeaveCallbacks: js.Array[LifeCycleCallback],
    ionViewWillEnter: () => Unit,
    ionViewWillEnterCallbacks: js.Array[LifeCycleCallback],
    ionViewWillLeave: () => Unit,
    ionViewWillLeaveCallbacks: js.Array[LifeCycleCallback],
    onComponentCanBeDestroyed: js.Function0[Unit] => Unit,
    onIonViewDidEnter: LifeCycleCallback => Unit,
    onIonViewDidLeave: LifeCycleCallback => Unit,
    onIonViewWillEnter: LifeCycleCallback => Unit,
    onIonViewWillLeave: LifeCycleCallback => Unit
  ): AnonComponentCanBeDestroyed = {
    val __obj = js.Dynamic.literal(componentCanBeDestroyed = js.Any.fromFunction0(componentCanBeDestroyed), ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidEnterCallbacks = ionViewDidEnterCallbacks.asInstanceOf[js.Any], ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewDidLeaveCallbacks = ionViewDidLeaveCallbacks.asInstanceOf[js.Any], ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillEnterCallbacks = ionViewWillEnterCallbacks.asInstanceOf[js.Any], ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), ionViewWillLeaveCallbacks = ionViewWillLeaveCallbacks.asInstanceOf[js.Any], onComponentCanBeDestroyed = js.Any.fromFunction1(onComponentCanBeDestroyed), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
    __obj.asInstanceOf[AnonComponentCanBeDestroyed]
  }
  @scala.inline
  implicit class AnonComponentCanBeDestroyedOps[Self <: AnonComponentCanBeDestroyed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentCanBeDestroyed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCanBeDestroyed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewDidEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewDidEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewDidEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewDidEnterCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIonViewDidLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewDidLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewDidLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewDidLeaveCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIonViewWillEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewWillEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewWillEnterCallbacks(value: js.Array[LifeCycleCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewWillEnterCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIonViewWillLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewWillLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewWillLeaveCallbacks(value: js.Array[LifeCycleCallback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewWillLeaveCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnComponentCanBeDestroyed(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComponentCanBeDestroyed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewDidEnter(value: LifeCycleCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewDidEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewDidLeave(value: LifeCycleCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewDidLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewWillEnter(value: LifeCycleCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewWillEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewWillLeave(value: LifeCycleCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewWillLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentCanBeDestroyedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCanBeDestroyedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComponentCanBeDestroyedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCanBeDestroyedCallback")(js.undefined)
        ret
    }
  }
  
}

