package typingsSlinky.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useSyncState", JSImport.Namespace)
@js.native
object useSyncStateMod extends js.Object {
  
  def default[T](): js.Tuple5[
    T, 
    js.Function0[T], 
    js.Function1[/* state */ T, Unit], 
    js.Function1[/* callback */ js.Function0[Unit], Unit], 
    js.Function0[Unit]
  ] = js.native
  def default[T](initialState: T): js.Tuple5[
    T, 
    js.Function0[T], 
    js.Function1[/* state */ T, Unit], 
    js.Function1[/* callback */ js.Function0[Unit], Unit], 
    js.Function0[Unit]
  ] = js.native
  def default[T](initialState: js.Function0[T]): js.Tuple5[
    T, 
    js.Function0[T], 
    js.Function1[/* state */ T, Unit], 
    js.Function1[/* callback */ js.Function0[Unit], Unit], 
    js.Function0[Unit]
  ] = js.native
}
