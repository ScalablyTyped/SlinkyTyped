package typingsSlinky.mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Mocha {
  
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ typingsSlinky.mocha.Mocha.Context, js.Thenable[js.Any]]
  
  type Done = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[
    /* this */ typingsSlinky.mocha.Mocha.Context, 
    /* done */ typingsSlinky.mocha.Mocha.Done, 
    scala.Unit
  ]
  
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites. Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  type PendingSuiteFunction = js.Function2[
    /* title */ java.lang.String, 
    /* fn */ js.ThisFunction0[/* this */ typingsSlinky.mocha.Mocha.Suite, scala.Unit], 
    typingsSlinky.mocha.Mocha.Suite | scala.Unit
  ]
  
  type TestInterface = js.Function1[/* suite */ typingsSlinky.mocha.Mocha.Suite, scala.Unit]
}
