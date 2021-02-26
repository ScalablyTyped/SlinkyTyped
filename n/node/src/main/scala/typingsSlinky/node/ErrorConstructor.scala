package typingsSlinky.node

import typingsSlinky.node.NodeJS.CallSite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorConstructor extends StObject {
  
  /** Create .stack property on a target object */
  def captureStackTrace(targetObject: js.Object): Unit = js.native
  def captureStackTrace(targetObject: js.Object, constructorOpt: js.Function): Unit = js.native
  
  /**
    * Optional override for formatting stack traces
    *
    * @see https://github.com/v8/v8/wiki/Stack%20Trace%20API#customizing-stack-traces
    */
  var prepareStackTrace: js.UndefOr[js.Function2[/* err */ js.Error, /* stackTraces */ js.Array[CallSite], _]] = js.native
  
  var stackTraceLimit: Double = js.native
}
