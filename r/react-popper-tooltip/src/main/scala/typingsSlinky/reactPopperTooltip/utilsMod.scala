package typingsSlinky.reactPopperTooltip

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactPopperTooltip.typesMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-popper-tooltip/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  val TooltipContext: Context[js.Object] = js.native
  
  def callAll(fns: Fn*): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  def canUseDOM(): Boolean = js.native
  
  def noop(): Unit = js.native
  
  def setRef(ref: Ref): Unit = js.native
  def setRef(ref: Ref, node: HTMLElement): Unit = js.native
  
  type Fn = js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]]
}
