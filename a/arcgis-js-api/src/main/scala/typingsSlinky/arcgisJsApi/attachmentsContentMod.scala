package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AttachmentsContent
import typingsSlinky.arcgisJsApi.esri.AttachmentsContentConstructor
import typingsSlinky.arcgisJsApi.esri.AttachmentsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentsContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
  @js.native
  val ^ : AttachmentsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
  @js.native
  /**
    * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
    */
  class Class () extends AttachmentsContent {
    def this(properties: AttachmentsContentProperties) = this()
  }
  
  type _To = AttachmentsContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attachmentsContentMod.foo` */
  override def _to: AttachmentsContentConstructor = ^
}
