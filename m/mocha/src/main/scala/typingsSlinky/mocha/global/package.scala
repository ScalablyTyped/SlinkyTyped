package typingsSlinky.mocha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def after: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("after").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def afterEach: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("afterEach").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def afterEach_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def after_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def before: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("before").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def beforeEach: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("beforeEach").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def beforeEach_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def before_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def context: typingsSlinky.mocha.Mocha.SuiteFunction = js.Dynamic.global.selectDynamic("context").asInstanceOf[typingsSlinky.mocha.Mocha.SuiteFunction]
  @scala.inline
  def context_=(x: typingsSlinky.mocha.Mocha.SuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def describe: typingsSlinky.mocha.Mocha.SuiteFunction = js.Dynamic.global.selectDynamic("describe").asInstanceOf[typingsSlinky.mocha.Mocha.SuiteFunction]
  @scala.inline
  def describe_=(x: typingsSlinky.mocha.Mocha.SuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def it: typingsSlinky.mocha.Mocha.TestFunction = js.Dynamic.global.selectDynamic("it").asInstanceOf[typingsSlinky.mocha.Mocha.TestFunction]
  @scala.inline
  def it_=(x: typingsSlinky.mocha.Mocha.TestFunction): scala.Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])
  
  // #endregion Reporter augmentations
  // #region Browser augmentations
  /**
    * Mocha global.
    *
    * - _Only supported in the browser._
    */
  @scala.inline
  def mocha: typingsSlinky.mocha.BrowserMocha = js.Dynamic.global.selectDynamic("mocha").asInstanceOf[typingsSlinky.mocha.BrowserMocha]
  
  // #region Test interface augmentations
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  @scala.inline
  def run(): scala.Unit = js.Dynamic.global.applyDynamic("run")().asInstanceOf[scala.Unit]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def setup: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("setup").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def setup_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def specify: typingsSlinky.mocha.Mocha.TestFunction = js.Dynamic.global.selectDynamic("specify").asInstanceOf[typingsSlinky.mocha.Mocha.TestFunction]
  @scala.inline
  def specify_=(x: typingsSlinky.mocha.Mocha.TestFunction): scala.Unit = js.Dynamic.global.updateDynamic("specify")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def suite: typingsSlinky.mocha.Mocha.SuiteFunction = js.Dynamic.global.selectDynamic("suite").asInstanceOf[typingsSlinky.mocha.Mocha.SuiteFunction]
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def suiteSetup: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("suiteSetup").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteSetup_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def suiteTeardown: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("suiteTeardown").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteTeardown_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def suite_=(x: typingsSlinky.mocha.Mocha.SuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def teardown: typingsSlinky.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("teardown").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def teardown_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("teardown")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def test: typingsSlinky.mocha.Mocha.TestFunction = js.Dynamic.global.selectDynamic("test").asInstanceOf[typingsSlinky.mocha.Mocha.TestFunction]
  @scala.inline
  def test_=(x: typingsSlinky.mocha.Mocha.TestFunction): scala.Unit = js.Dynamic.global.updateDynamic("test")(x.asInstanceOf[js.Any])
  
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xcontext: typingsSlinky.mocha.Mocha.PendingSuiteFunction = js.Dynamic.global.selectDynamic("xcontext").asInstanceOf[typingsSlinky.mocha.Mocha.PendingSuiteFunction]
  @scala.inline
  def xcontext_=(x: typingsSlinky.mocha.Mocha.PendingSuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("xcontext")(x.asInstanceOf[js.Any])
  
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xdescribe: typingsSlinky.mocha.Mocha.PendingSuiteFunction = js.Dynamic.global.selectDynamic("xdescribe").asInstanceOf[typingsSlinky.mocha.Mocha.PendingSuiteFunction]
  @scala.inline
  def xdescribe_=(x: typingsSlinky.mocha.Mocha.PendingSuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xit: typingsSlinky.mocha.Mocha.PendingTestFunction = js.Dynamic.global.selectDynamic("xit").asInstanceOf[typingsSlinky.mocha.Mocha.PendingTestFunction]
  @scala.inline
  def xit_=(x: typingsSlinky.mocha.Mocha.PendingTestFunction): scala.Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xspecify: typingsSlinky.mocha.Mocha.PendingTestFunction = js.Dynamic.global.selectDynamic("xspecify").asInstanceOf[typingsSlinky.mocha.Mocha.PendingTestFunction]
  @scala.inline
  def xspecify_=(x: typingsSlinky.mocha.Mocha.PendingTestFunction): scala.Unit = js.Dynamic.global.updateDynamic("xspecify")(x.asInstanceOf[js.Any])
}
