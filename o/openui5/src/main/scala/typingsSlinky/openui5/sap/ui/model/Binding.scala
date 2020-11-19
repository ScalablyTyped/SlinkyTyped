package typingsSlinky.openui5.sap.ui.model

import typingsSlinky.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding extends EventProvider {
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'AggregatedDataStateChange' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachAggregatedDataStateChange(fnFunction: js.Any): Unit = js.native
  def attachAggregatedDataStateChange(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'change' event of this
    * <code>sap.ui.model.Model</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachChange(fnFunction: js.Any): Unit = js.native
  def attachChange(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'dataReceived' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachDataReceived(fnFunction: js.Any): Unit = js.native
  def attachDataReceived(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'dataRequested' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachDataRequested(fnFunction: js.Any): Unit = js.native
  def attachDataRequested(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'DataStateChange' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachDataStateChange(fnFunction: js.Any): Unit = js.native
  def attachDataStateChange(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Attach multiple events.
    * @param oEvents undefined
    */
  def attachEvents(oEvents: js.Any): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'refresh' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def attachRefresh(fnFunction: js.Any): Unit = js.native
  def attachRefresh(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'AggregatedDataStateChange' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachAggregatedDataStateChange(fnFunction: js.Any): Unit = js.native
  def detachAggregatedDataStateChange(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'change' event of this
    * <code>sap.ui.model.Model</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachChange(fnFunction: js.Any): Unit = js.native
  def detachChange(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'dataReceived' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachDataReceived(fnFunction: js.Any): Unit = js.native
  def detachDataReceived(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'dataRequested' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachDataRequested(fnFunction: js.Any): Unit = js.native
  def detachDataRequested(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'DataStateChange' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachDataStateChange(fnFunction: js.Any): Unit = js.native
  def detachDataStateChange(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Detach multiple events-
    * @param oEvents undefined
    */
  def detachEvents(oEvents: js.Any): Unit = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'refresh' event of this
    * <code>sap.ui.model.Binding</code>.<br/>
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener object on which to call the given function.
    */
  def detachRefresh(fnFunction: js.Any): Unit = js.native
  def detachRefresh(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Fire event dataReceived to attached listeners. This event may also be fired when an error occured.
    * @param mArguments the arguments to pass along with the event.
    */
  def fireDataReceived(mArguments: js.Any): Unit = js.native
  
  /**
    * Fire event dataRequested to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    */
  def fireDataRequested(mArguments: js.Any): Unit = js.native
  
  /**
    * Initialize the binding. The message should be called when creating a binding.The default
    * implementation calls checkUpdate(true).
    */
  def initialize(): Unit = js.native
  
  /**
    * Returns whether the binding is initial, which means it did not get an initial value yet
    * @returns whether binding is initial
    */
  def isInitial(): Boolean = js.native
  
  /**
    * Returns whether the binding is relative, which means it did not start with a /
    * @returns whether binding is relative
    */
  def isRelative(): Boolean = js.native
  
  /**
    * Returns true if the binding is suspended or false if not.
    * @returns whether binding is suspended
    */
  def isSuspended(): Boolean = js.native
  
  /**
    * Refreshes the binding, check whether the model data has been changed and fire change eventif this is
    * the case. For server side models this should refetch the data from the server.To update a control,
    * even if no data has been changed, e.g. to reset a control after failedvalidation, please use the
    * parameter bForceUpdate.
    * @param bForceUpdate Update the bound control even if no data has been changed
    */
  def refresh(sGroupIdOrForceUpdate: String): Unit = js.native
  def refresh(sGroupIdOrForceUpdate: Boolean): Unit = js.native
  
  /**
    * Resumes the binding update. Change events will be fired again.When the binding is resumed, a change
    * event will be fired immediately, if the data has changed while the bindingwas suspended. For
    * serverside models, a request to the server will be triggered, if a refresh was requestedwhile the
    * binding was suspended.
    */
  def resume(): Unit = js.native
  
  /**
    * Suspends the binding update. No change events will be fired.A refresh call with bForceUpdate set to
    * true will also update the binding and fire a change in suspended mode.Special operations on
    * bindings, which require updates to work properly (as paging or filtering in list bindings)will also
    * update and cause a change event although the binding is suspended.
    */
  def suspend(): Unit = js.native
  
  /**
    * Determines if the binding should be updated by comparing the current model against a specified
    * model.
    * @param oModel The model instance to compare against
    * @returns true if this binding should be updated
    */
  def updateRequired(oModel: js.Any): Boolean = js.native
}
