package typingsSlinky.reactMdUtils.useResizeObserverMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typingsSlinky.reactMdUtils.useResizeObserverV1Mod.UseResizeObserverV1Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/sizing/useResizeObserver", "useResizeObserver")
@js.native
object useResizeObserver extends js.Object {
  
  def apply[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = js.native
  def apply[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = js.native
  def apply[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = js.native
}
