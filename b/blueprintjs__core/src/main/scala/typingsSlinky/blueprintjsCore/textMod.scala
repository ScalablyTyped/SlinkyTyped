package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.anon.PartialITextProps
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text")
  @js.native
  class Text protected ()
    extends AbstractPureComponent2[ITextProps, ITextState, js.Object] {
    def this(props: ITextProps) = this()
    def this(props: ITextProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MText(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MText(): Unit = js.native
    
    var textRef: js.Any = js.native
    
    var update: js.Any = js.native
  }
  /* static members */
  object Text {
    
    @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text.defaultProps")
    @js.native
    def defaultProps: PartialITextProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialITextProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/text/text", "Text.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITextProps extends IProps {
    
    /**
      * Indicates that this component should be truncated with an ellipsis if it overflows its container.
      * The `title` attribute will also be added when content overflows to show the full text of the children on hover.
      * @default false
      */
    var ellipsize: js.UndefOr[Boolean] = js.native
    
    /**
      * HTML tag name to use for rendered element.
      * @default "div"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    /**
      * HTML title of the element
      */
    var title: js.UndefOr[String] = js.native
  }
  object ITextProps {
    
    @scala.inline
    def apply(): ITextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextProps]
    }
    
    @scala.inline
    implicit class ITextPropsMutableBuilder[Self <: ITextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsize(value: Boolean): Self = StObject.set(x, "ellipsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsizeUndefined: Self = StObject.set(x, "ellipsize", js.undefined)
      
      @scala.inline
      def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ITextState extends StObject {
    
    var isContentOverflowing: Boolean = js.native
    
    var textContent: String = js.native
  }
  object ITextState {
    
    @scala.inline
    def apply(isContentOverflowing: Boolean, textContent: String): ITextState = {
      val __obj = js.Dynamic.literal(isContentOverflowing = isContentOverflowing.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextState]
    }
    
    @scala.inline
    implicit class ITextStateMutableBuilder[Self <: ITextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsContentOverflowing(value: Boolean): Self = StObject.set(x, "isContentOverflowing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    }
  }
}
