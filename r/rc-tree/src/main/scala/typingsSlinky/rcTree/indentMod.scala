package typingsSlinky.rcTree

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentMod extends Shortcut {
  
  @JSImport("rc-tree/es/Indent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IndentProps] = js.native
  
  @js.native
  trait IndentProps extends StObject {
    
    var isEnd: js.Array[Boolean] = js.native
    
    var isStart: js.Array[Boolean] = js.native
    
    var level: Double = js.native
    
    var prefixCls: String = js.native
  }
  object IndentProps {
    
    @scala.inline
    def apply(isEnd: js.Array[Boolean], isStart: js.Array[Boolean], level: Double, prefixCls: String): IndentProps = {
      val __obj = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndentProps]
    }
    
    @scala.inline
    implicit class IndentPropsMutableBuilder[Self <: IndentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      @scala.inline
      def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[IndentProps]
  
  /* This means you don't have to write `default`, but can instead just say `indentMod.foo` */
  override def _to: ReactComponentClass[IndentProps] = default
}
