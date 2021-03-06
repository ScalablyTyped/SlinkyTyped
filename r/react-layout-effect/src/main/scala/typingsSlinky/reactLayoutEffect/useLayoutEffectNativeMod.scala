package typingsSlinky.reactLayoutEffect

import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLayoutEffectNativeMod {
  
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
    */
  @JSImport("react-layout-effect/dist/esm/useLayoutEffect.native", "useLayoutEffect")
  @js.native
  def useLayoutEffect(effect: EffectCallback): Unit = js.native
  @JSImport("react-layout-effect/dist/esm/useLayoutEffect.native", "useLayoutEffect")
  @js.native
  def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
