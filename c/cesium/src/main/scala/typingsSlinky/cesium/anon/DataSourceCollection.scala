package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.DataSource
import typingsSlinky.cesium.mod.DataSourceDisplay.VisualizersCallback
import typingsSlinky.cesium.mod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceCollection extends js.Object {
  var dataSourceCollection: typingsSlinky.cesium.mod.DataSourceCollection
  var scene: typingsSlinky.cesium.mod.Scene
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}

object DataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: typingsSlinky.cesium.mod.DataSourceCollection,
    scene: typingsSlinky.cesium.mod.Scene,
    visualizersCallback: (/* scene */ typingsSlinky.cesium.mod.Scene, /* dataSource */ DataSource) => js.Array[Visualizer] = null
  ): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(js.Any.fromFunction2(visualizersCallback))
    __obj.asInstanceOf[DataSourceCollection]
  }
}

