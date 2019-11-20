package typingsSlinky.rcDashMenu

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/util", JSImport.Namespace)
@js.native
object libUtilMod extends js.Object {
  val menuAllProps: js.Array[String] = js.native
  def getKeyFromChildrenIndex(child: ReactElement, menuEventKey: Key, index: Double): Key = js.native
  def getMenuIdFromSubMenuEventKey(eventKey: String): Key = js.native
  def getWidth(elem: HTMLElement): Double = js.native
  def isMobileDevice(): Boolean = js.native
  def loopMenuItem(children: TagMod[Any], cb: js.Function2[/* node */ ReactElement, /* index */ Double, Unit]): Unit = js.native
  def loopMenuItemRecursively(children: TagMod[Any], keys: js.Array[String], ret: Anon_Find): Unit = js.native
  def noop(): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 756 */ js.Any,
    value: String
  ): Unit = js.native
  def setStyle(
    elem: HTMLElement,
    styleProperty: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 756 */ js.Any,
    value: Double
  ): Unit = js.native
}

