package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.UpdateWorkflow
import typingsSlinky.arcgisJsApi.esri.UpdateWorkflowConstructor
import typingsSlinky.arcgisJsApi.esri.UpdateWorkflowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateWorkflowMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/UpdateWorkflow", JSImport.Namespace)
  @js.native
  val ^ : UpdateWorkflowConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/UpdateWorkflow", JSImport.Namespace)
  @js.native
  /**
    * A read-only class containing the logic used when updating and/or deleting features using the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html)
    */
  class Class () extends UpdateWorkflow {
    def this(properties: UpdateWorkflowProperties) = this()
  }
  
  type _To = UpdateWorkflowConstructor
  
  /* This means you don't have to write `^`, but can instead just say `updateWorkflowMod.foo` */
  override def _to: UpdateWorkflowConstructor = ^
}
