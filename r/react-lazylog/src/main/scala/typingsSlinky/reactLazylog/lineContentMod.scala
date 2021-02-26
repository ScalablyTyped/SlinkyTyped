package typingsSlinky.reactLazylog

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactLazylog.anon.PartialLineContentProps
import typingsSlinky.reactLazylog.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineContentMod {
  
  @JSImport("react-lazylog/build/LineContent", JSImport.Default)
  @js.native
  class default ()
    extends Component[LineContentProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LineContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LineContent", "default.defaultProps")
    @js.native
    def defaultProps: PartialLineContentProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLineContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type LineContent = ReactComponentClass[LineContentProps]
  
  @js.native
  trait LineContentProps extends StObject {
    
    var data: js.Array[Text] = js.native
    
    var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactElement]] = js.native
    
    var number: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object LineContentProps {
    
    @scala.inline
    def apply(data: js.Array[Text], number: Double): LineContentProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineContentProps]
    }
    
    @scala.inline
    implicit class LineContentPropsMutableBuilder[Self <: LineContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Text]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Text*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFormatPart(value: /* text */ String => ReactElement): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
