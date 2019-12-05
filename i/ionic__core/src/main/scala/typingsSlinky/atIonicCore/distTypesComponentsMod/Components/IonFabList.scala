package typingsSlinky.atIonicCore.distTypesComponentsMod.Components

import typingsSlinky.atIonicCore.atIonicCoreStrings.bottom
import typingsSlinky.atIonicCore.atIonicCoreStrings.end
import typingsSlinky.atIonicCore.atIonicCoreStrings.start
import typingsSlinky.atIonicCore.atIonicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFabList extends js.Object {
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: Boolean
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: start | end | top | bottom
}

object IonFabList {
  @scala.inline
  def apply(activated: Boolean, side: start | end | top | bottom): IonFabList = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonFabList]
  }
}

