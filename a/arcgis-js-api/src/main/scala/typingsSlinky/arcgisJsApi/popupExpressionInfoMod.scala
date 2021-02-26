package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.popupExpressionInfo
import typingsSlinky.arcgisJsApi.esri.popupExpressionInfoConstructor
import typingsSlinky.arcgisJsApi.esri.popupExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupExpressionInfoMod extends Shortcut {
  
  @JSImport("esri/popup/ExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : popupExpressionInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/ExpressionInfo", JSImport.Namespace)
  @js.native
  class Class () extends popupExpressionInfo {
    def this(properties: popupExpressionInfoProperties) = this()
  }
  
  type _To = popupExpressionInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `popupExpressionInfoMod.foo` */
  override def _to: popupExpressionInfoConstructor = ^
}
