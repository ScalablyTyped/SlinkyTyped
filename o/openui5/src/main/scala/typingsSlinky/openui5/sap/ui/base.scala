package typingsSlinky.openui5.sap.ui

import typingsSlinky.openui5.sap.ui.model.Binding
import typingsSlinky.openui5.sap.ui.model.Context
import typingsSlinky.openui5.sap.ui.model.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base {
  
  @js.native
  trait Event extends Object {
    
    /**
      * Cancel bubbling of the event.<b>Note:</b> This function only has an effect if the bubbling of the
      * event is supported by the event source.
      */
    def cancelBubble(): Unit = js.native
    
    /**
      * Returns the id of the event.
      * @returns The id of the event
      */
    def getId(): String = js.native
    
    /**
      * Returns the value of the parameter with the given sName.
      * @param sName The name of the parameter to return
      * @returns The value for the named parameter
      */
    def getParameter(sName: String): js.Any = js.native
    
    /**
      * Returns all parameter values of the event keyed by their names.
      * @returns All parameters of the event keyed by name
      */
    def getParameters(): js.Any = js.native
    
    /**
      * Returns the event provider on which the event was fired.
      * @returns The source of the event
      */
    def getSource(): EventProvider = js.native
    
    /**
      * Prevent the default action of this event.<b>Note:</b> This function only has an effect if preventing
      * the default action of the event is supported by the event source.
      */
    def preventDefault(): Unit = js.native
  }
  
  @js.native
  trait EventProvider extends Object {
    
    /**
      * Attaches an event handler to the event with the given identifier.
      * @param sEventId The identifier of the event to listen for
      * @param oData An object that will be passed to the handler along with the event object when the event
      * is fired
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * event provider instance. The event                      object ({@link sap.ui.base.Event}) is
      * provided as first argument of the handler. Handlers must not change                      the content
      * of the event. The second argument is the specified <code>oData</code> instance (if present).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the event provider.
      * @returns Returns <code>this</code> to allow method chaining
      */
    def attachEvent(sEventId: String, oData: js.Any, fnFunction: js.Any): EventProvider = js.native
    def attachEvent(sEventId: String, oData: js.Any, fnFunction: js.Any, oListener: js.Any): EventProvider = js.native
    
    /**
      * Attaches an event handler, called one time only, to the event with the given identifier.When the
      * event occurs, the handler function is called and the handler registration is automatically removed
      * afterwards.
      * @param sEventId The identifier of the event to listen for
      * @param oData An object that will be passed to the handler along with the event object when the event
      * is fired
      * @param fnFunction The handler function to call when the event occurs. This function will be called
      * in the context of the                      <code>oListener</code> instance (if present) or on the
      * event provider instance. The event                      object ({@link sap.ui.base.Event}) is
      * provided as first argument of the handler. Handlers must not change                      the content
      * of the event. The second argument is the specified <code>oData</code> instance (if present).
      * @param oListener The object that wants to be notified when the event occurs (<code>this</code>
      * context within the                       handler function). If it is not specified, the handler
      * function is called in the context of the event provider.
      * @returns Returns <code>this</code> to allow method chaining
      */
    def attachEventOnce(sEventId: String, oData: js.Any, fnFunction: js.Any): EventProvider = js.native
    def attachEventOnce(sEventId: String, oData: js.Any, fnFunction: js.Any, oListener: js.Any): EventProvider = js.native
    
    /**
      * Removes a previously attached event handler from the event with the given identifier.The passed
      * parameters must match those used for registration with {@link #attachEvent} beforehand.
      * @param sEventId The identifier of the event to detach from
      * @param fnFunction The handler function to detach from the event
      * @param oListener The object that wanted to be notified when the event occurred
      * @returns Returns <code>this</code> to allow method chaining
      */
    def detachEvent(sEventId: String, fnFunction: js.Any): EventProvider = js.native
    def detachEvent(sEventId: String, fnFunction: js.Any, oListener: js.Any): EventProvider = js.native
    
    /**
      * Fires an {@link sap.ui.base.Event event} with the given settings and notifies all attached event
      * handlers.
      * @param sEventId The identifier of the event to fire
      * @param mParameters The parameters which should be carried by the event
      * @param bAllowPreventDefault Defines whether function <code>preventDefault</code> is supported on the
      * fired event
      * @param bEnableEventBubbling Defines whether event bubbling is enabled on the fired event. Set to
      * <code>true</code> the event is also forwarded to the parent(s)                                  of
      * the event provider ({@link #getEventingParent}) until the bubbling of the event is stopped or no
      * parent is available anymore.
      * @returns Returns <code>this</code> to allow method chaining. When <code>preventDefault</code> is
      * supported on the fired event                                            the function returns
      * <code>true</code> if the default action should be executed, <code>false</code> otherwise.
      */
    def fireEvent(sEventId: String): EventProvider | Boolean = js.native
    def fireEvent(
      sEventId: String,
      mParameters: js.UndefOr[scala.Nothing],
      bAllowPreventDefault: js.UndefOr[scala.Nothing],
      bEnableEventBubbling: Boolean
    ): EventProvider | Boolean = js.native
    def fireEvent(sEventId: String, mParameters: js.UndefOr[scala.Nothing], bAllowPreventDefault: Boolean): EventProvider | Boolean = js.native
    def fireEvent(
      sEventId: String,
      mParameters: js.UndefOr[scala.Nothing],
      bAllowPreventDefault: Boolean,
      bEnableEventBubbling: Boolean
    ): EventProvider | Boolean = js.native
    def fireEvent(sEventId: String, mParameters: js.Any): EventProvider | Boolean = js.native
    def fireEvent(
      sEventId: String,
      mParameters: js.Any,
      bAllowPreventDefault: js.UndefOr[scala.Nothing],
      bEnableEventBubbling: Boolean
    ): EventProvider | Boolean = js.native
    def fireEvent(sEventId: String, mParameters: js.Any, bAllowPreventDefault: Boolean): EventProvider | Boolean = js.native
    def fireEvent(
      sEventId: String,
      mParameters: js.Any,
      bAllowPreventDefault: Boolean,
      bEnableEventBubbling: Boolean
    ): EventProvider | Boolean = js.native
    
    /**
      * Returns the parent in the eventing hierarchy of this object.Per default this returns null, but if
      * eventing is used in objects, which are hierarchicallystructured, this can be overwritten to make the
      * object hierarchy visible to the eventing andenables the use of event bubbling within this object
      * hierarchy.
      * @returns The parent event provider
      */
    def getEventingParent(): EventProvider = js.native
    
    /**
      * Returns whether there are any registered event handlers for the event with the given identifier.
      * @param sEventId The identifier of the event
      * @returns Whether there are any registered event handlers
      */
    def hasListeners(sEventId: String): Boolean = js.native
  }
  
  @js.native
  trait Interface extends StObject
  
  @js.native
  trait ManagedObject extends EventProvider {
    
    /**
      * Adds some entity <code>oObject</code> to the aggregation identified by
      * <code>sAggregationName</code>.If the given object is not valid with regard to the aggregation (if it
      * is not an instanceof the type specified for that aggregation) or when the method is called for an
      * aggregationof cardinality 0..1, then an Error is thrown (see {@link #validateAggregation}.If the
      * aggregation already has content, the new object will be added after the current content.If the new
      * object was already contained in the aggregation, it will be moved to the end.<b>Note:</b> This
      * method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically add an object
      * to an aggregation.Use the concrete method add<i>XYZ</i> for aggregation 'XYZ' or the generic {@link
      * #applySettings} instead.
      * @param sAggregationName the string identifying the aggregation that <code>oObject</code> should be
      * added to.
      * @param oObject the object to add; if empty, nothing is added
      * @param bSuppressInvalidate if true, this ManagedObject as well as the added child are not marked as
      * changed
      * @returns Returns <code>this</code> to allow method chaining
      */
    def addAggregation(sAggregationName: String, oObject: ManagedObject): ManagedObject = js.native
    def addAggregation(sAggregationName: String, oObject: ManagedObject, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Adds some object with the ID <code>sId</code> to the association identified by
      * <code>sAssociationName</code> andmarks this ManagedObject as changed.This method does not avoid
      * duplicates.<b>Note:</b> This method is a low-level API as described in <a href="#lowlevelapi">the
      * class documentation</a>.Applications or frameworks must not use this method to generically add an
      * object to an association.Use the concrete method add<i>XYZ</i> for association 'XYZ' or the generic
      * {@link #applySettings} instead.
      * @param sAssociationName the string identifying the association the object should be added to.
      * @param sId the ID of the ManagedObject object to add; if empty, nothing is added; if a
      * <code>sap.ui.base.ManagedObject</code> is given, its ID is added
      * @param bSuppressInvalidate if true, this managed object as well as the newly associated object are
      * not marked as changed
      * @returns Returns <code>this</code> to allow method chaining
      */
    def addAssociation(sAssociationName: String, sId: String): ManagedObject = js.native
    def addAssociation(sAssociationName: String, sId: String, bSuppressInvalidate: Boolean): ManagedObject = js.native
    def addAssociation(sAssociationName: String, sId: ManagedObject): ManagedObject = js.native
    def addAssociation(sAssociationName: String, sId: ManagedObject, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Sets all the properties, aggregations, associations and event handlers as given inthe object literal
      * <code>mSettings</code>. If a property, aggregation, etc.is not listed in <code>mSettings</code>,
      * then its value is not changed by this method.For properties and 0..1 aggregations/associations, any
      * given setting overwritesthe current value. For 0..n aggregations, the given values are appended;
      * eventlisteners are registered in addition to existing ones.For the possible keys and values in
      * <code>mSettings</code> see the generaldocumentation in {@link sap.ui.base.ManagedObject} or the
      * specific documentationof the constructor of the concrete managed object class.
      * @param mSettings the settings to apply to this managed object
      * @param oScope Scope object to resolve types and formatters
      * @returns Returns <code>this</code> to allow method chaining
      */
    def applySettings(mSettings: js.Any): ManagedObject = js.native
    def applySettings(mSettings: js.Any, oScope: js.Any): ManagedObject = js.native
    
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>formatError</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.base.ManagedObject</code> itself.Fired when a new value for a bound property
      * should have been propagated from the model,but formatting the value failed with an exception.
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.base.ManagedObject</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachFormatError(oData: js.Any, fnFunction: js.Any): ManagedObject = js.native
    def attachFormatError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>modelContextChange</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.base.ManagedObject</code> itself.Fired when models or contexts are changed on
      * this object (either by calling setModel/setBindingContext or due to propagation)
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.base.ManagedObject</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachModelContextChange(oData: js.Any, fnFunction: js.Any): ManagedObject = js.native
    def attachModelContextChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>parseError</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.base.ManagedObject</code> itself.Fired when a new value for a bound property
      * should have been propagated to the model,but parsing the value failed with an exception.
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.base.ManagedObject</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachParseError(oData: js.Any, fnFunction: js.Any): ManagedObject = js.native
    def attachParseError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>validationError</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.base.ManagedObject</code> itself.Fired when a new value for a bound property
      * should have been propagated to the model,but validating the value failed with an exception.
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.base.ManagedObject</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachValidationError(oData: js.Any, fnFunction: js.Any): ManagedObject = js.native
    def attachValidationError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>validationSuccess</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.base.ManagedObject</code> itself.Fired after a new value for a bound property
      * has been propagated to the model.Only fired, when the binding uses a data type.
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.base.ManagedObject</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachValidationSuccess(oData: js.Any, fnFunction: js.Any): ManagedObject = js.native
    def attachValidationSuccess(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Bind an aggregation to the model.The bound aggregation will use the given template, clone it for
      * each itemwhich exists in the bound list and set the appropriate binding context.This is a generic
      * method which can be used to bind any aggregation to themodel. A managed object may flag aggregations
      * in the metamodel withbindable="bindable" to get typed bind<i>Something</i> methods for those
      * aggregations.
      * @param sName the aggregation to bind
      * @param oBindingInfo the binding info
      * @returns reference to the instance itself
      */
    def bindAggregation(sName: String, oBindingInfo: js.Any): ManagedObject = js.native
    
    /**
      * Bind the object to the referenced entity in the model, which is used as the binding contextto
      * resolve bound properties or aggregations of the object itself and all of its childrenrelatively to
      * the given path.
      * @param sPath the binding path
      * @returns reference to the instance itself
      */
    def bindContext(sPath: String): ManagedObject = js.native
    
    /**
      * Bind the object to the referenced entity in the model, which is used as the binding contextto
      * resolve bound properties or aggregations of the object itself and all of its childrenrelatively to
      * the given path.If a relative binding path is used, this will be applied whenever the parent context
      * changes.
      * @param vPath the binding path or an object with more detailed binding options
      * @param mParameters map of additional parameters for this binding (only taken into account when vPath
      * is a string in that case the properties described for vPath above are valid here).The supported
      * parameters are listed in the corresponding model-specific implementation of
      * <code>sap.ui.model.ContextBinding</code>.
      * @returns reference to the instance itself
      */
    def bindObject(vPath: String): ManagedObject = js.native
    def bindObject(vPath: String, mParameters: js.Any): ManagedObject = js.native
    def bindObject(vPath: js.Any): ManagedObject = js.native
    def bindObject(vPath: js.Any, mParameters: js.Any): ManagedObject = js.native
    
    /**
      * Bind a property to the model.The Setter for the given property will be called with the value
      * retrievedfrom the data model.This is a generic method which can be used to bind any property to
      * themodel. A managed object may flag properties in the metamodel withbindable="bindable" to get typed
      * bind methods for a property.A composite property binding which may have multiple paths (also known
      * as Calculated Fields) can be declared using the parts parameter.Note a composite binding is read
      * only (One Way).
      * @param sName the name of the property
      * @param oBindingInfo the binding information
      * @returns reference to the instance itself
      */
    def bindProperty(sName: String, oBindingInfo: js.Any): ManagedObject = js.native
    
    /**
      * Clones a tree of objects starting with the object on which clone is called first (root object).The
      * ids within the newly created clone tree are derived from the original ids by appendingthe given
      * <code>sIdSuffix</code> (if no suffix is given, one will be created; it will beunique across multiple
      * clone calls).The <code>oOptions</code> configuration object can have the following
      * properties:<ul><li>The boolean value <code>cloneChildren</code> specifies wether
      * associations/aggregations will be cloned</li><li>The boolean value <code>cloneBindings</code>
      * specifies if bindings will be cloned</li></ul>For each cloned object the following settings are
      * cloned based on the metadata of the object and the defined options:<ul><li>all properties that are
      * not bound. If cloneBinding is false even these properties will be cloned;the values are used by
      * reference, they are not cloned</li><li>all aggregated objects that are not bound. If cloneBinding is
      * false even the ones that are bound will be cloned;they are all cloned recursively using the same
      * <code>sIdSuffix</code></li><li>all associated controls; when an association points to an object
      * inside the cloned object tree,    then the cloned association will be modified to that it points to
      * the clone of the target object.    When the association points to a managed object outside of the
      * cloned object tree, then its    target won't be changed.</li><li>all models set via setModel(); used
      * by reference </li><li>all property and aggregation bindings (if cloneBindings is true); the pure
      * binding infos (path, model name) are    cloned, but all other information like template control or
      * factory function,    data type or formatter function are copied by reference. The bindings
      * themselves    are created anew as they are specific for the combination (object, property, model).  
      *  As a result, any later changes to a binding of the original object are not reflected    in the
      * clone, but changes to e.g the type or template etc. are.</li></ul>Each clone is created by first
      * collecting the above mentioned settings and then creatinga new instance with the normal constructor
      * function. As a result, any side effects ofmutator methods (setProperty etc.) or init hooks are
      * repeated during clone creation.There is no need to override <code>clone()</code> just to reproduce
      * these internal settings!Custom controls however can override <code>clone()</code> to implement
      * additional clone steps.They usually will first call <code>clone()</code> on the super class and then
      * modify thereturned clone accordingly.Applications <b>must never provide</b> the second parameter
      * <code>aLocaleIds</code>.It is determined automatically for the root object (and its non-existance
      * also serves asan indicator for the root object). Specifying it will break the implementation of
      * <code>clone()</code>.
      * @param sIdSuffix a suffix to be appended to the cloned object id
      * @param aLocalIds an array of local IDs within the cloned hierarchy (internally used)
      * @param oOptions configuration object
      * @returns reference to the newly created clone
      */
    def clone(sIdSuffix: String): ManagedObject = js.native
    def clone(sIdSuffix: String, aLocalIds: js.UndefOr[scala.Nothing], oOptions: js.Any): ManagedObject = js.native
    def clone(sIdSuffix: String, aLocalIds: js.Array[String]): ManagedObject = js.native
    def clone(sIdSuffix: String, aLocalIds: js.Array[String], oOptions: js.Any): ManagedObject = js.native
    
    def create(vData: js.Any, oKeyInfo: js.Any): Unit = js.native
    def create(vData: js.Any, oKeyInfo: js.Any, oScope: js.Any): Unit = js.native
    /**
      * Creates a new ManagedObject from the given data.If vData is a managed object already, that object is
      * returned.If vData is an object (literal), then a new object is created with vData as settings.The
      * type of the object is either determined by a "Type" entry in the vData orby a type information in
      * the oKeyInfo object
      * @param vData the data to create the object from
      * @param oKeyInfo undefined
      * @param oScope Scope object to resolve types and formatters in bindings
      */
    def create(vData: ManagedObject, oKeyInfo: js.Any): Unit = js.native
    def create(vData: ManagedObject, oKeyInfo: js.Any, oScope: js.Any): Unit = js.native
    
    /**
      * Destroys (all) the managed object(s) in the aggregation named <code>sAggregationName</code> and
      * empties theaggregation. If the aggregation did contain any object, this ManagedObject is marked as
      * changed.<b>Note:</b> This method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically destroy all
      * objects in an aggregation.Use the concrete method destroy<i>XYZ</i> for aggregation 'XYZ' instead.
      * @param sAggregationName the name of the aggregation
      * @param bSuppressInvalidate if true, this ManagedObject is not marked as changed
      * @returns Returns <code>this</code> to allow method chaining
      */
    def destroyAggregation(sAggregationName: String): ManagedObject = js.native
    def destroyAggregation(sAggregationName: String, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>formatError</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.The passed function and listener object must match the ones
      * used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachFormatError(fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>modelContextChange</code> event of
      * this <code>sap.ui.base.ManagedObject</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachModelContextChange(fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>parseError</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.The passed function and listener object must match the ones
      * used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachParseError(fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>validationError</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.The passed function and listener object must match the ones
      * used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachValidationError(fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>validationSuccess</code> event of this
      * <code>sap.ui.base.ManagedObject</code>.The passed function and listener object must match the ones
      * used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachValidationSuccess(fnFunction: js.Any, oListener: js.Any): ManagedObject = js.native
    
    /**
      * Searches and returns an array of child elements and controls which arereferenced within an
      * aggregation or aggregations of child elements/controls.This can be either done recursive or not.
      * Optionally a condition function can be passed thatreturns true if the object should be added to the
      * array.<br><b>Take care: this operation might be expensive.</b>
      * @param bRecursive true, if all nested children should be returned.
      * @param fnCondition if given, the object is passed as a parameter to the.
      * @returns array of child elements and controls
      */
    def findAggregatedObjects(bRecursive: Boolean, fnCondition: Boolean): js.Array[ManagedObject] = js.native
    
    /**
      * Fires event <code>formatError</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>element</code> of type <code>sap.ui.base.ManagedObject</code>ManagedObject
      * instance whose property should have received the model update.</li><li><code>property</code> of type
      * <code>string</code>Name of the property for which the binding should have been
      * updated.</li><li><code>type</code> of type <code>sap.ui.model.Type</code>Data type used in the
      * binding (if any).</li><li><code>newValue</code> of type <code>any</code>New value (model
      * representation) as propagated from the model.</li><li><code>oldValue</code> of type
      * <code>any</code>Old value (external representation) as previously stored in the
      * ManagedObject.</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireFormatError(mArguments: js.Any): ManagedObject = js.native
    
    /**
      * Fires event <code>modelContextChange</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireModelContextChange(mArguments: js.Any): ManagedObject = js.native
    
    /**
      * Fires event <code>parseError</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>element</code> of type <code>sap.ui.base.ManagedObject</code>ManagedObject
      * instance whose property initiated the model update.</li><li><code>property</code> of type
      * <code>string</code>Name of the property for which the bound model property should have been been
      * updated.</li><li><code>type</code> of type <code>sap.ui.model.Type</code>Data type used in the
      * binding.</li><li><code>newValue</code> of type <code>any</code>New value (external representation)
      * as parsed by the binding.</li><li><code>oldValue</code> of type <code>any</code>Old value (external
      * representation) as previously stored in the ManagedObject.</li><li><code>message</code> of type
      * <code>string</code>Localized message describing the parse error</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireParseError(mArguments: js.Any): ManagedObject = js.native
    
    /**
      * Fires event <code>validationError</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>element</code> of type <code>sap.ui.base.ManagedObject</code>ManagedObject
      * instance whose property initiated the model update.</li><li><code>property</code> of type
      * <code>string</code>Name of the property for which the bound model property should have been been
      * updated.</li><li><code>type</code> of type <code>sap.ui.model.Type</code>Data type used in the
      * binding.</li><li><code>newValue</code> of type <code>any</code>New value (external representation)
      * as parsed and validated by the binding.</li><li><code>oldValue</code> of type <code>any</code>Old
      * value (external representation) as previously stored in the
      * ManagedObject.</li><li><code>message</code> of type <code>string</code>Localized message describing
      * the validation issues</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireValidationError(mArguments: js.Any): ManagedObject = js.native
    
    /**
      * Fires event <code>validationSuccess</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>element</code> of type <code>sap.ui.base.ManagedObject</code>ManagedObject
      * instance whose property initiated the model update.</li><li><code>property</code> of type
      * <code>string</code>Name of the property for which the bound model property has been
      * updated.</li><li><code>type</code> of type <code>sap.ui.model.Type</code>Data type used in the
      * binding.</li><li><code>newValue</code> of type <code>any</code>New value (external representation)
      * as propagated to the model.<b>Note: </b>the model might modify (normalize) the value again and this
      * modificationwill be stored in the ManagedObject. The 'newValue' parameter of this event containsthe
      * value <b>before</b> such a normalization.</li><li><code>oldValue</code> of type <code>any</code>Old
      * value (external representation) as previously stored in the ManagedObject.</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireValidationSuccess(mArguments: js.Any): ManagedObject = js.native
    
    def getAggregation(sAggregationName: String, oDefaultForCreation: js.Array[_]): ManagedObject | js.Array[_] = js.native
    /**
      * Returns the aggregated object(s) for the named aggregation of this ManagedObject.If the aggregation
      * does not contain any objects(s), the given <code>oDefaultForCreation</code>(or <code>null</code>) is
      * set as new value of the aggregation and returned to the caller.<b>Note:</b> the need to specify a
      * default value and the fact that it is stored asnew value of a so far empty aggregation is recognized
      * as a shortcoming of this APIbut can no longer be changed for compatibility reasons.<b>Note:</b> This
      * method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically read the
      * content of an aggregation.Use the concrete method get<i>XYZ</i> for aggregation 'XYZ' instead.
      * @param sAggregationName the name of the aggregation
      * @param oDefaultForCreation the object that is used in case the current aggregation is empty
      * @returns the aggregation array in case of 0..n-aggregations or the managed object or null in case of
      * 0..1-aggregations
      */
    def getAggregation(sAggregationName: String, oDefaultForCreation: ManagedObject): ManagedObject | js.Array[_] = js.native
    
    /**
      * Returns the content of the association wit hthe given name.For associations of cardinality 0..1, a
      * single string with the ID of an associatedobject is returned (if any). For cardinality 0..n, an
      * array with the IDs of theassociated objects is returned.If the association does not contain any
      * objects(s), the given <code>oDefaultForCreation</code>is set as new value of the association and
      * returned to the caller. The only supported values for<code>oDefaultForCreation</code> are
      * <code>null</code> and <code>undefined</code> in the case ofcardinality 0..1 and <code>null</code>,
      * <code>undefined</code> or an empty array (<code>[]</code>)in case of cardinality 0..n. If the
      * argument is omitted, <code>null</code> is used independentlyfrom the cardinality.<b>Note:</b> the
      * need to specify a default value and the fact that it is stored asnew value of a so far empty
      * association is recognized as a shortcoming of this APIbut can no longer be changed for compatibility
      * reasons.<b>Note:</b> This method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically retrieve the
      * content of an association.Use the concrete method get<i>XYZ</i> for association 'XYZ' instead.
      * @param sAssociationName the name of the association
      * @param oDefaultForCreation the object that is used in case the current aggregation is empty (only
      * null or empty array allowed)
      * @returns the ID of the associated managed object or an array of such IDs; may be null if the
      * association has not been populated
      */
    def getAssociation(sAssociationName: String, oDefaultForCreation: js.Any): String | js.Array[String] = js.native
    
    /**
      * Get the binding object for a specific aggregation/property
      * @param sName the name of the property or aggregation
      * @returns the binding for the given name
      */
    def getBinding(sName: String): Binding = js.native
    
    /**
      * Get the binding context of this object for the given model name.If the object does not have a
      * binding context set on itself and has no own Model set,it will use the first binding context defined
      * in its parent hierarchy.Note: to be compatible with future versions of this API, applications must
      * not use the value <code>null</code>,the empty string <code>""</code> or the string literals
      * <code>"null"</code> or <code>"undefined"</code> as model name.Note: A ManagedObject inherits binding
      * contexts from the Core only when it is a descendant of an UIArea.
      * @param sModelName the name of the model or <code>undefined</code>
      * @returns oContext The binding context of this object
      */
    def getBindingContext(sModelName: String): Context = js.native
    
    /**
      * Returns the binding infos for the given property or aggregation. The binding info contains
      * information about path, binding object, format options,sorter, filter etc. for the property or
      * aggregation.
      * @param sName the name of the property or aggregation
      * @returns the binding info object, containing at least a path property                  and,
      * dependant of the binding type, additional properties
      */
    def getBindingInfo(sName: String): js.Any = js.native
    
    /**
      * Get the binding path for a specific aggregation/property
      * @param sName the name of the property or aggregation
      * @returns the binding path for the given name
      */
    def getBindingPath(sName: String): String = js.native
    
    /**
      * Returns the object's Id.
      * @returns the objects's Id.
      */
    def getId(): String = js.native
    
    /**
      * Get the model to be used for data bindings with the given model name.If the object does not have a
      * model set on itself, it will use the firstmodel defined in its parent hierarchy.The name can be
      * omitted to reference the default model or it must be a non-empty string.Note: to be compatible with
      * future versions of this API, applications must not use the value <code>null</code>,the empty string
      * <code>""</code> or the string literals <code>"null"</code> or <code>"undefined"</code> as model
      * name.
      * @param sName name of the model to be retrieved
      * @returns oModel
      */
    def getModel(sName: String): Model = js.native
    def getModel(sName: js.Any): Model = js.native
    
    /**
      * Get the object binding object for a specific model
      * @param sModelName the name of the model
      * @returns the element binding for the given model name
      */
    def getObjectBinding(sModelName: String): Binding = js.native
    
    /**
      * Returns the origin info for the value of the given property.The origin info might contain additional
      * information for translatabletexts. The bookkeeping of this information is not active by default and
      * must beactivated by configuration. Even then, it might not be present for all propertiesand their
      * values depending on where the value came form.
      * @param sPropertyName the name of the property
      * @returns a map of properties describing the origin of this property value or null
      */
    def getOriginInfo(sPropertyName: String): js.Any = js.native
    
    /**
      * Returns the parent managed object or <code>null</code> if this object hasn't been added to a parent
      * yet.
      * @returns The parent managed object or <code>null</code>
      */
    def getParent(): ManagedObject = js.native
    
    /**
      * Returns the value for the property with the given <code>sPropertyName</code>.<b>Note:</b> This
      * method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically retrieve the
      * value of a property.Use the concrete method get<i>XYZ</i> for property 'XYZ' instead.
      * @param sPropertyName the name of the property
      */
    def getProperty(sPropertyName: String): js.Any = js.native
    
    /**
      * Check if any model is set to the ManagedObject or to one of its parents (including UIArea and
      * Core).Note: A ManagedObject inherits models from the Core only when it is a descendant of an UIArea.
      * @returns whether a model reference exists or not
      */
    def hasModel(): Boolean = js.native
    
    /**
      * Searches for the provided ManagedObject in the named aggregation and returns its0-based index if
      * found, or -1 otherwise. Returns -2 if the given named aggregationis of cardinality 0..1 and doesn't
      * reference the given object.<b>Note:</b> This method is a low-level API as described in <a
      * href="#lowlevelapi">the class documentation</a>.Applications or frameworks must not use this method
      * to generically determine the position of an object in an aggregation.Use the concrete method
      * indexOf<i>XYZ</i> for aggregation 'XYZ' instead.
      * @param sAggregationName the name of the aggregation
      * @param oObject the ManagedObject whose index is looked for.
      * @returns the index of the provided managed object in the aggregation.
      */
    def indexOfAggregation(sAggregationName: String, oObject: ManagedObject): Double = js.native
    
    /**
      * Inserts managed object <code>oObject</code> to the aggregation named <code>sAggregationName</code>
      * atposition <code>iIndex</code>.If the given object is not valid with regard to the aggregation (if
      * it is not an instanceof the type specified for that aggregation) or when the method is called for an
      * aggregationof cardinality 0..1, then an Error is thrown (see {@link #validateAggregation}.If the
      * given index is out of range with respect to the current content of the aggregation,it is clipped to
      * that range (0 for iIndex < 0, n for iIndex > n).Please note that this method does not work as
      * expected when an object is addedthat is already part of the aggregation. In order to change the
      * index of an objectinside an aggregation, first remove it, then insert it again.<b>Note:</b> This
      * method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically insert an
      * object into an aggregation.Use the concrete method insert<i>XYZ</i> for aggregation 'XYZ' instead.
      * @param sAggregationName the string identifying the aggregation the managed object
      * <code>oObject</code>           should be inserted into.
      * @param oObject the ManagedObject to add; if empty, nothing is inserted.
      * @param iIndex the <code>0</code>-based index the managed object should be inserted at; for a
      * negative           value <code>iIndex</code>, <code>oObject</code> is inserted at position 0; for a
      * value           greater than the current size of the aggregation, <code>oObject</code> is inserted
      * at           the last position
      * @param bSuppressInvalidate if true, this ManagedObject as well as the added child are not marked as
      * changed
      * @returns Returns <code>this</code> to allow method chaining
      */
    def insertAggregation(sAggregationName: String, oObject: ManagedObject, iIndex: Double): ManagedObject = js.native
    def insertAggregation(sAggregationName: String, oObject: ManagedObject, iIndex: Double, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * This triggers rerendering of itself and its children.<br/> As <code>sap.ui.base.ManagedObject</code>
      * "bubbles up" theinvalidate, changes to child-<code>Elements</code> will also result in rerendering
      * of the whole sub tree.
      */
    def invalidate(): Unit = js.native
    def invalidate(oOrigin: js.Any): Unit = js.native
    
    /**
      * Find out whether a property or aggregation is bound
      * @param sName the name of the property or aggregation
      * @returns whether a binding exists for the given name
      */
    def isBound(sName: String): Boolean = js.native
    
    /**
      * Returns whether rerendering is currently suppressed on this ManagedObject
      */
    def isInvalidateSuppressed(): Unit = js.native
    
    /**
      * This method is used internally and should only be overridden by a tree managed object which utilizes
      * the tree binding. In this case and if the aggregation is a tree node the overridden method should
      * then return true. If true is returned the tree binding will be used instead of the list binding.
      * @param sName the aggregation to bind (e.g. nodes for a tree managed object)
      * @returns whether tree binding should be used or list binding. Default is false. Override method to
      * change this behavior.
      */
    def isTreeBinding(sName: String): Boolean = js.native
    
    /**
      * Generic method which is called, whenever messages for this object exists.
      * @since 1.28
      * @param sName The property name
      * @param aMessages The messages
      */
    def propagateMessages(sName: String, aMessages: js.Array[_]): Unit = js.native
    
    def removeAggregation(sAggregationName: String, vObject: String): ManagedObject = js.native
    def removeAggregation(sAggregationName: String, vObject: String, bSuppressInvalidate: Boolean): ManagedObject = js.native
    /**
      * Removes an object from the aggregation named <code>sAggregationName</code> with cardinality 0..n.The
      * removed object is not destroyed nor is it marked as changed.If the given object is found in the
      * aggreation, it is removed, it's parent relationshipis unset and this ManagedObject is marked as
      * changed. The removed object is returned asresult of this method. If the object could not be found,
      * <code>undefined</code> is returned.This method must only be called for aggregations of cardinality
      * 0..n. The only way to remove objectsfrom a 0..1 aggregation is to set a <code>null</code> value for
      * them.<b>Note:</b> This method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically remove an
      * object from an aggregation.Use the concrete method remove<i>XYZ</i> for aggregation 'XYZ' instead.
      * @param sAggregationName the string identifying the aggregation that the given object should be
      * removed from
      * @param vObject the position or ID of the ManagedObject that should be removed or that ManagedObject
      * itself;           if <code>vObject</code> is invalid, a negative value or a value greater or equal
      * than the current size           of the aggregation, nothing is removed.
      * @param bSuppressInvalidate if true, this ManagedObject is not marked as changed
      * @returns the removed object or null
      */
    def removeAggregation(sAggregationName: String, vObject: Double): ManagedObject = js.native
    def removeAggregation(sAggregationName: String, vObject: Double, bSuppressInvalidate: Boolean): ManagedObject = js.native
    def removeAggregation(sAggregationName: String, vObject: ManagedObject): ManagedObject = js.native
    def removeAggregation(sAggregationName: String, vObject: ManagedObject, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Removes all objects from the 0..n-aggregation named <code>sAggregationName</code>.The removed
      * objects are not destroyed nor are they marked as changed.Additionally, it clears the parent
      * relationship of all removed objects, marks thisManagedObject as changed and returns an array with
      * the removed objects.If the aggregation did not contain any objects, an empty array is returned and
      * thisManagedObject is not marked as changed.<b>Note:</b> This method is a low-level API as described
      * in <a href="#lowlevelapi">the class documentation</a>.Applications or frameworks must not use this
      * method to generically remove all objects from an aggregation.Use the concrete method
      * removeAll<i>XYZ</i> for aggregation 'XYZ' instead.
      * @param sAggregationName the name of the aggregation
      * @param bSuppressInvalidate if true, this ManagedObject is not marked as changed
      * @returns an array of the removed elements (might be empty)
      */
    def removeAllAggregation(sAggregationName: String): js.Array[_] = js.native
    def removeAllAggregation(sAggregationName: String, bSuppressInvalidate: Boolean): js.Array[_] = js.native
    
    /**
      * Removes all the objects in the 0..n-association named <code>sAssociationName</code> and returns an
      * arraywith their IDs. This ManagedObject is marked as changed, if the association contained any
      * objects.<b>Note:</b> This method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically remove all
      * object from an association.Use the concrete method removeAll<i>XYZ</i> for association 'XYZ'
      * instead.
      * @param sAssociationName the name of the association
      * @param bSuppressInvalidate if true, this ManagedObject is not marked as changed
      * @returns an array with the IDs of the removed objects (might be empty)
      */
    def removeAllAssociation(sAssociationName: String): js.Array[_] = js.native
    def removeAllAssociation(sAssociationName: String, bSuppressInvalidate: Boolean): js.Array[_] = js.native
    
    def removeAssociation(sAssociationName: String, vObject: String): Unit = js.native
    def removeAssociation(sAssociationName: String, vObject: String, bSuppressInvalidate: Boolean): Unit = js.native
    /**
      * Removes a ManagedObject from the association named <code>sAssociationName</code>.If an object is
      * removed, the Id of that object is returned and this ManagedObject ismarked as changed. Otherwise
      * <code>undefined</code> is returned.If the same object was added multiple times to the same
      * association, only a singleoccurence of it will be removed by this method. If the object is not found
      * or if theparameter can't be interpreted neither as a ManagedObject (or id) nor as an index inthe
      * assocation, nothing will be removed. The same is true if an index is given and ifthat index is out
      * of range for the association.<b>Note:</b> This method is a low-level API as described in <a
      * href="#lowlevelapi">the class documentation</a>.Applications or frameworks must not use this method
      * to generically remove an object from an association.Use the concrete method remove<i>XYZ</i> for
      * association 'XYZ' instead.
      * @param sAssociationName the string identifying the association the ManagedObject should be removed
      * from.
      * @param vObject the position or ID of the ManagedObject to remove or the ManagedObject itself; if
      * <code>vObject</code> is invalid input,           a negative value or a value greater or equal than
      * the current size of the association, nothing is removed
      * @param bSuppressInvalidate if true, the managed object is not marked as changed
      */
    def removeAssociation(sAssociationName: String, vObject: Double): Unit = js.native
    def removeAssociation(sAssociationName: String, vObject: Double, bSuppressInvalidate: Boolean): Unit = js.native
    def removeAssociation(sAssociationName: String, vObject: ManagedObject): Unit = js.native
    def removeAssociation(sAssociationName: String, vObject: ManagedObject, bSuppressInvalidate: Boolean): Unit = js.native
    
    /**
      * Sets a new object in the named 0..1 aggregation of this ManagedObject andmarks this ManagedObject as
      * changed.If the given object is not valid with regard to the aggregation (if it is not an instanceof
      * the type specified for that aggregation) or when the method is called for an aggregationof
      * cardinality 0..n, then an Error is thrown (see {@link #validateAggregation}.If the new object is the
      * same as the currently aggregated object, then the internal stateis not modified and this
      * ManagedObject is not marked as changed.If the given object is different, the parent of a previously
      * aggregated object is cleared(it must have been this ManagedObject before), the parent of the given
      * object is set to thisManagedObject and {@link #invalidate} is called for this object.Note that this
      * method does neither return nor destroy the previously aggregated object.This behavior is inherited
      * by named set methods (see below) in subclasses.To avoid memory leaks, applications therefore should
      * first get the aggregated object,keep a reference to it or destroy it, depending on their needs, and
      * only then set a newobject.Note that ManagedObject only implements a single level of change tracking:
      * if a firstcall to setAggregation recognizes a change, 'invalidate' is called. If another call
      * tosetAggregation reverts that change, invalidate() will be called again, the new statusis not
      * recognized as being 'clean' again.<b>Note:</b> This method is a low-level API as described in <a
      * href="#lowlevelapi">the class documentation</a>.Applications or frameworks must not use this method
      * to generically set an object in an aggregation.Use the concrete method set<i>XYZ</i> for aggregation
      * 'XYZ' or the generic {@link #applySettings} instead.
      * @param sAggregationName name of an 0..1 aggregation
      * @param oObject the managed object that is set as aggregated object
      * @param bSuppressInvalidate if true, this ManagedObject is not marked as changed
      * @returns Returns <code>this</code> to allow method chaining
      */
    def setAggregation(sAggregationName: String, oObject: js.Any): ManagedObject = js.native
    def setAggregation(sAggregationName: String, oObject: js.Any, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Sets the associatied object for the given managed association of cardinality '0..1' andmarks this
      * ManagedObject as changed.The associated object can either be given by itself or by its id. If
      * <code>null</code> or<code>undefined</code> is given, the association is cleared.<b>Note:</b> This
      * method is a low-level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically set an object
      * in an association.Use the concrete method set<i>XYZ</i> for association 'XYZ' or the generic {@link
      * #applySettings} instead.
      * @param sAssociationName name of the association
      * @param sId the ID of the managed object that is set as an association, or the managed object itself
      * or null
      * @param bSuppressInvalidate if true, the managed objects invalidate method is not called
      * @returns Returns <code>this</code> to allow method chaining
      */
    def setAssociation(sAssociationName: String, sId: String): ManagedObject = js.native
    def setAssociation(sAssociationName: String, sId: String, bSuppressInvalidate: Boolean): ManagedObject = js.native
    def setAssociation(sAssociationName: String, sId: ManagedObject): ManagedObject = js.native
    def setAssociation(sAssociationName: String, sId: ManagedObject, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Set the binding context for this ManagedObject for the model with the given name.Note: to be
      * compatible with future versions of this API, applications must not use the value
      * <code>null</code>,the empty string <code>""</code> or the string literals <code>"null"</code> or
      * <code>"undefined"</code> as model name.Note: A ManagedObject inherits binding contexts from the Core
      * only when it is a descendant of an UIArea.
      * @param oContext the new binding context for this object
      * @param sModelName the name of the model to set the context for or <code>undefined</code>
      * @returns reference to the instance itself
      */
    def setBindingContext(oContext: js.Any): ManagedObject = js.native
    def setBindingContext(oContext: js.Any, sModelName: String): ManagedObject = js.native
    
    /**
      * Sets or unsets a model for the given model name for this ManagedObject.The <code>sName</code> must
      * either be <code>undefined</code> (or omitted) or a non-empty string.When the name is omitted, the
      * default model is set/unset.When <code>oModel</code> is <code>null</code> or <code>undefined</code>,
      * a previously set modelwith that name is removed from this ManagedObject. If an ancestor (parent,
      * UIArea or Core) has a modelwith that name, this ManagedObject will immediately inherit that model
      * from its ancestor.All local bindings that depend on the given model name, are updated (created if
      * the model referencesbecame complete now; updated, if any model reference has changed; removed if the
      * model referencesbecame incomplete now).Any change (new model, removed model, inherited model) is
      * also applied to all aggregated descendantsas long as a descendant doesn't have its own model set for
      * the given name.Note: to be compatible with future versions of this API, applications must not use
      * the value <code>null</code>,the empty string <code>""</code> or the string literals
      * <code>"null"</code> or <code>"undefined"</code> as model name.Note: By design, it is not possible to
      * hide an inherited model by setting a <code>null</code> or<code>undefined</code> model. Applications
      * can set an empty model to achieve the same.Note: A ManagedObject inherits models from the Core only
      * when it is a descendant of an UIArea.
      * @param oModel the model to be set or <code>null</code> or <code>undefined</code>
      * @param sName the name of the model or <code>undefined</code>
      * @returns <code>this</code> to allow method chaining
      */
    def setModel(oModel: Model): ManagedObject = js.native
    def setModel(oModel: Model, sName: String): ManagedObject = js.native
    
    /**
      * Sets the given value for the given property after validating and normalizing it,marks this object as
      * changed.If the value is not valid with regard to the declared data type of the property,an Error is
      * thrown. In case <code>null</code> or <code>undefined</code> is passed,the default value for this
      * property is used (see {@link #validateProperty}. If the validated and normalized<code>oValue</code>
      * equals the current value of the property, the internal state ofthis object is not changed. If the
      * value changes, it is stored internally andthe {@link #invalidate} method is called on this object.
      * In the case of TwoWaydatabinding, the bound model is informed about the property change.Note that
      * ManagedObject only implements a single level of change tracking: if a firstcall to setProperty
      * recognizes a change, 'invalidate' is called. If another call tosetProperty reverts that change,
      * invalidate() will be called again, the new statusis not recognized as being 'clean'
      * again.<b>Note:</b> This method is a low level API as described in <a href="#lowlevelapi">the class
      * documentation</a>.Applications or frameworks must not use this method to generically set a
      * property.Use the concrete method set<i>XYZ</i> for property 'XYZ' or the generic {@link
      * #applySettings} instead.
      * @param sPropertyName name of the property to set
      * @param oValue value to set the property to
      * @param bSuppressInvalidate if true, the managed object is not marked as changed
      * @returns Returns <code>this</code> to allow method chaining
      */
    def setProperty(sPropertyName: String, oValue: js.Any): ManagedObject = js.native
    def setProperty(sPropertyName: String, oValue: js.Any, bSuppressInvalidate: Boolean): ManagedObject = js.native
    
    /**
      * Unbind the aggregation from the model
      * @param sName the name of the aggregation
      * @param bSuppressReset whether the reset to empty aggregation when unbinding should be suppressed
      * @returns reference to the instance itself
      */
    def unbindAggregation(sName: String, bSuppressReset: Boolean): ManagedObject = js.native
    
    /**
      * Removes the defined binding context of this object, all bindings will now resolverelative to the
      * parent context again.
      * @param sModelName name of the model to remove the context for.
      * @returns reference to the instance itself
      */
    def unbindContext(sModelName: String): ManagedObject = js.native
    
    /**
      * Removes the defined binding context of this object, all bindings will now resolverelative to the
      * parent context again.
      * @param sModelName name of the model to remove the context for.
      * @returns reference to the instance itself
      */
    def unbindObject(sModelName: String): ManagedObject = js.native
    
    /**
      * Unbind the property from the model
      * @param sName the name of the property
      * @param bSuppressReset whether the reset to the default value when unbinding should be suppressed
      * @returns reference to the instance itself
      */
    def unbindProperty(sName: String, bSuppressReset: Boolean): ManagedObject = js.native
    
    def validateAggregation(sAggregationName: String, oObject: js.Any, bMultiple: Boolean): ManagedObject | js.Any = js.native
    /**
      * Checks whether the given value is of the proper type for the given aggregation name.This method is
      * already called by {@link #setAggregation}, {@link #addAggregation} and {@link #insertAggregation}.In
      * many cases, subclasses of ManagedObject don't need to call it again in their mutator methods.
      * @param sAggregationName the name of the aggregation
      * @param oObject the aggregated object or a primitive value
      * @param bMultiple whether the caller assumes the aggregation to have cardinality 0..n
      * @returns the passed object
      */
    def validateAggregation(sAggregationName: String, oObject: ManagedObject, bMultiple: Boolean): ManagedObject | js.Any = js.native
    
    /**
      * Checks whether the given value is of the proper type for the given property name.In case
      * <code>null</code> or <code>undefined</code> is passed, the default value forthis property is used as
      * value. If no default value is defined for the property, thedefault value of the type of the property
      * is used.If the property has a data type that is an instance of sap.ui.base.DataType and ifa
      * <code>normalize</code> function is defined for that type, that function will becalled with the
      * resulting value as only argument. The result of the function call isthen used instead of the raw
      * value.This method is called by {@link #setProperty}. In many cases, subclasses ofManagedObject don't
      * need to call it themselves.
      * @param sPropertyName the name of the property
      * @param oValue the value
      * @returns the normalized value for the passed value or for the default value if null or undefined was
      * passed
      */
    def validateProperty(sPropertyName: String, oValue: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Metadata extends StObject {
    
    /**
      * Returns an array with the names of all public methods declared by the described classand its
      * ancestors.
      * @returns array with names of all public methods provided by the described class and its ancestors
      */
    def getAllPublicMethods(): js.Array[String] = js.native
    
    /**
      * Returns the fully qualified name of the described class
      * @returns name of the described class
      */
    def getName(): String = js.native
    
    /**
      * Returns the metadata object of the base class of the described classor null if the class has no
      * (documented) base class.
      * @returns metadata of the base class
      */
    def getParent(): Metadata = js.native
    
    /**
      * Returns an array with the names of the public methods declared by the described class.
      * @returns array with names of public methods declared by the described class
      */
    def getPublicMethods(): js.Array[String] = js.native
    
    /**
      * Returns whether the described class is abstract
      * @returns whether the class is abstract
      */
    def isAbstract(): Boolean = js.native
    
    /**
      * Whether the described class is deprecated and should not be used any more
      * @since 1.26.4
      * @returns whether the class is considered deprecated
      */
    def isDeprecated(): Boolean = js.native
    
    /**
      * Returns whether the described class is final
      * @returns whether the class is final
      */
    def isFinal(): Boolean = js.native
    
    /**
      * Checks whether the described class or one of its ancestor classes implements the given interface.
      * @param sInterface name of the interface to test for (in dot notation)
      * @returns whether this class implements the interface
      */
    def isInstanceOf(sInterface: String): Boolean = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(
      getAllPublicMethods: () => js.Array[String],
      getName: () => String,
      getParent: () => Metadata,
      getPublicMethods: () => js.Array[String],
      isAbstract: () => Boolean,
      isDeprecated: () => Boolean,
      isFinal: () => Boolean,
      isInstanceOf: String => Boolean
    ): Metadata = {
      val __obj = js.Dynamic.literal(getAllPublicMethods = js.Any.fromFunction0(getAllPublicMethods), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPublicMethods = js.Any.fromFunction0(getPublicMethods), isAbstract = js.Any.fromFunction0(isAbstract), isDeprecated = js.Any.fromFunction0(isDeprecated), isFinal = js.Any.fromFunction0(isFinal), isInstanceOf = js.Any.fromFunction1(isInstanceOf))
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllPublicMethods(value: () => js.Array[String]): Self = StObject.set(x, "getAllPublicMethods", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Metadata): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPublicMethods(value: () => js.Array[String]): Self = StObject.set(x, "getPublicMethods", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAbstract(value: () => Boolean): Self = StObject.set(x, "isAbstract", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDeprecated(value: () => Boolean): Self = StObject.set(x, "isDeprecated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFinal(value: () => Boolean): Self = StObject.set(x, "isFinal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsInstanceOf(value: String => Boolean): Self = StObject.set(x, "isInstanceOf", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Object extends StObject {
    
    /**
      * Creates metadata for a given class and attaches it to the constructor and prototype of that
      * class.After creation, metadata can be retrieved with getMetadata().The static info can at least
      * contain the following entries:<ul><li>baseType: {string} fully qualified name of a base class or
      * empty<li>publicMethods: {string} an array of method names that will be visible in the interface
      * proxy returned by {@link #getInterface}</ul>
      * @param sClassName name of an (already declared) constructor function
      * @param oStaticInfo static info used to create the metadata object
      * @param FNMetaImpl constructor function for the metadata object. If not given, it defaults to
      * sap.ui.base.Metadata.
      * @returns the created metadata object
      */
    def defineClass(sClassName: String, oStaticInfo: js.Any): Metadata = js.native
    def defineClass(sClassName: String, oStaticInfo: js.Any, FNMetaImpl: js.Any): Metadata = js.native
    
    /**
      * Destructor method for objects
      */
    def destroy(bSuppressInvalidate: Boolean): Unit = js.native
    
    /**
      * Returns the public interface of the object.
      * @returns the public interface of the object
      */
    def getInterface(): Interface = js.native
    
    /**
      * Returns the metadata for the class that this object belongs to.This method is only defined when
      * metadata has been declared by using {@link sap.ui.base.Object.defineClass}or {@link
      * sap.ui.base.Object.extend}.
      */
    def getMetadata(): Unit = js.native
  }
  
  @js.native
  trait ObjectPool extends Object {
    
    /**
      * Borrows a free object from the pool. Any arguments to this methodare forwarded to the init method of
      * the borrowed object.
      * @param any optional initialization parameters for the borrowed object
      * @returns the borrowed object of the same type that has been specified for this pool
      */
    def borrowObject(any: js.Any): js.Any = js.native
    
    /**
      * Returns an object to the pool. The object must have been borrowed from thispool beforehand. The
      * reset method is called on the object before it is addedto the set of free objects.
      * @param oObject the object to return to the pool
      */
    def returnObject(oObject: js.Any): Unit = js.native
  }
  
  /**
    * Contract for objects that can be pooled by ObjectPool
    * @resource sap/ui/base/ObjectPool.js
    */
  @js.native
  trait Poolable extends StObject {
    
    /**
      * Called by the object pool when this instance will be actived for a caller.The same method will be
      * called after a new instance has been created by an otherwiseexhausted pool.If the caller provided
      * any arguments to {@link sap.ui.base.ObjectPool#borrowObject}all arguments will be propagated to this
      * method.
      */
    def init(): Unit = js.native
    
    /**
      * Called by the object pool when an instance is returned to the pool.While no specific implementation
      * is required, poolable objects in generalshould clean all caller specific state (set to null) in this
      * method toavoid memory leaks and to enforce garbage collection of the caller state.
      */
    def reset(): Unit = js.native
  }
  object Poolable {
    
    @scala.inline
    def apply(init: () => Unit, reset: () => Unit): Poolable = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Poolable]
    }
    
    @scala.inline
    implicit class PoolableMutableBuilder[Self <: Poolable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
