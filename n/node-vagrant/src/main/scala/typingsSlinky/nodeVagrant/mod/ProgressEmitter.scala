package typingsSlinky.nodeVagrant.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeVagrant.nodeVagrantStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEmitter extends EventEmitter {
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
}

