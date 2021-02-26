package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowMod extends Shortcut {
  
  @JSImport("antd/lib/descriptions/Row", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RowProps] = js.native
  
  @js.native
  trait RowProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var colon: Boolean = js.native
    
    var index: Double = js.native
    
    var prefixCls: String = js.native
    
    var row: js.Array[ReactElement] = js.native
    
    var vertical: Boolean = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply(colon: Boolean, index: Double, prefixCls: String, row: js.Array[ReactElement], vertical: Boolean): RowProps = {
      val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: js.Array[ReactElement]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowVarargs(value: ReactElement*): Self = StObject.set(x, "row", js.Array(value :_*))
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[RowProps]
  
  /* This means you don't have to write `default`, but can instead just say `rowMod.foo` */
  override def _to: ReactComponentClass[RowProps] = default
}
