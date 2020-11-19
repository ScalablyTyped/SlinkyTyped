package typingsSlinky.reactHotkeys.components

import typingsSlinky.reactHotkeys.mod.HotKeysOverrideProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObserveKeys {
  
  @JSImport("react-hotkeys", "ObserveKeys")
  @js.native
  object component extends js.Object
  
  def withProps(p: HotKeysOverrideProps): SharedBuilder_HotKeysOverrideProps229638314[typingsSlinky.reactHotkeys.mod.ObserveKeys] = new SharedBuilder_HotKeysOverrideProps229638314[typingsSlinky.reactHotkeys.mod.ObserveKeys](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ObserveKeys.type): SharedBuilder_HotKeysOverrideProps229638314[typingsSlinky.reactHotkeys.mod.ObserveKeys] = new SharedBuilder_HotKeysOverrideProps229638314[typingsSlinky.reactHotkeys.mod.ObserveKeys](js.Array(this.component, js.Dictionary.empty))()
}
