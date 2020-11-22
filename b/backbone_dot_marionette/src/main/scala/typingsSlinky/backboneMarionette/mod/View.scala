package typingsSlinky.backboneMarionette.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backboneMarionette.anon.Dictindex
import typingsSlinky.backboneMarionette.backboneMarionetteBooleans.`false`
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.backboneMarionette.mod.ViewMixin because var conflicts: delegateEvents. Inlined supportsRenderLifecycle, supportsDestroyLifecycle, isDestroyed, isRendered, isAttached, getTriggers, delegateEntityEvents, undelegateEntityEvents, destroy, bindUIElements, unbindUIElements, childViewEventPrefix, triggerMethod */ @JSImport("backbone.marionette", "View")
@js.native
class View[TModel /* <: Model[_, ModelSetOptions, js.Object] */] ()
  extends typingsSlinky.backbone.mod.View[TModel]
     with RegionsMixin
     with DomMixin
     with CommonMixin {
  def this(options: ViewOptions[TModel]) = this()
  
  /**
    * Used to attached the rendered template to this View's element.
    */
  def attachElContent(html: String): View[TModel] = js.native
  
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: (js.Array[Behavior | Dictindex]) | (StringDictionary[Instantiable1[/* options */ js.UndefOr[js.Any], Behavior]]) = js.native
  
  /**
    * Bind UI elements to this view. By default this is called in the
    * render method. (undocumented)
    */
  def bindUIElements(): js.Any = js.native
  
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  var childViewEventPrefix: js.Any | String | `false` = js.native
  
  /**
    * Delegate entity events. (undocumented)
    */
  def delegateEntityEvents(): View[TModel] = js.native
  
  /**
    * Overrides Backbone.View.delegateEvents. By default Marionette uses
    * this to add handlers for events and triggers. (undocumented)
    */
  def delegateEvents(eventsArg: js.Any): View[TModel] = js.native
  
  var destroy: js.Any = js.native
  /**
    * Manually destroy a view by calling the destroy method. The method
    * unbinds the UI elements, removes the view and its children from the
    * DOM and unbinds the listeners. It also triggers lifecycle events.
    */
  def destroy(args: js.Any*): View[TModel] = js.native
  
  /**
    * Used to determine which template to use. Override this method to add
    * logic for using multiple templates.
    */
  def getTemplate(): js.Any = js.native
  
  /**
    * Get the triggers that are currently attached to this view.
    * (undocumented)
    */
  def getTriggers(): EventsHash = js.native
  
  /**
    * Get handle on UI element defined in ui hash
    */
  def getUI(ui: String): JQuery[HTMLElement] = js.native
  
  /**
    * Check if this View is attached to the DOM.
    */
  def isAttached(): Boolean = js.native
  
  /**
    * Check if this View has been destroyed.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Check if this View has been rendered.
    */
  def isRendered(): Boolean = js.native
  
  /**
    * Mix in template context methods. Looks for a templateContext
    * attribute, which can either be an object literal, or a function that
    * returns an object literal. All methods and attributes from this
    * object are copies to the object passed in. (undocumented)
    */
  def mixinTemplateContext(args: js.Any*): js.Any = js.native
  
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: EventsHash = js.native
  
  /**
    * Event that is triggered after a Region has been added.
    */
  def onAddRegion(regionName: String, region: Region): Unit = js.native
  
  /**
    * Event that is triggered after this View's element has been added to
    * the DOM.
    */
  def onAttach(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered before a Region is added.
    */
  def onBeforeAddRegion(regionName: String, region: Region): Unit = js.native
  
  /**
    * Event that is triggered before this View is added to the DOM.
    */
  def onBeforeAttach(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered before this View is destroyed.
    */
  def onBeforeDestroy(view: View[TModel], args: js.Any*): Unit = js.native
  
  /**
    * Event that is triggered before this View's element is removed from
    * the DOM.
    */
  def onBeforeDetach(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered before a Region is removed.
    */
  def onBeforeRemoveRegion(regionName: String, region: Region): Unit = js.native
  
  /**
    * Event that is triggered before this View is rendered.
    */
  def onBeforeRender(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered after this View is destroyed.
    */
  def onDestroy(view: View[TModel], args: js.Any*): Unit = js.native
  
  /**
    * Event that is triggered after this View's element has been removed
    * from the DOM.
    */
  def onDetach(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered after this View's content has been added to
    * the DOM. Is also triggered every time this.render() is called.
    */
  def onDomRefresh(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered before this View's content is removed from
    * the DOM.
    */
  def onDomRemove(view: View[TModel]): Unit = js.native
  
  /**
    * Event that is triggered after a Region has been removed.
    */
  def onRemoveRegion(regionName: String, region: Region): Unit = js.native
  
  /**
    * Event that is triggered after this View is rendered.
    */
  def onRender(view: View[TModel]): Unit = js.native
  
  /**
    * Method used by this.serializeData to serialize this View's collection
    * data.
    */
  def serializeCollection(): js.Any = js.native
  
  /**
    * The results of this method ared passed to this View's template. By
    * default Marionette will attempt to pass either an attached model or
    * collection which has been converted to JSON.
    */
  def serializeData(): js.Any = js.native
  
  /**
    * Method used by this.serializeData to serialize this View's model
    * data.
    */
  def serializeModel(): js.Any = js.native
  
  /**
    * Used to set the renderer for this View. The rendere function is
    * passed the template and the data and is expected to return an html
    * string. By default this is set to use Renderer.
    */
  def setRenderer(renderer: js.Function2[/* template */ js.Any, /* data */ js.Any, String]): Unit = js.native
  
  /**
    * Internal property. (undocumented)
    */
  var supportsDestroyLifecycle: js.Any | Boolean = js.native
  
  /**
    * Internal property. (undocumented)
    */
  var supportsRenderLifecycle: js.Any | Boolean = js.native
  
  var triggerMethod: js.Any = js.native
  /**
    * Trigger an event and a corresponding method on the target object.
    * All arguments that are passed to the triggerMethod call are passed
    * along to both the event and the method, with the exception of the
    * event name not being passed to the corresponding method.
    */
  def triggerMethod(name: String, args: js.Any*): js.Any = js.native
  
  /**
    * The view triggers attribute binds DOM events to Marionette View events
    * that can be responded to at the view or parent level.
    */
  var triggers: EventsHash = js.native
  
  /**
    * Name parts of your template to be used
    * throughout the view with the ui attribute.
    */
  var ui: js.Any = js.native
  
  /**
    * Bind UI elements from this view. (undocumented)
    */
  def unbindUIElements(): js.Any = js.native
  
  /**
    * Undelegate entity events. (undocumented)
    */
  def undelegateEntityEvents(): View[TModel] = js.native
}
