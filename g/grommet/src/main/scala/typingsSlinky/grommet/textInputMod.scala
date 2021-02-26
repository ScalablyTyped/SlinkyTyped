package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.Bottom
import typingsSlinky.grommet.anon.EnterSelect
import typingsSlinky.grommet.anon.LabelValue
import typingsSlinky.grommet.anon.Suggestion
import typingsSlinky.grommet.dropMod.DropProps
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.onSelect
import typingsSlinky.grommet.grommetStrings.placeholder
import typingsSlinky.grommet.grommetStrings.size
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.grommet.utilsMod.PlaceHolderType
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/TextInput", "TextInput")
  @js.native
  class TextInput protected ()
    extends Component[
          TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]), 
          js.Object, 
          js.Any
        ] {
    def this(props: TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ])) = this()
    def this(
      props: TextInputProps with (Omit[
            DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
            onSelect | size | placeholder
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/TextInput", "TextInput")
  @js.native
  val TextInput: ReactComponentClass[
    TextInputProps with (Omit[
      DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
      onSelect | size | placeholder
    ])
  ] = js.native
  
  @js.native
  trait TextInputProps extends StObject {
    
    var dropAlign: js.UndefOr[Bottom] = js.native
    
    var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
    
    var dropProps: js.UndefOr[DropProps] = js.native
    
    var dropTarget: js.UndefOr[js.Object] = js.native
    
    var focusIndicator: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var messages: js.UndefOr[EnterSelect] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.native
    
    var onSuggestionsClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onSuggestionsOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var placeholder: js.UndefOr[PlaceHolderType] = js.native
    
    var plain: js.UndefOr[Boolean | full] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
    
    var suggestions: js.UndefOr[js.Array[LabelValue | String]] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
  }
  object TextInputProps {
    
    @scala.inline
    def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit class TextInputPropsMutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      @scala.inline
      def setDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
      
      @scala.inline
      def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      @scala.inline
      def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      @scala.inline
      def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMessages(value: EnterSelect): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* x */ Suggestion => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSuggestionsClose(value: () => Unit): Self = StObject.set(x, "onSuggestionsClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuggestionsCloseUndefined: Self = StObject.set(x, "onSuggestionsClose", js.undefined)
      
      @scala.inline
      def setOnSuggestionsOpen(value: () => Unit): Self = StObject.set(x, "onSuggestionsOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuggestionsOpenUndefined: Self = StObject.set(x, "onSuggestionsOpen", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderReactElement(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean | full): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuggestions(value: js.Array[LabelValue | String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setSuggestionsVarargs(value: (LabelValue | String)*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
