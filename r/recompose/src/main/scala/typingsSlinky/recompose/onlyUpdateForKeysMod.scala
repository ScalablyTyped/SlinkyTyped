package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#onlyupdateforkeys
@JSImport("recompose/onlyUpdateForKeys", JSImport.Namespace)
@js.native
object onlyUpdateForKeysMod extends js.Object {
  
  def default(propKeys: js.Array[String]): InferableComponentEnhancer[js.Object] = js.native
  @JSName("default")
  def default_T[T](propKeys: js.Array[/* keyof T */ String]): InferableComponentEnhancer[js.Object] = js.native
}
