package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.XBindableValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validation {
  
  /**
    * specifies a control model which supports both binding to an external value supplier, and to an external validator.
    *
    * There are two methods how the value which is represented by a control model can interact with other components (well, except the trivial ones
    * accessible by using {@link com.sun.star.beans.XPropertySet} ): binding the value to an external component via {@link
    * com.sun.star.form.binding.XBindableValue}validating the current value by an external component, via {@link XValidatable} and {@link XValidator}
    *
    * The {@link ValidatableBindableControlModel} services describes the interaction of these concepts for control models which support both of them.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsSlinky.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait ValidatableBindableControlModel
    extends ValidatableControlModel
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies the model of a form control which supports live validation of its input.
    *
    * Validatable control models support setting a validator with dynamic validity constraints, and broadcasting changes in their value as well as the
    * validity of their value.
    */
  @js.native
  trait ValidatableControlModel
    extends FormControlModel
       with XValidatableFormComponent
       with XValidityConstraintListener {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** is the listener interface to be notified of changes of a {@link XValidatableFormComponent} */
  @js.native
  trait XFormComponentValidityListener extends XEventListener {
    
    /**
      * called when the validity and/or the value of the form component at which the listener is registered changed.
      * @param Source The member {@link com.sun.star.lang.EventObject.Source} represents the {@link XValidatableFormComponent} whose validity, value, or text ch
      */
    def componentValidityChanged(Source: EventObject): Unit = js.native
  }
  object XFormComponentValidityListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      componentValidityChanged: EventObject => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XFormComponentValidityListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), componentValidityChanged = js.Any.fromFunction1(componentValidityChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XFormComponentValidityListener]
    }
    
    @scala.inline
    implicit class XFormComponentValidityListenerMutableBuilder[Self <: XFormComponentValidityListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentValidityChanged(value: EventObject => Unit): Self = StObject.set(x, "componentValidityChanged", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * specifies support for validating a component
    * @see XValidator
    */
  @js.native
  trait XValidatable extends XInterface {
    
    /** retrieves the external instance which is currently used to validate the component */
    var Validator: XValidator = js.native
    
    /** retrieves the external instance which is currently used to validate the component */
    def getValidator(): XValidator = js.native
    
    /**
      * sets an external instance which is able to validate the component
      *
      * Any previously active validator will be revoked - there can be only one!
      * @param Validator the new validator which is to be used by the component. May be `NULL` , in this case only the current validator is revoked.
      * @throws com::sun::star::util::VetoException if changing the validator is not allowed in the current component state
      */
    def setValidator(Validator: XValidator): Unit = js.native
  }
  object XValidatable {
    
    @scala.inline
    def apply(
      Validator: XValidator,
      acquire: () => Unit,
      getValidator: () => XValidator,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setValidator: XValidator => Unit
    ): XValidatable = {
      val __obj = js.Dynamic.literal(Validator = Validator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getValidator = js.Any.fromFunction0(getValidator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValidator = js.Any.fromFunction1(setValidator))
      __obj.asInstanceOf[XValidatable]
    }
    
    @scala.inline
    implicit class XValidatableMutableBuilder[Self <: XValidatable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValidator(value: () => XValidator): Self = StObject.set(x, "getValidator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValidator(value: XValidator => Unit): Self = StObject.set(x, "setValidator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidator(value: XValidator): Self = StObject.set(x, "Validator", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is a convenience interface for accessing several aspects of a form component which supports validation.
    *
    * A validatable form component has two aspects which other parties might be interested in: The pure validity flag: Whatever the user enters in the
    * component, this is either valid (relative to the active validator), or invalid.The current value: Even if the validity flag does not change with the
    * user input (e.g. because the user replaces one invalid value with another invalid value), observers might be interested in the current value, for
    * example to include it in a feedback message to the user.
    *
    * An {@link XValidatableFormComponent} allows to easily access both of these aspects.
    *
    * Note that all of the information provided at this interface can also obtained by other means, but much more inconveniently.
    * @see XValidatable
    * @see XValidator
    */
  @js.native
  trait XValidatableFormComponent extends XValidatable {
    
    /**
      * retrieves the current value of the component.
      *
      * The type of the current value, as well as it's semantics, depend on the service implementing this interface.
      *
      * Again, this is a convenience method. For example, for a {@link com.sun.star.form.component.FormattedField} , calling this method is equivalent to
      * retrieving the {@link com.sun.star.awt.UnoControlFormattedFieldModel.EffectiveValue} .
      *
      * If no validator has been set ( {@link XValidatable.setValidator()} ), the value returned here is defined by the service implementing this interface.
      */
    val CurrentValue: js.Any = js.native
    
    /**
      * registers the given listener.
      *
      * XFormComponentValidityListeners are called whenever **any** of the aspects of the validatable form component (the validity flag, or the value)
      * changed.
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def addFormComponentValidityListener(Listener: XFormComponentValidityListener): Unit = js.native
    
    /**
      * retrieves the current value of the component.
      *
      * The type of the current value, as well as it's semantics, depend on the service implementing this interface.
      *
      * Again, this is a convenience method. For example, for a {@link com.sun.star.form.component.FormattedField} , calling this method is equivalent to
      * retrieving the {@link com.sun.star.awt.UnoControlFormattedFieldModel.EffectiveValue} .
      *
      * If no validator has been set ( {@link XValidatable.setValidator()} ), the value returned here is defined by the service implementing this interface.
      */
    def getCurrentValue(): js.Any = js.native
    
    /**
      * determines whether the current value of the component passed the validity test at the validator.
      *
      * Calling this is equal to calling {@link XValidator.isValid()} with the current value (see {@link getCurrentValue()} ) of the component, where the
      * validator is obtained via {@link XValidatable.getValidator()} .
      *
      * If no validator has been set ( {@link XValidatable.setValidator()} ), this method returns true.
      */
    def isValid(): Boolean = js.native
    
    /**
      * registers the given listener.
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def removeFormComponentValidityListener(Listener: XFormComponentValidityListener): Unit = js.native
  }
  object XValidatableFormComponent {
    
    @scala.inline
    def apply(
      CurrentValue: js.Any,
      Validator: XValidator,
      acquire: () => Unit,
      addFormComponentValidityListener: XFormComponentValidityListener => Unit,
      getCurrentValue: () => js.Any,
      getValidator: () => XValidator,
      isValid: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeFormComponentValidityListener: XFormComponentValidityListener => Unit,
      setValidator: XValidator => Unit
    ): XValidatableFormComponent = {
      val __obj = js.Dynamic.literal(CurrentValue = CurrentValue.asInstanceOf[js.Any], Validator = Validator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFormComponentValidityListener = js.Any.fromFunction1(addFormComponentValidityListener), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getValidator = js.Any.fromFunction0(getValidator), isValid = js.Any.fromFunction0(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFormComponentValidityListener = js.Any.fromFunction1(removeFormComponentValidityListener), setValidator = js.Any.fromFunction1(setValidator))
      __obj.asInstanceOf[XValidatableFormComponent]
    }
    
    @scala.inline
    implicit class XValidatableFormComponentMutableBuilder[Self <: XValidatableFormComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFormComponentValidityListener(value: XFormComponentValidityListener => Unit): Self = StObject.set(x, "addFormComponentValidityListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurrentValue(value: js.Any): Self = StObject.set(x, "CurrentValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCurrentValue(value: () => js.Any): Self = StObject.set(x, "getCurrentValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveFormComponentValidityListener(value: XFormComponentValidityListener => Unit): Self = StObject.set(x, "removeFormComponentValidityListener", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * specifies a component able to validate (the content of) other components
    *
    * Validators support simple validity checks and retrieving justifications for invalidity.
    *
    * Validators may additionally support dynamic validity constraints. In such a case, the validity of a given value may change, without the value changing
    * itself. ;  To be notified about this, interested components should register as {@link XValidityConstraintListener} .
    * @see XValidatable
    */
  @js.native
  trait XValidator extends XInterface {
    
    /**
      * registers the given validity listener.
      *
      * Usually, an {@link XValidatable} instance will also add itself as validity listener, as soon as the validator is introduced to it.
      *
      * Implementations which do not support dynamic validity constraints should simply ignore this call.
      * @see XValidityConstraintListener
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def addValidityConstraintListener(Listener: XValidityConstraintListener): Unit = js.native
    
    /**
      * retrieves a justification for the invalidity of the given value
      * @param Value the value which has been recognized as being invalid
      * @returns a human-readable string, which explains why the given value is considered invalid.
      */
    def explainInvalid(Value: js.Any): String = js.native
    
    /**
      * determines whether the given value is valid
      * @param Value the value to check for validity
      * @returns `TRUE` if and only if the value is considered valid.
      */
    def isValid(Value: js.Any): Boolean = js.native
    
    /**
      * revokes the given validity listener
      * @see XValidityConstraintListener
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def removeValidityConstraintListener(Listener: XValidityConstraintListener): Unit = js.native
  }
  object XValidator {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      addValidityConstraintListener: XValidityConstraintListener => Unit,
      explainInvalid: js.Any => String,
      isValid: js.Any => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeValidityConstraintListener: XValidityConstraintListener => Unit
    ): XValidator = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addValidityConstraintListener = js.Any.fromFunction1(addValidityConstraintListener), explainInvalid = js.Any.fromFunction1(explainInvalid), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeValidityConstraintListener = js.Any.fromFunction1(removeValidityConstraintListener))
      __obj.asInstanceOf[XValidator]
    }
    
    @scala.inline
    implicit class XValidatorMutableBuilder[Self <: XValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddValidityConstraintListener(value: XValidityConstraintListener => Unit): Self = StObject.set(x, "addValidityConstraintListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExplainInvalid(value: js.Any => String): Self = StObject.set(x, "explainInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValid(value: js.Any => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveValidityConstraintListener(value: XValidityConstraintListener => Unit): Self = StObject.set(x, "removeValidityConstraintListener", js.Any.fromFunction1(value))
    }
  }
  
  /** specifies an interface for listening for changes in the validity constraints represented by an {@link XValidator} . */
  @js.native
  trait XValidityConstraintListener extends XEventListener {
    
    /**
      * called when the validity constraint represented by an {@link XValidator} , at which the listener is registered, changed.
      * @param Source The event source. The member {@link com.sun.star.lang.EventObject.Source} represents the validator component whose validity constraint changed.
      */
    def validityConstraintChanged(Source: EventObject): Unit = js.native
  }
  object XValidityConstraintListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      validityConstraintChanged: EventObject => Unit
    ): XValidityConstraintListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), validityConstraintChanged = js.Any.fromFunction1(validityConstraintChanged))
      __obj.asInstanceOf[XValidityConstraintListener]
    }
    
    @scala.inline
    implicit class XValidityConstraintListenerMutableBuilder[Self <: XValidityConstraintListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidityConstraintChanged(value: EventObject => Unit): Self = StObject.set(x, "validityConstraintChanged", js.Any.fromFunction1(value))
    }
  }
}
