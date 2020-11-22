package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Typeofts
import typingsSlinky.forkTsCheckerWebpackPlugin.performanceMod.Performance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/profile/TypeScriptPerformance", JSImport.Namespace)
@js.native
object typeScriptPerformanceMod extends js.Object {
  
  def connectTypeScriptPerformance(typescript: Typeofts, performance: Performance): Performance = js.native
  
  @js.native
  trait TypeScriptPerformance extends js.Object {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def mark(name: String): Unit = js.native
    
    def measure(name: String): Unit = js.native
    def measure(name: String, startMark: js.UndefOr[scala.Nothing], endMark: String): Unit = js.native
    def measure(name: String, startMark: String): Unit = js.native
    def measure(name: String, startMark: String, endMark: String): Unit = js.native
  }
}
