package typingsSlinky.novncDashCore

import typingsSlinky.novncDashCore.novncDashCoreStrings.debug
import typingsSlinky.novncDashCore.novncDashCoreStrings.error
import typingsSlinky.novncDashCore.novncDashCoreStrings.info
import typingsSlinky.novncDashCore.novncDashCoreStrings.none
import typingsSlinky.novncDashCore.novncDashCoreStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
@js.native
object libUtilLoggingMod extends js.Object {
  def get_logging(): debug | info | warn | error | none = js.native
  def init_logging(): Unit = js.native
  @JSName("init_logging")
  def init_logging_debug(level: debug): Unit = js.native
  @JSName("init_logging")
  def init_logging_error(level: error): Unit = js.native
  @JSName("init_logging")
  def init_logging_info(level: info): Unit = js.native
  @JSName("init_logging")
  def init_logging_none(level: none): Unit = js.native
  @JSName("init_logging")
  def init_logging_warn(level: warn): Unit = js.native
}

