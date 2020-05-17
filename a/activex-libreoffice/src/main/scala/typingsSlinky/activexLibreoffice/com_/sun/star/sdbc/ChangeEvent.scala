package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecatedindicates the type of change action on the data source. */
@js.native
trait ChangeEvent extends EventObject {
  /**
    * indicates the type of change.
    * @see com.sun.star.sdbc.ChangeAction
    */
  var Action: Double = js.native
  /** indicates the number of rows affected by the change. */
  var Rows: Double = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(Action: Double, Rows: Double, Source: XInterface): ChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

