package typingsSlinky.reReselect.anon

import typingsSlinky.reReselect.mod.ICacheObject
import typingsSlinky.reReselect.mod.OutputSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache[S, R, C, D] extends js.Object {
  
  var cache: ICacheObject = js.native
  
  def clearCache(): Unit = js.native
  
  def getMatchingSelector(state: S, args: js.Any*): OutputSelector[S, R, C, D] = js.native
  
  def keySelector(state: S, args: js.Any*): js.Any = js.native
  @JSName("keySelector")
  var keySelector_Original: typingsSlinky.reReselect.mod.KeySelector[S] = js.native
  
  def removeMatchingSelector(state: S, args: js.Any*): Unit = js.native
}
