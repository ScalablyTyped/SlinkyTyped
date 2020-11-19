package typingsSlinky.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait visitors[V]
  extends coreVisitors[V]
     with es2015Visitors[V]
     with flowVisitors[V]
     with jsxVisitors[V]
     with miscVisitors[V]
object visitors {
  
  @scala.inline
  def apply[V](): visitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[visitors[V]]
  }
}
