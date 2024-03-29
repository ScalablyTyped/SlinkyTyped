package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.GeneralizeParameters
import typingsSlinky.arcgisJsApi.esri.GeneralizeParametersConstructor
import typingsSlinky.arcgisJsApi.esri.GeneralizeParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalizeParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/GeneralizeParameters", JSImport.Namespace)
  @js.native
  val ^ : GeneralizeParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/GeneralizeParameters", JSImport.Namespace)
  @js.native
  class Class () extends GeneralizeParameters {
    def this(properties: GeneralizeParametersProperties) = this()
  }
  
  type _To = GeneralizeParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `generalizeParametersMod.foo` */
  override def _to: GeneralizeParametersConstructor = ^
}
