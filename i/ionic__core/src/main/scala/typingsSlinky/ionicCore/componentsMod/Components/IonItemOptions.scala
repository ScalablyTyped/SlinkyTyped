package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonItemOptions extends js.Object {
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: Side = js.native
  def fireSwipeEvent(): js.Promise[Unit] = js.native
}

object IonItemOptions {
  @scala.inline
  def apply(fireSwipeEvent: () => js.Promise[Unit], side: Side): IonItemOptions = {
    val __obj = js.Dynamic.literal(fireSwipeEvent = js.Any.fromFunction0(fireSwipeEvent), side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonItemOptions]
  }
  @scala.inline
  implicit class IonItemOptionsOps[Self <: IonItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFireSwipeEvent(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireSwipeEvent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSide(value: Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

