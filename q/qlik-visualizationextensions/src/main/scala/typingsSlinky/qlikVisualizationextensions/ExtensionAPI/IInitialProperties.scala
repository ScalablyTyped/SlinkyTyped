package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInitialProperties extends js.Object {
   // IListObjectDef;
  var fixed: js.UndefOr[Boolean] = js.native
  var percent: js.UndefOr[Boolean] = js.native
  var qHyperCubeDef: js.UndefOr[js.Any] = js.native
   // IHyperCubeDef;
  var qListObjectDef: js.UndefOr[js.Any] = js.native
  var selectionMode: js.UndefOr[SelectionModeType] = js.native
  var width: js.UndefOr[Double] = js.native
}

object IInitialProperties {
  @scala.inline
  def apply(): IInitialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitialProperties]
  }
  @scala.inline
  implicit class IInitialPropertiesOps[Self <: IInitialProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withQHyperCubeDef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHyperCubeDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQHyperCubeDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHyperCubeDef")(js.undefined)
        ret
    }
    @scala.inline
    def withQListObjectDef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qListObjectDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQListObjectDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qListObjectDef")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionModeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

