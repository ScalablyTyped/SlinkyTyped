package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridUpdatingLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the label of the add child button in touch environment.
  	 *
  	 */
  var addChildButtonLabel: js.UndefOr[String] = js.native
  /**
  	 * Specifies the add child tooltip text.
  	 *
  	 */
  var addChildTooltip: js.UndefOr[String] = js.native
}

object IgTreeGridUpdatingLocale {
  @scala.inline
  def apply(): IgTreeGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridUpdatingLocale]
  }
  @scala.inline
  implicit class IgTreeGridUpdatingLocaleOps[Self <: IgTreeGridUpdatingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChildButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddChildButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAddChildTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddChildTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChildTooltip")(js.undefined)
        ret
    }
  }
  
}

