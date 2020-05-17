package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.ProviderViewModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Globe extends js.Object {
  var globe: typingsSlinky.cesium.mod.Globe = js.native
  var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
  var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.native
  var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.native
}

object Globe {
  @scala.inline
  def apply(globe: typingsSlinky.cesium.mod.Globe): Globe = {
    val __obj = js.Dynamic.literal(globe = globe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globe]
  }
  @scala.inline
  implicit class GlobeOps[Self <: Globe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobe(value: typingsSlinky.cesium.mod.Globe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProviderViewModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageryProviderViewModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageryProviderViewModels")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedImageryProviderViewModel(value: ProviderViewModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageryProviderViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedImageryProviderViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedImageryProviderViewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTerrainProviderViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTerrainProviderViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTerrainProviderViewModel")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainProviderViewModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrainProviderViewModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrainProviderViewModels")(js.undefined)
        ret
    }
  }
  
}

