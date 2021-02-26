package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typingsSlinky.materialUiLab.materialUiLabStrings.default
import typingsSlinky.materialUiLab.materialUiLabStrings.grey
import typingsSlinky.materialUiLab.materialUiLabStrings.inherit
import typingsSlinky.materialUiLab.materialUiLabStrings.outlined
import typingsSlinky.materialUiLab.materialUiLabStrings.primary
import typingsSlinky.materialUiLab.materialUiLabStrings.secondary
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineDotTimelineDotMod {
  
  @JSImport("@material-ui/lab/TimelineDot/TimelineDot", JSImport.Default)
  @js.native
  def default(props: TimelineDotProps): ReactElement = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.defaultDefault
    - typingsSlinky.materialUiLab.materialUiLabStrings.defaultPrimary
    - typingsSlinky.materialUiLab.materialUiLabStrings.defaultSecondary
    - typingsSlinky.materialUiLab.materialUiLabStrings.outlinedDefault
    - typingsSlinky.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typingsSlinky.materialUiLab.materialUiLabStrings.outlinedSecondary
  */
  trait TimelineDotClassKey extends StObject
  object TimelineDotClassKey {
    
    @scala.inline
    def defaultDefault: typingsSlinky.materialUiLab.materialUiLabStrings.defaultDefault = "defaultDefault".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.defaultDefault]
    
    @scala.inline
    def defaultPrimary: typingsSlinky.materialUiLab.materialUiLabStrings.defaultPrimary = "defaultPrimary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.defaultPrimary]
    
    @scala.inline
    def defaultSecondary: typingsSlinky.materialUiLab.materialUiLabStrings.defaultSecondary = "defaultSecondary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.defaultSecondary]
    
    @scala.inline
    def outlinedDefault: typingsSlinky.materialUiLab.materialUiLabStrings.outlinedDefault = "outlinedDefault".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.outlinedDefault]
    
    @scala.inline
    def outlinedPrimary: typingsSlinky.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    @scala.inline
    def outlinedSecondary: typingsSlinky.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineDot/TimelineDot.TimelineDotClassKey, never> */
  @js.native
  trait TimelineDotProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapTimeliDefaultDefault] = js.native
    
    /**
      * The dot can have a different colors.
      */
    var color: js.UndefOr[inherit | primary | secondary | grey] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * The dot can appear filled or outlined.
      */
    var variant: js.UndefOr[default | outlined] = js.native
  }
  object TimelineDotProps {
    
    @scala.inline
    def apply(): TimelineDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineDotProps]
    }
    
    @scala.inline
    implicit class TimelineDotPropsMutableBuilder[Self <: TimelineDotProps] (val x: Self) extends AnyVal {
      
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
      def setClasses(value: PartialClassNameMapTimeliDefaultDefault): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setColor(value: inherit | primary | secondary | grey): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
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
      
      @scala.inline
      def setVariant(value: default | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
