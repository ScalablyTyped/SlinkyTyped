package typingsSlinky.emberMocha.mod

import typingsSlinky.emberMocha.mochaAfterEach
import typingsSlinky.emberMocha.mochaBeforeEach
import typingsSlinky.mocha.Mocha.AsyncFunc
import typingsSlinky.mocha.Mocha.Func
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestHooks extends js.Object {
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def afterEach(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def afterEach(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def afterEach(name: String): Unit = js.native
  def afterEach(name: String, fn: AsyncFunc): Unit = js.native
  def afterEach(name: String, fn: Func): Unit = js.native
  @JSName("afterEach")
  var afterEach_Original: mochaAfterEach = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def beforeEach(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def beforeEach(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def beforeEach(name: String): Unit = js.native
  def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
  def beforeEach(name: String, fn: Func): Unit = js.native
  @JSName("beforeEach")
  var beforeEach_Original: mochaBeforeEach = js.native
}
