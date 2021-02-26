package typingsSlinky.materialUiLab

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.anon.ClassName
import typingsSlinky.materialUiCore.withStylesMod.StyledComponentProps
import typingsSlinky.materialUiLab.anon.PartialFabProps
import typingsSlinky.materialUiLab.materialUiLabStrings.down
import typingsSlinky.materialUiLab.materialUiLabStrings.left
import typingsSlinky.materialUiLab.materialUiLabStrings.right
import typingsSlinky.materialUiLab.materialUiLabStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialSpeedDialMod {
  
  @JSImport("@material-ui/lab/SpeedDial/SpeedDial", JSImport.Default)
  @js.native
  def default(props: SpeedDialProps): ReactElement = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.toggle
    - typingsSlinky.materialUiLab.materialUiLabStrings.blur
    - typingsSlinky.materialUiLab.materialUiLabStrings.mouseLeave
    - typingsSlinky.materialUiLab.materialUiLabStrings.escapeKeyDown
  */
  trait CloseReason extends StObject
  object CloseReason {
    
    @scala.inline
    def blur: typingsSlinky.materialUiLab.materialUiLabStrings.blur = "blur".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.blur]
    
    @scala.inline
    def escapeKeyDown: typingsSlinky.materialUiLab.materialUiLabStrings.escapeKeyDown = "escapeKeyDown".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.escapeKeyDown]
    
    @scala.inline
    def mouseLeave: typingsSlinky.materialUiLab.materialUiLabStrings.mouseLeave = "mouseLeave".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.mouseLeave]
    
    @scala.inline
    def toggle: typingsSlinky.materialUiLab.materialUiLabStrings.toggle = "toggle".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.toggle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.toggle
    - typingsSlinky.materialUiLab.materialUiLabStrings.focus
    - typingsSlinky.materialUiLab.materialUiLabStrings.mouseEnter
  */
  trait OpenReason extends StObject
  object OpenReason {
    
    @scala.inline
    def focus: typingsSlinky.materialUiLab.materialUiLabStrings.focus = "focus".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.focus]
    
    @scala.inline
    def mouseEnter: typingsSlinky.materialUiLab.materialUiLabStrings.mouseEnter = "mouseEnter".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.mouseEnter]
    
    @scala.inline
    def toggle: typingsSlinky.materialUiLab.materialUiLabStrings.toggle = "toggle".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.toggle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.fab
    - typingsSlinky.materialUiLab.materialUiLabStrings.directionUp
    - typingsSlinky.materialUiLab.materialUiLabStrings.directionDown
    - typingsSlinky.materialUiLab.materialUiLabStrings.directionLeft
    - typingsSlinky.materialUiLab.materialUiLabStrings.directionRight
    - typingsSlinky.materialUiLab.materialUiLabStrings.actions
    - typingsSlinky.materialUiLab.materialUiLabStrings.actionsClosed
  */
  trait SpeedDialClassKey extends StObject
  object SpeedDialClassKey {
    
    @scala.inline
    def actions: typingsSlinky.materialUiLab.materialUiLabStrings.actions = "actions".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.actions]
    
    @scala.inline
    def actionsClosed: typingsSlinky.materialUiLab.materialUiLabStrings.actionsClosed = "actionsClosed".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.actionsClosed]
    
    @scala.inline
    def directionDown: typingsSlinky.materialUiLab.materialUiLabStrings.directionDown = "directionDown".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.directionDown]
    
    @scala.inline
    def directionLeft: typingsSlinky.materialUiLab.materialUiLabStrings.directionLeft = "directionLeft".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.directionLeft]
    
    @scala.inline
    def directionRight: typingsSlinky.materialUiLab.materialUiLabStrings.directionRight = "directionRight".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.directionRight]
    
    @scala.inline
    def directionUp: typingsSlinky.materialUiLab.materialUiLabStrings.directionUp = "directionUp".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.directionUp]
    
    @scala.inline
    def fab: typingsSlinky.materialUiLab.materialUiLabStrings.fab = "fab".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.fab]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | 'children'>> : never */ @js.native
  trait SpeedDialProps
    extends StyledComponentProps[SpeedDialClassKey]
       with ClassName {
    
    /**
      * Props applied to the [`Fab`](/api/fab/) element.
      */
    var FabProps: js.UndefOr[PartialFabProps] = js.native
    
    /**
      * The component used for the transition.
      * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
      */
    var TransitionComponent: js.UndefOr[
        ReactComponentClass[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
        ]
      ] = js.native
    
    /**
      * Props applied to the [`Transition`](http://reactcommunity.org/react-transition-group/transition#Transition-props) element.
      */
    var TransitionProps: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
      ] = js.native
    
    /**
      * The aria-label of the button element.
      * Also used to provide the `id` for the `SpeedDial` element and its children.
      */
    var ariaLabel: String = js.native
    
    /**
      * SpeedDialActions to display when the SpeedDial is `open`.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * The direction the actions open relative to the floating action button.
      */
    var direction: js.UndefOr[up | down | left | right] = js.native
    
    /**
      * If `true`, the SpeedDial will be hidden.
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
      * provides a default Icon with animation.
      */
    var icon: js.UndefOr[ReactElement] = js.native
    
    /**
      * Callback fired when the component requests to be closed.
      *
      * @param {object} event The event source of the callback.
      * @param {string} reason Can be: `"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
      */
    var onClose: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Event, js.Object], /* reason */ CloseReason, Unit]
      ] = js.native
    
    /**
      * Callback fired when the component requests to be open.
      *
      * @param {object} event The event source of the callback.
      * @param {string} reason Can be: `"toggle"`, `"focus"`, `"mouseEnter"`.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Event, js.Object], /* reason */ OpenReason, Unit]
      ] = js.native
    
    /**
      * If `true`, the SpeedDial is open.
      */
    var open: Boolean = js.native
    
    /**
      * The icon to display in the SpeedDial Fab when the SpeedDial is open.
      */
    var openIcon: js.UndefOr[ReactElement] = js.native
    
    /**
      * The duration for the transition, in milliseconds.
      * You may specify a single timeout for all transitions, or individually with an object.
      */
    var transitionDuration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
      ] = js.native
  }
  object SpeedDialProps {
    
    @scala.inline
    def apply(ariaLabel: String, open: Boolean): SpeedDialProps = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpeedDialProps]
    }
    
    @scala.inline
    implicit class SpeedDialPropsMutableBuilder[Self <: SpeedDialProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: up | down | left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFabProps(value: PartialFabProps): Self = StObject.set(x, "FabProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFabPropsUndefined: Self = StObject.set(x, "FabProps", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ CloseReason) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ OpenReason) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIcon(value: ReactElement): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIconReactElement(value: ReactElement): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIconUndefined: Self = StObject.set(x, "openIcon", js.undefined)
      
      @scala.inline
      def setTransitionComponent(
        value: ReactComponentClass[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
            ]
      ): Self = StObject.set(x, "TransitionComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentComponentClass(
        value: ReactComponentClass[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
            ]
      ): Self = StObject.set(x, "TransitionComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentFunctionComponent(
        value: ReactComponentClass[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
            ]
      ): Self = StObject.set(x, "TransitionComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionComponentUndefined: Self = StObject.set(x, "TransitionComponent", js.undefined)
      
      @scala.inline
      def setTransitionDuration(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
      ): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
      ): Self = StObject.set(x, "TransitionProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionPropsUndefined: Self = StObject.set(x, "TransitionProps", js.undefined)
    }
  }
}
