package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BuildingPhase
import typingsSlinky.arcgisJsApi.esri.BuildingPhaseConstructor
import typingsSlinky.arcgisJsApi.esri.BuildingPhaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingPhaseMod extends Shortcut {
  
  @JSImport("esri/widgets/BuildingExplorer/BuildingPhase", JSImport.Namespace)
  @js.native
  val ^ : BuildingPhaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BuildingExplorer/BuildingPhase", JSImport.Namespace)
  @js.native
  class Class () extends BuildingPhase {
    def this(properties: BuildingPhaseProperties) = this()
  }
  
  type _To = BuildingPhaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingPhaseMod.foo` */
  override def _to: BuildingPhaseConstructor = ^
}
