package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BuildingFilter
import typingsSlinky.arcgisJsApi.esri.BuildingFilterConstructor
import typingsSlinky.arcgisJsApi.esri.BuildingFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingFilterMod extends Shortcut {
  
  @JSImport("esri/layers/support/BuildingFilter", JSImport.Namespace)
  @js.native
  val ^ : BuildingFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/BuildingFilter", JSImport.Namespace)
  @js.native
  class Class () extends BuildingFilter {
    def this(properties: BuildingFilterProperties) = this()
  }
  
  type _To = BuildingFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingFilterMod.foo` */
  override def _to: BuildingFilterConstructor = ^
}
