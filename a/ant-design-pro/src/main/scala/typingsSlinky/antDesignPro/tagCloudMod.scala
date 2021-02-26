package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import typingsSlinky.antDesignPro.anon.Name
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagCloudMod {
  
  @JSImport("ant-design-pro/lib/Charts/TagCloud", JSImport.Default)
  @js.native
  class default ()
    extends Component[ITagCloudProps, js.Any, js.Any]
  
  @js.native
  trait ITagCloudProps extends StObject {
    
    var data: js.Array[Name] = js.native
    
    var height: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ITagCloudProps {
    
    @scala.inline
    def apply(data: js.Array[Name], height: Double): ITagCloudProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagCloudProps]
    }
    
    @scala.inline
    implicit class ITagCloudPropsMutableBuilder[Self <: ITagCloudProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[Name]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Name*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TagCloud = ReactComponentClass[ITagCloudProps]
}
