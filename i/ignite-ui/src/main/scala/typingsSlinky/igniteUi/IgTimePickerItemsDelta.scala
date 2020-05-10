package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTimePickerItemsDelta
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var hours: js.UndefOr[Double] = js.native
  var minutes: js.UndefOr[Double] = js.native
}

object IgTimePickerItemsDelta {
  @scala.inline
  def apply(): IgTimePickerItemsDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTimePickerItemsDelta]
  }
  @scala.inline
  implicit class IgTimePickerItemsDeltaOps[Self <: IgTimePickerItemsDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.undefined)
        ret
    }
  }
  
}

