package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets collapse button title.
  	 *
  	 */
  var collapseButtonTitle: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets expand button title.
  	 *
  	 */
  var expandButtonTitle: js.UndefOr[js.Any] = js.native
}

object IgToolbarLocale {
  @scala.inline
  def apply(): IgToolbarLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarLocale]
  }
  @scala.inline
  implicit class IgToolbarLocaleOps[Self <: IgToolbarLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseButtonTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandButtonTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonTitle")(js.undefined)
        ret
    }
  }
  
}

