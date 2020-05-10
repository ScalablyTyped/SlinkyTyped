package typingsSlinky.officeUiFabricReact.resizeGroupOverflowSetExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeGroupOverflowSetExampleState extends js.Object {
  var buttonsChecked: Boolean = js.native
  var cachingEnabled: Boolean = js.native
  var numberOfItems: Double = js.native
  var onGrowDataEnabled: Boolean = js.native
  var short: Boolean = js.native
}

object IResizeGroupOverflowSetExampleState {
  @scala.inline
  def apply(
    buttonsChecked: Boolean,
    cachingEnabled: Boolean,
    numberOfItems: Double,
    onGrowDataEnabled: Boolean,
    short: Boolean
  ): IResizeGroupOverflowSetExampleState = {
    val __obj = js.Dynamic.literal(buttonsChecked = buttonsChecked.asInstanceOf[js.Any], cachingEnabled = cachingEnabled.asInstanceOf[js.Any], numberOfItems = numberOfItems.asInstanceOf[js.Any], onGrowDataEnabled = onGrowDataEnabled.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeGroupOverflowSetExampleState]
  }
  @scala.inline
  implicit class IResizeGroupOverflowSetExampleStateOps[Self <: IResizeGroupOverflowSetExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonsChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnGrowDataEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGrowDataEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

