package typingsSlinky.ionicReact.ionLifeCycleContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonLifeCycleContextInterface extends js.Object {
  def ionViewDidEnter(): Unit = js.native
  def ionViewDidLeave(): Unit = js.native
  def ionViewWillEnter(): Unit = js.native
  def ionViewWillLeave(): Unit = js.native
  def onIonViewDidEnter(callback: js.Function0[Unit]): Unit = js.native
  def onIonViewDidLeave(callback: js.Function0[Unit]): Unit = js.native
  def onIonViewWillEnter(callback: js.Function0[Unit]): Unit = js.native
  def onIonViewWillLeave(callback: js.Function0[Unit]): Unit = js.native
}

object IonLifeCycleContextInterface {
  @scala.inline
  def apply(
    ionViewDidEnter: () => Unit,
    ionViewDidLeave: () => Unit,
    ionViewWillEnter: () => Unit,
    ionViewWillLeave: () => Unit,
    onIonViewDidEnter: js.Function0[Unit] => Unit,
    onIonViewDidLeave: js.Function0[Unit] => Unit,
    onIonViewWillEnter: js.Function0[Unit] => Unit,
    onIonViewWillLeave: js.Function0[Unit] => Unit
  ): IonLifeCycleContextInterface = {
    val __obj = js.Dynamic.literal(ionViewDidEnter = js.Any.fromFunction0(ionViewDidEnter), ionViewDidLeave = js.Any.fromFunction0(ionViewDidLeave), ionViewWillEnter = js.Any.fromFunction0(ionViewWillEnter), ionViewWillLeave = js.Any.fromFunction0(ionViewWillLeave), onIonViewDidEnter = js.Any.fromFunction1(onIonViewDidEnter), onIonViewDidLeave = js.Any.fromFunction1(onIonViewDidLeave), onIonViewWillEnter = js.Any.fromFunction1(onIonViewWillEnter), onIonViewWillLeave = js.Any.fromFunction1(onIonViewWillLeave))
    __obj.asInstanceOf[IonLifeCycleContextInterface]
  }
  @scala.inline
  implicit class IonLifeCycleContextInterfaceOps[Self <: IonLifeCycleContextInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIonViewDidEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewDidEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewDidLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewDidLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewWillEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewWillEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIonViewWillLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ionViewWillLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnIonViewDidEnter(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewDidEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewDidLeave(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewDidLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewWillEnter(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewWillEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIonViewWillLeave(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonViewWillLeave")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

