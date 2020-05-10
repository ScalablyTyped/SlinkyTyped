package typingsSlinky.agGrid.dateComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDate extends js.Object {
  /** Returns the current date represented by this editor */
  def getDate(): js.Date = js.native
  /** Sets the date represented by this component */
  def setDate(date: js.Date): Unit = js.native
}

object IDate {
  @scala.inline
  def apply(getDate: () => js.Date, setDate: js.Date => Unit): IDate = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), setDate = js.Any.fromFunction1(setDate))
    __obj.asInstanceOf[IDate]
  }
  @scala.inline
  implicit class IDateOps[Self <: IDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

