package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.DataSource
import typingsSlinky.cesium.mod.DataSourceDisplay.VisualizersCallback
import typingsSlinky.cesium.mod.Visualizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceCollection extends StObject {
  
  var dataSourceCollection: typingsSlinky.cesium.mod.DataSourceCollection = js.native
  
  var scene: typingsSlinky.cesium.mod.Scene = js.native
  
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.native
}
object DataSourceCollection {
  
  @scala.inline
  def apply(
    dataSourceCollection: typingsSlinky.cesium.mod.DataSourceCollection,
    scene: typingsSlinky.cesium.mod.Scene
  ): DataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCollection]
  }
  
  @scala.inline
  implicit class DataSourceCollectionMutableBuilder[Self <: DataSourceCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceCollection(value: typingsSlinky.cesium.mod.DataSourceCollection): Self = StObject.set(x, "dataSourceCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: typingsSlinky.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualizersCallback(
      value: (/* scene */ typingsSlinky.cesium.mod.Scene, /* dataSource */ DataSource) => js.Array[Visualizer]
    ): Self = StObject.set(x, "visualizersCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVisualizersCallbackUndefined: Self = StObject.set(x, "visualizersCallback", js.undefined)
  }
}
