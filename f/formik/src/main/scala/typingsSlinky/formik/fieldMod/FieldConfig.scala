package typingsSlinky.formik.fieldMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.formik.typesMod.FieldInputProps
import typingsSlinky.formik.typesMod.FieldValidator
import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldConfig[V] extends js.Object {
  
  /**
    * Component to render. Can either be a string e.g. 'select', 'input', or 'textarea', or a component.
    */
  var as: js.UndefOr[
    (ReactComponentClass[FieldInputProps[V] | js.Object]) | String | ForwardRefExoticComponent[_]
  ] = js.native
  
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[(js.Function1[/* props */ FieldProps[V, _], ReactElement]) | ReactElement] = js.native
  
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[
    String | (ReactComponentClass[(FieldProps[V, _]) | js.Object]) | ForwardRefExoticComponent[_]
  ] = js.native
  
  /** Inner ref */
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.native
  
  /**
    * Field name
    */
  var name: String = js.native
  
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    * @deprecated
    */
  var render: js.UndefOr[js.Function1[/* props */ FieldProps[V, _], ReactElement]] = js.native
  
  /** HTML input type */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Validate a single field value independently
    */
  var validate: js.UndefOr[FieldValidator] = js.native
  
  /** Field value */
  var value: js.UndefOr[js.Any] = js.native
}
object FieldConfig {
  
  @scala.inline
  def apply[V](name: String): FieldConfig[V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldConfig[V]]
  }
  
  @scala.inline
  implicit class FieldConfigOps[Self <: FieldConfig[_], V] (val x: Self with FieldConfig[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsFunctionComponent(value: ReactComponentClass[FieldInputProps[V] | js.Object]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsComponentClass(value: ReactComponentClass[FieldInputProps[V] | js.Object]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(
      value: (ReactComponentClass[FieldInputProps[V] | js.Object]) | String | ForwardRefExoticComponent[_]
    ): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ FieldProps[V, _] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ FieldProps[V, _], ReactElement]) | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[(FieldProps[V, _]) | js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[(FieldProps[V, _]) | js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(
      value: String | (ReactComponentClass[(FieldProps[V, _]) | js.Object]) | ForwardRefExoticComponent[_]
    ): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setInnerRef(value: /* instance */ js.Any => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setRender(value: /* props */ FieldProps[V, _] => ReactElement): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidate(value: /* value */ js.Any => String | Unit | (js.Promise[String | Unit])): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
