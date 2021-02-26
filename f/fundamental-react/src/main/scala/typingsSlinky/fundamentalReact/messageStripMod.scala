package typingsSlinky.fundamentalReact

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialMessageStripProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapMessageS
import typingsSlinky.fundamentalReact.fundamentalReactStrings.MessageStrip
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageStripMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> & {  displayName :'MessageStrip'} */
  object default {
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[MessageStripProps]): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[MessageStripProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialMessageStripProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.displayName")
    @js.native
    def displayName: js.UndefOr[MessageStrip | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[MessageStrip | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/MessageStrip/MessageStrip", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapMessageS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MessageStripProps extends StObject {
    
    var buttonProps: js.UndefOr[js.Any] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var dismissible: js.UndefOr[Boolean] = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var linkProps: js.UndefOr[js.Any] = js.native
    
    var linkText: js.UndefOr[String] = js.native
    
    var localizedText: js.UndefOr[js.Any] = js.native
    
    var noGlyph: js.UndefOr[Boolean] = js.native
    
    var onCloseClicked: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var `type`: js.UndefOr[js.Any] = js.native
  }
  object MessageStripProps {
    
    @scala.inline
    def apply(): MessageStripProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStripProps]
    }
    
    @scala.inline
    implicit class MessageStripPropsMutableBuilder[Self <: MessageStripProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: js.Any): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      @scala.inline
      def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setLocalizedText(value: js.Any): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      @scala.inline
      def setNoGlyph(value: Boolean): Self = StObject.set(x, "noGlyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoGlyphUndefined: Self = StObject.set(x, "noGlyph", js.undefined)
      
      @scala.inline
      def setOnCloseClicked(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onCloseClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseClickedUndefined: Self = StObject.set(x, "onCloseClicked", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
