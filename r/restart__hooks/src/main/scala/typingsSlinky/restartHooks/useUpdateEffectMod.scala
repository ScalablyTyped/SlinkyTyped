package typingsSlinky.restartHooks

import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useUpdateEffect", JSImport.Namespace)
@js.native
object useUpdateEffectMod extends js.Object {
  
  /**
    * Runs an effect only when the dependencies have changed, skipping the
    * initial "on mount" run. Caution, if the dependency list never changes,
    * the effect is **never run**
    *
    * ```ts
    *  const ref = useRef<HTMLInput>(null);
    *
    *  // focuses an element only if the focus changes, and not on mount
    *  useUpdateEffect(() => {
    *    const element = ref.current?.children[focusedIdx] as HTMLElement
    *
    *    element?.focus()
    *
    *  }, [focusedIndex])
    * ```
    * @param effect An effect to run on mount
    *
    * @category effects
    */
  def default(fn: EffectCallback, deps: DependencyList): Unit = js.native
}
