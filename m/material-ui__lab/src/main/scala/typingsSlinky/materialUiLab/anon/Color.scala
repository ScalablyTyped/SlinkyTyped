package typingsSlinky.materialUiLab.anon

import typingsSlinky.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typingsSlinky.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typingsSlinky.materialUiLab.materialUiLabStrings.first
import typingsSlinky.materialUiLab.materialUiLabStrings.large
import typingsSlinky.materialUiLab.materialUiLabStrings.last
import typingsSlinky.materialUiLab.materialUiLabStrings.medium
import typingsSlinky.materialUiLab.materialUiLabStrings.next
import typingsSlinky.materialUiLab.materialUiLabStrings.outlined
import typingsSlinky.materialUiLab.materialUiLabStrings.page
import typingsSlinky.materialUiLab.materialUiLabStrings.previous
import typingsSlinky.materialUiLab.materialUiLabStrings.primary
import typingsSlinky.materialUiLab.materialUiLabStrings.round
import typingsSlinky.materialUiLab.materialUiLabStrings.rounded
import typingsSlinky.materialUiLab.materialUiLabStrings.secondary
import typingsSlinky.materialUiLab.materialUiLabStrings.small
import typingsSlinky.materialUiLab.materialUiLabStrings.standard
import typingsSlinky.materialUiLab.materialUiLabStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  /**
    * The active color.
    */
  var color: js.UndefOr[standard | primary | secondary] = js.native
  /**
    * If `true`, the item will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The current page number.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * If `true` the pagination item is selected.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * The shape of the pagination item.
    */
  var shape: js.UndefOr[round | rounded] = js.native
  /**
    * The size of the pagination item.
    */
  var size: js.UndefOr[small | medium | large] = js.native
  /**
    * The type of pagination item.
    */
  var `type`: js.UndefOr[page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`] = js.native
  /**
    * The pagination item variant.
    */
  var variant: js.UndefOr[text | outlined] = js.native
}

object Color {
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: standard | primary | secondary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: round | rounded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: text | outlined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

