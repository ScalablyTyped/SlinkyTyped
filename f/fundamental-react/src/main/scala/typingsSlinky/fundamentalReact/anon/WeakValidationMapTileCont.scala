package typingsSlinky.fundamentalReact.anon

import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
@js.native
trait WeakValidationMapTileCont extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var headingLevel: js.UndefOr[Validator[js.UndefOr[`2` | `3` | `4` | `5` | `6` | Null]]] = js.native
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var titleProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
}

object WeakValidationMapTileCont {
  @scala.inline
  def apply(): WeakValidationMapTileCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileCont]
  }
  @scala.inline
  implicit class WeakValidationMapTileContOps[Self <: WeakValidationMapTileCont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingLevel(value: Validator[js.UndefOr[`2` | `3` | `4` | `5` | `6` | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProductTile(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTile")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleProps(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(js.undefined)
        ret
    }
  }
  
}

