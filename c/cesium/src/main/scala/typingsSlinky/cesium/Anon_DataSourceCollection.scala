package typingsSlinky.cesium

import typingsSlinky.cesium.cesiumMod.DataSource
import typingsSlinky.cesium.cesiumMod.DataSourceCollection
import typingsSlinky.cesium.cesiumMod.DataSourceDisplay.VisualizersCallback
import typingsSlinky.cesium.cesiumMod.Scene
import typingsSlinky.cesium.cesiumMod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourceCollection extends js.Object {
  var dataSourceCollection: DataSourceCollection
  var scene: Scene
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}

object Anon_DataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: DataSourceCollection,
    scene: Scene,
    visualizersCallback: (/* scene */ Scene, /* dataSource */ DataSource) => js.Array[Visualizer] = null
  ): Anon_DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(js.Any.fromFunction2(visualizersCallback))
    __obj.asInstanceOf[Anon_DataSourceCollection]
  }
}

