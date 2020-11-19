package typingsSlinky.appdmg.mod

import typingsSlinky.appdmg.appdmgStrings.error
import typingsSlinky.appdmg.appdmgStrings.finish
import typingsSlinky.appdmg.appdmgStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter
  extends typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter {
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: js.Function1[/* info */ Progress, Unit]): this.type = js.native
}
