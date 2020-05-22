package typingsSlinky.dayzed.mod

import typingsSlinky.dayzed.anon.Calendars
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar]
  def getBackProps(data: Calendars): Record[String, _]
  def getDateProps(data: typingsSlinky.dayzed.anon.DateObj): Record[String, _]
  def getForwardProps(data: Calendars): Record[String, _]
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: Calendars => Record[String, _],
    getDateProps: typingsSlinky.dayzed.anon.DateObj => Record[String, _],
    getForwardProps: Calendars => Record[String, _]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], getBackProps = js.Any.fromFunction1(getBackProps), getDateProps = js.Any.fromFunction1(getDateProps), getForwardProps = js.Any.fromFunction1(getForwardProps))
    __obj.asInstanceOf[RenderProps]
  }
}

