package typingsSlinky.pg.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.pg.pgStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Events")
@js.native
class Events () extends EventEmitter {
  
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* client */ Client, Unit]): this.type = js.native
}
