package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.BackgroundImage
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.antd.progressProgressMod.ProgressGradient
import typingsSlinky.antd.progressProgressMod.ProgressProps
import typingsSlinky.antd.progressProgressMod.StringGradients
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Line", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LineProps] = js.native
  
  @JSImport("antd/lib/progress/Line", "handleGradient")
  @js.native
  def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): BackgroundImage = js.native
  
  @JSImport("antd/lib/progress/Line", "sortGradient")
  @js.native
  def sortGradient(gradients: StringGradients): String = js.native
  
  @js.native
  trait LineProps extends ProgressProps {
    
    var children: ReactElement = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String = js.native
  }
  object LineProps {
    
    @scala.inline
    def apply(prefixCls: String): LineProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[LineProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineMod.foo` */
  override def _to: ReactComponentClass[LineProps] = default
}
