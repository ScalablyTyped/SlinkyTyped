package typingsSlinky.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object form {
  
  /**
    * is not used anymore, and superseded by {@link com.sun.star.form.runtime.FormController} and {@link com.sun.star.form.runtime.FormOperations} .
    * @deprecated Deprecated
    */
  type FormControllerDispatcher = typingsSlinky.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
  
  /**
    * specifies the capabilities of a collection of forms.
    *
    * Basically, a {@link Forms} is a {@link FormComponents} , with the additional restriction that the contained elements support the {@link
    * com.sun.star.form.component.Form} service.
    * @see com.sun.star.form.component.Form
    */
  type Forms = typingsSlinky.activexLibreoffice.com_.sun.star.form.XForms
  
  /**
    * identifies a {@link FormComponent} as being a (sub-) form.
    *
    * This interface does not really provide an own functionality, it is only for easier runtime identification of form components.
    * @see XFormComponent
    */
  type XForm = typingsSlinky.activexLibreoffice.com_.sun.star.form.XFormComponent
  
  /**
    * describes a component which may be part of a form.
    *
    * This interface does not really provide an own functionality, it is only for easier runtime identification of form components.
    * @see XForm
    */
  type XFormComponent = typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild
}
