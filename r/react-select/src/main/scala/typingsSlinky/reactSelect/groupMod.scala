package typingsSlinky.reactSelect

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSelect.typesMod.CommonProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod extends Shortcut {
  
  @JSImport("react-select/src/components/Group", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GroupProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Group", "Group")
  @js.native
  val Group: ReactComponentClass[GroupProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Group", "GroupHeading")
  @js.native
  val GroupHeading: ReactComponentClass[js.Any] = js.native
  
  @JSImport("react-select/src/components/Group", "groupCSS")
  @js.native
  def groupCSS(): CSSProperties = js.native
  
  @JSImport("react-select/src/components/Group", "groupHeadingCSS")
  @js.native
  def groupHeadingCSS(): CSSProperties = js.native
  
  @js.native
  trait ComponentProps extends StObject {
    
    /** Component to wrap the label, recieves headingProps. */
    var Heading: ReactComponentClass[_] = js.native
    
    /** The children to be rendered. */
    var children: ReactElement = js.native
    
    /** Props to pass to Heading. */
    var headingProps: js.Any = js.native
    
    /** Label to be displayed in the heading component. */
    var label: ReactElement = js.native
  }
  object ComponentProps {
    
    @scala.inline
    def apply(Heading: ReactComponentClass[_], headingProps: js.Any): ComponentProps = {
      val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], headingProps = headingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentProps]
    }
    
    @scala.inline
    implicit class ComponentPropsMutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHeading(value: ReactComponentClass[_]): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingProps(value: js.Any): Self = StObject.set(x, "headingProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  type GroupProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with ComponentProps
  
  type _To = ReactComponentClass[GroupProps[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `groupMod.foo` */
  override def _to: ReactComponentClass[GroupProps[js.Any]] = default
}
