package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceSolution extends js.Object {
  /** The user-visible icon for this solution. */
  var iconUri: js.UndefOr[String] = js.native
  /** The key which can uniquely identify the conference solution for this event. */
  var key: js.UndefOr[ConferenceSolutionKey] = js.native
  /** The user-visible name of this solution. Not localized. */
  var name: js.UndefOr[String] = js.native
}

object ConferenceSolution {
  @scala.inline
  def apply(): ConferenceSolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceSolution]
  }
  @scala.inline
  implicit class ConferenceSolutionOps[Self <: ConferenceSolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: ConferenceSolutionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

