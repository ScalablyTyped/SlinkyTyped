package typingsSlinky.activexLibreoffice.com_.sun.star.form.validation

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XValidatableOps[Self <: XValidatable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidator(value: XValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetValidator(value: () => XValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValidator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValidator(value: XValidator => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidator")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

