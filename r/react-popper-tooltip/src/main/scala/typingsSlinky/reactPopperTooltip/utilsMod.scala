package typingsSlinky.reactPopperTooltip

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Context
import typingsSlinky.reactPopperTooltip.typesMod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-popper-tooltip/dist/utils", "TooltipContext")
  @js.native
  val TooltipContext: Context[js.Object] = js.native
  
  @JSImport("react-popper-tooltip/dist/utils", "callAll")
  @js.native
  def callAll(fns: Fn*): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("react-popper-tooltip/dist/utils", "canUseDOM")
  @js.native
  def canUseDOM(): Boolean = js.native
  
  @JSImport("react-popper-tooltip/dist/utils", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("react-popper-tooltip/dist/utils", "setRef")
  @js.native
  def setRef(ref: Ref): Unit = js.native
  @JSImport("react-popper-tooltip/dist/utils", "setRef")
  @js.native
  def setRef(ref: Ref, node: HTMLElement): Unit = js.native
  
  type Fn = js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]]
}
