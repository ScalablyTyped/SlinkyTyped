package typingsSlinky.jupyterlabLogconsoleExtension.statusMod.LogConsoleStatus

import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typingsSlinky.luminoSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VDomModel for the LogConsoleStatus item.
  */
@JSImport("@jupyterlab/logconsole-extension/lib/status", "LogConsoleStatus.Model")
@js.native
class Model protected () extends VDomModel {
  /**
    * Create a new LogConsoleStatus model.
    *
    * @param loggerRegistry - The logger registry providing the logs.
    */
  def this(loggerRegistry: ILoggerRegistry) = this()
  
  var _flashEnabled: js.Any = js.native
  
  var _handleLogContentChange: js.Any = js.native
  
  var _handleLogRegistryChange: js.Any = js.native
  
  var _loggerRegistry: js.Any = js.native
  
  var _source: js.Any = js.native
  
  /**
    * The view status of each source.
    *
    * #### Notes
    * Keys are source names, value is a list of two numbers. The first
    * represents the version of the messages that was last displayed to the
    * user, the second represents the version that we last notified the user
    * about.
    */
  var _sourceVersion: js.Any = js.native
  
  /**
    * Flag to toggle flashing when new logs added.
    */
  def flashEnabled: Boolean = js.native
  
  /**
    * A signal emitted when the flash enablement changes.
    */
  var flashEnabledChanged: Signal[this.type, Unit] = js.native
  
  def flashEnabled_=(enabled: Boolean): Unit = js.native
  
  /**
    * Number of messages currently in the current source.
    */
  def messages: Double = js.native
  
  /**
    * The name of the active log source
    */
  def source: String | Null = js.native
  
  /**
    * Record the last source version displayed to the user.
    *
    * @param source - The name of the log source.
    * @param version - The version of the log that was displayed.
    *
    * #### Notes
    * This will also update the last notified version so that the last
    * notified version is always at least the last displayed version.
    */
  def sourceDisplayed(): Unit = js.native
  def sourceDisplayed(source: String): Unit = js.native
  def sourceDisplayed(source: String, version: Double): Unit = js.native
  def sourceDisplayed(source: Null, version: Double): Unit = js.native
  
  /**
    * Record a source version we notified the user about.
    *
    * @param source - The name of the log source.
    * @param version - The version of the log.
    */
  def sourceNotified(source: String, version: Double): Unit = js.native
  def sourceNotified(source: Null, version: Double): Unit = js.native
  
  def source_=(name: String | Null): Unit = js.native
  
  /**
    * The number of messages ever stored by the current source.
    */
  def version: Double = js.native
  
  /**
    * The last source version that was displayed.
    */
  def versionDisplayed: Double = js.native
  
  /**
    * The last source version we notified the user about.
    */
  def versionNotified: Double = js.native
}
