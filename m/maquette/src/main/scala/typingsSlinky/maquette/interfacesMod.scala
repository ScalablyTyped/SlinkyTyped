package typingsSlinky.maquette

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.maquette.anon.PartialCSSStyleDeclaratio
import typingsSlinky.maquette.maquetteStrings.`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait CalculationCache[Result] extends StObject {
    
    /**
      * Manually invalidates the cached outcome.
      */
    def invalidate(): Unit = js.native
    
    /**
      * If the inputs array matches the inputs array from the previous invocation, this method returns the result of the previous invocation.
      * Otherwise, the calculation function is invoked and its result is cached and returned.
      * Objects in the inputs array are compared using ===.
      * @param inputs - Array of objects that are to be compared using === with the inputs from the previous invocation.
      * These objects are assumed to be immutable primitive values.
      * @param calculation - Function that takes zero arguments and returns an object (A [[VNode]] presumably) that can be cached.
      */
    def result(inputs: js.Array[_], calculation: js.Function0[Result]): Result = js.native
  }
  object CalculationCache {
    
    @scala.inline
    def apply[Result](invalidate: () => Unit, result: (js.Array[_], js.Function0[Result]) => Result): CalculationCache[Result] = {
      val __obj = js.Dynamic.literal(invalidate = js.Any.fromFunction0(invalidate), result = js.Any.fromFunction2(result))
      __obj.asInstanceOf[CalculationCache[Result]]
    }
    
    @scala.inline
    implicit class CalculationCacheMutableBuilder[Self <: CalculationCache[_], Result] (val x: Self with CalculationCache[Result]) extends AnyVal {
      
      @scala.inline
      def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResult(value: (js.Array[_], js.Function0[Result]) => Result): Self = StObject.set(x, "result", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Component extends StObject {
    
    def renderMaquette(): js.UndefOr[VNode | Null] = js.native
  }
  object Component {
    
    @scala.inline
    def apply(renderMaquette: () => js.UndefOr[VNode | Null]): Component = {
      val __obj = js.Dynamic.literal(renderMaquette = js.Any.fromFunction0(renderMaquette))
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderMaquette(value: () => js.UndefOr[VNode | Null]): Self = StObject.set(x, "renderMaquette", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Dom extends StObject {
    
    /**
      * Appends a new child node to the DOM which is generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param parentNode - The parent node for the new child node.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    def append(parentNode: Element, vnode: VNode): Projection = js.native
    def append(parentNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Creates a real DOM tree from `vnode`. The [[Projection]] object returned will contain the resulting DOM Node in
      * its [[Projection.domNode|domNode]] property.
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection.
      * @returns The [[Projection]] which also contains the DOM Node that was created.
      */
    def create(vnode: VNode): Projection = js.native
    def create(vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Inserts a new DOM node which is generated from a [[VNode]].
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param beforeNode - The node that the DOM Node is inserted before.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function.
      * NOTE: [[VNode]] objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    def insertBefore(beforeNode: Element, vnode: VNode): Projection = js.native
    def insertBefore(beforeNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Merges a new DOM node which is generated from a [[VNode]] with an existing DOM Node.
      * This means that the virtual DOM and the real DOM will have one overlapping element.
      * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided.
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param element - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]] objects
      * may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    def merge(element: Element, vnode: VNode): Projection = js.native
    def merge(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
    
    /**
      * Replaces an existing DOM node with a node generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param element - The node for the [[VNode]] to replace.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    def replace(element: Element, vnode: VNode): Projection = js.native
    def replace(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = js.native
  }
  
  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ String, 
    /* eventHandler */ js.Function, 
    /* domNode */ Node, 
    /* properties */ VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  
  @js.native
  trait Mapping[Source, Target] extends StObject {
    
    /**
      * Maps a new array of sources and updates [[results]].
      *
      * @param newSources   The new array of sources.
      */
    def map(newSources: js.Array[Source]): Unit = js.native
    
    /**
      * The array of results. These results will be synchronized with the latest array of sources that were provided using [[map]].
      */
    var results: js.Array[Target] = js.native
  }
  object Mapping {
    
    @scala.inline
    def apply[Source, Target](map: js.Array[Source] => Unit, results: js.Array[Target]): Mapping[Source, Target] = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapping[Source, Target]]
    }
    
    @scala.inline
    implicit class MappingMutableBuilder[Self <: Mapping[_, _], Source, Target] (val x: Self with (Mapping[Source, Target])) extends AnyVal {
      
      @scala.inline
      def setMap(value: js.Array[Source] => Unit): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResults(value: js.Array[Target]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: Target*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MaquetteComponent extends StObject {
    
    /**
      * A function that returns the DOM representation of the component.
      */
    def render(): js.UndefOr[VNode | Null] = js.native
  }
  object MaquetteComponent {
    
    @scala.inline
    def apply(render: () => js.UndefOr[VNode | Null]): MaquetteComponent = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[MaquetteComponent]
    }
    
    @scala.inline
    implicit class MaquetteComponentMutableBuilder[Self <: MaquetteComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: () => js.UndefOr[VNode | Null]): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.maquette.maquetteStrings.domEvent
    - typingsSlinky.maquette.maquetteStrings.domEventProcessed
    - typingsSlinky.maquette.maquetteStrings.renderStart
    - typingsSlinky.maquette.maquetteStrings.rendered
    - typingsSlinky.maquette.maquetteStrings.patched
    - typingsSlinky.maquette.maquetteStrings.renderDone
  */
  trait PerformanceLoggerEvent extends StObject
  object PerformanceLoggerEvent {
    
    @scala.inline
    def domEvent: typingsSlinky.maquette.maquetteStrings.domEvent = "domEvent".asInstanceOf[typingsSlinky.maquette.maquetteStrings.domEvent]
    
    @scala.inline
    def domEventProcessed: typingsSlinky.maquette.maquetteStrings.domEventProcessed = "domEventProcessed".asInstanceOf[typingsSlinky.maquette.maquetteStrings.domEventProcessed]
    
    @scala.inline
    def patched: typingsSlinky.maquette.maquetteStrings.patched = "patched".asInstanceOf[typingsSlinky.maquette.maquetteStrings.patched]
    
    @scala.inline
    def renderDone: typingsSlinky.maquette.maquetteStrings.renderDone = "renderDone".asInstanceOf[typingsSlinky.maquette.maquetteStrings.renderDone]
    
    @scala.inline
    def renderStart: typingsSlinky.maquette.maquetteStrings.renderStart = "renderStart".asInstanceOf[typingsSlinky.maquette.maquetteStrings.renderStart]
    
    @scala.inline
    def rendered: typingsSlinky.maquette.maquetteStrings.rendered = "rendered".asInstanceOf[typingsSlinky.maquette.maquetteStrings.rendered]
  }
  
  @js.native
  trait Projection extends StObject {
    
    /**
      * The DOM node that is used as the root of this [[Projection]].
      */
    val domNode: Element = js.native
    
    def getLastRender(): VNode = js.native
    
    /**
      * Updates the real DOM to match the new virtual DOM tree.
      * @param updatedVnode The updated virtual DOM tree. Note: The selector for the root of the [[VNode]] tree may not change.
      */
    def update(updatedVnode: VNode): Unit = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(domNode: Element, getLastRender: () => VNode, update: VNode => Unit): Projection = {
      val __obj = js.Dynamic.literal(domNode = domNode.asInstanceOf[js.Any], getLastRender = js.Any.fromFunction0(getLastRender), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomNode(value: Element): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetLastRender(value: () => VNode): Self = StObject.set(x, "getLastRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: VNode => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ProjectionOptions extends ProjectorOptions {
    
    /**
      * May be used to intercept registration of event-handlers.
      *
      * Used by the [[Projector]] to wrap eventHandler-calls to call [[scheduleRender]] as well.
      *
      * @param propertyName             The name of the property to be assigned, for example onclick
      * @param eventHandler             The function that was registered on the [[VNode]]
      * @param domNode                  The real DOM element
      * @param properties               The whole set of properties that was put on the VNode
      * @returns                        The function that is to be placed on the DOM node as the event handler, instead of `eventHandler`.
      */
    var eventHandlerInterceptor: js.UndefOr[EventHandlerInterceptor] = js.native
    
    /**
      * Only for internal use. Used for rendering SVG Nodes.
      */
    val namespace: js.UndefOr[String] = js.native
  }
  object ProjectionOptions {
    
    @scala.inline
    def apply(): ProjectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectionOptions]
    }
    
    @scala.inline
    implicit class ProjectionOptionsMutableBuilder[Self <: ProjectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventHandlerInterceptor(
        value: (/* propertyName */ String, /* eventHandler */ js.Function, /* domNode */ Node, /* properties */ VNodeProperties) => js.UndefOr[js.Function]
      ): Self = StObject.set(x, "eventHandlerInterceptor", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEventHandlerInterceptorUndefined: Self = StObject.set(x, "eventHandlerInterceptor", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
  
  @js.native
  trait Projector extends ProjectorService {
    
    /**
      * Appends a new child node to the DOM using the result from the provided `renderFunction`.
      * The `renderFunction` will be invoked again to update the DOM when needed.
      * @param parentNode - The parent node for the new child node.
      * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
      */
    def append(parentNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
    
    /**
      * Stops running the `renderFunction` to update the DOM. The `renderFunction` must have been
      * registered using [[append]], [[merge]], [[insertBefore]] or [[replace]].
      *
      * @returns The [[Projection]] which was created using this `renderFunction`.
      * The [[Projection]] contains a reference to the DOM Node that was rendered.
      */
    def detach(renderFunction: js.Function0[VNode]): Projection = js.native
    
    /**
      * Inserts a new DOM node using the result from the provided `renderFunction`.
      * The `renderFunction` will be invoked again to update the DOM when needed.
      * @param beforeNode - The node that the DOM Node is inserted before.
      * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
      */
    def insertBefore(beforeNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
    
    /**
      * Merges a new DOM node using the result from the provided `renderFunction` with an existing DOM Node.
      * This means that the virtual DOM and real DOM have one overlapping element.
      * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided
      * The `renderFunction` will be invoked again to update the DOM when needed.
      * @param domNode - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
      * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
      */
    def merge(domNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
    
    /**
      * Replaces an existing DOM node with the result from the provided `renderFunction`.
      * The `renderFunction` will be invoked again to update the DOM when needed.
      * @param domNode - The DOM node to replace.
      * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
      */
    def replace(domNode: Element, renderFunction: js.Function0[VNode]): Unit = js.native
    
    /**
      * Resumes the projector. Use this method to resume rendering after [[stop]] was called or an error occurred during rendering.
      */
    def resume(): Unit = js.native
    
    /**
      * Stops the projector. This means that the registered `render` functions will not be called anymore.
      *
      * Note that calling [[stop]] is not mandatory. A projector is a passive object that will get garbage collected
      * as usual if it is no longer in scope.
      */
    def stop(): Unit = js.native
  }
  object Projector {
    
    @scala.inline
    def apply(
      append: (Element, js.Function0[VNode]) => Unit,
      detach: js.Function0[VNode] => Projection,
      insertBefore: (Element, js.Function0[VNode]) => Unit,
      merge: (Element, js.Function0[VNode]) => Unit,
      renderNow: () => Unit,
      replace: (Element, js.Function0[VNode]) => Unit,
      resume: () => Unit,
      scheduleRender: () => Unit,
      stop: () => Unit
    ): Projector = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), detach = js.Any.fromFunction1(detach), insertBefore = js.Any.fromFunction2(insertBefore), merge = js.Any.fromFunction2(merge), renderNow = js.Any.fromFunction0(renderNow), replace = js.Any.fromFunction2(replace), resume = js.Any.fromFunction0(resume), scheduleRender = js.Any.fromFunction0(scheduleRender), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Projector]
    }
    
    @scala.inline
    implicit class ProjectorMutableBuilder[Self <: Projector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: (Element, js.Function0[VNode]) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDetach(value: js.Function0[VNode] => Projection): Self = StObject.set(x, "detach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsertBefore(value: (Element, js.Function0[VNode]) => Unit): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMerge(value: (Element, js.Function0[VNode]) => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplace(value: (Element, js.Function0[VNode]) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ProjectorOptions extends StObject {
    
    /**
      * Can be used to log performance metrics
      */
    var performanceLogger: js.UndefOr[ProjectorPerformanceLogger] = js.native
    
    /**
      * May be used to add vendor prefixes when applying inline styles when needed.
      * This function is called when [[styles]] is used.
      * This function should execute `domNode.style[styleName] = value` or do something smarter.
      *
      * @param domNode   The DOM Node that needs to receive the style
      * @param styleName The name of the style that should be applied, for example `transform`.
      * @param value     The value of this style, for example `rotate(45deg)`.
      */
    var styleApplyer: js.UndefOr[
        js.Function3[/* domNode */ HTMLElement, /* styleName */ String, /* value */ String, Unit]
      ] = js.native
  }
  object ProjectorOptions {
    
    @scala.inline
    def apply(): ProjectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectorOptions]
    }
    
    @scala.inline
    implicit class ProjectorOptionsMutableBuilder[Self <: ProjectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPerformanceLogger(value: (/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event]) => Unit): Self = StObject.set(x, "performanceLogger", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPerformanceLoggerUndefined: Self = StObject.set(x, "performanceLogger", js.undefined)
      
      @scala.inline
      def setStyleApplyer(value: (/* domNode */ HTMLElement, /* styleName */ String, /* value */ String) => Unit): Self = StObject.set(x, "styleApplyer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStyleApplyerUndefined: Self = StObject.set(x, "styleApplyer", js.undefined)
    }
  }
  
  type ProjectorPerformanceLogger = js.Function2[/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event], Unit]
  
  @js.native
  trait ProjectorService extends StObject {
    
    /**
      * Synchronously re-renders to the DOM. You should normally call the `scheduleRender()` function to keep the
      * user interface more performant. There is however one good reason to call renderNow(),
      * when you want to put the focus into a newly created element in iOS.
      * This is only allowed when triggered by a user-event, not during requestAnimationFrame.
      */
    def renderNow(): Unit = js.native
    
    /**
      * Instructs the projector to re-render to the DOM at the next animation-frame using the registered `render` functions.
      * This method is automatically called for you when event-handlers that are registered in the [[VNode]]s are invoked.
      *
      * You need to call this method when timeouts expire, when AJAX responses arrive or other asynchronous actions happen.
      */
    def scheduleRender(): Unit = js.native
  }
  object ProjectorService {
    
    @scala.inline
    def apply(renderNow: () => Unit, scheduleRender: () => Unit): ProjectorService = {
      val __obj = js.Dynamic.literal(renderNow = js.Any.fromFunction0(renderNow), scheduleRender = js.Any.fromFunction0(scheduleRender))
      __obj.asInstanceOf[ProjectorService]
    }
    
    @scala.inline
    implicit class ProjectorServiceMutableBuilder[Self <: ProjectorService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderNow(value: () => Unit): Self = StObject.set(x, "renderNow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScheduleRender(value: () => Unit): Self = StObject.set(x, "scheduleRender", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait VNode extends _VNodeChild {
    
    /**
      * Array of [[VNode]]s to be used as children. This array is already flattened.
      */
    val children: js.UndefOr[js.Array[VNode]] = js.native
    
    /**
      * Used by maquette to store the domNode that was produced from this [[VNode]].
      */
    var domNode: Node | Null = js.native
    
    /**
      * Object containing attributes, properties, event handlers and more, see [[h]].
      */
    val properties: js.UndefOr[VNodeProperties] = js.native
    
    /**
      * Used in a special case when a [[VNode]] only has one child node which is a text node. Only used in combination with children === undefined.
      */
    val text: js.UndefOr[String] = js.native
    
    /**
      * The CSS selector containing tagname, css classnames and id. An empty string is used to denote a text node.
      */
    val vnodeSelector: String = js.native
  }
  object VNode {
    
    @scala.inline
    def apply(vnodeSelector: String): VNode = {
      val __obj = js.Dynamic.literal(vnodeSelector = vnodeSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    @scala.inline
    implicit class VNodeMutableBuilder[Self <: VNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDomNode(value: Node): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomNodeNull: Self = StObject.set(x, "domNode", null)
      
      @scala.inline
      def setProperties(value: VNodeProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVnodeSelector(value: String): Self = StObject.set(x, "vnodeSelector", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.maquette.interfacesMod.VNode
    - typingsSlinky.maquette.interfacesMod.VNodeChildren
    - typingsSlinky.maquette.maquetteBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type VNodeChild = js.UndefOr[_VNodeChild | String | Null]
  
  @js.native
  trait VNodeChildren
    extends Array[VNodeChild]
       with _VNodeChild
  
  @js.native
  trait VNodeProperties
    extends /**
    * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
    */
  /* index */ StringDictionary[js.Any] {
    
    val accessKey: js.UndefOr[String] = js.native
    
    val action: js.UndefOr[String] = js.native
    
    /**
      * Callback that is executed after this node is added to the DOM. Child nodes and properties have
      * already been applied.
      * @param element - The element that was added to the DOM.
      * @param projectionOptions - The projection options that were used, see [[createProjector]].
      * @param vnodeSelector - The selector passed to the [[h]] function.
      * @param properties - The properties passed to the [[h]] function.
      * @param children - The children that were created.
      */
    var afterCreate: js.UndefOr[
        js.Function5[
          /* element */ Element, 
          /* projectionOptions */ ProjectionOptions, 
          /* vnodeSelector */ String, 
          /* properties */ this.type, 
          /* children */ js.UndefOr[js.Array[VNode]], 
          Unit
        ]
      ] = js.native
    
    /**
      * Callback that is called when a node has been removed from the tree.
      * The callback is called during idle state or after a timeout (fallback).
      * {@link https://maquettejs.org/docs/dom-node-removal.html|More info}
      * @param element - The element that has been removed from the DOM.
      */
    var afterRemoved: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
    
    /**
      * Callback that is executed every time this node may have been updated. Child nodes and properties
      * have already been updated.
      * @param element - The element that may have been updated in the DOM.
      * @param projectionOptions - The projection options that were used, see [[createProjector]].
      * @param vnodeSelector - The selector passed to the [[h]] function.
      * @param properties - The properties passed to the [[h]] function.
      * @param children - The children for this node.
      */
    var afterUpdate: js.UndefOr[
        js.Function5[
          /* element */ Element, 
          /* projectionOptions */ ProjectionOptions, 
          /* vnodeSelector */ String, 
          /* properties */ this.type, 
          /* children */ js.UndefOr[js.Array[VNode]], 
          Unit
        ]
      ] = js.native
    
    val alt: js.UndefOr[String] = js.native
    
    val autocomplete: js.UndefOr[String] = js.native
    
    /**
      * When specified, the event handlers will be invoked with 'this' pointing to the value.
      * This is useful when using the prototype/class based implementation of MaquetteComponents.
      *
      * When no [[key]] is present, this object is also used to uniquely identify a DOM node.
      */
    val bind: js.UndefOr[js.Object] = js.native
    
    val checked: js.UndefOr[Boolean] = js.native
    
    val `class`: js.UndefOr[String] = js.native
    
    /**
      * Do not use className, use class instead
      */
    val className: js.UndefOr[
        `HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
      ] = js.native
    
    /**
      * An object literal like `{important:true}` which allows css classes, like `important` to be added and removed
      * dynamically.
      */
    val classes: js.UndefOr[StringDictionary[js.UndefOr[Boolean | Null]]] = js.native
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val draggable: js.UndefOr[Boolean] = js.native
    
    val encoding: js.UndefOr[String] = js.native
    
    val enctype: js.UndefOr[String] = js.native
    
    /**
      * The animation to perform when this node is added to an already existing parent.
      * {@link http://maquettejs.org/docs/animations.html|More about animations}.
      * @param element - Element that was just added to the DOM.
      * @param properties - The properties object that was supplied to the [[h]] method
      */
    var enterAnimation: js.UndefOr[
        js.Function2[/* element */ Element, /* properties */ js.UndefOr[this.type], Unit]
      ] = js.native
    
    /**
      * The animation to perform when this node is removed while its parent remains.
      * @param element - Element that ought to be removed from to the DOM.
      * @param removeElement - Function that removes the element from the DOM.
      * This argument is provided purely for convenience.
      * You may use this function to remove the element when the animation is done.
      * @param properties - The properties object that was supplied to the [[h]] method that rendered this [[VNode]] the previous time.
      */
    var exitAnimation: js.UndefOr[
        js.Function3[
          /* element */ Element, 
          /* removeElement */ js.Function0[Unit], 
          /* properties */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.native
    
    val href: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    /**
      * Puts a non-interactive string of html inside the DOM node.
      *
      * Note: if you use innerHTML, maquette cannot protect you from XSS vulnerabilities and you must make sure that the innerHTML value is safe.
      */
    val innerHTML: js.UndefOr[String] = js.native
    
    /**
      * Used to uniquely identify a DOM node among siblings.
      * A key is required when there are more children with the same selector and these children are added or removed dynamically.
      * NOTE: this does not have to be a string or number, a [[MaquetteComponent]] Object for instance is also common.
      */
    val key: js.UndefOr[js.Object] = js.native
    
    val method: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    var onblur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.native
    
    var onchange: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
    
    var onclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var ondblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var ondrag: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var ondragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var ondragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var ondragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var ondragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var ondragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var ondrop: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
    
    var onfocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.native
    
    var oninput: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
    
    var onkeydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
    
    var onkeypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
    
    var onkeyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
    
    var onload: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
    
    var onmousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
    
    var onmousewheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, Boolean | Unit]] = js.native
    
    var onscroll: js.UndefOr[js.Function1[/* ev */ UIEvent, Boolean | Unit]] = js.native
    
    var onsubmit: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
    
    var ontouchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
    
    var ontouchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
    
    var ontouchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
    
    var ontouchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
    
    val placeholder: js.UndefOr[String] = js.native
    
    val readOnly: js.UndefOr[Boolean] = js.native
    
    val rel: js.UndefOr[String] = js.native
    
    val spellcheck: js.UndefOr[Boolean] = js.native
    
    val src: js.UndefOr[String] = js.native
    
    val srcset: js.UndefOr[String] = js.native
    
    /**
      * An object literal like `{height:'100px'}` which allows styles to be changed dynamically. All values must be strings.
      */
    val styles: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
    
    val tabIndex: js.UndefOr[Double] = js.native
    
    val target: js.UndefOr[String] = js.native
    
    val title: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
    
    /**
      * The animation to perform when the properties of this node change.
      * This also includes attributes, styles, css classes. This callback is also invoked when node contains only text and that text changes.
      * {@link http://maquettejs.org/docs/animations.html|More about animations}.
      * @param element - Element that was modified in the DOM.
      * @param properties - The last properties object that was supplied to the [[h]] method
      * @param previousProperties - The previous properties object that was supplied to the [[h]] method
      */
    var updateAnimation: js.UndefOr[
        js.Function3[
          /* element */ Element, 
          /* properties */ js.UndefOr[this.type], 
          /* previousProperties */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.native
    
    val value: js.UndefOr[String] = js.native
  }
  object VNodeProperties {
    
    @scala.inline
    def apply(): VNodeProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeProperties]
    }
    
    @scala.inline
    implicit class VNodePropertiesMutableBuilder[Self <: VNodeProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAfterCreate(
        value: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Unit
      ): Self = StObject.set(x, "afterCreate", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
      
      @scala.inline
      def setAfterRemoved(value: /* element */ Element => Unit): Self = StObject.set(x, "afterRemoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterRemovedUndefined: Self = StObject.set(x, "afterRemoved", js.undefined)
      
      @scala.inline
      def setAfterUpdate(
        value: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Unit
      ): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setBind(value: js.Object): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(
        value: scala.Nothing | (`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`)
      ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setClasses(value: StringDictionary[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
      
      @scala.inline
      def setEnterAnimation(value: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties]) => Unit): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      @scala.inline
      def setExitAnimation(
        value: (/* element */ Element, /* removeElement */ js.Function0[Unit], /* properties */ js.UndefOr[VNodeProperties]) => Unit
      ): Self = StObject.set(x, "exitAnimation", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExitAnimationUndefined: Self = StObject.set(x, "exitAnimation", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
      
      @scala.inline
      def setKey(value: js.Object): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnblur(value: /* ev */ FocusEvent => Boolean | Unit): Self = StObject.set(x, "onblur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      @scala.inline
      def setOnchange(value: /* ev */ Event => Boolean | Unit): Self = StObject.set(x, "onchange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      @scala.inline
      def setOnclick(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setOndblclick(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      @scala.inline
      def setOndrag(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      @scala.inline
      def setOndragend(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondragend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      @scala.inline
      def setOndragenter(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondragenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      @scala.inline
      def setOndragleave(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondragleave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      @scala.inline
      def setOndragover(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondragover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      @scala.inline
      def setOndragstart(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondragstart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      @scala.inline
      def setOndrop(value: /* ev */ DragEvent => Boolean | Unit): Self = StObject.set(x, "ondrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      @scala.inline
      def setOnfocus(value: /* ev */ FocusEvent => Boolean | Unit): Self = StObject.set(x, "onfocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      @scala.inline
      def setOninput(value: /* ev */ Event => Boolean | Unit): Self = StObject.set(x, "oninput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      @scala.inline
      def setOnkeydown(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = StObject.set(x, "onkeydown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      @scala.inline
      def setOnkeypress(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = StObject.set(x, "onkeypress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      @scala.inline
      def setOnkeyup(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = StObject.set(x, "onkeyup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      @scala.inline
      def setOnload(value: /* ev */ Event => Boolean | Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnmousedown(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      @scala.inline
      def setOnmouseenter(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmouseenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      @scala.inline
      def setOnmouseleave(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmouseleave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      @scala.inline
      def setOnmousemove(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmousemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      @scala.inline
      def setOnmouseout(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      @scala.inline
      def setOnmouseover(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      @scala.inline
      def setOnmouseup(value: /* ev */ MouseEvent => Boolean | Unit): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      @scala.inline
      def setOnmousewheel(value: /* ev */ WheelEvent => Boolean | Unit): Self = StObject.set(x, "onmousewheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmousewheelUndefined: Self = StObject.set(x, "onmousewheel", js.undefined)
      
      @scala.inline
      def setOnscroll(value: /* ev */ UIEvent => Boolean | Unit): Self = StObject.set(x, "onscroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      @scala.inline
      def setOnsubmit(value: /* ev */ Event => Boolean | Unit): Self = StObject.set(x, "onsubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      @scala.inline
      def setOntouchcancel(value: /* ev */ TouchEvent => Boolean | Unit): Self = StObject.set(x, "ontouchcancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
      
      @scala.inline
      def setOntouchend(value: /* ev */ TouchEvent => Boolean | Unit): Self = StObject.set(x, "ontouchend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
      
      @scala.inline
      def setOntouchmove(value: /* ev */ TouchEvent => Boolean | Unit): Self = StObject.set(x, "ontouchmove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
      
      @scala.inline
      def setOntouchstart(value: /* ev */ TouchEvent => Boolean | Unit): Self = StObject.set(x, "ontouchstart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdateAnimation(
        value: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties], /* previousProperties */ js.UndefOr[VNodeProperties]) => Unit
      ): Self = StObject.set(x, "updateAnimation", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateAnimationUndefined: Self = StObject.set(x, "updateAnimation", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait _VNodeChild extends StObject
}
