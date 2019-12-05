package typingsSlinky.atLinguiMacro

import slinky.core.ReactComponentClass
import typingsSlinky.atLinguiCore.i18nMod.MessageDescriptor
import typingsSlinky.atLinguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.atLinguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typingsSlinky.atLinguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typingsSlinky.atLinguiMacro.selectMod.PluralProps
import typingsSlinky.atLinguiMacro.selectMod.SelectProps
import typingsSlinky.atLinguiMacro.transMod.TransPropsWithoutI18n
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.std.Date
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", JSImport.Namespace)
@js.native
object atLinguiMacroMod extends js.Object {
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class Plural ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class Select ()
    extends Component[SelectPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class SelectOrdinal ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class Trans ()
    extends Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  val DateFormat: ReactComponentClass[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]] = js.native
  val NumberFormat: ReactComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions]] = js.native
  def date(value: js.Date): MessageDescriptor = js.native
  def date(value: js.Date, format: DateTimeFormatOptions): MessageDescriptor = js.native
  def number(value: Double): MessageDescriptor = js.native
  def number(value: Double, format: NumberFormatOptions): MessageDescriptor = js.native
  def plural(config: PluralProps): MessageDescriptor = js.native
  def plural(id: String, config: PluralProps): MessageDescriptor = js.native
  def select(config: SelectProps): MessageDescriptor = js.native
  def select(id: String, config: SelectProps): MessageDescriptor = js.native
  def selectOrdinal(config: PluralProps): MessageDescriptor = js.native
  def selectOrdinal(id: String, config: PluralProps): MessageDescriptor = js.native
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = js.native
  def t(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = js.native
}

