package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.RotationVariable
import typingsSlinky.arcgisJsApi.esri.RotationVariableConstructor
import typingsSlinky.arcgisJsApi.esri.RotationVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/RotationVariable", JSImport.Namespace)
  @js.native
  val ^ : RotationVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/RotationVariable", JSImport.Namespace)
  @js.native
  /**
    * The rotation visual variable defines how features rendered with [marker symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html) or [text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html) in a MapView are rotated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html)
    */
  class Class () extends RotationVariable {
    def this(properties: RotationVariableProperties) = this()
  }
  
  type _To = RotationVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rotationVariableMod.foo` */
  override def _to: RotationVariableConstructor = ^
}
