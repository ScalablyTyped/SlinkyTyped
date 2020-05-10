package typingsSlinky.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.seleniumWebdriver.remoteMod.DriverService
import typingsSlinky.seleniumWebdriver.remoteMod.FileDetector
import typingsSlinky.seleniumWebdriver.remoteMod.SeleniumServer
import typingsSlinky.seleniumWebdriver.remoteMod.ServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofremote extends js.Object {
  var DriverService: (Instantiable2[
    /* executable */ String, 
    /* options */ ServiceOptions, 
    typingsSlinky.seleniumWebdriver.remoteMod.DriverService
  ]) with TypeofDriverService = js.native
  var FileDetector: Instantiable0[typingsSlinky.seleniumWebdriver.remoteMod.FileDetector] = js.native
  var SeleniumServer: Instantiable1[/* jar */ String, typingsSlinky.seleniumWebdriver.remoteMod.SeleniumServer] = js.native
}

object Typeofremote {
  @scala.inline
  def apply(
    DriverService: (Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService]) with TypeofDriverService,
    FileDetector: Instantiable0[FileDetector],
    SeleniumServer: Instantiable1[/* jar */ String, SeleniumServer]
  ): Typeofremote = {
    val __obj = js.Dynamic.literal(DriverService = DriverService.asInstanceOf[js.Any], FileDetector = FileDetector.asInstanceOf[js.Any], SeleniumServer = SeleniumServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofremote]
  }
  @scala.inline
  implicit class TypeofremoteOps[Self <: Typeofremote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriverService(
      value: (Instantiable2[/* executable */ String, /* options */ ServiceOptions, DriverService]) with TypeofDriverService
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriverService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDetector(value: Instantiable0[FileDetector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileDetector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeleniumServer(value: Instantiable1[/* jar */ String, SeleniumServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeleniumServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

