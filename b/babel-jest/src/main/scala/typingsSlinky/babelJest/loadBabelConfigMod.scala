package typingsSlinky.babelJest

import typingsSlinky.babelCore.anon.ReadonlyPartialConfig
import typingsSlinky.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-jest/build/loadBabelConfig", JSImport.Namespace)
@js.native
object loadBabelConfigMod extends js.Object {
  def loadPartialConfig(): ReadonlyPartialConfig | Null = js.native
  def loadPartialConfig(options: TransformOptions): ReadonlyPartialConfig | Null = js.native
}

