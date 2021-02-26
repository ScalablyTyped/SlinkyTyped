package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.AttachmentsContentConstructor
import typingsSlinky.arcgisJsApi.esri.AttachmentsContentProperties
import typingsSlinky.arcgisJsApi.esri.CustomContentConstructor
import typingsSlinky.arcgisJsApi.esri.CustomContentProperties
import typingsSlinky.arcgisJsApi.esri.FieldsContentConstructor
import typingsSlinky.arcgisJsApi.esri.FieldsContentProperties
import typingsSlinky.arcgisJsApi.esri.MediaContentConstructor
import typingsSlinky.arcgisJsApi.esri.MediaContentProperties
import typingsSlinky.arcgisJsApi.esri.TextContentConstructor
import typingsSlinky.arcgisJsApi.esri.TextContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Content](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content.html)
  */
object content {
  
  @JSGlobal("__esri.content.AttachmentsContent")
  @js.native
  val AttachmentsContent: AttachmentsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.AttachmentsContent")
  @js.native
  /**
    * An `AttachmentsContent` popup element represents an attachment element associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
    */
  class AttachmentsContentCls ()
    extends typingsSlinky.arcgisJsApi.esri.AttachmentsContent {
    def this(properties: AttachmentsContentProperties) = this()
  }
  
  @JSGlobal("__esri.content.CustomContent")
  @js.native
  val CustomContent: CustomContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.CustomContent")
  @js.native
  class CustomContentCls ()
    extends typingsSlinky.arcgisJsApi.esri.CustomContent {
    def this(properties: CustomContentProperties) = this()
  }
  
  @JSGlobal("__esri.content.FieldsContent")
  @js.native
  val FieldsContent: FieldsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.FieldsContent")
  @js.native
  /**
    * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
    */
  class FieldsContentCls ()
    extends typingsSlinky.arcgisJsApi.esri.FieldsContent {
    def this(properties: FieldsContentProperties) = this()
  }
  
  @JSGlobal("__esri.content.MediaContent")
  @js.native
  val MediaContent: MediaContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.MediaContent")
  @js.native
  /**
    * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
    */
  class MediaContentCls ()
    extends typingsSlinky.arcgisJsApi.esri.MediaContent {
    def this(properties: MediaContentProperties) = this()
  }
  
  @JSGlobal("__esri.content.TextContent")
  @js.native
  val TextContent: TextContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.content.TextContent")
  @js.native
  /**
    * A `TextContent` popup element is used to define descriptive text as an element within the [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
    */
  class TextContentCls ()
    extends typingsSlinky.arcgisJsApi.esri.TextContent {
    def this(properties: TextContentProperties) = this()
  }
}
