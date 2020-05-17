package typingsSlinky.fullcalendar.mod

import typingsSlinky.fullcalendar.inputTypesMod.OptionsInput
import typingsSlinky.fullcalendar.jqueryHooksMod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar", "Calendar")
@js.native
class Calendar protected ()
  extends typingsSlinky.fullcalendar.srcMainMod.Calendar {
  def this(el: JQuery, overrides: OptionsInput) = this()
}

/* static members */
@JSImport("fullcalendar", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaults: js.Any = js.native
  var englishDefaults: js.Any = js.native
  var rtlDefaults: js.Any = js.native
}

