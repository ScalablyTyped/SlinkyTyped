package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BuildingExplorer
import typingsSlinky.arcgisJsApi.esri.BuildingExplorerConstructor
import typingsSlinky.arcgisJsApi.esri.BuildingExplorerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingExplorerMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer", JSImport.Namespace)
  @js.native
  val ^ : BuildingExplorerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer", JSImport.Namespace)
  @js.native
  /**
    * The BuildingExplorer widget is used to filter and explore the various components of [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html)
    */
  class Class () extends BuildingExplorer {
    def this(properties: BuildingExplorerProperties) = this()
  }
  
  type _To = BuildingExplorerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingExplorerMod.foo` */
  override def _to: BuildingExplorerConstructor = ^
}
