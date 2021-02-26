package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.formatjsIntl.mod.IntlError
import typingsSlinky.formatjsIntl.srcCreateIntlMod.CreateIntlFn
import typingsSlinky.formatjsIntl.srcErrorMod.IntlErrorCode
import typingsSlinky.formatjsIntl.srcTypesMod.FormatDateOptions
import typingsSlinky.formatjsIntl.srcTypesMod.FormatNumberOptions
import typingsSlinky.formatjsIntl.srcTypesMod.IntlCache
import typingsSlinky.formatjsIntl.srcTypesMod.MessageDescriptor
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.reactIntl.anon.Children
import typingsSlinky.reactIntl.anon.DateTimeFormatOptionsCust
import typingsSlinky.reactIntl.anon.DisplayNamesOptionsvalues
import typingsSlinky.reactIntl.anon.IntlListFormatOptionsvalu
import typingsSlinky.reactIntl.anon.NumberFormatOptionsCustom
import typingsSlinky.reactIntl.anon.PartialStateCache
import typingsSlinky.reactIntl.anon.PartialStateCurrentValueInSeconds
import typingsSlinky.reactIntl.anon.PickIntlConfigtimeZonefor
import typingsSlinky.reactIntl.anon.PickPropsunitvalue
import typingsSlinky.reactIntl.anon.Value
import typingsSlinky.reactIntl.anon.WrappedComponentComponentType
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-intl/lib", "FormattedDate")
  @js.native
  val FormattedDate: ReactComponentClass[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl/lib", "FormattedDateParts")
  @js.native
  val FormattedDateParts: ReactComponentClass[FormatDateOptions with Children] = js.native
  
  @JSImport("react-intl/lib", "FormattedDateTimeRange")
  @js.native
  val FormattedDateTimeRange: ReactComponentClass[Props] = js.native
  
  @JSImport("react-intl/lib", "FormattedDisplayName")
  @js.native
  val FormattedDisplayName: ReactComponentClass[DisplayNamesOptionsvalues] = js.native
  
  @JSImport("react-intl/lib", "FormattedList")
  @js.native
  val FormattedList: ReactComponentClass[IntlListFormatOptionsvalu] = js.native
  
  @JSImport("react-intl/lib", "FormattedMessage")
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] () extends default[V]
  object FormattedMessage {
    
    @JSImport("react-intl/lib", "FormattedMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-intl/lib", "FormattedMessage.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl/lib", "FormattedNumber")
  @js.native
  val FormattedNumber: ReactComponentClass[NumberFormatOptionsCustom] = js.native
  
  @JSImport("react-intl/lib", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: ReactComponentClass[FormatNumberOptions with Value] = js.native
  
  /* Inlined react.react.FC<react-intl.react-intl/lib/src/components/injectIntl.WithIntlProps<react-intl.react-intl/lib/src/components/plural.Props>> & {  WrappedComponent :react.react.ComponentType<react-intl.react-intl/lib/src/components/plural.Props>} */
  object FormattedPlural {
    
    @JSImport("react-intl/lib", "FormattedPlural")
    @js.native
    def apply(props: PropsWithChildren[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]): ReactElement | Null = js.native
    @JSImport("react-intl/lib", "FormattedPlural")
    @js.native
    def apply(props: PropsWithChildren[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]], context: js.Any): ReactElement | Null = js.native
    @JSImport("react-intl/lib", "FormattedPlural")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "FormattedPlural.WrappedComponent")
    @js.native
    def WrappedComponent: ReactComponentClass[typingsSlinky.reactIntl.pluralMod.Props] = js.native
    @scala.inline
    def WrappedComponent_=(x: ReactComponentClass[typingsSlinky.reactIntl.pluralMod.Props]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[Partial[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMap[WithIntlProps[typingsSlinky.reactIntl.pluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl/lib", "FormattedRelativeTime")
  @js.native
  class FormattedRelativeTime protected ()
    extends typingsSlinky.reactIntl.relativeMod.default {
    def this(props: typingsSlinky.reactIntl.relativeMod.Props) = this()
  }
  /* static members */
  object FormattedRelativeTime {
    
    @JSImport("react-intl/lib", "FormattedRelativeTime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "FormattedRelativeTime.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    @scala.inline
    def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedRelativeTime.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedRelativeTime.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: typingsSlinky.reactIntl.relativeMod.Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  @JSImport("react-intl/lib", "FormattedTime")
  @js.native
  val FormattedTime: ReactComponentClass[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl/lib", "FormattedTimeParts")
  @js.native
  val FormattedTimeParts: ReactComponentClass[FormatDateOptions with Children] = js.native
  
  @JSImport("react-intl/lib", "IntlContext")
  @js.native
  val IntlContext: Context[IntlShape] = js.native
  
  @JSImport("react-intl/lib", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends typingsSlinky.reactIntl.providerMod.default
  /* static members */
  object IntlProvider {
    
    @JSImport("react-intl/lib", "IntlProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "IntlProvider.defaultProps")
    @js.native
    def defaultProps: PickIntlConfigtimeZonefor = js.native
    @scala.inline
    def defaultProps_=(x: PickIntlConfigtimeZonefor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "IntlProvider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "IntlProvider.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typingsSlinky.reactIntl.providerMod.State): PartialStateCache | Null = js.native
  }
  
  @JSImport("react-intl/lib", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typingsSlinky.formatjsIntl.mod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl/lib", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typingsSlinky.formatjsIntl.mod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
  }
  
  @JSImport("react-intl/lib", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typingsSlinky.formatjsIntl.mod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl/lib", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typingsSlinky.formatjsIntl.mod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("react-intl/lib", "RawIntlProvider")
  @js.native
  val RawIntlProvider: ReactComponentClass[ProviderProps[IntlShape]] = js.native
  
  @JSImport("react-intl/lib", "ReactIntlError")
  @js.native
  class ReactIntlError[T /* <: IntlErrorCode */] protected () extends IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl/lib", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typingsSlinky.formatjsIntl.mod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl/lib", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactElement, OptionalIntlConfig, IntlShape] = js.native
  
  @JSImport("react-intl/lib", "createIntlCache")
  @js.native
  def createIntlCache(): IntlCache = js.native
  
  @JSImport("react-intl/lib", "defineMessage")
  @js.native
  def defineMessage[T](msg: T): T = js.native
  
  @JSImport("react-intl/lib", "defineMessages")
  @js.native
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `false`]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  
  @JSImport("react-intl/lib", "useIntl")
  @js.native
  def useIntl(): IntlShape = js.native
}
