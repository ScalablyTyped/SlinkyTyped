package typingsSlinky.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lzma-native", "Compressor")
@js.native
object Compressor extends js.Object {
  
  def apply(): JSLzmaStream = js.native
  def apply(preset: js.UndefOr[scala.Nothing], options: LzmaOptions): JSLzmaStream = js.native
  def apply(preset: Preset): JSLzmaStream = js.native
  def apply(preset: Preset, options: LzmaOptions): JSLzmaStream = js.native
}
