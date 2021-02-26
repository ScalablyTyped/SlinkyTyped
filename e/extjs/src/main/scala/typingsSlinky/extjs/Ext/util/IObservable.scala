package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable extends IBase {
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addManagedListener: js.UndefOr[
    js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Removes all managed listeners for this object  */
  var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  var enableBubble: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.native
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEventArgs: js.UndefOr[
    js.Function2[/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], Boolean]
  ] = js.native
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Property] (Object) */
  var hasListeners: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var isObservable: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.native
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var mon: js.UndefOr[
    js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var mun: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var on: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  var relayEvents: js.UndefOr[
    js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[Array], 
      /* prefix */ js.UndefOr[String], 
      _
    ]
  ] = js.native
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var removeListener: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var removeManagedListener: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  var resumeEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  /** [Method] Resumes firing events see suspendEvents */
  var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  var suspendEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  var suspendEvents: js.UndefOr[js.Function1[/* queueSuspended */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var un: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IObservable {
  
  @scala.inline
  def apply(): IObservable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObservable]
  }
  
  @scala.inline
  implicit class IObservableMutableBuilder[Self <: IObservable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEvents(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
    
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setAddManagedListener(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
    
    @scala.inline
    def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
    
    @scala.inline
    def setClearManagedListeners(value: () => Unit): Self = StObject.set(x, "clearManagedListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
    
    @scala.inline
    def setEnableBubble(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
    
    @scala.inline
    def setFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEventArgs(value: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
    
    @scala.inline
    def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
    
    @scala.inline
    def setHasListener(value: /* eventName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
    
    @scala.inline
    def setHasListeners(value: js.Any): Self = StObject.set(x, "hasListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasListenersUndefined: Self = StObject.set(x, "hasListeners", js.undefined)
    
    @scala.inline
    def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
    
    @scala.inline
    def setListeners(value: js.Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setMon(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
    
    @scala.inline
    def setMun(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setRelayEvents(
      value: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setRemoveListener(
      value: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    @scala.inline
    def setRemoveManagedListener(
      value: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
    
    @scala.inline
    def setResumeEvent(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
    
    @scala.inline
    def setResumeEvents(value: () => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
    
    @scala.inline
    def setSuspendEvent(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
    
    @scala.inline
    def setSuspendEvents(value: /* queueSuspended */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
    
    @scala.inline
    def setUn(
      value: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
  }
}
