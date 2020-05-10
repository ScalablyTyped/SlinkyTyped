package typingsSlinky.navigationReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshLinkProps extends LinkProps {
  /**
    * The Css Class to display when the Link is active
    */
  var activeCssClass: js.UndefOr[String] = js.native
  /**
    * The style to display when the Link is active
    */
  var activeStyle: js.UndefOr[js.Any] = js.native
  /**
    * The data to add from the current NavigationData
    */
  var currentDataKeys: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Indicates whether the Link is disabled when active
    */
  var disableActive: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to include all the current NavigationData
    */
  var includeCurrentData: js.UndefOr[Boolean] = js.native
  /**
    * The NavigationData to pass
    */
  var navigationData: js.UndefOr[js.Any] = js.native
}

object RefreshLinkProps {
  @scala.inline
  def apply(): RefreshLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshLinkProps]
  }
  @scala.inline
  implicit class RefreshLinkPropsOps[Self <: RefreshLinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDataKeys(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDataKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDataKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDataKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableActive")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCurrentData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCurrentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCurrentData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCurrentData")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationData")(js.undefined)
        ret
    }
  }
  
}

