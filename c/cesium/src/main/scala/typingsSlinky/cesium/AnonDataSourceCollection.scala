package typingsSlinky.cesium

import typingsSlinky.cesium.mod.DataSource
import typingsSlinky.cesium.mod.DataSourceCollection
import typingsSlinky.cesium.mod.DataSourceDisplay.VisualizersCallback
import typingsSlinky.cesium.mod.Scene
import typingsSlinky.cesium.mod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSourceCollection extends js.Object {
  var dataSourceCollection: DataSourceCollection
  var scene: Scene
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}

object AnonDataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: DataSourceCollection,
    scene: Scene,
    visualizersCallback: (/* scene */ Scene, /* dataSource */ DataSource) => js.Array[Visualizer] = null
  ): AnonDataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(js.Any.fromFunction2(visualizersCallback))
    __obj.asInstanceOf[AnonDataSourceCollection]
  }
}

