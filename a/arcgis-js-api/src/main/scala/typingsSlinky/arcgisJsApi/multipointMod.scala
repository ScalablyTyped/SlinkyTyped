package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Multipoint
import typingsSlinky.arcgisJsApi.esri.MultipointConstructor
import typingsSlinky.arcgisJsApi.esri.MultipointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipointMod extends Shortcut {
  
  @JSImport("esri/geometry/Multipoint", JSImport.Namespace)
  @js.native
  val ^ : MultipointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Multipoint", JSImport.Namespace)
  @js.native
  class Class () extends Multipoint {
    def this(properties: MultipointProperties) = this()
  }
  
  type _To = MultipointConstructor
  
  /* This means you don't have to write `^`, but can instead just say `multipointMod.foo` */
  override def _to: MultipointConstructor = ^
}
