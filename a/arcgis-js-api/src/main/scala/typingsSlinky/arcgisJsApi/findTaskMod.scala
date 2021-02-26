package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FindTask
import typingsSlinky.arcgisJsApi.esri.FindTaskConstructor
import typingsSlinky.arcgisJsApi.esri.FindTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/FindTask", JSImport.Namespace)
  @js.native
  val ^ : FindTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/FindTask", JSImport.Namespace)
  @js.native
  /**
    * Search a map service exposed by the ArcGIS Server REST API based on a string value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html)
    */
  class Class () extends FindTask {
    def this(properties: FindTaskProperties) = this()
  }
  
  type _To = FindTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `findTaskMod.foo` */
  override def _to: FindTaskConstructor = ^
}
