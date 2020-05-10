package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabClasses extends js.Object {
  var `ui-tabs`: js.UndefOr[String] = js.native
  var `ui-tabs-active`: js.UndefOr[String] = js.native
  var `ui-tabs-anchor`: js.UndefOr[String] = js.native
  var `ui-tabs-collapsible`: js.UndefOr[String] = js.native
  var `ui-tabs-loading`: js.UndefOr[String] = js.native
  var `ui-tabs-nav`: js.UndefOr[String] = js.native
  var `ui-tabs-panel`: js.UndefOr[String] = js.native
  var `ui-tabs-tab`: js.UndefOr[String] = js.native
}

object TabClasses {
  @scala.inline
  def apply(): TabClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabClasses]
  }
  @scala.inline
  implicit class TabClassesOps[Self <: TabClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withUi-tabs`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-active`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-active`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-active")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-anchor`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-anchor`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-anchor")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-collapsible`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-collapsible`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-loading`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-loading`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-loading")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-nav`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-nav`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-nav")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-panel`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-panel`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-panel")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-tabs-tab`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-tabs-tab`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-tabs-tab")(js.undefined)
        ret
    }
  }
  
}

