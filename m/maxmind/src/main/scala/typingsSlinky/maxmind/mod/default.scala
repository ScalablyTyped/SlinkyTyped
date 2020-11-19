package typingsSlinky.maxmind.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind", JSImport.Default)
@js.native
object default extends js.Object {
  
  def init(): scala.Nothing = js.native
  
  def open[T](filepath: String): js.Promise[typingsSlinky.maxmind.readerMod.default[T]] = js.native
  def open[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[typingsSlinky.maxmind.readerMod.default[T]] = js.native
  def open[T](filepath: String, opts: OpenOpts): js.Promise[typingsSlinky.maxmind.readerMod.default[T]] = js.native
  def open[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typingsSlinky.maxmind.readerMod.default[T]] = js.native
  
  def openSync(): scala.Nothing = js.native
  
  def validate(ip: String): Boolean = js.native
}
