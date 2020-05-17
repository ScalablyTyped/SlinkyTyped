package typingsSlinky.nodeVagrant.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeVagrant.nodeVagrantStrings.`up-progress`
import typingsSlinky.nodeVagrant.nodeVagrantStrings.progress
import typingsSlinky.nodeVagrant.nodeVagrantStrings.stderr
import typingsSlinky.nodeVagrant.nodeVagrantStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineEmitter extends EventEmitter {
  @JSName("on")
  def on_progress(
    event: progress,
    listener: js.Function4[
      /* machine */ String, 
      /* progress */ String, 
      /* rate */ String, 
      /* remaining */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_stderr(event: stderr, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_stdout(event: stdout, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_upprogress(event: `up-progress`, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
}

