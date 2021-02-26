package typingsSlinky.blueprintjsCore

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonIdealStateMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState")
  @js.native
  class NonIdealState protected ()
    extends AbstractPureComponent2[INonIdealStateProps, js.Object, js.Object] {
    def this(props: INonIdealStateProps) = this()
    def this(props: INonIdealStateProps, context: js.Any) = this()
    
    var maybeRenderVisual: js.Any = js.native
  }
  /* static members */
  object NonIdealState {
    
    @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait INonIdealStateProps extends IProps {
    
    /** An action to resolve the non-ideal state which appears after `description`. */
    var action: js.UndefOr[ReactElement] = js.native
    
    /**
      * Advanced usage: React `children` will appear last (after `action`).
      * Avoid passing raw strings as they will not receive margins and disrupt the layout flow.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * A longer description of the non-ideal state.
      * A string or number value will be wrapped in a `<div>` to preserve margins.
      */
    var description: js.UndefOr[ReactChild] = js.native
    
    /** The name of a Blueprint icon or a JSX Element (such as `<Spinner/>`) to render above the title. */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /** The title of the non-ideal state. */
    var title: js.UndefOr[ReactElement] = js.native
  }
  object INonIdealStateProps {
    
    @scala.inline
    def apply(): INonIdealStateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INonIdealStateProps]
    }
    
    @scala.inline
    implicit class INonIdealStatePropsMutableBuilder[Self <: INonIdealStateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactChild): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionReactElement(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
