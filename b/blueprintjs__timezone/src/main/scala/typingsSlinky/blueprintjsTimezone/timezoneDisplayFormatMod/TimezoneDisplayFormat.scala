package typingsSlinky.blueprintjsTimezone.timezoneDisplayFormatMod

import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
  - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
  - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.name
  - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
*/
trait TimezoneDisplayFormat extends js.Object

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat")
@js.native
object TimezoneDisplayFormat extends js.Object {
  /** Abbreviation format: `"HST"` */
  var ABBREVIATION: abbreviation = js.native
  /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
  var COMPOSITE: composite = js.native
  /** Name format: `"Pacific/Honolulu"` */
  var NAME: name = js.native
  /** Offset format: `"-10:00"` */
  var OFFSET: offset = js.native
}

