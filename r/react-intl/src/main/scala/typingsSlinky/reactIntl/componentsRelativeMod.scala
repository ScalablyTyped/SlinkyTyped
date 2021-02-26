package typingsSlinky.reactIntl

import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import typingsSlinky.formatjsIntl.srcTypesMod.CustomFormatConfig
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.reactIntl.anon.PartialStateCurrentValueInSeconds
import typingsSlinky.reactIntl.anon.PickPropsunitvalue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRelativeMod {
  
  @JSImport("react-intl/src/components/relative", JSImport.Default)
  @js.native
  class default protected () extends FormattedRelativeTime {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-intl/src/components/relative", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/relative", "default.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    @scala.inline
    def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/relative", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/relative", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  @JSImport("react-intl/src/components/relative", "FormattedRelativeTime")
  @js.native
  class FormattedRelativeTime protected ()
    extends PureComponent[Props, State, js.Any] {
    def this(props: Props) = this()
    
    var _updateTimer: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFormattedRelativeTime(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFormattedRelativeTime(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFormattedRelativeTime(): Unit = js.native
    
    def scheduleNextUpdate(hasUpdateIntervalInSecondsUnit: Props, hasCurrentValueInSeconds: State): Unit = js.native
  }
  /* static members */
  object FormattedRelativeTime {
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    @scala.inline
    def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/relative", "FormattedRelativeTime.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.IntlRelativeTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.IntlRelativeTimeFormatOptions */ @js.native
  trait Props extends CustomFormatConfig {
    
    var children: js.UndefOr[js.Function1[/* value */ String, ReactChild]] = js.native
    
    var unit: js.UndefOr[RelativeTimeUnit] = js.native
    
    var updateIntervalInSeconds: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* value */ String => ReactChild): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setUnit(value: RelativeTimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setUpdateIntervalInSeconds(value: Double): Self = StObject.set(x, "updateIntervalInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateIntervalInSecondsUndefined: Self = StObject.set(x, "updateIntervalInSeconds", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var currentValueInSeconds: Double = js.native
    
    var prevUnit: js.UndefOr[RelativeTimeUnit] = js.native
    
    var prevValue: js.UndefOr[Double] = js.native
  }
  object State {
    
    @scala.inline
    def apply(currentValueInSeconds: Double): State = {
      val __obj = js.Dynamic.literal(currentValueInSeconds = currentValueInSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentValueInSeconds(value: Double): Self = StObject.set(x, "currentValueInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUnit(value: RelativeTimeUnit): Self = StObject.set(x, "prevUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUnitUndefined: Self = StObject.set(x, "prevUnit", js.undefined)
      
      @scala.inline
      def setPrevValue(value: Double): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
    }
  }
}
