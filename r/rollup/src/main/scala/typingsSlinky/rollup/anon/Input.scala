package typingsSlinky.rollup.anon

import typingsSlinky.rollup.mod.InputOption
import typingsSlinky.rollup.mod.RollupWatcherEvent
import typingsSlinky.rollup.rollupStrings.BUNDLE_START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends RollupWatcherEvent {
  
  var code: BUNDLE_START = js.native
  
  var input: js.UndefOr[InputOption] = js.native
  
  var output: js.Array[String] = js.native
}
object Input {
  
  @scala.inline
  def apply(code: BUNDLE_START, output: js.Array[String]): Input = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: BUNDLE_START): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: InputOption): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
  }
}
