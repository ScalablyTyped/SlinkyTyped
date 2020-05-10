package typingsSlinky.dayzed.mod

import typingsSlinky.dayzed.AnonCalendars
import typingsSlinky.dayzed.AnonDateObj
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar] = js.native
  def getBackProps(data: AnonCalendars): Record[String, _] = js.native
  def getDateProps(data: AnonDateObj): Record[String, _] = js.native
  def getForwardProps(data: AnonCalendars): Record[String, _] = js.native
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: AnonCalendars => Record[String, _],
    getDateProps: AnonDateObj => Record[String, _],
    getForwardProps: AnonCalendars => Record[String, _]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: js.Array[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBackProps(value: AnonCalendars => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDateProps(value: AnonDateObj => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetForwardProps(value: AnonCalendars => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForwardProps")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

