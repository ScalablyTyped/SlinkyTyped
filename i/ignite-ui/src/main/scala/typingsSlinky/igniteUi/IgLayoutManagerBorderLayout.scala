package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLayoutManagerBorderLayout
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Option specifying the width of the left region, either in px or percentages
  	 *
  	 */
  var leftWidth: js.UndefOr[String] = js.native
  /**
  	 * Option specifying the width of the right region, either in px or percentages
  	 *
  	 */
  var rightWidth: js.UndefOr[String] = js.native
  /**
  	 * Option specifying whether the footer region in the border layout will be hidden or shown
  	 *
  	 */
  var showFooter: js.UndefOr[Boolean] = js.native
  /**
  	 * Option specifying whether the header region in the border layout will be hidden or shown
  	 *
  	 */
  var showHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Option specifying whether the left region in the border layout will be hidden or shown
  	 *
  	 */
  var showLeft: js.UndefOr[Boolean] = js.native
  /**
  	 * Option specifying whether the right region in the border layout will be hidden or shown
  	 *
  	 */
  var showRight: js.UndefOr[Boolean] = js.native
}

object IgLayoutManagerBorderLayout {
  @scala.inline
  def apply(): IgLayoutManagerBorderLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerBorderLayout]
  }
  @scala.inline
  implicit class IgLayoutManagerBorderLayoutOps[Self <: IgLayoutManagerBorderLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRightWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRight")(js.undefined)
        ret
    }
  }
  
}

