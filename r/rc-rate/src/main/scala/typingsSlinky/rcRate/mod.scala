package typingsSlinky.rcRate

import typingsSlinky.rcRate.rateMod.RateProps
import typingsSlinky.rcRate.rateMod.RateState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-rate", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.rcRate.rateMod.default {
    def this(props: RateProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-rate", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-rate", "default.defaultProps.allowClear")
      @js.native
      def allowClear: Boolean = js.native
      @scala.inline
      def allowClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.allowHalf")
      @js.native
      def allowHalf: Boolean = js.native
      @scala.inline
      def allowHalf_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowHalf")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.character")
      @js.native
      def character: String = js.native
      @scala.inline
      def character_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("character")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.count")
      @js.native
      def count: Double = js.native
      @scala.inline
      def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.defaultValue")
      @js.native
      def defaultValue: Double = js.native
      @scala.inline
      def defaultValue_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.direction")
      @js.native
      def direction: String = js.native
      @scala.inline
      def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      @scala.inline
      def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.onHoverChange")
      @js.native
      def onHoverChange: js.Function0[Unit] = js.native
      @scala.inline
      def onHoverChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHoverChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-rate", "default.defaultProps.tabIndex")
      @js.native
      def tabIndex: Double = js.native
      @scala.inline
      def tabIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-rate", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: RateProps, state: RateState): RateState = js.native
  }
}
