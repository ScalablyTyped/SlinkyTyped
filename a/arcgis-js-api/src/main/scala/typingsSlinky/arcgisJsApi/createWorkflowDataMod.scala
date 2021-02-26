package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.CreateWorkflowData
import typingsSlinky.arcgisJsApi.esri.CreateWorkflowDataConstructor
import typingsSlinky.arcgisJsApi.esri.CreateWorkflowDataProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createWorkflowDataMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/CreateWorkflowData", JSImport.Namespace)
  @js.native
  val ^ : CreateWorkflowDataConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/CreateWorkflowData", JSImport.Namespace)
  @js.native
  class Class () extends CreateWorkflowData {
    def this(properties: CreateWorkflowDataProperties) = this()
  }
  
  type _To = CreateWorkflowDataConstructor
  
  /* This means you don't have to write `^`, but can instead just say `createWorkflowDataMod.foo` */
  override def _to: CreateWorkflowDataConstructor = ^
}
