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
import typingsSlinky.reactIntl.anon.PartialState
import typingsSlinky.reactIntl.anon.PartialStateCurrentValueInSeconds
import typingsSlinky.reactIntl.anon.PickIntlConfigtimeZonefor
import typingsSlinky.reactIntl.anon.PickPropsunitvalue
import typingsSlinky.reactIntl.anon.Value
import typingsSlinky.reactIntl.anon.WrappedComponent
import typingsSlinky.reactIntl.componentsDateTimeRangeMod.Props
import typingsSlinky.reactIntl.componentsInjectIntlMod.Opts
import typingsSlinky.reactIntl.componentsInjectIntlMod.WithIntlProps
import typingsSlinky.reactIntl.componentsInjectIntlMod.WrappedComponentProps
import typingsSlinky.reactIntl.componentsMessageMod.default
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import typingsSlinky.reactIntl.componentsRelativeMod.State
import typingsSlinky.reactIntl.reactIntlBooleans.`false`
import typingsSlinky.reactIntl.reactIntlBooleans.`true`
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-intl", "FormattedDate")
  @js.native
  val FormattedDate: ReactComponentClass[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl", "FormattedDateParts")
  @js.native
  val FormattedDateParts: ReactComponentClass[FormatDateOptions with Children] = js.native
  
  @JSImport("react-intl", "FormattedDateTimeRange")
  @js.native
  val FormattedDateTimeRange: ReactComponentClass[Props] = js.native
  
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  val FormattedDisplayName: ReactComponentClass[DisplayNamesOptionsvalues] = js.native
  
  @JSImport("react-intl", "FormattedList")
  @js.native
  val FormattedList: ReactComponentClass[IntlListFormatOptionsvalu] = js.native
  
  @JSImport("react-intl", "FormattedMessage")
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] () extends default[V]
  object FormattedMessage {
    
    @JSImport("react-intl", "FormattedMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-intl", "FormattedMessage.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl", "FormattedNumber")
  @js.native
  val FormattedNumber: ReactComponentClass[NumberFormatOptionsCustom] = js.native
  
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: ReactComponentClass[FormatNumberOptions with Value] = js.native
  
  /* Inlined react.react.FC<react-intl.react-intl/src/components/injectIntl.WithIntlProps<react-intl.react-intl/src/components/plural.Props>> & {  WrappedComponent :react.react.ComponentType<react-intl.react-intl/src/components/plural.Props>} */
  object FormattedPlural {
    
    @JSImport("react-intl", "FormattedPlural")
    @js.native
    def apply(props: PropsWithChildren[WithIntlProps[typingsSlinky.reactIntl.componentsPluralMod.Props]]): ReactElement | Null = js.native
    @JSImport("react-intl", "FormattedPlural")
    @js.native
    def apply(
      props: PropsWithChildren[WithIntlProps[typingsSlinky.reactIntl.componentsPluralMod.Props]],
      context: js.Any
    ): ReactElement | Null = js.native
    @JSImport("react-intl", "FormattedPlural")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "FormattedPlural.WrappedComponent")
    @js.native
    def WrappedComponent: ReactComponentClass[typingsSlinky.reactIntl.componentsPluralMod.Props] = js.native
    @scala.inline
    def WrappedComponent_=(x: ReactComponentClass[typingsSlinky.reactIntl.componentsPluralMod.Props]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[WithIntlProps[typingsSlinky.reactIntl.componentsPluralMod.Props]]] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[Partial[WithIntlProps[typingsSlinky.reactIntl.componentsPluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedPlural.propTypes")
    @js.native
    def propTypes: js.UndefOr[
        WeakValidationMap[WithIntlProps[typingsSlinky.reactIntl.componentsPluralMod.Props]]
      ] = js.native
    @scala.inline
    def propTypes_=(
      x: js.UndefOr[
          WeakValidationMap[WithIntlProps[typingsSlinky.reactIntl.componentsPluralMod.Props]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl", "FormattedRelativeTime")
  @js.native
  class FormattedRelativeTime protected ()
    extends typingsSlinky.reactIntl.componentsRelativeMod.default {
    def this(props: typingsSlinky.reactIntl.componentsRelativeMod.Props) = this()
  }
  /* static members */
  object FormattedRelativeTime {
    
    @JSImport("react-intl", "FormattedRelativeTime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "FormattedRelativeTime.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    @scala.inline
    def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedRelativeTime.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "FormattedRelativeTime.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: typingsSlinky.reactIntl.componentsRelativeMod.Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  @JSImport("react-intl", "FormattedTime")
  @js.native
  val FormattedTime: ReactComponentClass[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl", "FormattedTimeParts")
  @js.native
  val FormattedTimeParts: ReactComponentClass[FormatDateOptions with Children] = js.native
  
  @JSImport("react-intl", "IntlContext")
  @js.native
  val IntlContext: Context[IntlShape] = js.native
  
  @JSImport("react-intl", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends typingsSlinky.reactIntl.componentsProviderMod.default
  /* static members */
  object IntlProvider {
    
    @JSImport("react-intl", "IntlProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl", "IntlProvider.defaultProps")
    @js.native
    def defaultProps: PickIntlConfigtimeZonefor = js.native
    @scala.inline
    def defaultProps_=(x: PickIntlConfigtimeZonefor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "IntlProvider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl", "IntlProvider.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typingsSlinky.reactIntl.componentsProviderMod.State): PartialState | Null = js.native
  }
  
  @JSImport("react-intl", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typingsSlinky.formatjsIntl.mod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typingsSlinky.formatjsIntl.mod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
  }
  
  @JSImport("react-intl", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typingsSlinky.formatjsIntl.mod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typingsSlinky.formatjsIntl.mod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("react-intl", "RawIntlProvider")
  @js.native
  val RawIntlProvider: ReactComponentClass[ProviderProps[IntlShape]] = js.native
  
  @JSImport("react-intl", "ReactIntlError")
  @js.native
  class ReactIntlError[T /* <: IntlErrorCode */] protected () extends IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typingsSlinky.formatjsIntl.mod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("react-intl", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactElement, OptionalIntlConfig, IntlShape] = js.native
  
  @JSImport("react-intl", "createIntlCache")
  @js.native
  def createIntlCache(): IntlCache = js.native
  
  @JSImport("react-intl", "defineMessage")
  @js.native
  def defineMessage[T](msg: T): T = js.native
  
  @JSImport("react-intl", "defineMessages")
  @js.native
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  @JSImport("react-intl", "injectIntl")
  @js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
  @JSImport("react-intl", "injectIntl")
  @js.native
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponent[P, IntlPropName]) = js.native
  @JSImport("react-intl", "injectIntl")
  @js.native
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `false`]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
  @JSImport("react-intl", "injectIntl")
  @js.native
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ReactComponentClass[P] */](WrappedComponent: ReactComponentClass[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponent[P, IntlPropName]) = js.native
  
  @JSImport("react-intl", "useIntl")
  @js.native
  def useIntl(): IntlShape = js.native
}
