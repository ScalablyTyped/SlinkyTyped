package typingsSlinky.protractor.anon

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

trait Typeofremote extends js.Object {
  var DriverService: (Instantiable2[
    /* executable */ String, 
    /* options */ ServiceOptions, 
    typingsSlinky.seleniumWebdriver.remoteMod.DriverService
  ]) with TypeofDriverService
  var FileDetector: Instantiable0[typingsSlinky.seleniumWebdriver.remoteMod.FileDetector]
  var SeleniumServer: Instantiable1[/* jar */ String, typingsSlinky.seleniumWebdriver.remoteMod.SeleniumServer]
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
}

