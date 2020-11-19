package typingsSlinky.angularCompiler.coreMod

import typingsSlinky.angularCompiler.angularCompilerNumbers.`0`
import typingsSlinky.angularCompiler.angularCompilerNumbers.`1`
import typingsSlinky.angularCompiler.angularCompilerNumbers.`2`
import typingsSlinky.angularCompiler.angularCompilerNumbers.`4`
import typingsSlinky.angularCompiler.angularCompilerNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCompiler.angularCompilerNumbers.`0`
  - typingsSlinky.angularCompiler.angularCompilerNumbers.`1`
  - typingsSlinky.angularCompiler.angularCompilerNumbers.`2`
  - typingsSlinky.angularCompiler.angularCompilerNumbers.`4`
  - typingsSlinky.angularCompiler.angularCompilerNumbers.`8`
*/
trait InjectFlags extends js.Object
object InjectFlags {
  
  @scala.inline
  def Default: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @scala.inline
  def Host: `1` = 1.asInstanceOf[`1`]
  
  /** Inject `defaultValue` instead if token not found. */
  @scala.inline
  def Optional: `8` = 8.asInstanceOf[`8`]
  
  /** Don't descend into ancestors of the node requesting injection. */
  @scala.inline
  def Self: `2` = 2.asInstanceOf[`2`]
  
  /** Skip the node that is requesting injection. */
  @scala.inline
  def SkipSelf: `4` = 4.asInstanceOf[`4`]
}
