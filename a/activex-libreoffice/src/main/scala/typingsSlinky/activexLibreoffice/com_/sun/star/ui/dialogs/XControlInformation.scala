package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to query for controls and control properties supported by the implementing instance.
  * @since OOo 1.1.2
  */
@js.native
trait XControlInformation extends XInterface {
  /**
    * Query for the supported controls of a service instance.
    * @returns a sequence with the names of the supported controls.
    */
  val SupportedControls: SafeArray[String] = js.native
  /**
    * Returns a sequence with properties supported by the specified control.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @returns a sequence of control properties supported by the specified control.
    * @throws com::sun::star::lang::IllegalArgumentException when the specified control is not supported.
    */
  def getSupportedControlProperties(aControlName: String): SafeArray[String] = js.native
  /**
    * Query for the supported controls of a service instance.
    * @returns a sequence with the names of the supported controls.
    */
  def getSupportedControls(): SafeArray[String] = js.native
  /**
    * Returns whether control property is supported by a control.
    * @param aControlName The name of the control.
    * @param aControlProperty The control property to query for.
    * @returns `TRUE` if the specified control action is supported. `FALSE` if the specified control action is not supported.
    * @throws com::sun::star::lang::IllegalArgumentException when the specified control is not supported.
    */
  def isControlPropertySupported(aControlName: String, aControlProperty: String): Boolean = js.native
  /**
    * Returns whether the specified control is supported or not.
    * @param aControlName The name of the control. Common control names are for instance "OkButton" or "CancelButton".
    * @returns `TRUE` if the specified control is supported. `FALSE` if the specified control is not supported.
    */
  def isControlSupported(aControlName: String): Boolean = js.native
}

object XControlInformation {
  @scala.inline
  def apply(
    SupportedControls: SafeArray[String],
    acquire: () => Unit,
    getSupportedControlProperties: String => SafeArray[String],
    getSupportedControls: () => SafeArray[String],
    isControlPropertySupported: (String, String) => Boolean,
    isControlSupported: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XControlInformation = {
    val __obj = js.Dynamic.literal(SupportedControls = SupportedControls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSupportedControlProperties = js.Any.fromFunction1(getSupportedControlProperties), getSupportedControls = js.Any.fromFunction0(getSupportedControls), isControlPropertySupported = js.Any.fromFunction2(isControlPropertySupported), isControlSupported = js.Any.fromFunction1(isControlSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XControlInformation]
  }
  @scala.inline
  implicit class XControlInformationOps[Self <: XControlInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportedControls(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSupportedControlProperties(value: String => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedControlProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSupportedControls(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsControlPropertySupported(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlPropertySupported")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsControlSupported(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlSupported")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

