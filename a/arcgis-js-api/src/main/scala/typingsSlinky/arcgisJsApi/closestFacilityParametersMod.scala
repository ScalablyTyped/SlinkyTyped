package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ClosestFacilityParameters
import typingsSlinky.arcgisJsApi.esri.ClosestFacilityParametersConstructor
import typingsSlinky.arcgisJsApi.esri.ClosestFacilityParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestFacilityParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  val ^ : ClosestFacilityParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html)
    */
  class Class () extends ClosestFacilityParameters {
    def this(properties: ClosestFacilityParametersProperties) = this()
  }
  
  type _To = ClosestFacilityParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `closestFacilityParametersMod.foo` */
  override def _to: ClosestFacilityParametersConstructor = ^
}
