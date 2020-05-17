package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information regarding the implementation: which services are implemented and the name of the implementation. */
@js.native
trait XServiceInfo extends XInterface {
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  val ImplementationName: String = js.native
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  val SupportedServiceNames: SafeArray[String] = js.native
  /**
    * Provides the implementation name of the service implementation.
    * @returns unique name of the implementation
    */
  def getImplementationName(): String = js.native
  /**
    * Provides the supported service names of the implementation, including also indirect service names.
    * @returns sequence of service names that are supported
    */
  def getSupportedServiceNames(): SafeArray[String] = js.native
  /**
    * Tests whether the specified service is supported, i.e. implemented by the implementation.
    * @param ServiceName name of service to be tested
    * @returns true, if service is supported, false otherwise
    */
  def supportsService(ServiceName: String): Boolean = js.native
}

object XServiceInfo {
  @scala.inline
  def apply(
    ImplementationName: String,
    SupportedServiceNames: SafeArray[String],
    acquire: () => Unit,
    getImplementationName: () => String,
    getSupportedServiceNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsService: String => Boolean
  ): XServiceInfo = {
    val __obj = js.Dynamic.literal(ImplementationName = ImplementationName.asInstanceOf[js.Any], SupportedServiceNames = SupportedServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getImplementationName = js.Any.fromFunction0(getImplementationName), getSupportedServiceNames = js.Any.fromFunction0(getSupportedServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsService = js.Any.fromFunction1(supportsService))
    __obj.asInstanceOf[XServiceInfo]
  }
  @scala.inline
  implicit class XServiceInfoOps[Self <: XServiceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplementationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImplementationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedServiceNames(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedServiceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetImplementationName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplementationName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSupportedServiceNames(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedServiceNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSupportsService(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsService")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

