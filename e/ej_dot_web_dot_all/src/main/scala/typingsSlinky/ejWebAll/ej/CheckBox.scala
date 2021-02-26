package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBox extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Disable the CheckBox to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the CheckBox
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To Check the status of CheckBox
    * @returns {boolean}
    */
  def isChecked(): Boolean = js.native
  
  @JSName("model")
  var model_CheckBox: Model = js.native
}
object CheckBox {
  
  @js.native
  trait BeforeChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event model values
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the status whether the element is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** returns the CheckBox model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeChangeEventArgs {
    
    @scala.inline
    def apply(): BeforeChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeChangeEventArgs]
    }
    
    @scala.inline
    implicit class BeforeChangeEventArgsMutableBuilder[Self <: BeforeChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the state of the checkbox
      */
    var checkState: js.UndefOr[String] = js.native
    
    /** returns the event arguments
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the status whether the element is checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** returns the CheckBox model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCheckState(value: String): Self = StObject.set(x, "checkState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStateUndefined: Self = StObject.set(x, "checkState", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the CheckBox model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the CheckBox model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires before the CheckBox is going to changed its state successfully
      */
    var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.native
    
    /** Fires when the CheckBox state is changed successfully
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
    
    /** Specifies the State of CheckBox.See below to get available CheckState
      * @Default {null}
      */
    var checkState: js.UndefOr[CheckState | String] = js.native
    
    /** Specifies whether CheckBox has to be in checked or not. We can also specify array of string as value for this property. If any of the value in the specified array matches the
      * value of the textbox, then it will be considered as checked. It will be useful in MVVM binding, specify array type to identify the values of the checked CheckBoxes.
      * @Default {false}
      */
    var checked: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /** Fires when the CheckBox state is created successfully
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Sets the root CSS class for CheckBox theme, which is used customize.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires when the CheckBox state is destroyed successfully
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Specifies the persist property for CheckBox while initialization. The persist API save current model value to browser cookies for state maintains. While refreshing the CheckBox
      * control page the model value apply from browser cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Specify the Right to Left direction to Checkbox
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Specifies the enable or disable Tri-State for checkbox control.
      * @Default {false}
      */
    var enableTriState: js.UndefOr[Boolean] = js.native
    
    /** Specifies the checkbox control state.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** It allows to define the characteristics of the CheckBox control. It will helps to extend the capability of an HTML element.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Specified value to be added an id attribute of the CheckBox.
      * @Default {null}
      */
    var id: js.UndefOr[String] = js.native
    
    /** Specify the prefix value of id to be added before the current id of the CheckBox.
      * @Default {ej}
      */
    var idPrefix: js.UndefOr[String] = js.native
    
    /** Specifies the name attribute of the CheckBox.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Displays rounded corner borders to CheckBox
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** Specifies the size of the CheckBox.See below to know available CheckboxSize
      * @Default {small}
      */
    var size: js.UndefOr[CheckboxSize | String] = js.native
    
    /** Specifies the text content to be displayed for CheckBox.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Set the jQuery validation error message in CheckBox.
      * @Default {null}
      */
    var validationMessage: js.UndefOr[js.Any] = js.native
    
    /** Set the jQuery validation rules in CheckBox.
      * @Default {null}
      */
    var validationRules: js.UndefOr[js.Any] = js.native
    
    /** Specifies the value attribute of the CheckBox.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.CheckBox.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.CheckBox.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.CheckBox.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeChange(value: /* e */ BeforeChangeEventArgs => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCheckState(value: CheckState | String): Self = StObject.set(x, "checkState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStateUndefined: Self = StObject.set(x, "checkState", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean | js.Array[String]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCheckedVarargs(value: String*): Self = StObject.set(x, "checked", js.Array(value :_*))
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableTriState(value: Boolean): Self = StObject.set(x, "enableTriState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTriStateUndefined: Self = StObject.set(x, "enableTriState", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setSize(value: CheckboxSize | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValidationMessage(value: js.Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
