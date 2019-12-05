package typingsSlinky.firefoxDashWebextDashBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* telemetry types */
/**
  * Type of scalar: 'count' for numeric values, 'string' for string values, 'boolean' for boolean values. Maps to
  * `nsITelemetry.SCALAR_TYPE_*`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.count
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.string
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.boolean
*/
trait ScalarType extends js.Object

object ScalarType {
  @scala.inline
  def boolean: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.count = this.cast("count")
  @scala.inline
  def string: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.string = this.cast("string")
}

