package typingsSlinky.reactToastify

import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import typingsSlinky.reactToastify.reactToastifyBooleans.`true`
import typingsSlinky.reactToastify.typesMod.Id
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-toastify/dist/utils/propValidator", JSImport.Namespace)
@js.native
object propValidatorMod extends js.Object {
  
  def canBeRendered[T](content: T): Boolean = js.native
  
  val canUseDom: Boolean = js.native
  
  def getAutoCloseDelay(): js.UndefOr[Double | `false`] = js.native
  def getAutoCloseDelay(toastAutoClose: js.UndefOr[scala.Nothing], containerAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  def getAutoCloseDelay(toastAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  def getAutoCloseDelay(toastAutoClose: Double, containerAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  @JSName("getAutoCloseDelay")
  def getAutoCloseDelay_false(toastAutoClose: js.UndefOr[scala.Nothing], containerAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  @JSName("getAutoCloseDelay")
  def getAutoCloseDelay_false(toastAutoClose: Double, containerAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  @JSName("getAutoCloseDelay")
  def getAutoCloseDelay_false(toastAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  @JSName("getAutoCloseDelay")
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  @JSName("getAutoCloseDelay")
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  
  def hasToastId(): js.UndefOr[String | Double | `true`] = js.native
  def hasToastId(toastId: Id): js.UndefOr[String | Double | `true`] = js.native
  
  def isBool(v: js.Any): /* is std.Boolean */ Boolean = js.native
  
  def isFn(v: js.Any): /* is std.Function */ Boolean = js.native
  
  def isNum(v: js.Any): /* is std.Number */ Boolean = js.native
  
  def isStr(v: js.Any): /* is std.String */ Boolean = js.native
  
  def objectValues[T](obj: Record[String, T]): js.Array[T] = js.native
  
  def parseClassName(v: js.Any): js.Any = js.native
}
