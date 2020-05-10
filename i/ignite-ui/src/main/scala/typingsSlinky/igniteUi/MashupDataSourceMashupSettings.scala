package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MashupDataSourceMashupSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * An array of $.ig.DataSource instances holding the disperse data.
  	 */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Indicates whether to ignore records that have no corresponding data in all of the provided data sources.
  	 */
  var ignorePartialRecords: js.UndefOr[Boolean] = js.native
}

object MashupDataSourceMashupSettings {
  @scala.inline
  def apply(): MashupDataSourceMashupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MashupDataSourceMashupSettings]
  }
  @scala.inline
  implicit class MashupDataSourceMashupSettingsOps[Self <: MashupDataSourceMashupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[_]): Self = {
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
    def withIgnorePartialRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePartialRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePartialRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePartialRecords")(js.undefined)
        ret
    }
  }
  
}

