package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ClosestFacilitySolveResult
import typingsSlinky.arcgisJsApi.esri.ClosestFacilitySolveResultConstructor
import typingsSlinky.arcgisJsApi.esri.ClosestFacilitySolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestFacilitySolveResultMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ClosestFacilitySolveResult", JSImport.Namespace)
  @js.native
  val ^ : ClosestFacilitySolveResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ClosestFacilitySolveResult", JSImport.Namespace)
  @js.native
  /**
    * The result from [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html)
    */
  class Class () extends ClosestFacilitySolveResult {
    def this(properties: ClosestFacilitySolveResultProperties) = this()
  }
  
  type _To = ClosestFacilitySolveResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `closestFacilitySolveResultMod.foo` */
  override def _to: ClosestFacilitySolveResultConstructor = ^
}
