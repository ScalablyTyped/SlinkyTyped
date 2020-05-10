package typingsSlinky.cesium

import typingsSlinky.cesium.mod.DataSource
import typingsSlinky.cesium.mod.DataSourceCollection
import typingsSlinky.cesium.mod.DataSourceDisplay.VisualizersCallback
import typingsSlinky.cesium.mod.Scene
import typingsSlinky.cesium.mod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataSourceCollection extends js.Object {
  var dataSourceCollection: DataSourceCollection = js.native
  var scene: Scene = js.native
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.native
}

object AnonDataSourceCollection {
  @scala.inline
  def apply(dataSourceCollection: DataSourceCollection, scene: Scene): AnonDataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataSourceCollection]
  }
  @scala.inline
  implicit class AnonDataSourceCollectionOps[Self <: AnonDataSourceCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceCollection(value: DataSourceCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualizersCallback(value: (/* scene */ Scene, /* dataSource */ DataSource) => js.Array[Visualizer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualizersCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVisualizersCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualizersCallback")(js.undefined)
        ret
    }
  }
  
}

