package typingsSlinky.protractorHttpMock.mod

import typingsSlinky.protractorHttpMock.anon.Mocks
import typingsSlinky.protractorHttpMock.mod.requests.AllRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtractorHttpMock extends js.Object {
  
  /**
    * Instantiate mock module. This must be done before the browser connects.
    *
    * @param mocks An array of either mock modules or module names relative to the rootDirectory configuration to load into the application.
    * @param plugins An array of either Plugin objects or NPM modules as strings.
    * @param skipDefaults Set true to skip loading of default mocks.
    */
  def apply(): ProtractorHttpMock = js.native
  def apply(mocks: js.UndefOr[scala.Nothing], plugins: js.UndefOr[scala.Nothing], skipDefaults: Boolean): ProtractorHttpMock = js.native
  def apply(mocks: js.UndefOr[scala.Nothing], plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String]): ProtractorHttpMock = js.native
  def apply(
    mocks: js.UndefOr[scala.Nothing],
    plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String],
    skipDefaults: Boolean
  ): ProtractorHttpMock = js.native
  def apply(mocks: js.Array[AllRequests | String]): ProtractorHttpMock = js.native
  def apply(mocks: js.Array[AllRequests | String], plugins: js.UndefOr[scala.Nothing], skipDefaults: Boolean): ProtractorHttpMock = js.native
  def apply(mocks: js.Array[AllRequests | String], plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String]): ProtractorHttpMock = js.native
  def apply(
    mocks: js.Array[AllRequests | String],
    plugins: js.Array[Plugin1[_] | (Plugin2[_, _]) | String],
    skipDefaults: Boolean
  ): ProtractorHttpMock = js.native
  
  /**
    * Add mocks during test execution.
    * Returns a promise that will be resolved with a true boolean
    * when mocks are added.
    *
    * @param mocks An array of mock modules to load into the application.
    */
  def add(mocks: js.Array[AllRequests]): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise that will be resolved with a true boolean
    * when all matched HTTP requests are cleared.
    */
  def clearRequests(): js.Promise[Boolean] = js.native
  
  /**
    * Module configuration to setup
    */
  var config: Mocks = js.native
  
  /**
    * Remove mocks during test execution.
    * Returns a promise that will be resolved with a true boolean
    * when the supplied mocks are removed.
    *
    * @param mocks An array of mock modules to remove from the application.
    */
  def remove(mocks: js.Array[AllRequests]): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise that will be resolved with an array of
    * all matched HTTP requests.
    */
  def requestsMade(): js.Promise[js.Array[ReceivedRequest]] = js.native
  
  /**
    * Clean up.
    * Typically done in the afterEach call to ensure the teardown
    * is executed regardless of what happens in the test execution.
    */
  def teardown(): Unit = js.native
}
