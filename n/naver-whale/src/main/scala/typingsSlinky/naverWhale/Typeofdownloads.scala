package typingsSlinky.naverWhale

import typingsSlinky.naverWhale.chrome.downloads.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdownloads extends js.Object {
  val State: StateType = js.native
}

object Typeofdownloads {
  @scala.inline
  def apply(State: StateType): Typeofdownloads = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdownloads]
  }
  @scala.inline
  implicit class TypeofdownloadsOps[Self <: Typeofdownloads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: StateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

