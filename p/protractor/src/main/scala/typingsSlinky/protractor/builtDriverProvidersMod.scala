package typingsSlinky.protractor

import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.q.qMod.Promise
import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object builtDriverProvidersMod extends js.Object {
  @js.native
  class AttachSession protected ()
    extends typingsSlinky.protractor.builtDriverProvidersAttachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @js.native
  class BrowserStack protected ()
    extends typingsSlinky.protractor.builtDriverProvidersBrowserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @js.native
  class Direct protected ()
    extends typingsSlinky.protractor.builtDriverProvidersDirectMod.Direct {
    def this(config: Config) = this()
  }
  
  @js.native
  abstract class DriverProvider protected ()
    extends typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  
  @js.native
  class Hosted protected ()
    extends typingsSlinky.protractor.builtDriverProvidersHostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @js.native
  class Kobiton protected ()
    extends typingsSlinky.protractor.builtDriverProvidersKobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @js.native
  class Local protected ()
    extends typingsSlinky.protractor.builtDriverProvidersLocalMod.Local {
    def this(config: Config) = this()
  }
  
  @js.native
  class Mock ()
    extends typingsSlinky.protractor.builtDriverProvidersMockMod.Mock {
    def this(config: Config) = this()
  }
  
  @js.native
  class MockExecutor ()
    extends typingsSlinky.protractor.builtDriverProvidersMockMod.MockExecutor
  
  @js.native
  class Sauce protected ()
    extends typingsSlinky.protractor.builtDriverProvidersSauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @js.native
  class TestObject protected ()
    extends typingsSlinky.protractor.builtDriverProvidersTestObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @js.native
  class UseExistingWebDriver protected ()
    extends typingsSlinky.protractor.builtDriverProvidersUseExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  var buildDriverProvider: js.Function1[
    /* config */ Config, 
    typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
  ] = js.native
  var logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  /* static members */
  @js.native
  object DriverProvider extends js.Object {
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    def quitDrivers(
      provider: typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider,
      drivers: js.Array[WebDriver]
    ): Promise[Unit] = js.native
  }
  
}

