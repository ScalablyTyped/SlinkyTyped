package typingsSlinky.fundamentalReact.anon

import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
@js.native
trait WeakValidationMapTileProp extends js.Object {
  var active: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var backgroundImage: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
}

object WeakValidationMapTileProp {
  @scala.inline
  def apply(): WeakValidationMapTileProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileProp]
  }
  @scala.inline
  implicit class WeakValidationMapTilePropOps[Self <: WeakValidationMapTileProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImage(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
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
    def withDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def withOnClick(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
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
    def withTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

