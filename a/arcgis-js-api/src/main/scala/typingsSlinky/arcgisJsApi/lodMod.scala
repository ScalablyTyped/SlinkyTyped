package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.LOD
import typingsSlinky.arcgisJsApi.esri.LODConstructor
import typingsSlinky.arcgisJsApi.esri.LODProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lodMod extends Shortcut {
  
  @JSImport("esri/layers/support/LOD", JSImport.Namespace)
  @js.native
  val ^ : LODConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/LOD", JSImport.Namespace)
  @js.native
  class Class () extends LOD {
    def this(properties: LODProperties) = this()
  }
  
  type _To = LODConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lodMod.foo` */
  override def _to: LODConstructor = ^
}
