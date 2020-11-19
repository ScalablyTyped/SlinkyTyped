package typingsSlinky.rcUtil

import typingsSlinky.rcUtil.anon.DefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-util/lib/hooks/useMergedState", JSImport.Namespace)
@js.native
object useMergedStateMod extends js.Object {
  
  def default[T, R](defaultStateValue: T): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
  def default[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, js.Function1[/* value */ T, Unit]] = js.native
}
