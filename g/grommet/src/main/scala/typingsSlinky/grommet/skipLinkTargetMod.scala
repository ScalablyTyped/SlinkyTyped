package typingsSlinky.grommet

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipLinkTargetMod {
  
  @JSImport("grommet/components/SkipLinkTarget", "SkipLinkTarget")
  @js.native
  val SkipLinkTarget: ReactComponentClass[SkipLinkTargetProps] = js.native
  
  @js.native
  trait SkipLinkTargetProps extends StObject {
    
    var id: String = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
  }
  object SkipLinkTargetProps {
    
    @scala.inline
    def apply(id: String): SkipLinkTargetProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipLinkTargetProps]
    }
    
    @scala.inline
    implicit class SkipLinkTargetPropsMutableBuilder[Self <: SkipLinkTargetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
