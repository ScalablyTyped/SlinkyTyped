package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgResponsiveContainer
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The time between two resize checks in milliseconds.
  	 */
  var pollingInterval: js.UndefOr[Double] = js.native
}

object IgResponsiveContainer {
  @scala.inline
  def apply(): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgResponsiveContainer]
  }
  @scala.inline
  implicit class IgResponsiveContainerOps[Self <: IgResponsiveContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPollingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(js.undefined)
        ret
    }
  }
  
}

