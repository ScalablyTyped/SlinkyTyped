package typingsSlinky.ionicCore.componentsMod.Components

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
  var activated: Boolean = js.native
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: start | end | top | bottom = js.native
}

object IonFabList {
  @scala.inline
  def apply(activated: Boolean, side: start | end | top | bottom): IonFabList = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
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
    def withSide(value: start | end | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

