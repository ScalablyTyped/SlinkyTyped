package typingsSlinky.rollup.mod

import typingsSlinky.rollup.rollupStrings.BUNDLE_END
import typingsSlinky.rollup.rollupStrings.BUNDLE_START
import typingsSlinky.rollup.rollupStrings.END
import typingsSlinky.rollup.rollupStrings.ERROR
import typingsSlinky.rollup.rollupStrings.START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.anon.`2`
  - typingsSlinky.rollup.anon.Input
  - typingsSlinky.rollup.anon.Duration
  - typingsSlinky.rollup.anon.`3`
  - typingsSlinky.rollup.anon.Error
*/
trait RollupWatcherEvent extends StObject
object RollupWatcherEvent {
  
  @scala.inline
  def `2`(code: START): typingsSlinky.rollup.anon.`2` = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.anon.`2`]
  }
  
  @scala.inline
  def `3`(code: END): typingsSlinky.rollup.anon.`3` = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.anon.`3`]
  }
  
  @scala.inline
  def Duration(code: BUNDLE_END, duration: Double, output: js.Array[String], result: RollupBuild): typingsSlinky.rollup.anon.Duration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.anon.Duration]
  }
  
  @scala.inline
  def Error(code: ERROR, error: RollupError): typingsSlinky.rollup.anon.Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.anon.Error]
  }
  
  @scala.inline
  def Input(code: BUNDLE_START, output: js.Array[String]): typingsSlinky.rollup.anon.Input = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.anon.Input]
  }
}
