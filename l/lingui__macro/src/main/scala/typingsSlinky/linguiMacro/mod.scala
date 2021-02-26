package typingsSlinky.linguiMacro

import slinky.core.ReactComponentClass
import typingsSlinky.linguiCore.i18nMod.MessageDescriptor
import typingsSlinky.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.linguiMacro.reactSelectMod.Plural
import typingsSlinky.linguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typingsSlinky.linguiMacro.reactSelectMod.Select
import typingsSlinky.linguiMacro.reactSelectMod.SelectOrdinal
import typingsSlinky.linguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typingsSlinky.linguiMacro.selectMod.PluralProps
import typingsSlinky.linguiMacro.selectMod.SelectProps
import typingsSlinky.linguiMacro.transMod.default
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], js.Object, js.Any] {
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  val DateFormat: ReactComponentClass[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], js.Object, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  val NumberFormat: ReactComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions]] = js.native
  
  @JSImport("@lingui/macro", "Plural")
  @js.native
  class Plural_ protected () extends Plural {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "SelectOrdinal")
  @js.native
  class SelectOrdinal_ protected () extends SelectOrdinal {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "Select")
  @js.native
  class Select_ protected () extends Select {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  class Trans () extends default
  
  @JSImport("@lingui/macro", "date")
  @js.native
  def date(value: js.Date): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "date")
  @js.native
  def date(value: js.Date, format: DateTimeFormatOptions): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "number")
  @js.native
  def number(value: Double): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "number")
  @js.native
  def number(value: Double, format: NumberFormatOptions): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "plural")
  @js.native
  def plural(config: PluralProps): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "plural")
  @js.native
  def plural(id: String, config: PluralProps): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "select")
  @js.native
  def select(config: SelectProps): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "select")
  @js.native
  def select(id: String, config: SelectProps): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "selectOrdinal")
  @js.native
  def selectOrdinal(config: PluralProps): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "selectOrdinal")
  @js.native
  def selectOrdinal(id: String, config: PluralProps): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "t")
  @js.native
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = js.native
  @JSImport("@lingui/macro", "t")
  @js.native
  def t(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = js.native
}
