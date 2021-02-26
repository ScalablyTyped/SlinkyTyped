package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.FieldsContent
import typingsSlinky.arcgisJsApi.esri.FieldsContentConstructor
import typingsSlinky.arcgisJsApi.esri.FieldsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
  @js.native
  val ^ : FieldsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
  @js.native
  /**
    * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
    */
  class Class () extends FieldsContent {
    def this(properties: FieldsContentProperties) = this()
  }
  
  type _To = FieldsContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldsContentMod.foo` */
  override def _to: FieldsContentConstructor = ^
}
