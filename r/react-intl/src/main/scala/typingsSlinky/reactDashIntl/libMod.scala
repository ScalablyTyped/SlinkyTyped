package typingsSlinky.reactDashIntl

import slinky.core.ReactComponentClass
import typingsSlinky.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.ForwardRefExoticComponent
import typingsSlinky.react.reactMod.PropsWithoutRef
import typingsSlinky.react.reactMod.ProviderProps
import typingsSlinky.react.reactMod.RefAttributes
import typingsSlinky.reactDashIntl.libComponentsHtmlDashMessageMod.default
import typingsSlinky.reactDashIntl.libComponentsInjectIntlMod.Opts
import typingsSlinky.reactDashIntl.libComponentsInjectIntlMod.WithIntlProps
import typingsSlinky.reactDashIntl.libComponentsInjectIntlMod.WrappedComponentProps
import typingsSlinky.reactDashIntl.libComponentsProviderMod.OptionalIntlConfig
import typingsSlinky.reactDashIntl.libComponentsRelativeMod.Props
import typingsSlinky.reactDashIntl.libComponentsRelativeMod.State
import typingsSlinky.reactDashIntl.libTypesMod.CustomFormatConfig
import typingsSlinky.reactDashIntl.libTypesMod.FormatNumberOptions
import typingsSlinky.reactDashIntl.libTypesMod.IntlCache
import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
import typingsSlinky.reactDashIntl.libTypesMod.IntlShape
import typingsSlinky.reactDashIntl.reactDashIntlBooleans.`false`
import typingsSlinky.reactDashIntl.reactDashIntlBooleans.`true`
import typingsSlinky.reactDashIntl.reactDashIntlStrings.`type`
import typingsSlinky.reactDashIntl.reactDashIntlStrings.children
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultFormats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultLocale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.few
import typingsSlinky.reactDashIntl.reactDashIntlStrings.format
import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.localeMatcher
import typingsSlinky.reactDashIntl.reactDashIntlStrings.many
import typingsSlinky.reactDashIntl.reactDashIntlStrings.messages
import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
import typingsSlinky.reactDashIntl.reactDashIntlStrings.one
import typingsSlinky.reactDashIntl.reactDashIntlStrings.other
import typingsSlinky.reactDashIntl.reactDashIntlStrings.textComponent
import typingsSlinky.reactDashIntl.reactDashIntlStrings.timeZone
import typingsSlinky.reactDashIntl.reactDashIntlStrings.two
import typingsSlinky.reactDashIntl.reactDashIntlStrings.unit
import typingsSlinky.reactDashIntl.reactDashIntlStrings.value
import typingsSlinky.reactDashIntl.reactDashIntlStrings.zero
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class FormattedHTMLMessage () extends default
  
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] ()
    extends typingsSlinky.reactDashIntl.libComponentsMessageMod.default[V]
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typingsSlinky.reactDashIntl.libComponentsRelativeMod.default {
    def this(props: Props) = this()
  }
  
  @js.native
  class IntlProvider ()
    extends typingsSlinky.reactDashIntl.libComponentsProviderMod.default
  
  val FormattedDate: ReactComponentClass[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedDateParts: ReactComponentClass[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val FormattedList: ReactComponentClass[IntlListFormatOptions with Anon_ValueArray] = js.native
  val FormattedNumber: ReactComponentClass[UnifiedNumberFormatOptions with CustomFormatConfig with Anon_ValueNumber] = js.native
  val FormattedNumberParts: ReactComponentClass[FormatNumberOptions with Anon_0] = js.native
  val FormattedPlural: (ForwardRefExoticComponent[
    (Pick[
      typingsSlinky.reactDashIntl.libComponentsPluralMod.Props, 
      children | other | zero | one | two | few | many | localeMatcher | `type` | format | value
    ]) with Anon_ForwardedRefInstance with RefAttributes[_]
  ]) with Anon_WrappedComponentComponentType = js.native
  val FormattedTime: ReactComponentClass[DateTimeFormatOptions with CustomFormatConfig with Anon_Value] = js.native
  val FormattedTimeParts: ReactComponentClass[DateTimeFormatOptions with CustomFormatConfig with Anon_Children] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ReactComponentClass[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with Anon_WrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `false`]): ReactComponentClass[WithIntlProps[P]] with Anon_WrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with Anon_WrappedComponent[P] = js.native
  def useIntl(): IntlShape = js.native
  /* static members */
  @js.native
  object FormattedHTMLMessage extends js.Object {
    var defaultProps: Anon_Span = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    var defaultProps: Anon_Values = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    var defaultProps: Pick[Props, unit | value] = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: Props, state: State): Partial[State] | Null = js.native
  }
  
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    var defaultProps: Pick[
        IntlConfig, 
        formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
      ] = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(
      props: OptionalIntlConfig,
      hasPrevConfigCache: typingsSlinky.reactDashIntl.libComponentsProviderMod.State
    ): Partial[typingsSlinky.reactDashIntl.libComponentsProviderMod.State] | Null = js.native
  }
  
}

