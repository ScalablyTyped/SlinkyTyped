package typingsSlinky.reduceReducers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reduce-reducers", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[S](initialState: S, reducers: Reducer[S]*): Reducer[S] = js.native
  def apply[S](initialState: Null, reducers: Reducer[S]*): Reducer[S] = js.native
  def apply[S](reducers: Reducer[S]*): Reducer[S] = js.native
}
