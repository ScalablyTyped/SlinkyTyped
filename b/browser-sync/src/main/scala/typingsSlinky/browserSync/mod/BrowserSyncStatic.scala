package typingsSlinky.browserSync.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserSyncStatic extends BrowserSyncInstance {
  
  /**
    * Start the Browsersync service. This will launch a server, proxy or start the snippet mode
    * depending on your use-case.
    */
  def apply(): BrowserSyncInstance = js.native
  def apply(
    config: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* bs */ BrowserSyncInstance, _]
  ): BrowserSyncInstance = js.native
  def apply(config: Options): BrowserSyncInstance = js.native
  def apply(config: Options, callback: js.Function2[/* err */ js.Error, /* bs */ BrowserSyncInstance, _]): BrowserSyncInstance = js.native
  
  /**
    * Create a Browsersync instance
    * @param name an identifier that can used for retrieval later
    */
  def create(): BrowserSyncInstance = js.native
  def create(name: js.UndefOr[scala.Nothing], emitter: EventEmitter): BrowserSyncInstance = js.native
  def create(name: String): BrowserSyncInstance = js.native
  def create(name: String, emitter: EventEmitter): BrowserSyncInstance = js.native
  
  /**
    * Get a single instance by name. This is useful if you have your build scripts in separate files
    * @param name the identifier used for retrieval
    */
  def get(name: String): BrowserSyncInstance = js.native
  
  /**
    * Check if an instance has been created.
    * @param name the name of the instance
    */
  def has(name: String): Boolean = js.native
  
  /**
    *
    */
  var instances: js.Array[BrowserSyncInstance] = js.native
  
  /**
    * Reset the state of the module.
    * (should only be needed for test environments)
    */
  def reset(): Unit = js.native
}
