package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ImageServiceIdentifyTaskConstructor
import typingsSlinky.arcgisJsApi.esri.ImageServiceIdentifyTaskProperties
import typingsSlinky.arcgisJsApi.esri.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageServiceIdentifyTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/ImageServiceIdentifyTask", JSImport.Namespace)
  @js.native
  val ^ : ImageServiceIdentifyTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/ImageServiceIdentifyTask", JSImport.Namespace)
  @js.native
  class Class () extends Task {
    def this(properties: ImageServiceIdentifyTaskProperties) = this()
  }
  
  type _To = ImageServiceIdentifyTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageServiceIdentifyTaskMod.foo` */
  override def _to: ImageServiceIdentifyTaskConstructor = ^
}
