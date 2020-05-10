package typingsSlinky.protractor

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.seleniumWebdriver.chromeMod.ServiceBuilder
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofchrome extends js.Object {
  var Driver: TypeofDriverInstantiable = js.native
  var Options: TypeofOptions = js.native
  var ServiceBuilder: Instantiable0[typingsSlinky.seleniumWebdriver.chromeMod.ServiceBuilder] = js.native
  def getDefaultService(): DriverService = js.native
  def setDefaultService(service: DriverService): Unit = js.native
}

object Typeofchrome {
  @scala.inline
  def apply(
    Driver: TypeofDriverInstantiable,
    Options: TypeofOptions,
    ServiceBuilder: Instantiable0[ServiceBuilder],
    getDefaultService: () => DriverService,
    setDefaultService: DriverService => Unit
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], ServiceBuilder = ServiceBuilder.asInstanceOf[js.Any], getDefaultService = js.Any.fromFunction0(getDefaultService), setDefaultService = js.Any.fromFunction1(setDefaultService))
    __obj.asInstanceOf[Typeofchrome]
  }
  @scala.inline
  implicit class TypeofchromeOps[Self <: Typeofchrome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: TypeofDriverInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: TypeofOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceBuilder(value: Instantiable0[ServiceBuilder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceBuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDefaultService(value: () => DriverService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultService")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDefaultService(value: DriverService => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultService")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

