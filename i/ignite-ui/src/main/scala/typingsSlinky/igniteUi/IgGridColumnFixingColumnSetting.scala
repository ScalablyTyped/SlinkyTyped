package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnFixingColumnSetting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies whether the column can be fixed or not. If allow fixing is false, then the fixing pin will not be rendered for the column.
  	 *
  	 */
  var allowFixing: js.UndefOr[Boolean] = js.native
  /**
  	 * Identifies the grid column by index. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Identifies the grid column by key. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies whether the column is initially fixed or not. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#initial-state) out for more information.
  	 *
  	 */
  var isFixed: js.UndefOr[Boolean] = js.native
}

object IgGridColumnFixingColumnSetting {
  @scala.inline
  def apply(): IgGridColumnFixingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixingColumnSetting]
  }
  @scala.inline
  implicit class IgGridColumnFixingColumnSettingOps[Self <: IgGridColumnFixingColumnSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFixing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFixing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFixing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFixing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixed")(js.undefined)
        ret
    }
  }
  
}

