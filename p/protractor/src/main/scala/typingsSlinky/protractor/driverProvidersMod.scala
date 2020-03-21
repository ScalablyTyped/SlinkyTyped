package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.q.mod.Promise
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object driverProvidersMod extends js.Object {
  @js.native
  class AttachSession protected ()
    extends typingsSlinky.protractor.attachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @js.native
  class BrowserStack protected ()
    extends typingsSlinky.protractor.browserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @js.native
  class Direct protected ()
    extends typingsSlinky.protractor.directMod.Direct {
    def this(config: Config) = this()
  }
  
  @js.native
  abstract class DriverProvider protected ()
    extends typingsSlinky.protractor.driverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  
  @js.native
  class Hosted protected ()
    extends typingsSlinky.protractor.hostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @js.native
  class Kobiton protected ()
    extends typingsSlinky.protractor.kobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @js.native
  class Local protected ()
    extends typingsSlinky.protractor.localMod.Local {
    def this(config: Config) = this()
  }
  
  @js.native
  class Mock ()
    extends typingsSlinky.protractor.mockMod.Mock {
    def this(config: Config) = this()
  }
  
  @js.native
  class MockExecutor ()
    extends typingsSlinky.protractor.mockMod.MockExecutor
  
  @js.native
  class Sauce protected ()
    extends typingsSlinky.protractor.sauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @js.native
  class TestObject protected ()
    extends typingsSlinky.protractor.testObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @js.native
  class UseExistingWebDriver protected ()
    extends typingsSlinky.protractor.useExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  var buildDriverProvider: js.Function1[/* config */ Config, typingsSlinky.protractor.driverProviderMod.DriverProvider] = js.native
  var logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  /* static members */
  @js.native
  object DriverProvider extends js.Object {
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    def quitDrivers(provider: typingsSlinky.protractor.driverProviderMod.DriverProvider, drivers: js.Array[WebDriver]): Promise[Unit] = js.native
  }
  
}

