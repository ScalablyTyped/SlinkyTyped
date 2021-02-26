package typingsSlinky.reactDragtastic

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactDragtastic.anon.StateisActivebooleanevent
import typingsSlinky.reactDragtastic.anon.StateisOverAcceptedboolea
import typingsSlinky.reactDragtastic.anon.StateisOverbooleanwillAcc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dragtastic", "DragComponent")
  @js.native
  class DragComponent protected ()
    extends Component[DragComponentProps, js.Any, js.Any] {
    def this(props: DragComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DragComponentProps, context: js.Any) = this()
  }
  
  @JSImport("react-dragtastic", "DragState")
  @js.native
  class DragState protected ()
    extends Component[DragStateProps, js.Any, js.Any] {
    def this(props: DragStateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DragStateProps, context: js.Any) = this()
  }
  
  @JSImport("react-dragtastic", "Draggable")
  @js.native
  class Draggable protected ()
    extends Component[DraggableProps, js.Any, js.Any] {
    def this(props: DraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DraggableProps, context: js.Any) = this()
  }
  
  @JSImport("react-dragtastic", "Droppable")
  @js.native
  class Droppable protected ()
    extends Component[DroppableProps, js.Any, js.Any] {
    def this(props: DroppableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DroppableProps, context: js.Any) = this()
  }
  
  type Accepts = String | js.Array[String]
  
  @js.native
  trait DragComponentProps extends StObject {
    
    /** A boolean determining whether or not the DragComponent should always render. Defaults to false. */
    var alwaysRender: js.UndefOr[Boolean] = js.native
    
    def children(arg: StateisOverAcceptedboolea): ReactElement = js.native
    
    /* A string corresponding to the id property of the <Draggable/> zone that should trigger this component to start rendering. */
    var `for`: js.UndefOr[Id] = js.native
    
    /** A function which will be called every time a user drags. */
    var onDrag: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
      * For example, you may pass ['type', 'data'] to only rerender if these keys change.
      */
    var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  }
  object DragComponentProps {
    
    @scala.inline
    def apply(children: StateisOverAcceptedboolea => ReactElement): DragComponentProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DragComponentProps]
    }
    
    @scala.inline
    implicit class DragComponentPropsMutableBuilder[Self <: DragComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysRender(value: Boolean): Self = StObject.set(x, "alwaysRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysRenderUndefined: Self = StObject.set(x, "alwaysRender", js.undefined)
      
      @scala.inline
      def setChildren(value: StateisOverAcceptedboolea => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFor(value: Id): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      @scala.inline
      def setOnDrag(value: () => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setSubscribeTo(value: js.Array[String]): Self = StObject.set(x, "subscribeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeToNull: Self = StObject.set(x, "subscribeTo", null)
      
      @scala.inline
      def setSubscribeToUndefined: Self = StObject.set(x, "subscribeTo", js.undefined)
      
      @scala.inline
      def setSubscribeToVarargs(value: String*): Self = StObject.set(x, "subscribeTo", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DragStateProps extends StObject {
    
    def children(arg: State): ReactElement = js.native
    
    /**
      * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
      * For example, you may pass ['type', 'data'] to only rerender if these keys change.
      */
    var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  }
  object DragStateProps {
    
    @scala.inline
    def apply(children: State => ReactElement): DragStateProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DragStateProps]
    }
    
    @scala.inline
    implicit class DragStatePropsMutableBuilder[Self <: DragStateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: State => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeTo(value: js.Array[String]): Self = StObject.set(x, "subscribeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeToNull: Self = StObject.set(x, "subscribeTo", null)
      
      @scala.inline
      def setSubscribeToUndefined: Self = StObject.set(x, "subscribeTo", js.undefined)
      
      @scala.inline
      def setSubscribeToVarargs(value: String*): Self = StObject.set(x, "subscribeTo", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DraggableProps extends StObject {
    
    def children(arg: StateisActivebooleanevent): ReactElement = js.native
    
    /** Data of any type which will be passed to the onDrop function of any <Droppable/> which accepts this <Draggable/>'s type. */
    var data: js.UndefOr[js.Any] = js.native
    
    /** An optional int representing the distance in pixels the user's pointer must travel to activate the draggable. Defaults to 8 */
    var delay: js.UndefOr[Double] = js.native
    
    /** An id which will be used in the draggable zone's target <DragComponent/> */
    var id: js.UndefOr[Id] = js.native
    
    /** A function which will be called every time the user's cursor moves while dragging. */
    var onDrag: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** A function which will be called when the <Draggable/> zone is deactivated (The user stopped dragging). */
    var onDragEnd: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    /** A function which will be called when the <Draggable/> zone is activated (The user started dragging). */
    var onDragStart: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    /**
      * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
      * For example, you may pass ['type', 'data'] to only rerender if these keys change.
      */
    var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
    
    /** A string, or array of strings, used to limit which droppable zones will accept <DragComponent/>'s attached to this draggable. */
    var `type`: js.UndefOr[Type] = js.native
  }
  object DraggableProps {
    
    @scala.inline
    def apply(children: StateisActivebooleanevent => ReactElement): DraggableProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DraggableProps]
    }
    
    @scala.inline
    implicit class DraggablePropsMutableBuilder[Self <: DraggableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: StateisActivebooleanevent => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnDrag(value: () => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragEnd(value: /* data */ js.Any => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* data */ js.Any => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setSubscribeTo(value: js.Array[String]): Self = StObject.set(x, "subscribeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeToNull: Self = StObject.set(x, "subscribeTo", null)
      
      @scala.inline
      def setSubscribeToUndefined: Self = StObject.set(x, "subscribeTo", js.undefined)
      
      @scala.inline
      def setSubscribeToVarargs(value: String*): Self = StObject.set(x, "subscribeTo", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DroppableProps extends StObject {
    
    /** A string type corresponding to the type property of the <Draggable/> zone for which this <Droppable/> should accept drop events. */
    var accepts: js.UndefOr[Accepts] = js.native
    
    def children(arg: StateisOverbooleanwillAcc): ReactElement = js.native
    
    /** An id which will be used in the draggable zone's target <DragComponent/> */
    var id: js.UndefOr[Id] = js.native
    
    /**
      * A function which will be called when the user's cursor enters the <Droppable/> while dragging.
      * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
      */
    var onDragEnter: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function which will be called when the user's cursor leaves the <Droppable/> while dragging.
      * This function will be called regardless of whether the droppable accepts the draggable currently being dragged.
      */
    var onDragLeave: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** A function which will be called when a user drops a <DragComponent/> on this <Droppable/> with an accepted type. */
    var onDrop: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    /**
      * An optional array of strings. For performance reasons you can limit which keys in the dragState your component subscribes to.
      * For example, you may pass ['type', 'data'] to only rerender if these keys change.
      */
    var subscribeTo: js.UndefOr[js.Array[String] | Null] = js.native
  }
  object DroppableProps {
    
    @scala.inline
    def apply(children: StateisOverbooleanwillAcc => ReactElement): DroppableProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[DroppableProps]
    }
    
    @scala.inline
    implicit class DroppablePropsMutableBuilder[Self <: DroppableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: Accepts): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAcceptsVarargs(value: String*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: StateisOverbooleanwillAcc => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: () => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: () => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDrop(value: /* data */ js.Any => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setSubscribeTo(value: js.Array[String]): Self = StObject.set(x, "subscribeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeToNull: Self = StObject.set(x, "subscribeTo", null)
      
      @scala.inline
      def setSubscribeToUndefined: Self = StObject.set(x, "subscribeTo", js.undefined)
      
      @scala.inline
      def setSubscribeToVarargs(value: String*): Self = StObject.set(x, "subscribeTo", js.Array(value :_*))
    }
  }
  
  type Id = String | Double
  
  @js.native
  trait State extends StObject {
    
    /** The id of the currently dragging element. */
    var currentlyDraggingId: js.UndefOr[Id] = js.native
    
    /** The accepts property of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableAccepts: js.UndefOr[Accepts] = js.native
    
    /** The id of the <Droppable/> currently being hovered. */
    var currentlyHoveredDroppableId: js.UndefOr[Id] = js.native
    
    /** Data from the data property of the <Draggable/> which is currently active. null if not dragging. */
    var data: js.Any = js.native
    
    /** A boolean representing whether the user is currently dragging. */
    var isDragging: Boolean = js.native
    
    /** The user's initial horizontal position on the page when they started dragging. */
    var startingX: Double = js.native
    
    /** The user's initial vertical position on the page when they started dragging. */
    var startingY: Double = js.native
    
    /** The type of the component being currently dragged. null if not dragging. */
    var `type`: js.UndefOr[Type] = js.native
    
    /** The user's current horizontal position on the page. */
    var x: Double = js.native
    
    /** The user's current vertical position on the page. */
    var y: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(data: js.Any, isDragging: Boolean, startingX: Double, startingY: Double, x: Double, y: Double): State = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], startingX = startingX.asInstanceOf[js.Any], startingY = startingY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentlyDraggingId(value: Id): Self = StObject.set(x, "currentlyDraggingId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentlyDraggingIdUndefined: Self = StObject.set(x, "currentlyDraggingId", js.undefined)
      
      @scala.inline
      def setCurrentlyHoveredDroppableAccepts(value: Accepts): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentlyHoveredDroppableAcceptsUndefined: Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.undefined)
      
      @scala.inline
      def setCurrentlyHoveredDroppableAcceptsVarargs(value: String*): Self = StObject.set(x, "currentlyHoveredDroppableAccepts", js.Array(value :_*))
      
      @scala.inline
      def setCurrentlyHoveredDroppableId(value: Id): Self = StObject.set(x, "currentlyHoveredDroppableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentlyHoveredDroppableIdUndefined: Self = StObject.set(x, "currentlyHoveredDroppableId", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingX(value: Double): Self = StObject.set(x, "startingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingY(value: Double): Self = StObject.set(x, "startingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Type = String | Double
}
