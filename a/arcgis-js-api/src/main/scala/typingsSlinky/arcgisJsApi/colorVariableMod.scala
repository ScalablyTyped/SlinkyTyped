package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ColorVariable
import typingsSlinky.arcgisJsApi.esri.ColorVariableConstructor
import typingsSlinky.arcgisJsApi.esri.ColorVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/ColorVariable", JSImport.Namespace)
  @js.native
  val ^ : ColorVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/ColorVariable", JSImport.Namespace)
  @js.native
  /**
    * The color visual variable is used to visualize features along a continuous color ramp based on the values of a numeric attribute [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#field) or an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html)
    */
  class Class () extends ColorVariable {
    def this(properties: ColorVariableProperties) = this()
  }
  
  type _To = ColorVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorVariableMod.foo` */
  override def _to: ColorVariableConstructor = ^
}
