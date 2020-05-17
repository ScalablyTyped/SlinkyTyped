package typingsSlinky.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.restifyPlugins.restifyPluginsStrings.close
  - typingsSlinky.restifyPlugins.restifyPluginsStrings.aborted
  - js.UndefOr[scala.Nothing]
*/
trait TMetricsCallback extends js.Object

object TMetricsCallback {
  @scala.inline
  def close: typingsSlinky.restifyPlugins.restifyPluginsStrings.close = "close".asInstanceOf[typingsSlinky.restifyPlugins.restifyPluginsStrings.close]
  @scala.inline
  def aborted: typingsSlinky.restifyPlugins.restifyPluginsStrings.aborted = "aborted".asInstanceOf[typingsSlinky.restifyPlugins.restifyPluginsStrings.aborted]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => TMetricsCallback): TMetricsCallback = value.asInstanceOf[TMetricsCallback]
}

