package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeliAlignAlternate
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineItemTimelineItemMod {
  
  @JSImport("@material-ui/lab/TimelineItem/TimelineItem", JSImport.Default)
  @js.native
  def default(props: TimelineItemProps): ReactElement = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.alignLeft
    - typingsSlinky.materialUiLab.materialUiLabStrings.alignRight
    - typingsSlinky.materialUiLab.materialUiLabStrings.alignAlternate
    - typingsSlinky.materialUiLab.materialUiLabStrings.missingOppositeContent
  */
  trait TimelineItemClassKey extends StObject
  object TimelineItemClassKey {
    
    @scala.inline
    def alignAlternate: typingsSlinky.materialUiLab.materialUiLabStrings.alignAlternate = "alignAlternate".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.alignAlternate]
    
    @scala.inline
    def alignLeft: typingsSlinky.materialUiLab.materialUiLabStrings.alignLeft = "alignLeft".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.alignLeft]
    
    @scala.inline
    def alignRight: typingsSlinky.materialUiLab.materialUiLabStrings.alignRight = "alignRight".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.alignRight]
    
    @scala.inline
    def missingOppositeContent: typingsSlinky.materialUiLab.materialUiLabStrings.missingOppositeContent = "missingOppositeContent".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.missingOppositeContent]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineItem/TimelineItem.TimelineItemClassKey, never> */
  @js.native
  trait TimelineItemProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapTimeliAlignAlternate] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineItemProps {
    
    @scala.inline
    def apply(): TimelineItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineItemProps]
    }
    
    @scala.inline
    implicit class TimelineItemPropsMutableBuilder[Self <: TimelineItemProps] (val x: Self) extends AnyVal {
      
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
      def setClasses(value: PartialClassNameMapTimeliAlignAlternate): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
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
