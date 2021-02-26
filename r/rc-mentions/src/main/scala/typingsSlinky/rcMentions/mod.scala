package typingsSlinky.rcMentions

import slinky.core.ReactComponentClass
import typingsSlinky.rcMentions.anon.PartialMentionsState
import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.mentionsMod.MentionsState
import typingsSlinky.rcMentions.optionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-mentions", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.rcMentions.mentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  object default {
    
    @JSImport("rc-mentions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-mentions", "default.Option")
    @js.native
    def Option: ReactComponentClass[OptionProps] = js.native
    @scala.inline
    def Option_=(x: ReactComponentClass[OptionProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-mentions", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-mentions", "default.defaultProps.filterOption")
      @js.native
      def filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean] = js.native
      @scala.inline
      def filterOption_=(x: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.notFoundContent")
      @js.native
      def notFoundContent: String = js.native
      @scala.inline
      def notFoundContent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.prefix")
      @js.native
      def prefix: String = js.native
      
      @JSImport("rc-mentions", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.rows")
      @js.native
      def rows: Double = js.native
      @scala.inline
      def rows_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rows")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.split")
      @js.native
      def split: String = js.native
      @scala.inline
      def split_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("split")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.validateSearch")
      @js.native
      def validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean] = js.native
      @scala.inline
      def validateSearch_=(x: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateSearch")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-mentions", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = js.native
  }
}
