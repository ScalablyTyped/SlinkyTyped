package typingsSlinky.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventColor extends js.Object {
  /**
  	         * The primary color of the event, should be darker than secondary
  	         */
  var primary: String = js.native
  /**
  	         * The secondary color of the event, should be lighter than primary
  	         */
  var secondary: String = js.native
}

object IEventColor {
  @scala.inline
  def apply(primary: String, secondary: String): IEventColor = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventColor]
  }
  @scala.inline
  implicit class IEventColorOps[Self <: IEventColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

