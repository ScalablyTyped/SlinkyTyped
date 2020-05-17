package typingsSlinky.flatpickr.instanceMod

import org.scalajs.dom.raw.Node
import typingsSlinky.flatpickr.anon.PartialParsedOptions
import typingsSlinky.flatpickr.anon.kinkeyCustomLocaledefault
import typingsSlinky.flatpickr.globalsMod.global.Date
import typingsSlinky.flatpickr.localeMod.CustomLocale
import typingsSlinky.flatpickr.optionsMod.DateOption
import typingsSlinky.flatpickr.optionsMod.Options
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatpickrFn extends js.Object {
  var defaultConfig: PartialParsedOptions = js.native
  var l10ns: kinkeyCustomLocaledefault = js.native
  def apply(selector: String): Instance | js.Array[Instance] = js.native
  def apply(selector: String, config: Options): Instance | js.Array[Instance] = js.native
  def apply(selector: ArrayLike[Node]): js.Array[Instance] = js.native
  def apply(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
  def apply(selector: Node): Instance = js.native
  def apply(selector: Node, config: Options): Instance = js.native
  def compareDates(date1: Date, date2: Date): Double = js.native
  def compareDates(date1: Date, date2: Date, timeless: Boolean): Double = js.native
  def formatDate(date: Date, format: String): String = js.native
  def localize(l10n: CustomLocale): Unit = js.native
  def parseDate(date: DateOption): js.UndefOr[Date] = js.native
  def parseDate(date: DateOption, format: String): js.UndefOr[Date] = js.native
  def parseDate(date: DateOption, format: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def setDefaults(config: Options): Unit = js.native
}

