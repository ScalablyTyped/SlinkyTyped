package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionsMod extends Shortcut {
  
  @JSImport("antd/lib/mentions", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/mentions", "Option")
  @js.native
  val Option: ReactComponentClass[typingsSlinky.rcMentions.optionMod.OptionProps] = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[MentionProps with RefAttributes[HTMLElement]] {
    
    var Option: ReactComponentClass[typingsSlinky.rcMentions.optionMod.OptionProps] = js.native
    
    def getMentions(value: String): js.Array[MentionsEntity] = js.native
    def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.top
    - typingsSlinky.antd.antdStrings.bottom
  */
  trait MentionPlacement extends StObject
  object MentionPlacement {
    
    @scala.inline
    def bottom: typingsSlinky.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsSlinky.antd.antdStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.antd.antdStrings.top = "top".asInstanceOf[typingsSlinky.antd.antdStrings.top]
  }
  
  @js.native
  trait MentionProps extends MentionsProps {
    
    var loading: js.UndefOr[Boolean] = js.native
  }
  object MentionProps {
    
    @scala.inline
    def apply(): MentionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MentionProps]
    }
    
    @scala.inline
    implicit class MentionPropsMutableBuilder[Self <: MentionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  @js.native
  trait MentionState extends StObject {
    
    var focused: Boolean = js.native
  }
  object MentionState {
    
    @scala.inline
    def apply(focused: Boolean): MentionState = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionState]
    }
    
    @scala.inline
    implicit class MentionStateMutableBuilder[Self <: MentionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MentionsConfig extends StObject {
    
    var prefix: js.UndefOr[String | js.Array[String]] = js.native
    
    var split: js.UndefOr[String] = js.native
  }
  object MentionsConfig {
    
    @scala.inline
    def apply(): MentionsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MentionsConfig]
    }
    
    @scala.inline
    implicit class MentionsConfigMutableBuilder[Self <: MentionsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String | js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value :_*))
      
      @scala.inline
      def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  @js.native
  trait MentionsEntity extends StObject {
    
    var prefix: String = js.native
    
    var value: String = js.native
  }
  object MentionsEntity {
    
    @scala.inline
    def apply(prefix: String, value: String): MentionsEntity = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionsEntity]
    }
    
    @scala.inline
    implicit class MentionsEntityMutableBuilder[Self <: MentionsEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionProps
    extends /* customProp */ StringDictionary[js.Any] {
    
    var children: ReactElement = js.native
    
    var value: String = js.native
  }
  object OptionProps {
    
    @scala.inline
    def apply(value: String): OptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionProps]
    }
    
    @scala.inline
    implicit class OptionPropsMutableBuilder[Self <: OptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `mentionsMod.foo` */
  override def _to: CompoundedComponent = default
}
