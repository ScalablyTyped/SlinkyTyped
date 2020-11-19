package typingsSlinky.babelJest.mod

import typingsSlinky.babelCore.mod.TransformOptions
import typingsSlinky.babelJest.babelJestBooleans.`true`
import typingsSlinky.std.TransformStreamDefaultControllerCallback
import typingsSlinky.std.TransformStreamDefaultControllerTransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-jest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var canInstrument: `true` = js.native
  
  def createTransformer(): BabelJestTransformer = js.native
  def createTransformer(options: TransformOptions): BabelJestTransformer = js.native
  
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[_]] = js.native
  
  var readableType: js.UndefOr[scala.Nothing] = js.native
  
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[_]] = js.native
  
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[_, _]] = js.native
  
  var writableType: js.UndefOr[scala.Nothing] = js.native
}
