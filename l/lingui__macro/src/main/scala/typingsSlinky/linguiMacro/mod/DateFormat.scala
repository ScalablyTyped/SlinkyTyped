package typingsSlinky.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "DateFormat")
@js.native
class DateFormat protected ()
  extends Component[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], js.Object, js.Any] {
  def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
}

@JSImport("@lingui/macro", "DateFormat")
@js.native
object DateFormat
  extends TopLevel[ReactComponentClass[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]]]

