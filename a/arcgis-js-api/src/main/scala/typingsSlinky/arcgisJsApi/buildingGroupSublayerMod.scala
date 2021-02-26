package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BuildingGroupSublayer
import typingsSlinky.arcgisJsApi.esri.BuildingGroupSublayerConstructor
import typingsSlinky.arcgisJsApi.esri.BuildingGroupSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingGroupSublayerMod extends Shortcut {
  
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  val ^ : BuildingGroupSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  class Class () extends BuildingGroupSublayer {
    def this(properties: BuildingGroupSublayerProperties) = this()
  }
  
  type _To = BuildingGroupSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingGroupSublayerMod.foo` */
  override def _to: BuildingGroupSublayerConstructor = ^
}
