package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Callout3D
import typingsSlinky.arcgisJsApi.esri.Callout3DConstructor
import typingsSlinky.arcgisJsApi.esri.Callout3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callout3DMod extends Shortcut {
  
  @JSImport("esri/symbols/callouts/Callout3D", JSImport.Namespace)
  @js.native
  val ^ : Callout3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/callouts/Callout3D", JSImport.Namespace)
  @js.native
  /**
    * When symbols have an offset from their position, it's important to still see what the real location is.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html)
    */
  class Class () extends Callout3D {
    def this(properties: Callout3DProperties) = this()
  }
  
  type _To = Callout3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `callout3DMod.foo` */
  override def _to: Callout3DConstructor = ^
}
