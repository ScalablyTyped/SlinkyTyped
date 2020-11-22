package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.reactIntl.anon.Children
import typingsSlinky.reactIntl.anon.DisplayNamesOptionsvalues
import typingsSlinky.reactIntl.anon.IntlListFormatOptionsvalu
import typingsSlinky.reactIntl.anon.PartialStateCache
import typingsSlinky.reactIntl.anon.PartialStateCurrentValueInSeconds
import typingsSlinky.reactIntl.anon.PickIntlConfigtimeZonefor
import typingsSlinky.reactIntl.anon.PickPropsunitvalue
import typingsSlinky.reactIntl.anon.Value
import typingsSlinky.reactIntl.anon.WrappedComponentComponentType
import typingsSlinky.reactIntl.anon.`0`
import typingsSlinky.reactIntl.anon.`1`
import typingsSlinky.reactIntl.dateTimeRangeMod.Props
import typingsSlinky.reactIntl.injectIntlMod.Opts
import typingsSlinky.reactIntl.injectIntlMod.WithIntlProps
import typingsSlinky.reactIntl.injectIntlMod.WrappedComponentProps
import typingsSlinky.reactIntl.messageMod.default
import typingsSlinky.reactIntl.providerMod.OptionalIntlConfig
import typingsSlinky.reactIntl.reactIntlBooleans.`false`
import typingsSlinky.reactIntl.reactIntlBooleans.`true`
import typingsSlinky.reactIntl.relativeMod.State
import typingsSlinky.reactIntl.typesMod.IntlShape
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  
  val FormattedDate: ReactComponentClass[
    DateTimeFormatOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ js.Any) with Value
  ] = js.native
  
  val FormattedDateParts: ReactComponentClass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any) with Children
  ] = js.native
  
  val FormattedDateTimeRange: ReactComponentClass[Props] = js.native
  
  val FormattedDisplayName: ReactComponentClass[DisplayNamesOptionsvalues] = js.native
  
  val FormattedList: ReactComponentClass[IntlListFormatOptionsvalu] = js.native
  
  val FormattedNumber: ReactComponentClass[
    NumberFormatOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ js.Any) with `0`
  ] = js.native
  
  val FormattedNumberParts: ReactComponentClass[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) with `1`
  ] = js.native
  
  val FormattedTime: ReactComponentClass[
    DateTimeFormatOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ js.Any) with Value
  ] = js.native
  
  val FormattedTimeParts: ReactComponentClass[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ js.Any) with Children
  ] = js.native
  
  val IntlContext: Context[IntlShape] = js.native
  
  val RawIntlProvider: ReactComponentClass[ProviderProps[IntlShape]] = js.native
  
  val createIntl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateIntlFn<React.ReactNode, OptionalIntlConfig, IntlShape> */ js.Any = js.native
  
  def defineMessage[T](msg: T): T = js.native
  
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `false`]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  
  def useIntl(): IntlShape = js.native
  
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] () extends default[V]
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    
    var displayName: String = js.native
  }
  
  @js.native
  object FormattedPlural extends js.Object {
    
    def apply(props: PropsWithChildren[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]], context: js.Any): ReactElement | Null = js.native
    
    var WrappedComponent: ReactComponentClass[typingsSlinky.reactIntl.pluralMod.Props] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var defaultProps: js.UndefOr[Partial[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]] = js.native
  }
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typingsSlinky.reactIntl.relativeMod.default {
    def this(props: typingsSlinky.reactIntl.relativeMod.Props) = this()
  }
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    
    var defaultProps: PickPropsunitvalue = js.native
    
    var displayName: String = js.native
    
    def getDerivedStateFromProps(props: typingsSlinky.reactIntl.relativeMod.Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  @js.native
  class IntlProvider ()
    extends typingsSlinky.reactIntl.providerMod.default
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    
    var defaultProps: PickIntlConfigtimeZonefor = js.native
    
    var displayName: String = js.native
    
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typingsSlinky.reactIntl.providerMod.State): PartialStateCache | Null = js.native
  }
}
