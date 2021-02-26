package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.AttachmentQuery
import typingsSlinky.arcgisJsApi.esri.AttachmentQueryConstructor
import typingsSlinky.arcgisJsApi.esri.AttachmentQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentQueryMod extends Shortcut {
  
  @JSImport("esri/tasks/support/AttachmentQuery", JSImport.Namespace)
  @js.native
  val ^ : AttachmentQueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/AttachmentQuery", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for executing queries for feature attachments from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html)
    */
  class Class () extends AttachmentQuery {
    def this(properties: AttachmentQueryProperties) = this()
  }
  
  type _To = AttachmentQueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attachmentQueryMod.foo` */
  override def _to: AttachmentQueryConstructor = ^
}
