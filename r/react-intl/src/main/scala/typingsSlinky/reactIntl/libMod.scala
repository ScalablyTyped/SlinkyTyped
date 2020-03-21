package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactIntl.htmlMessageMod.default
import typingsSlinky.reactIntl.injectIntlMod.Opts
import typingsSlinky.reactIntl.injectIntlMod.WithIntlProps
import typingsSlinky.reactIntl.injectIntlMod.WrappedComponentProps
import typingsSlinky.reactIntl.providerMod.OptionalIntlConfig
import typingsSlinky.reactIntl.reactIntlBooleans.`false`
import typingsSlinky.reactIntl.reactIntlBooleans.`true`
import typingsSlinky.reactIntl.relativeMod.Props
import typingsSlinky.reactIntl.relativeMod.State
import typingsSlinky.reactIntl.typesMod.FormatNumberOptions
import typingsSlinky.reactIntl.typesMod.IntlCache
import typingsSlinky.reactIntl.typesMod.IntlShape
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
    extends typingsSlinky.reactIntl.messageMod.default[V]
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typingsSlinky.reactIntl.relativeMod.default {
    def this(props: Props) = this()
  }
  
  @js.native
  class IntlProvider ()
    extends typingsSlinky.reactIntl.providerMod.default
  
  val FormattedDate: ReactComponentClass[DateTimeFormatOptionsCust] = js.native
  val FormattedDateParts: ReactComponentClass[DateTimeFormatOptionsCustChildren] = js.native
  val FormattedDisplayName: ReactComponentClass[DisplayNamesOptionsvalues] = js.native
  val FormattedList: ReactComponentClass[IntlListFormatOptionsvalu] = js.native
  val FormattedNumber: ReactComponentClass[UnifiedNumberFormatOption] = js.native
  val FormattedNumberParts: ReactComponentClass[FormatNumberOptions with AnonChildren] = js.native
  val FormattedTime: ReactComponentClass[DateTimeFormatOptionsCust] = js.native
  val FormattedTimeParts: ReactComponentClass[DateTimeFormatOptionsCustChildren] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: ReactComponentClass[ProviderProps[IntlShape]] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `false`]): ReactComponentClass[WithIntlProps[P]] with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with AnonWrappedComponent[P] = js.native
  def useIntl(): IntlShape = js.native
  /* static members */
  @js.native
  object FormattedHTMLMessage extends js.Object {
    var defaultProps: AnonTagName = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    var defaultProps: AnonValues = js.native
    var displayName: String = js.native
  }
  
  @js.native
  object FormattedPlural extends js.Object {
    @JSName("$$typeof")
    val DollarDollartypeof: js.Symbol = js.native
    var WrappedComponent: ReactComponentClass[typingsSlinky.reactIntl.pluralMod.Props] = js.native
    var defaultProps: js.UndefOr[PartialPickPropschildreno] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapPickProp] = js.native
    /**
      * **NOTE**: Exotic components are not callable.
      */
    def apply(props: PickPropschildrenotherzer): ReactElement | Null = js.native
  }
  
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    var defaultProps: PickPropsunitvalue = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    var defaultProps: PickIntlConfigformatsmess = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typingsSlinky.reactIntl.providerMod.State): PartialState | Null = js.native
  }
  
}

