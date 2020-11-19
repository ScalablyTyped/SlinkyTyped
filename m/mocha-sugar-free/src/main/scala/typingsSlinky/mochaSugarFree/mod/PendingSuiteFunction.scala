package typingsSlinky.mochaSugarFree.mod

import typingsSlinky.mocha.mod.Suite_
import typingsSlinky.mochaSugarFree.anon.OptionsfnSuiteFuncundefin
import typingsSlinky.mochaSugarFree.anon.OptionstitlestringfnSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [bdd, tdd]
  *
  * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
  *
  * Indicates this suite should not be executed.
  *
  * @returns [bdd] `Suite`
  * @returns [tdd] `void`
  */
@js.native
trait PendingSuiteFunction extends js.Object {
  
  // tslint:disable-next-line: unified-signatures
  def apply(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
  def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
  def apply(title: String): Suite_ | Unit = js.native
  def apply(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
  def apply(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
  def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
  def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
}
