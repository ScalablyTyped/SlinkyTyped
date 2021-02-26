package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldAncestor extends IBase {
  
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Fired when the error message of any field within the container changes
    * @param field Ext.form.Labelable The sub-field whose active error changed
    * @param error String The new active error message
    */
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.native
  
  /** [Method] Fired when the validity of any field within the container changes
    * @param field Ext.form.field.Field The sub-field whose validity changed
    * @param valid Boolean The new validity state
    */
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], 
      /* valid */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
}
object IFieldAncestor {
  
  @scala.inline
  def apply(): IFieldAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldAncestor]
  }
  
  @scala.inline
  implicit class IFieldAncestorMutableBuilder[Self <: IFieldAncestor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldDefaults(value: js.Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    @scala.inline
    def setInitFieldAncestor(value: () => Unit): Self = StObject.set(x, "initFieldAncestor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    @scala.inline
    def setOnFieldErrorChange(value: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    @scala.inline
    def setOnFieldValidityChange(
      value: (/* field */ js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], /* valid */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
  }
}
