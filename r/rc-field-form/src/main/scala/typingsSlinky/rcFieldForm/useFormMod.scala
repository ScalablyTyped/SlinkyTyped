package typingsSlinky.rcFieldForm

import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.InternalFormInstance
import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.rcFieldFormStrings.updateValue
import typingsSlinky.rcFieldForm.rcFieldFormStrings.validateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormMod {
  
  @JSImport("rc-field-form/es/useForm", JSImport.Default)
  @js.native
  def default[Values](): js.Array[FormInstance[Values]] = js.native
  @JSImport("rc-field-form/es/useForm", JSImport.Default)
  @js.native
  def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @JSImport("rc-field-form/es/useForm", "FormStore")
  @js.native
  class FormStore protected () extends StObject {
    def this(forceRootUpdate: js.Function0[Unit]) = this()
    
    var callbacks: js.Any = js.native
    
    var dispatch: js.Any = js.native
    
    var fieldEntities: js.Any = js.native
    
    var forceRootUpdate: js.Any = js.native
    
    var formHooked: js.Any = js.native
    
    var getDependencyChildrenFields: js.Any = js.native
    
    /**
      * Get registered field entities.
      * @param pure Only return field which has a `name`. Default: false
      */
    var getFieldEntities: js.Any = js.native
    
    var getFieldEntitiesForNamePathList: js.Any = js.native
    
    var getFieldError: js.Any = js.native
    
    var getFieldValue: js.Any = js.native
    
    var getFields: js.Any = js.native
    
    var getFieldsError: js.Any = js.native
    
    var getFieldsMap: js.Any = js.native
    
    var getFieldsValue: js.Any = js.native
    
    def getForm(): InternalFormInstance = js.native
    
    var getInitialValue: js.Any = js.native
    
    var getInternalHooks: js.Any = js.native
    
    /**
      * This only trigger when a field is on constructor to avoid we get initialValue too late
      */
    var initEntityValue: js.Any = js.native
    
    var initialValues: js.Any = js.native
    
    var isFieldTouched: js.Any = js.native
    
    var isFieldValidating: js.Any = js.native
    
    var isFieldsTouched: js.Any = js.native
    
    var isFieldsValidating: js.Any = js.native
    
    var lastValidatePromise: js.Any = js.native
    
    var notifyObservers: js.Any = js.native
    
    var preserve: js.Any = js.native
    
    var registerField: js.Any = js.native
    
    var resetFields: js.Any = js.native
    
    /**
      * Reset Field with field `initialValue` prop.
      * Can pass `entities` or `namePathList` or just nothing.
      */
    var resetWithFieldInitialValue: js.Any = js.native
    
    var setCallbacks: js.Any = js.native
    
    var setFields: js.Any = js.native
    
    var setFieldsValue: js.Any = js.native
    
    /**
      * First time `setInitialValues` should update store with initial value
      */
    var setInitialValues: js.Any = js.native
    
    var setPreserve: js.Any = js.native
    
    var setValidateMessages: js.Any = js.native
    
    var store: js.Any = js.native
    
    var submit: js.Any = js.native
    
    var subscribable: js.Any = js.native
    
    var timeoutId: js.Any = js.native
    
    var triggerOnFieldsChange: js.Any = js.native
    
    var updateValue: js.Any = js.native
    
    var useSubscribe: js.Any = js.native
    
    var validateFields: js.Any = js.native
    
    var validateMessages: js.Any = js.native
    
    var warningUnhooked: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcFieldForm.useFormMod.UpdateAction
    - typingsSlinky.rcFieldForm.useFormMod.ValidateAction
  */
  trait ReducerAction extends StObject
  object ReducerAction {
    
    @scala.inline
    def UpdateAction(namePath: InternalNamePath, `type`: updateValue, value: StoreValue): typingsSlinky.rcFieldForm.useFormMod.UpdateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.rcFieldForm.useFormMod.UpdateAction]
    }
    
    @scala.inline
    def ValidateAction(namePath: InternalNamePath, triggerName: String, `type`: validateField): typingsSlinky.rcFieldForm.useFormMod.ValidateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.rcFieldForm.useFormMod.ValidateAction]
    }
  }
  
  @js.native
  trait UpdateAction extends ReducerAction {
    
    var namePath: InternalNamePath = js.native
    
    var `type`: updateValue = js.native
    
    var value: StoreValue = js.native
  }
  object UpdateAction {
    
    @scala.inline
    def apply(namePath: InternalNamePath, `type`: updateValue, value: StoreValue): UpdateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateAction]
    }
    
    @scala.inline
    implicit class UpdateActionMutableBuilder[Self <: UpdateAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamePath(value: InternalNamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value :_*))
      
      @scala.inline
      def setType(value: updateValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidateAction extends ReducerAction {
    
    var namePath: InternalNamePath = js.native
    
    var triggerName: String = js.native
    
    var `type`: validateField = js.native
  }
  object ValidateAction {
    
    @scala.inline
    def apply(namePath: InternalNamePath, triggerName: String, `type`: validateField): ValidateAction = {
      val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateAction]
    }
    
    @scala.inline
    implicit class ValidateActionMutableBuilder[Self <: ValidateAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamePath(value: InternalNamePath): Self = StObject.set(x, "namePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePathVarargs(value: (String | Double)*): Self = StObject.set(x, "namePath", js.Array(value :_*))
      
      @scala.inline
      def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: validateField): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
