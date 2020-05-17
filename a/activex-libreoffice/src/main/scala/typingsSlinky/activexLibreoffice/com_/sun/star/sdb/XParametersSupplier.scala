package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of parameters, typically used for a prepared statement. */
@js.native
trait XParametersSupplier extends XInterface {
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  val Parameters: XIndexAccess = js.native
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  def getParameters(): XIndexAccess = js.native
}

object XParametersSupplier {
  @scala.inline
  def apply(
    Parameters: XIndexAccess,
    acquire: () => Unit,
    getParameters: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XParametersSupplier = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XParametersSupplier]
  }
  @scala.inline
  implicit class XParametersSupplierOps[Self <: XParametersSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetParameters(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

