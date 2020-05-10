package typingsSlinky.linguiReact

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.linguiReact.i18nMod.I18nComponentProps
import typingsSlinky.linguiReact.i18nProviderMod.I18nProviderProps
import typingsSlinky.linguiReact.linguiReactStrings.i18n
import typingsSlinky.linguiReact.linguiReactStrings.i18nHash
import typingsSlinky.linguiReact.selectMod.PluralPropsWithoutI18n
import typingsSlinky.linguiReact.selectMod.SelectPropsWithoutI18n
import typingsSlinky.linguiReact.transMod.TransPropsWithoutI18n
import typingsSlinky.linguiReact.withI18nMod.ComponentConstructor
import typingsSlinky.linguiReact.withI18nMod.withI18nOptions
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Exclude
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], js.Object, js.Any] {
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class I18n ()
    extends Component[I18nComponentProps, js.Object, js.Any]
  
  @js.native
  class I18nProvider ()
    extends Component[I18nProviderProps, js.Object, js.Any]
  
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], js.Object, js.Any] {
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
  
  def i18nMark(id: String): String = js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ReactComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]]]
  ] = js.native
  def withI18n(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ReactComponentClass[Pick[_, Exclude[/* keyof any */ String, i18n | i18nHash]]]
  ] = js.native
  @js.native
  object DateFormat
    extends TopLevel[ReactComponentClass[FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]]]
  
  @js.native
  object NumberFormat extends TopLevel[ReactComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions]]]
  
}

