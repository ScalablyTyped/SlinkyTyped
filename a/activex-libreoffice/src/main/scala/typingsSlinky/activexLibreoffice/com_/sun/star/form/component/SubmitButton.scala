package typingsSlinky.activexLibreoffice.com_.sun.star.form.component

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.form.FormControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.form.submission.XSubmissionSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the control model for a button, part of a form component hierarchy, which can be bound to external submissions.
  * @see CommandButton
  */
@js.native
trait SubmitButton
  extends FormControlModel
     with XSubmissionSupplier {
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
