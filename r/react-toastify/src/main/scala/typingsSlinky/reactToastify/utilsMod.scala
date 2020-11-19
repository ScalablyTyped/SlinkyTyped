package typingsSlinky.reactToastify

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactToastify.constantMod.DEFAULT
import typingsSlinky.reactToastify.cssTransitionMod.CSSTransitionProps
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import typingsSlinky.reactToastify.reactToastifyBooleans.`true`
import typingsSlinky.reactToastify.typesMod.Id
import typingsSlinky.reactToastify.typesMod.ToastPosition
import typingsSlinky.reactToastify.typesMod.ToastTransitionProps
import typingsSlinky.reactToastify.typesMod.TypeOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-toastify/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def canBeRendered[T](content: T): Boolean = js.native
  
  val canUseDom: Boolean = js.native
  
  def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = js.native
  
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    ReactElement
  ] = js.native
  
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
  
  def parseClassName(v: js.Any): String | Null = js.native
  
  @js.native
  object POSITION extends js.Object {
    
    var BOTTOM_CENTER: ToastPosition = js.native
    
    var BOTTOM_LEFT: ToastPosition = js.native
    
    var BOTTOM_RIGHT: ToastPosition = js.native
    
    var TOP_CENTER: ToastPosition = js.native
    
    var TOP_LEFT: ToastPosition = js.native
    
    var TOP_RIGHT: ToastPosition = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    
    var DARK: TypeOptions = js.native
    
    var DEFAULT: TypeOptions = js.native
    
    var ERROR: TypeOptions = js.native
    
    var INFO: TypeOptions = js.native
    
    var SUCCESS: TypeOptions = js.native
    
    var WARNING: TypeOptions = js.native
  }
}
