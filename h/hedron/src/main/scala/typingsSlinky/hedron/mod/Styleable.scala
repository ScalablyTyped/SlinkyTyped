package typingsSlinky.hedron.mod

import typingsSlinky.hedron.hedronStrings.`inline-block`
import typingsSlinky.hedron.hedronStrings.`inline-flex`
import typingsSlinky.hedron.hedronStrings.`inline-grid`
import typingsSlinky.hedron.hedronStrings.`inline-table`
import typingsSlinky.hedron.hedronStrings.`inline`
import typingsSlinky.hedron.hedronStrings.`list-item`
import typingsSlinky.hedron.hedronStrings.`run-in`
import typingsSlinky.hedron.hedronStrings.`table-caption`
import typingsSlinky.hedron.hedronStrings.`table-cell`
import typingsSlinky.hedron.hedronStrings.`table-column-group`
import typingsSlinky.hedron.hedronStrings.`table-column`
import typingsSlinky.hedron.hedronStrings.`table-footer-group`
import typingsSlinky.hedron.hedronStrings.`table-header-group`
import typingsSlinky.hedron.hedronStrings.`table-row-group`
import typingsSlinky.hedron.hedronStrings.`table-row`
import typingsSlinky.hedron.hedronStrings.block
import typingsSlinky.hedron.hedronStrings.collapse
import typingsSlinky.hedron.hedronStrings.contents
import typingsSlinky.hedron.hedronStrings.flex
import typingsSlinky.hedron.hedronStrings.grid
import typingsSlinky.hedron.hedronStrings.hidden
import typingsSlinky.hedron.hedronStrings.inherit
import typingsSlinky.hedron.hedronStrings.initial
import typingsSlinky.hedron.hedronStrings.none
import typingsSlinky.hedron.hedronStrings.table
import typingsSlinky.hedron.hedronStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styleable extends js.Object {
  /**
    * Background Property
    */
  var background: js.UndefOr[String] = js.native
  /**
    * Border property
    */
  var border: js.UndefOr[String] = js.native
  /**
    * Display Property
    */
  var display: js.UndefOr[
    `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
  ] = js.native
  /**
    * Height Property
    */
  var height: js.UndefOr[String] = js.native
  /**
    * Controls hidden
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The amount of padding added
    */
  var margin: js.UndefOr[String] = js.native
  /**
    * Opacity Property
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The amount of padding added
    */
  var padding: js.UndefOr[String] = js.native
  /**
    * Visibilty Property
    */
  var visibility: js.UndefOr[visible | hidden | collapse | initial | inherit] = js.native
  /**
    * Width Property
    */
  var width: js.UndefOr[String] = js.native
}

object Styleable {
  @scala.inline
  def apply(): Styleable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styleable]
  }
  @scala.inline
  implicit class StyleableOps[Self <: Styleable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(
      value: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: visible | hidden | collapse | initial | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

