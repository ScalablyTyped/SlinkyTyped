package typingsSlinky.imagemapster.mod._Global_.ImageMapster

import typingsSlinky.imagemapster.imagemapsterStrings.highlight
import typingsSlinky.imagemapster.imagemapsterStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnStateChangeData extends js.Object {
  /**
    * map key
    */
  var key: String = js.native
  /**
    * indicating the current state (following the event)
    */
  var selected: Boolean = js.native
  var state: highlight | select = js.native
}

object OnStateChangeData {
  @scala.inline
  def apply(key: String, selected: Boolean, state: highlight | select): OnStateChangeData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStateChangeData]
  }
  @scala.inline
  implicit class OnStateChangeDataOps[Self <: OnStateChangeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: highlight | select): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

