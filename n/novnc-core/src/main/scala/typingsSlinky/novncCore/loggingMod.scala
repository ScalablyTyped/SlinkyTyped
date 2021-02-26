package typingsSlinky.novncCore

import typingsSlinky.novncCore.novncCoreStrings.debug
import typingsSlinky.novncCore.novncCoreStrings.error
import typingsSlinky.novncCore.novncCoreStrings.info
import typingsSlinky.novncCore.novncCoreStrings.none
import typingsSlinky.novncCore.novncCoreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("novnc-core/lib/util/logging", "get_logging")
  @js.native
  def getLogging(): debug | info | warn | error | none = js.native
  
  @JSImport("novnc-core/lib/util/logging", "init_logging")
  @js.native
  def initLogging(): Unit = js.native
  @JSImport("novnc-core/lib/util/logging", "init_logging")
  @js.native
  def initLogging_debug(level: debug): Unit = js.native
  @JSImport("novnc-core/lib/util/logging", "init_logging")
  @js.native
  def initLogging_error(level: error): Unit = js.native
  @JSImport("novnc-core/lib/util/logging", "init_logging")
  @js.native
  def initLogging_info(level: info): Unit = js.native
  @JSImport("novnc-core/lib/util/logging", "init_logging")
  @js.native
  def initLogging_none(level: none): Unit = js.native
  @JSImport("novnc-core/lib/util/logging", "init_logging")
  @js.native
  def initLogging_warn(level: warn): Unit = js.native
}
