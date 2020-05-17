package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.restify.restifyStrings.close
  - typingsSlinky.restify.restifyStrings.aborted
  - js.UndefOr[scala.Nothing]
*/
trait TMetricsCallback extends js.Object

object TMetricsCallback {
  @scala.inline
  def close: typingsSlinky.restify.restifyStrings.close = "close".asInstanceOf[typingsSlinky.restify.restifyStrings.close]
  @scala.inline
  def aborted: typingsSlinky.restify.restifyStrings.aborted = "aborted".asInstanceOf[typingsSlinky.restify.restifyStrings.aborted]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => TMetricsCallback): TMetricsCallback = value.asInstanceOf[TMetricsCallback]
}

