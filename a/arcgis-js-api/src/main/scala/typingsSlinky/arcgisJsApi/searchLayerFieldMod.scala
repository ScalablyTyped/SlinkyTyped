package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SearchLayerField
import typingsSlinky.arcgisJsApi.esri.SearchLayerFieldConstructor
import typingsSlinky.arcgisJsApi.esri.SearchLayerFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchLayerFieldMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/SearchLayerField", JSImport.Namespace)
  @js.native
  val ^ : SearchLayerFieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/SearchLayerField", JSImport.Namespace)
  @js.native
  class Class () extends SearchLayerField {
    def this(properties: SearchLayerFieldProperties) = this()
  }
  
  type _To = SearchLayerFieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `searchLayerFieldMod.foo` */
  override def _to: SearchLayerFieldConstructor = ^
}
