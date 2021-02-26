package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MediaContent
import typingsSlinky.arcgisJsApi.esri.MediaContentConstructor
import typingsSlinky.arcgisJsApi.esri.MediaContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/MediaContent", JSImport.Namespace)
  @js.native
  val ^ : MediaContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/MediaContent", JSImport.Namespace)
  @js.native
  /**
    * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
    */
  class Class () extends MediaContent {
    def this(properties: MediaContentProperties) = this()
  }
  
  type _To = MediaContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mediaContentMod.foo` */
  override def _to: MediaContentConstructor = ^
}
