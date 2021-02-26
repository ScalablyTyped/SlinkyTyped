package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeliRoot
import typingsSlinky.materialUiLab.materialUiLabStrings.root
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineConnectorTimelineConnectorMod {
  
  @JSImport("@material-ui/lab/TimelineConnector/TimelineConnector", JSImport.Default)
  @js.native
  def default(props: TimelineConnectorProps): ReactElement = js.native
  
  type TimelineConnectorClassKey = root
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineConnector/TimelineConnector.TimelineConnectorClassKey, never> */
  @js.native
  trait TimelineConnectorProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapTimeliRoot] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineConnectorProps {
    
    @scala.inline
    def apply(): TimelineConnectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineConnectorProps]
    }
    
    @scala.inline
    implicit class TimelineConnectorPropsMutableBuilder[Self <: TimelineConnectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapTimeliRoot): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
