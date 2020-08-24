package typingsSlinky.reactUid.components

import typingsSlinky.reactUid.controlMod.WithPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UIDFork {
  @JSImport("react-uid", "UIDFork")
  @js.native
  object component extends js.Object
  
  def withProps(p: WithPrefix): SharedBuilder_WithPrefix_1053596693 = new SharedBuilder_WithPrefix_1053596693(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: UIDFork.type): SharedBuilder_WithPrefix_1053596693 = new SharedBuilder_WithPrefix_1053596693(js.Array(this.component, js.Dictionary.empty))()
}

