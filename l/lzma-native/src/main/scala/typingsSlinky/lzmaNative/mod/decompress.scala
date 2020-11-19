package typingsSlinky.lzmaNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lzma-native", "decompress")
@js.native
object decompress extends js.Object {
  
  def apply(buf: String): Unit = js.native
  def apply(
    buf: String,
    options: js.UndefOr[scala.Nothing],
    on_finish: js.Function1[/* result */ Buffer, Unit]
  ): Unit = js.native
  def apply(buf: String, options: LzmaOptions): Unit = js.native
  def apply(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def apply(buf: String, options: Preset): Unit = js.native
  def apply(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def apply(buf: Buffer): Unit = js.native
  def apply(
    buf: Buffer,
    options: js.UndefOr[scala.Nothing],
    on_finish: js.Function1[/* result */ Buffer, Unit]
  ): Unit = js.native
  def apply(buf: Buffer, options: LzmaOptions): Unit = js.native
  def apply(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def apply(buf: Buffer, options: Preset): Unit = js.native
  def apply(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
}
