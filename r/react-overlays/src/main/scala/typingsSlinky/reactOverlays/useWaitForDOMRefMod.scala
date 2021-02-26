package typingsSlinky.reactOverlays

import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWaitForDOMRefMod {
  
  @JSImport("react-overlays/cjs/useWaitForDOMRef", JSImport.Default)
  @js.native
  def default[T /* <: HTMLElement */](): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", JSImport.Default)
  @js.native
  def default[T /* <: HTMLElement */](ref: js.UndefOr[DOMContainer[T]], onResolved: js.Function1[HTMLBodyElement | T, Unit]): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", JSImport.Default)
  @js.native
  def default[T /* <: HTMLElement */](ref: DOMContainer[T]): HTMLBodyElement | T | Null = js.native
  
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](ref: T): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](ref: js.Function0[T | ReactRef[T] | Null]): HTMLBodyElement | T | Null = js.native
  @JSImport("react-overlays/cjs/useWaitForDOMRef", "resolveContainerRef")
  @js.native
  def resolveContainerRef[T /* <: HTMLElement */](ref: ReactRef[T]): HTMLBodyElement | T | Null = js.native
  
  type DOMContainer[T /* <: HTMLElement */] = T | ReactRef[T] | Null | (js.Function0[T | ReactRef[T] | Null])
}
