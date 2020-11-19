package typingsSlinky.coreJs

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #############################################################################################
// Number - https://github.com/zloirock/core-js/#number
// Modules: core.number.iterator
// #############################################################################################
@js.native
trait Number extends js.Object {
  
  /**
    * Non-standard.
    */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Double]] = js.native
}
