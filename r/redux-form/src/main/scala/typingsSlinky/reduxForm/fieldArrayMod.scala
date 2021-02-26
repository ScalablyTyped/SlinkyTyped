package typingsSlinky.reduxForm

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reduxForm.anon.Props
import typingsSlinky.reduxForm.fieldMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldArrayMod {
  
  @JSImport("redux-form/lib/FieldArray", "FieldArray")
  @js.native
  class FieldArray[P, FieldValue] protected () extends GenericFieldArray[FieldValue, P] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: js.Any) = this()
  }
  
  type BaseFieldArrayProps[P, FieldValue] = (P | Props[P]) with (_BaseFieldArrayProps[P, FieldValue])
  
  @js.native
  trait FieldArrayFieldsProps[FieldValue] extends StObject {
    
    def forEach(callback: FieldIterate[FieldValue, Unit]): Unit = js.native
    
    def get(index: Double): FieldValue = js.native
    
    def getAll(): js.Array[FieldValue] = js.native
    
    def insert(index: Double, value: FieldValue): Unit = js.native
    
    var length: Double = js.native
    
    def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R] = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    var name: String = js.native
    
    def pop(): FieldValue = js.native
    
    def push(value: FieldValue): Unit = js.native
    
    def remove(index: Double): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def shift(): FieldValue = js.native
    
    def splice(index: Double, removeNum: Double, value: FieldValue): Unit = js.native
    def splice(index: Double, removeNum: Null, value: FieldValue): Unit = js.native
    
    def swap(indexA: Double, indexB: Double): Unit = js.native
    
    def unshift(value: FieldValue): Unit = js.native
  }
  
  @js.native
  trait FieldArrayMetaProps extends StObject {
    
    var dirty: Boolean = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var form: String = js.native
    
    var invalid: Boolean = js.native
    
    var pristine: Boolean = js.native
    
    var submitFailed: Boolean = js.native
    
    var submitting: Boolean = js.native
    
    var valid: Boolean = js.native
    
    var warning: js.UndefOr[js.Any] = js.native
  }
  object FieldArrayMetaProps {
    
    @scala.inline
    def apply(
      dirty: Boolean,
      form: String,
      invalid: Boolean,
      pristine: Boolean,
      submitFailed: Boolean,
      submitting: Boolean,
      valid: Boolean
    ): FieldArrayMetaProps = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldArrayMetaProps]
    }
    
    @scala.inline
    implicit class FieldArrayMetaPropsMutableBuilder[Self <: FieldArrayMetaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: js.Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ String, 
    /* index */ Double, 
    /* fields */ FieldArrayFieldsProps[FieldValue], 
    R
  ]
  
  @js.native
  trait GenericFieldArray[FieldValue, P]
    extends Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
    
    def getRenderedComponent(): ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P] = js.native
    
    var name: String = js.native
    
    var valid: Boolean = js.native
  }
  
  @js.native
  trait WrappedFieldArrayProps[FieldValue] extends StObject {
    
    var fields: FieldArrayFieldsProps[FieldValue] = js.native
    
    var meta: FieldArrayMetaProps = js.native
  }
  object WrappedFieldArrayProps {
    
    @scala.inline
    def apply[FieldValue](fields: FieldArrayFieldsProps[FieldValue], meta: FieldArrayMetaProps): WrappedFieldArrayProps[FieldValue] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldArrayProps[FieldValue]]
    }
    
    @scala.inline
    implicit class WrappedFieldArrayPropsMutableBuilder[Self <: WrappedFieldArrayProps[_], FieldValue] (val x: Self with WrappedFieldArrayProps[FieldValue]) extends AnyVal {
      
      @scala.inline
      def setFields(value: FieldArrayFieldsProps[FieldValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: FieldArrayMetaProps): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _BaseFieldArrayProps[P, FieldValue] extends StObject {
    
    var component: ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P] = js.native
    
    var name: String = js.native
    
    var rerenderOnEveryChange: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[Validator | js.Array[Validator]] = js.native
    
    var warn: js.UndefOr[Validator | js.Array[Validator]] = js.native
    
    var withRef: js.UndefOr[Boolean] = js.native
  }
  object _BaseFieldArrayProps {
    
    @scala.inline
    def apply[P, FieldValue](component: ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P], name: String): _BaseFieldArrayProps[P, FieldValue] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[_BaseFieldArrayProps[P, FieldValue]]
    }
    
    @scala.inline
    implicit class _BaseFieldArrayPropsMutableBuilder[Self <: _BaseFieldArrayProps[_, _], P, FieldValue] (val x: Self with (_BaseFieldArrayProps[P, FieldValue])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRerenderOnEveryChange(value: Boolean): Self = StObject.set(x, "rerenderOnEveryChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRerenderOnEveryChangeUndefined: Self = StObject.set(x, "rerenderOnEveryChange", js.undefined)
      
      @scala.inline
      def setValidate(value: Validator | js.Array[Validator]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValidateVarargs(value: Validator*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      @scala.inline
      def setWarn(value: Validator | js.Array[Validator]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "warn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      @scala.inline
      def setWarnVarargs(value: Validator*): Self = StObject.set(x, "warn", js.Array(value :_*))
      
      @scala.inline
      def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
}
