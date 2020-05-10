package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Command
import typingsSlinky.cesium.mod.ImageryProvider
import typingsSlinky.cesium.mod.ProviderViewModel.CreationFunction
import typingsSlinky.cesium.mod.TerrainProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCategory extends js.Object {
  var category: js.UndefOr[String] = js.native
  var creationFunction: CreationFunction | Command = js.native
  var iconUrl: String = js.native
  var name: String = js.native
  var tooltip: String = js.native
}

object AnonCategory {
  @scala.inline
  def apply(creationFunction: CreationFunction | Command, iconUrl: String, name: String, tooltip: String): AnonCategory = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
  @scala.inline
  implicit class AnonCategoryOps[Self <: AnonCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationFunctionFunction0(value: () => ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationFunction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreationFunction(value: CreationFunction | Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
  }
  
}

