package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwimlaneSettingsHeader extends js.Object {
  /** Gets or sets a value that indicates to render the Kanban with specified swimlane header key.
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to render the Kanban with specified swimlane header text.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}

object SwimlaneSettingsHeader {
  @scala.inline
  def apply(): SwimlaneSettingsHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwimlaneSettingsHeader]
  }
  @scala.inline
  implicit class SwimlaneSettingsHeaderOps[Self <: SwimlaneSettingsHeader] (val x: Self) extends AnyVal {
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
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

