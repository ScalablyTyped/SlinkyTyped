package typingsSlinky.reactDayPicker.propsMod

import typingsSlinky.reactDayPicker.anon.NextMonth
import typingsSlinky.reactDayPicker.classNamesMod.ClassNames
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarElementProps extends js.Object {
  var className: String = js.native
  var classNames: ClassNames = js.native
  var dir: js.UndefOr[String] = js.native
  var labels: NextMonth = js.native
  var locale: String = js.native
  var localeUtils: LocaleUtils = js.native
  var month: js.Date = js.native
  var nextMonth: js.Date = js.native
  var previousMonth: js.Date = js.native
  var showNextButton: Boolean = js.native
  var showPreviousButton: Boolean = js.native
  def onNextClick(): Unit = js.native
  def onNextClick(callback: js.Function0[Unit]): Unit = js.native
  def onPreviousClick(): Unit = js.native
  def onPreviousClick(callback: js.Function0[Unit]): Unit = js.native
}

