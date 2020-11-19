package typingsSlinky.karma.mod

import typingsSlinky.karma.karmaStrings.run_complete
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("karma", "Server")
@js.native
class Server_ () extends EventEmitter {
  def this(options: ConfigFile) = this()
  def this(options: ConfigOptions) = this()
  def this(options: js.UndefOr[scala.Nothing], callback: ServerCallback) = this()
  def this(options: ConfigFile, callback: ServerCallback) = this()
  def this(options: ConfigOptions, callback: ServerCallback) = this()
  
  /**
    * Get properties from the injector
    * @param token
    */
  def get(token: String): js.Any = js.native
  
  /**
    * Listen to the 'run_complete' event.
    */
  @JSName("on")
  def on_runcomplete(
    event: run_complete,
    listener: js.Function2[/* browsers */ js.Any, /* results */ TestResults, Unit]
  ): this.type = js.native
  
  /**
    * Force a refresh of the file list
    */
  def refreshFiles(): js.Promise[_] = js.native
  
  /**
    * Start the server
    */
  def start(): Unit = js.native
}
