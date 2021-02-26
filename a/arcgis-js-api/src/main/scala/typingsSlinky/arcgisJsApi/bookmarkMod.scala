package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Bookmark
import typingsSlinky.arcgisJsApi.esri.BookmarkConstructor
import typingsSlinky.arcgisJsApi.esri.BookmarkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarkMod extends Shortcut {
  
  @JSImport("esri/webmap/Bookmark", JSImport.Namespace)
  @js.native
  val ^ : BookmarkConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/Bookmark", JSImport.Namespace)
  @js.native
  class Class () extends Bookmark {
    def this(properties: BookmarkProperties) = this()
  }
  
  type _To = BookmarkConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bookmarkMod.foo` */
  override def _to: BookmarkConstructor = ^
}
