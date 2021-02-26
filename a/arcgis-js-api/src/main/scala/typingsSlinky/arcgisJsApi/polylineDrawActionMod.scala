package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PolylineDrawAction
import typingsSlinky.arcgisJsApi.esri.PolylineDrawActionConstructor
import typingsSlinky.arcgisJsApi.esri.PolylineDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/PolylineDrawAction", JSImport.Namespace)
  @js.native
  val ^ : PolylineDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/PolylineDrawAction", JSImport.Namespace)
  @js.native
  class Class () extends PolylineDrawAction {
    def this(properties: PolylineDrawActionProperties) = this()
  }
  
  type _To = PolylineDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polylineDrawActionMod.foo` */
  override def _to: PolylineDrawActionConstructor = ^
}
