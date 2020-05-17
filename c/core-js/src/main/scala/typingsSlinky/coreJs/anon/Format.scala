package typingsSlinky.coreJs.anon

import typingsSlinky.coreJs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  def format(date: Date, template: String): String = js.native
  def format(date: Date, template: String, locale: String): String = js.native
  def formatUTC(date: Date, template: String): String = js.native
  def formatUTC(date: Date, template: String, locale: String): String = js.native
  def now(): Double = js.native
  def toISOString(date: Date): String = js.native
}

