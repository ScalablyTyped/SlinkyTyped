package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JumpListSettings extends js.Object {
  /**
    * The minimum number of items that will be shown in the Jump List (for a more
    * detailed description of this value see the ).
    */
  var minItems: Double = js.native
  /**
    * Array of JumpListItem objects that correspond to items that the user has
    * explicitly removed from custom categories in the Jump List. These items must not
    * be re-added to the Jump List in the call to app.setJumpList(), Windows will not
    * display any custom category that contains any of the removed items.
    */
  var removedItems: js.Array[JumpListItem] = js.native
}

object JumpListSettings {
  @scala.inline
  def apply(minItems: Double, removedItems: js.Array[JumpListItem]): JumpListSettings = {
    val __obj = js.Dynamic.literal(minItems = minItems.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpListSettings]
  }
  @scala.inline
  implicit class JumpListSettingsOps[Self <: JumpListSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedItems(value: js.Array[JumpListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

