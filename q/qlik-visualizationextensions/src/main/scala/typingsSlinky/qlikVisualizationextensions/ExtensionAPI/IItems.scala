package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItems
  extends /* other */ StringDictionary[js.Any] {
  var AddOns: js.UndefOr[IAddOns] = js.native
  var appearance: js.UndefOr[IAppearance] = js.native
  var dimentions: js.UndefOr[IDimensions] = js.native
  var measures: js.UndefOr[IMeasures] = js.native
  var sorting: js.UndefOr[ISorting] = js.native
}

object IItems {
  @scala.inline
  def apply(): IItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItems]
  }
  @scala.inline
  implicit class IItemsOps[Self <: IItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOns(value: IAddOns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddOns")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearance(value: IAppearance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def withDimentions(value: IDimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimentions")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasures(value: IMeasures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: ISorting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
  }
  
}

