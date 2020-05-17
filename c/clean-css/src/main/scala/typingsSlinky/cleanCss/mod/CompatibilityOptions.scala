package typingsSlinky.cleanCss.mod

import typingsSlinky.cleanCss.anon.AdjacentSpace
import typingsSlinky.cleanCss.anon.BackgroundClipMerging
import typingsSlinky.cleanCss.anon.Ch
import typingsSlinky.cleanCss.anon.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained configuration for compatibility option
  */
@js.native
trait CompatibilityOptions extends js.Object {
  /**
    * A hash of compatibility options related to color
    */
  var colors: js.UndefOr[Opacity] = js.native
  /**
    * A hash of properties that can be set with compatibility
    */
  var properties: js.UndefOr[BackgroundClipMerging] = js.native
  /**
    * A hash of options related to compatibility of selectors
    */
  var selectors: js.UndefOr[AdjacentSpace] = js.native
  /**
    * A hash of options related to comparability of supported units
    */
  var units: js.UndefOr[Ch] = js.native
}

object CompatibilityOptions {
  @scala.inline
  def apply(): CompatibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibilityOptions]
  }
  @scala.inline
  implicit class CompatibilityOptionsOps[Self <: CompatibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Opacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: BackgroundClipMerging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: AdjacentSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: Ch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

