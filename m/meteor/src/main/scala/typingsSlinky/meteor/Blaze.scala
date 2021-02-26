package typingsSlinky.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.meteor.Meteor.SubscriptionHandle
import typingsSlinky.meteor.Tracker.Computation
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Blaze {
  
  type EventsMap = StringDictionary[js.Function]
  
  type HelpersMap = StringDictionary[js.Function]
  
  @js.native
  trait Template extends StObject {
    
    @JSName("$")
    var $: js.Any = js.native
    
    def constructView(): View = js.native
    
    var created: js.Function = js.native
    
    var destroyed: js.Function = js.native
    
    def events(eventsMap: EventsMap): Unit = js.native
    
    def find(selector: String): HTMLElement = js.native
    
    def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    var head: Template = js.native
    
    def helpers(helpersMap: HelpersMap): Unit = js.native
    
    def onCreated(cb: js.Function): Unit = js.native
    
    def onDestroyed(cb: js.Function): Unit = js.native
    
    def onRendered(cb: js.Function): Unit = js.native
    
    var renderFunction: js.Function = js.native
    
    var rendered: js.Function = js.native
    
    var viewName: String = js.native
  }
  object Template {
    
    @scala.inline
    def apply(
      $: js.Any,
      constructView: () => View,
      created: js.Function,
      destroyed: js.Function,
      events: EventsMap => Unit,
      find: String => HTMLElement,
      findAll: String => js.Array[HTMLElement],
      head: Template,
      helpers: HelpersMap => Unit,
      onCreated: js.Function => Unit,
      onDestroyed: js.Function => Unit,
      onRendered: js.Function => Unit,
      renderFunction: js.Function,
      rendered: js.Function,
      viewName: String
    ): Template = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constructView = js.Any.fromFunction0(constructView), created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head.asInstanceOf[js.Any], helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Template]
    }
    
    @scala.inline
    implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$(value: js.Any): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructView(value: () => View): Self = StObject.set(x, "constructView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreated(value: js.Function): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyed(value: js.Function): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: EventsMap => Unit): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHead(value: Template): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpers(value: HelpersMap => Unit): Self = StObject.set(x, "helpers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreated(value: js.Function => Unit): Self = StObject.set(x, "onCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDestroyed(value: js.Function => Unit): Self = StObject.set(x, "onDestroyed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRendered(value: js.Function => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderFunction(value: js.Function): Self = StObject.set(x, "renderFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendered(value: js.Function): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplateInstance extends StObject {
    
    @JSName("$")
    def $(selector: String): js.Any = js.native
    
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    
    var data: Record[String, _] = js.native
    
    def find(selector: String): HTMLElement = js.native
    
    def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    var firstNode: js.Object = js.native
    
    var lastNode: js.Object = js.native
    
    def subscribe(name: String, args: js.Any*): SubscriptionHandle = js.native
    
    def subscriptionsReady(): Boolean = js.native
    
    var view: js.Object = js.native
  }
  object TemplateInstance {
    
    @scala.inline
    def apply(
      $: String => js.Any,
      autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
      data: Record[String, _],
      find: String => HTMLElement,
      findAll: String => js.Array[HTMLElement],
      firstNode: js.Object,
      lastNode: js.Object,
      subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle,
      subscriptionsReady: () => Boolean,
      view: js.Object
    ): TemplateInstance = {
      val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), autorun = js.Any.fromFunction1(autorun), data = data.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), firstNode = firstNode.asInstanceOf[js.Any], lastNode = lastNode.asInstanceOf[js.Any], subscribe = js.Any.fromFunction2(subscribe), subscriptionsReady = js.Any.fromFunction0(subscriptionsReady), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateInstance]
    }
    
    @scala.inline
    implicit class TemplateInstanceMutableBuilder[Self <: TemplateInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$(value: String => js.Any): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: String => HTMLElement): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindAll(value: String => js.Array[HTMLElement]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirstNode(value: js.Object): Self = StObject.set(x, "firstNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNode(value: js.Object): Self = StObject.set(x, "lastNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubscriptionsReady(value: () => Boolean): Self = StObject.set(x, "subscriptionsReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setView(value: js.Object): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplateInstanceStatic extends Instantiable1[/* view */ View, TemplateInstance]
  
  @js.native
  trait TemplateStatic
    extends Instantiable0[Template]
       with Instantiable1[/* viewName */ String, Template]
       with Instantiable2[js.UndefOr[/* viewName */ String], /* renderFunction */ js.Function, Template] {
    
    def currentData(): js.Any = js.native
    
    def instance(): TemplateInstance = js.native
    
    def parentData(numLevels: Double): js.Any = js.native
    
    def registerHelper(name: String, func: js.Function): Unit = js.native
  }
  
  @js.native
  trait View extends StObject {
    
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    
    def firstNode(): Node = js.native
    
    var isCreated: Boolean = js.native
    
    var isDestroyed: Boolean = js.native
    
    var isRendered: Boolean = js.native
    
    def lastNode(): Node = js.native
    
    var name: String = js.native
    
    def onViewCreated(func: js.Function): Unit = js.native
    
    def onViewDestroyed(func: js.Function): Unit = js.native
    
    def onViewReady(func: js.Function): Unit = js.native
    
    var parentView: View = js.native
    
    var renderCount: Double = js.native
    
    var template: Template = js.native
    
    def templateInstance(): TemplateInstance = js.native
  }
  object View {
    
    @scala.inline
    def apply(
      autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
      firstNode: () => Node,
      isCreated: Boolean,
      isDestroyed: Boolean,
      isRendered: Boolean,
      lastNode: () => Node,
      name: String,
      onViewCreated: js.Function => Unit,
      onViewDestroyed: js.Function => Unit,
      onViewReady: js.Function => Unit,
      parentView: View,
      renderCount: Double,
      template: Template,
      templateInstance: () => TemplateInstance
    ): View = {
      val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], lastNode = js.Any.fromFunction0(lastNode), name = name.asInstanceOf[js.Any], onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView.asInstanceOf[js.Any], renderCount = renderCount.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateInstance = js.Any.fromFunction0(templateInstance))
      __obj.asInstanceOf[View]
    }
    
    @scala.inline
    implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = StObject.set(x, "autorun", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirstNode(value: () => Node): Self = StObject.set(x, "firstNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCreated(value: Boolean): Self = StObject.set(x, "isCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDestroyed(value: Boolean): Self = StObject.set(x, "isDestroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNode(value: () => Node): Self = StObject.set(x, "lastNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnViewCreated(value: js.Function => Unit): Self = StObject.set(x, "onViewCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewDestroyed(value: js.Function => Unit): Self = StObject.set(x, "onViewDestroyed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewReady(value: js.Function => Unit): Self = StObject.set(x, "onViewReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParentView(value: View): Self = StObject.set(x, "parentView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderCount(value: Double): Self = StObject.set(x, "renderCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateInstance(value: () => TemplateInstance): Self = StObject.set(x, "templateInstance", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ViewStatic
    extends Instantiable0[View]
       with Instantiable1[/* name */ String, View]
       with Instantiable2[js.UndefOr[/* name */ String], /* renderFunction */ js.Function, View]
}
