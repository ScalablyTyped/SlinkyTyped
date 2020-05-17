package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to produce instances of an implementation of a service specification.
  *
  * This interface is deprecated. Please use {@link XSingleComponentFactory} .
  * @deprecated Deprecated
  * @see XInitialization
  */
@js.native
trait XSingleServiceFactory extends XInterface {
  /**
    * Creates an instance of a service implementation.
    * @returns service instance
    */
  def createInstance(): XInterface = js.native
  /**
    * Creates an instance of a service implementation initialized with some arguments.
    * @param aArguments arguments passed to implementation
    * @returns service instance
    */
  def createInstanceWithArguments(aArguments: SeqEquiv[_]): XInterface = js.native
}

object XSingleServiceFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSingleServiceFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingleServiceFactory]
  }
  @scala.inline
  implicit class XSingleServiceFactoryOps[Self <: XSingleServiceFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateInstance(value: () => XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateInstanceWithArguments(value: SeqEquiv[_] => XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstanceWithArguments")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

