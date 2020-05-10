package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.ionicCoreStrings.full
import typingsSlinky.ionicCore.ionicCoreStrings.inset
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonList extends js.Object {
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  var inset: Boolean = js.native
  /**
    * How the bottom border should be displayed on all items.
    */
  var lines: js.UndefOr[full | inset | none] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  def closeSlidingItems(): js.Promise[Boolean] = js.native
}

object IonList {
  @scala.inline
  def apply(closeSlidingItems: () => js.Promise[Boolean], inset: Boolean): IonList = {
    val __obj = js.Dynamic.literal(closeSlidingItems = js.Any.fromFunction0(closeSlidingItems), inset = inset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonList]
  }
  @scala.inline
  implicit class IonListOps[Self <: IonList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseSlidingItems(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSlidingItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: full | inset | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ios | md): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

