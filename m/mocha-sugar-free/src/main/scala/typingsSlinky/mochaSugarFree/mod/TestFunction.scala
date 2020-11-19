package typingsSlinky.mochaSugarFree.mod

import typingsSlinky.mocha.mod.Test_
import typingsSlinky.mochaSugarFree.anon.Optionsasyncfalseundefine
import typingsSlinky.mochaSugarFree.anon.OptionsasynctruefnTestCas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [bdd, tdd, qunit]
  *
  * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
  *
  * The name of the function is used as the name of the test if `title` is not supplied.
  */
@js.native
trait TestFunction extends js.Object {
  
  def apply(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def apply(options: Optionsasyncfalseundefine): Test_ = js.native
  def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
  def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def apply(title: String): Test_ = js.native
  def apply(title: String, fn: TestCase): Test_ = js.native
  def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  def only(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  def only(options: Optionsasyncfalseundefine): Test_ = js.native
  def only(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  def only(options: OptionsasynctruefnTestCas): Test_ = js.native
  def only(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  def only(title: String): Test_ = js.native
  def only(title: String, fn: TestCase): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  def only(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def only(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  def only(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def only(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should be executed exclusively.
    */
  @JSName("only")
  var only_Original: ExclusiveTestFunction = js.native
  
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  def skip(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  def skip(options: Optionsasyncfalseundefine): Test_ = js.native
  def skip(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  def skip(options: OptionsasynctruefnTestCas): Test_ = js.native
  def skip(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  def skip(title: String): Test_ = js.native
  def skip(title: String, fn: TestCase): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  def skip(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def skip(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  def skip(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def skip(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd, tdd, qunit]
    *
    * Indicates this test should not be executed.
    */
  @JSName("skip")
  var skip_Original: PendingTestFunction = js.native
}
