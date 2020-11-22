package typingsSlinky.newman.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("newman", "run")
@js.native
object run extends js.Object {
  
  def apply(callback: js.Function2[/* err */ js.Error | Null, /* summary */ NewmanRunSummary, Unit]): EventEmitter = js.native
  def apply(options: NewmanRunOptions): EventEmitter = js.native
  def apply(
    options: NewmanRunOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* summary */ NewmanRunSummary, Unit]
  ): EventEmitter = js.native
}
