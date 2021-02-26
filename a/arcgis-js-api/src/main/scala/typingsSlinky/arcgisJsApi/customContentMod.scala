package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.CustomContent
import typingsSlinky.arcgisJsApi.esri.CustomContentConstructor
import typingsSlinky.arcgisJsApi.esri.CustomContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/CustomContent", JSImport.Namespace)
  @js.native
  val ^ : CustomContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/CustomContent", JSImport.Namespace)
  @js.native
  class Class () extends CustomContent {
    def this(properties: CustomContentProperties) = this()
  }
  
  type _To = CustomContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `customContentMod.foo` */
  override def _to: CustomContentConstructor = ^
}
