package typingsSlinky.flatpickr.distUtilsDatesMod

import typingsSlinky.flatpickr.Anon_Config
import typingsSlinky.flatpickr.distTypesGlobalsMod._Global_.Date
import typingsSlinky.flatpickr.distTypesLocaleMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils/dates", "createDateParser")
@js.native
object createDateParser extends js.Object {
  def apply(hasConfigL10n: Anon_Config): js.Function4[
    /* date */ String | Double | Date, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ] = js.native
}

