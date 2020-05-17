package typingsSlinky.antd.statisticUtilsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.antdBooleans.`false`
  - typingsSlinky.antd.antdStrings.number
  - typingsSlinky.antd.antdStrings.countdown
  - js.Function2[
/ * value * / typingsSlinky.antd.statisticUtilsMod.valueType, 
/ * config * / js.UndefOr[typingsSlinky.antd.statisticUtilsMod.FormatConfig], 
typingsSlinky.react.mod.ReactNode]
*/
trait Formatter extends js.Object

object Formatter {
  @scala.inline
  def `false`: typingsSlinky.antd.antdBooleans.`false` = false.asInstanceOf[typingsSlinky.antd.antdBooleans.`false`]
  @scala.inline
  def number: typingsSlinky.antd.antdStrings.number = "number".asInstanceOf[typingsSlinky.antd.antdStrings.number]
  @scala.inline
  def countdown: typingsSlinky.antd.antdStrings.countdown = "countdown".asInstanceOf[typingsSlinky.antd.antdStrings.countdown]
  @scala.inline
  implicit def apply(value: js.Function2[/* value */ valueType, /* config */ js.UndefOr[FormatConfig], TagMod[Any]]): Formatter = value.asInstanceOf[Formatter]
}

