package typingsSlinky.handsontable.mod.Handsontable._editors

import org.scalajs.dom.raw.Event
import typingsSlinky.pikaday.mod.PikadayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends Text {
  def destroyElements(): Unit = js.native
  def getDatePickerConfig(): PikadayOptions = js.native
  def hideDatepicker(): Unit = js.native
  def showDatepicker(): Unit = js.native
  def showDatepicker(event: Event): Unit = js.native
}

