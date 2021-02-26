package typingsSlinky.reactLazylog

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactLazylog.anon.PartialLineNumberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineNumberMod {
  
  @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
  @js.native
  class default ()
    extends Component[LineNumberProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LineNumber", "default.defaultProps")
    @js.native
    def defaultProps: PartialLineNumberProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLineNumberProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LineNumberProps extends StObject {
    
    var highlight: js.UndefOr[Boolean] = js.native
    
    var number: Double = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object LineNumberProps {
    
    @scala.inline
    def apply(number: Double): LineNumberProps = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineNumberProps]
    }
    
    @scala.inline
    implicit class LineNumberPropsMutableBuilder[Self <: LineNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type LinePart = ReactComponentClass[LineNumberProps]
}
