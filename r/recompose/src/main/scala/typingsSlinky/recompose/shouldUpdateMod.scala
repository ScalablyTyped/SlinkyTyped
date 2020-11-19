package typingsSlinky.recompose

import typingsSlinky.recompose.mod.InferableComponentEnhancer
import typingsSlinky.recompose.mod.predicateDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#shouldupdate
@JSImport("recompose/shouldUpdate", JSImport.Namespace)
@js.native
object shouldUpdateMod extends js.Object {
  
  def default[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
}
