package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.q.mod.Promise
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverProviderMod {
  
  @JSImport("protractor/built/driverProviders/driverProvider", "DriverProvider")
  @js.native
  abstract class DriverProvider protected () extends StObject {
    def this(config: Config) = this()
    
    var bpRunner: js.Any = js.native
    
    var config_ : Config = js.native
    
    var drivers_ : js.Array[WebDriver] = js.native
    
    def getBPUrl(): String = js.native
    
    /**
      * Get all existing drivers.
      *
      * @public
      * @return array of webdriver instances
      */
    def getExistingDrivers(): js.Array[WebDriver] = js.native
    
    /**
      * Create a new driver.
      *
      * @public
      * @return webdriver instance
      */
    def getNewDriver(): WebDriver = js.native
    
    /**
      * Quit a driver.
      *
      * @public
      * @param webdriver instance
      */
    def quitDriver(driver: WebDriver): js.Promise[Unit] = js.native
    
    /**
      * Set up environment specific to a particular driver provider. Overridden
      * by each driver provider.
      */
    /* protected */ def setupDriverEnv(): Promise[_] = js.native
    
    /**
      * Default setup environment method, common to all driver providers.
      */
    def setupEnv(): Promise[_] = js.native
    
    /**
      * Teardown and destroy the environment and do any associated cleanup.
      * Shuts down the drivers.
      *
      * @public
      * @return {q.Promise<any>} A promise which will resolve when the environment is down.
      */
    def teardownEnv(): Promise[_] = js.native
    
    /**
      * Default update job method.
      * @return a promise
      */
    def updateJob(update: js.Any): Promise[_] = js.native
  }
  /* static members */
  object DriverProvider {
    
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    @JSImport("protractor/built/driverProviders/driverProvider", "DriverProvider.quitDrivers")
    @js.native
    def quitDrivers(provider: DriverProvider, drivers: js.Array[WebDriver]): Promise[Unit] = js.native
  }
}
