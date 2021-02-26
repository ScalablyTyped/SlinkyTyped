package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.BasemapGalleryItem
import typingsSlinky.arcgisJsApi.esri.BasemapGalleryItemConstructor
import typingsSlinky.arcgisJsApi.esri.BasemapGalleryItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapGalleryItemMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/support/BasemapGalleryItem", JSImport.Namespace)
  @js.native
  val ^ : BasemapGalleryItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/support/BasemapGalleryItem", JSImport.Namespace)
  @js.native
  class Class () extends BasemapGalleryItem {
    def this(properties: BasemapGalleryItemProperties) = this()
  }
  
  type _To = BasemapGalleryItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapGalleryItemMod.foo` */
  override def _to: BasemapGalleryItemConstructor = ^
}
