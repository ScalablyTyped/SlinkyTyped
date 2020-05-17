package typingsSlinky.flatpickr.datesMod

import typingsSlinky.flatpickr.anon.Config
import typingsSlinky.flatpickr.globalsMod.global.Date
import typingsSlinky.flatpickr.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils/dates", "createDateParser")
@js.native
object createDateParser extends js.Object {
  def apply(hasConfigL10n: Config): js.Function4[
    /* date */ String | Double | Date, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ] = js.native
}

