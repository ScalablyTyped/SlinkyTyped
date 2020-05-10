package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneCollection extends js.Object {
  /** Sets the collection of timezone items to the dataSource that accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule timezones.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Binds id field name in the dataSource to timeZoneCollection id.
    * @Default {id}
    */
  var id: js.UndefOr[String] = js.native
  /** Binds text field name in the dataSource to timeZoneCollection text. These text gets listed out in the timezone fields of the appointment window.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.native
  /** Binds value field name in the dataSource to timeZoneCollection value.
    * @Default {value}
    */
  var value: js.UndefOr[String] = js.native
}

object TimeZoneCollection {
  @scala.inline
  def apply(): TimeZoneCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZoneCollection]
  }
  @scala.inline
  implicit class TimeZoneCollectionOps[Self <: TimeZoneCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

