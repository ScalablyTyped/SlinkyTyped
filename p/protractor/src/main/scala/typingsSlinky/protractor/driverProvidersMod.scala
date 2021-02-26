package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.q.mod.Promise
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverProvidersMod {
  
  @JSImport("protractor/built/driverProviders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protractor/built/driverProviders", "AttachSession")
  @js.native
  class AttachSession protected ()
    extends typingsSlinky.protractor.attachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "BrowserStack")
  @js.native
  class BrowserStack protected ()
    extends typingsSlinky.protractor.browserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Direct")
  @js.native
  class Direct protected ()
    extends typingsSlinky.protractor.directMod.Direct {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "DriverProvider")
  @js.native
  abstract class DriverProvider protected ()
    extends typingsSlinky.protractor.driverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  /* static members */
  object DriverProvider {
    
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    @JSImport("protractor/built/driverProviders", "DriverProvider.quitDrivers")
    @js.native
    def quitDrivers(provider: typingsSlinky.protractor.driverProviderMod.DriverProvider, drivers: js.Array[WebDriver]): Promise[Unit] = js.native
  }
  
  @JSImport("protractor/built/driverProviders", "Hosted")
  @js.native
  class Hosted protected ()
    extends typingsSlinky.protractor.hostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Kobiton")
  @js.native
  class Kobiton protected ()
    extends typingsSlinky.protractor.kobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Local")
  @js.native
  class Local protected ()
    extends typingsSlinky.protractor.localMod.Local {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Mock")
  @js.native
  class Mock ()
    extends typingsSlinky.protractor.mockMod.Mock {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "MockExecutor")
  @js.native
  class MockExecutor ()
    extends typingsSlinky.protractor.mockMod.MockExecutor
  
  @JSImport("protractor/built/driverProviders", "Sauce")
  @js.native
  class Sauce protected ()
    extends typingsSlinky.protractor.sauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "TestObject")
  @js.native
  class TestObject protected ()
    extends typingsSlinky.protractor.testObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "UseExistingWebDriver")
  @js.native
  class UseExistingWebDriver protected ()
    extends typingsSlinky.protractor.useExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "buildDriverProvider")
  @js.native
  def buildDriverProvider: js.Function1[/* config */ Config, typingsSlinky.protractor.driverProviderMod.DriverProvider] = js.native
  @scala.inline
  def buildDriverProvider_=(x: js.Function1[/* config */ Config, typingsSlinky.protractor.driverProviderMod.DriverProvider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDriverProvider")(x.asInstanceOf[js.Any])
  
  @JSImport("protractor/built/driverProviders", "logWarnings")
  @js.native
  def logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  @scala.inline
  def logWarnings_=(x: js.Function2[/* providerType */ String, /* config */ Config, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logWarnings")(x.asInstanceOf[js.Any])
}
