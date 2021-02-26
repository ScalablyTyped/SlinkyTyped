package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.HandleOwner
import typingsSlinky.arcgisJsApi.esri.HandleOwnerConstructor
import typingsSlinky.arcgisJsApi.esri.HandleOwnerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleOwnerMod extends Shortcut {
  
  @JSImport("esri/core/HandleOwner", JSImport.Namespace)
  @js.native
  val ^ : HandleOwnerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/HandleOwner", JSImport.Namespace)
  @js.native
  class Class () extends HandleOwner {
    def this(properties: HandleOwnerProperties) = this()
  }
  
  type _To = HandleOwnerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `handleOwnerMod.foo` */
  override def _to: HandleOwnerConstructor = ^
}
