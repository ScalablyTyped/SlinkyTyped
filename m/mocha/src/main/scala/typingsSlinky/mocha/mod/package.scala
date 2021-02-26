package typingsSlinky.mocha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def after: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("after").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def afterEach: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def afterEach_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def after_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def before: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("before").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def beforeEach: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def beforeEach_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def before_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def describe: typingsSlinky.mocha.Mocha.SuiteFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("describe").asInstanceOf[typingsSlinky.mocha.Mocha.SuiteFunction]
  @scala.inline
  def describe_=(x: typingsSlinky.mocha.Mocha.SuiteFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def it: typingsSlinky.mocha.Mocha.TestFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("it").asInstanceOf[typingsSlinky.mocha.Mocha.TestFunction]
  @scala.inline
  def it_=(x: typingsSlinky.mocha.Mocha.TestFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])
  
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  @scala.inline
  def run(): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[scala.Unit]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def setup: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("setup").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def setup_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def suite: typingsSlinky.mocha.Mocha.SuiteFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suite").asInstanceOf[typingsSlinky.mocha.Mocha.SuiteFunction]
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def suiteSetup: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suiteSetup").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteSetup_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def suiteTeardown: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suiteTeardown").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteTeardown_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def suite_=(x: typingsSlinky.mocha.Mocha.SuiteFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def teardown: typingsSlinky.mocha.Mocha.HookFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("teardown").asInstanceOf[typingsSlinky.mocha.Mocha.HookFunction]
  @scala.inline
  def teardown_=(x: typingsSlinky.mocha.Mocha.HookFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("teardown")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def test: typingsSlinky.mocha.Mocha.TestFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("test").asInstanceOf[typingsSlinky.mocha.Mocha.TestFunction]
  @scala.inline
  def test_=(x: typingsSlinky.mocha.Mocha.TestFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xit: typingsSlinky.mocha.Mocha.PendingTestFunction = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xit").asInstanceOf[typingsSlinky.mocha.Mocha.PendingTestFunction]
  @scala.inline
  def xit_=(x: typingsSlinky.mocha.Mocha.PendingTestFunction): scala.Unit = typingsSlinky.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])
}
