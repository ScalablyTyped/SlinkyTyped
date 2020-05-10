package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the collapse indicator tooltip text.
  	 *
  	 */
  var collapseTooltipText: js.UndefOr[String] = js.native
  /**
  	 * Specifies the expansion indicator tooltip text.
  	 *
  	 */
  var expandTooltipText: js.UndefOr[String] = js.native
}

object IgTreeGridLocale {
  @scala.inline
  def apply(): IgTreeGridLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridLocale]
  }
  @scala.inline
  implicit class IgTreeGridLocaleOps[Self <: IgTreeGridLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseTooltipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltipText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTooltipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltipText")(js.undefined)
        ret
    }
  }
  
}

