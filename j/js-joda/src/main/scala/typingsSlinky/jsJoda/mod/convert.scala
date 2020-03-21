package typingsSlinky.jsJoda.mod

import typingsSlinky.jsJoda.AnonToDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "convert")
@js.native
object convert extends js.Object {
  def apply(temporal: LocalDate): AnonToDate = js.native
  def apply(temporal: LocalDateTime): AnonToDate = js.native
  def apply(temporal: LocalDateTime, zone: ZoneId): AnonToDate = js.native
  def apply(temporal: LocalDate, zone: ZoneId): AnonToDate = js.native
  def apply(temporal: ZonedDateTime): AnonToDate = js.native
  def apply(temporal: ZonedDateTime, zone: ZoneId): AnonToDate = js.native
}

