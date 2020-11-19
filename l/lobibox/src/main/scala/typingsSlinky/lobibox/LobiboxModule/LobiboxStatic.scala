package typingsSlinky.lobibox.LobiboxModule

import typingsSlinky.lobibox.anon.Call
import typingsSlinky.lobibox.anon.CallDEFAULTS
import typingsSlinky.lobibox.anon.CallOptions
import typingsSlinky.lobibox.anon.DEFAULTS
import typingsSlinky.lobibox.anon.DEFAULTSProgressOptions
import typingsSlinky.lobibox.anon.DEFAULTSWindowOptions
import typingsSlinky.lobibox.anon.OPTIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LobiboxStatic extends js.Object {
  
  def alert[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  @JSName("alert")
  var alert_Original: Call = js.native
  
  var base: DEFAULTS = js.native
  
  def confirm[T /* <: MessageBoxesDefault */](): T = js.native
  def confirm[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
  @JSName("confirm")
  var confirm_Original: CallOptions = js.native
  
  def notify[T /* <: NotifyDefault */](`type`: String): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
  @JSName("notify")
  var notify_Original: OPTIONS = js.native
  
  def progress[T /* <: MessageBoxesDefault */](options: ProgressOptions): T = js.native
  @JSName("progress")
  var progress_Original: DEFAULTSProgressOptions = js.native
  
  def prompt[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  @JSName("prompt")
  var prompt_Original: CallDEFAULTS = js.native
  
  def window[T /* <: MessageBoxesDefault */](options: WindowOptions): T = js.native
  @JSName("window")
  var window_Original: DEFAULTSWindowOptions = js.native
}
