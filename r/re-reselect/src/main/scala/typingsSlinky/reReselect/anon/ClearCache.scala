package typingsSlinky.reReselect.anon

import typingsSlinky.reReselect.mod.ICacheObject
import typingsSlinky.reReselect.mod.OutputParametricSelector
import typingsSlinky.reReselect.mod.ParametricKeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCache[S, P, R, C, D] extends js.Object {
  
  var cache: ICacheObject = js.native
  
  def clearCache(): Unit = js.native
  
  def getMatchingSelector(state: S, props: P, args: js.Any*): OutputParametricSelector[S, P, R, C, D] = js.native
  
  def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
  @JSName("keySelector")
  var keySelector_Original: ParametricKeySelector[S, P] = js.native
  
  def removeMatchingSelector(state: S, props: P, args: js.Any*): Unit = js.native
}
