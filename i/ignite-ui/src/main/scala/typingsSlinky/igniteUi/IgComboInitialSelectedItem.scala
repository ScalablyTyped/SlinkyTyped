package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboInitialSelectedItem
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="true" Index of item in the list. The index should be greater than -1 and less than the count of the [items](ui.igcombo#methods:items) in the list (rows in dataSource).
  	 *
  	 */
  var index: js.UndefOr[Double] = js.native
  /**
  	 * Optional="true" Value matching the [valueKey](ui.igcombo#options:valueKey) property of the item.
  	 *
  	 */
  var value: js.UndefOr[js.Any] = js.native
}

object IgComboInitialSelectedItem {
  @scala.inline
  def apply(): IgComboInitialSelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboInitialSelectedItem]
  }
  @scala.inline
  implicit class IgComboInitialSelectedItemOps[Self <: IgComboInitialSelectedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
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

