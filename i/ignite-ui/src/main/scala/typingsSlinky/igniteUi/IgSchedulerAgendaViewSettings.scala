package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerAgendaViewSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the number of days shown in AgendaView mode.
  	 *
  	 */
  var dateRangeInterval: js.UndefOr[Double] = js.native
}

object IgSchedulerAgendaViewSettings {
  @scala.inline
  def apply(): IgSchedulerAgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerAgendaViewSettings]
  }
  @scala.inline
  implicit class IgSchedulerAgendaViewSettingsOps[Self <: IgSchedulerAgendaViewSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateRangeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRangeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeInterval")(js.undefined)
        ret
    }
  }
  
}

