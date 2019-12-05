package typingsSlinky.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.applicationinsights.applicationinsightsStrings.Event
  - typings.applicationinsights.applicationinsightsStrings.Exception
  - typings.applicationinsights.applicationinsightsStrings.Trace
  - typings.applicationinsights.applicationinsightsStrings.Metric
  - typings.applicationinsights.applicationinsightsStrings.Request
  - typings.applicationinsights.applicationinsightsStrings.Dependency
  - typings.applicationinsights.applicationinsightsStrings.Availability
*/
trait TelemetryTypeKeys extends js.Object

object TelemetryTypeKeys {
  @scala.inline
  def Availability: typingsSlinky.applicationinsights.applicationinsightsStrings.Availability = this.cast("Availability")
  @scala.inline
  def Dependency: typingsSlinky.applicationinsights.applicationinsightsStrings.Dependency = this.cast("Dependency")
  @scala.inline
  def Event: typingsSlinky.applicationinsights.applicationinsightsStrings.Event = this.cast("Event")
  @scala.inline
  def Exception: typingsSlinky.applicationinsights.applicationinsightsStrings.Exception = this.cast("Exception")
  @scala.inline
  def Metric: typingsSlinky.applicationinsights.applicationinsightsStrings.Metric = this.cast("Metric")
  @scala.inline
  def Request: typingsSlinky.applicationinsights.applicationinsightsStrings.Request = this.cast("Request")
  @scala.inline
  def Trace: typingsSlinky.applicationinsights.applicationinsightsStrings.Trace = this.cast("Trace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

