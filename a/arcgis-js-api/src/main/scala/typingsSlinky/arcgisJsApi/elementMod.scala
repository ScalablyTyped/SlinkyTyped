package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Element
import typingsSlinky.arcgisJsApi.esri.ElementConstructor
import typingsSlinky.arcgisJsApi.esri.ElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod extends Shortcut {
  
  @JSImport("esri/form/elements/Element", JSImport.Namespace)
  @js.native
  val ^ : ElementConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/Element", JSImport.Namespace)
  @js.native
  /**
    * Form elements define what should display within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html)
    */
  class Class () extends Element {
    def this(properties: ElementProperties) = this()
  }
  
  type _To = ElementConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elementMod.foo` */
  override def _to: ElementConstructor = ^
}
