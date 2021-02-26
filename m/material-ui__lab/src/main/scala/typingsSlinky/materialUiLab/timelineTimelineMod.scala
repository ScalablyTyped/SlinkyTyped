package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeli
import typingsSlinky.materialUiLab.materialUiLabStrings.alternate
import typingsSlinky.materialUiLab.materialUiLabStrings.left
import typingsSlinky.materialUiLab.materialUiLabStrings.right
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineTimelineMod {
  
  @JSImport("@material-ui/lab/Timeline/Timeline", JSImport.Default)
  @js.native
  def default(props: TimelineProps): ReactElement = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.alignLeft
    - typingsSlinky.materialUiLab.materialUiLabStrings.alignRight
    - typingsSlinky.materialUiLab.materialUiLabStrings.alignAlternate
  */
  trait TimelineClassKey extends StObject
  object TimelineClassKey {
    
    @scala.inline
    def alignAlternate: typingsSlinky.materialUiLab.materialUiLabStrings.alignAlternate = "alignAlternate".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.alignAlternate]
    
    @scala.inline
    def alignLeft: typingsSlinky.materialUiLab.materialUiLabStrings.alignLeft = "alignLeft".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.alignLeft]
    
    @scala.inline
    def alignRight: typingsSlinky.materialUiLab.materialUiLabStrings.alignRight = "alignRight".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.alignRight]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/Timeline/Timeline.TimelineClassKey, never> */
  @js.native
  trait TimelineProps extends StObject {
    
    /**
      * The position where the timeline's content should appear.
      */
    var align: js.UndefOr[left | right | alternate] = js.native
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapTimeli] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineProps {
    
    @scala.inline
    def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    @scala.inline
    implicit class TimelinePropsMutableBuilder[Self <: TimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right | alternate): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
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
      def setClasses(value: PartialClassNameMapTimeli): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
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
