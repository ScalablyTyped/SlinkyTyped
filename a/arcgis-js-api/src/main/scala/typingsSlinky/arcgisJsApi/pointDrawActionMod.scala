package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PointDrawAction
import typingsSlinky.arcgisJsApi.esri.PointDrawActionConstructor
import typingsSlinky.arcgisJsApi.esri.PointDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/PointDrawAction", JSImport.Namespace)
  @js.native
  val ^ : PointDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/PointDrawAction", JSImport.Namespace)
  @js.native
  class Class () extends PointDrawAction {
    def this(properties: PointDrawActionProperties) = this()
  }
  
  type _To = PointDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointDrawActionMod.foo` */
  override def _to: PointDrawActionConstructor = ^
}
