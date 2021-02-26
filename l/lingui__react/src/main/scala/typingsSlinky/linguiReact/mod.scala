package typingsSlinky.linguiReact

import slinky.core.ReactComponentClass
import typingsSlinky.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.linguiReact.i18nMod.default
import typingsSlinky.linguiReact.linguiReactStrings.i18n
import typingsSlinky.linguiReact.linguiReactStrings.i18nHash
import typingsSlinky.linguiReact.selectMod.PluralPropsWithoutI18n
import typingsSlinky.linguiReact.selectMod.SelectPropsWithoutI18n
import typingsSlinky.linguiReact.withI18nMod.ComponentConstructor
import typingsSlinky.linguiReact.withI18nMod.withI18nOptions
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Exclude
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/react", "DateFormat")
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], js.Object, js.Any] {
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/react", "DateFormat")
  @js.native
  val DateFormat: ReactComponentClass[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]] = js.native
  
  @JSImport("@lingui/react", "I18n")
  @js.native
  class I18n () extends default
  
  @JSImport("@lingui/react", "I18nProvider")
  @js.native
  class I18nProvider ()
    extends typingsSlinky.linguiReact.i18nProviderMod.default
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/react", "NumberFormat")
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], js.Object, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/react", "NumberFormat")
  @js.native
  val NumberFormat: ReactComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions]] = js.native
  
  @JSImport("@lingui/react", "Plural")
  @js.native
  class Plural protected ()
    extends typingsSlinky.linguiReact.selectMod.Plural {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react", "Select")
  @js.native
  class Select protected ()
    extends typingsSlinky.linguiReact.selectMod.Select {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react", "SelectOrdinal")
  @js.native
  class SelectOrdinal protected ()
    extends typingsSlinky.linguiReact.selectMod.SelectOrdinal {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/react", "Trans")
  @js.native
  class Trans ()
    extends typingsSlinky.linguiReact.transMod.default
  
  @JSImport("@lingui/react", "i18nMark")
  @js.native
  def i18nMark(id: String): String = js.native
  
  @JSImport("@lingui/react", "withI18n")
  @js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ReactComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]]]
  ] = js.native
  @JSImport("@lingui/react", "withI18n")
  @js.native
  def withI18n(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ReactComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]]]
  ] = js.native
}
