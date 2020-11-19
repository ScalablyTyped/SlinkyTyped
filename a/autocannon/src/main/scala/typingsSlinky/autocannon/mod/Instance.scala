package typingsSlinky.autocannon.mod

import typingsSlinky.autocannon.autocannonStrings.done
import typingsSlinky.autocannon.autocannonStrings.error
import typingsSlinky.autocannon.autocannonStrings.reqError
import typingsSlinky.autocannon.autocannonStrings.response
import typingsSlinky.autocannon.autocannonStrings.start
import typingsSlinky.autocannon.autocannonStrings.tick
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Autocannon instance/event emitter for tracking progress, etc.
  */
@js.native
trait Instance extends EventEmitter {
  
   // tslint:disable-line:unified-signatures
  /**
    * Emitted when the autocannon finishes a benchmark.
    */
  @JSName("on")
  def on_done(event: done, listener: js.Function1[/* result */ Result, Unit]): this.type = js.native
  /**
    * Emitted if there is an error during the setup phase of autocannon.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Emitted in the case of a request error e.g. a timeout.
    */
  @JSName("on")
  def on_reqError(event: reqError, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Emitted when the autocannons http-client gets a http response from the server.
    */
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function4[
      /* client */ Client, 
      /* statusCode */ Double, 
      /* resBytes */ Double, 
      /* responseTime */ Double, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted once everything has been setup in your autocannon instance and it has started.
    * Useful for if running the instance forever.
    */
  @JSName("on")
  def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted every second this autocannon is running a benchmark.
    * Useful for displaying stats, etc. Used by the `track` function.
    */
  @JSName("on")
  def on_tick(event: tick, listener: js.Function0[Unit]): this.type = js.native
}
