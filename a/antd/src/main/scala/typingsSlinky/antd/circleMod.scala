package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.progressProgressMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Circle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircleProps] = js.native
  
  @js.native
  trait CircleProps extends ProgressProps {
    
    var children: ReactElement = js.native
    
    @JSName("prefixCls")
    var prefixCls_CircleProps: String = js.native
    
    var progressStatus: String = js.native
  }
  object CircleProps {
    
    @scala.inline
    def apply(prefixCls: String, progressStatus: String): CircleProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], progressStatus = progressStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    @scala.inline
    implicit class CirclePropsMutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStatus(value: String): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[CircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleMod.foo` */
  override def _to: ReactComponentClass[CircleProps] = default
}
