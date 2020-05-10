package typingsSlinky.ionicCore.componentsMod.LocalJSX

import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.end
import typingsSlinky.ionicCore.ionicCoreStrings.start
import typingsSlinky.ionicCore.ionicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonFabList extends js.Object {
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: js.UndefOr[Boolean] = js.native
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: js.UndefOr[start | end | top | bottom] = js.native
}

object IonFabList {
  @scala.inline
  def apply(): IonFabList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonFabList]
  }
  @scala.inline
  implicit class IonFabListOps[Self <: IonFabList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: start | end | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
  }
  
}

