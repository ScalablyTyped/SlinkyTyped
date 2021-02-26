package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SizeVariable
import typingsSlinky.arcgisJsApi.esri.SizeVariableConstructor
import typingsSlinky.arcgisJsApi.esri.SizeVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
  @js.native
  val ^ : SizeVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
  @js.native
  /**
    * The size visual variable defines the size of individual features in a layer based on a numeric (often thematic) value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html)
    */
  class Class () extends SizeVariable {
    def this(properties: SizeVariableProperties) = this()
  }
  
  type _To = SizeVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sizeVariableMod.foo` */
  override def _to: SizeVariableConstructor = ^
}
