package typingsSlinky.reactTypist.components

import typingsSlinky.reactTypist.mod.Typist.BackSpaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Backspace {
  @JSImport("react-typist", "default.Backspace")
  @js.native
  object component extends js.Object
  
  def withProps(p: BackSpaceProps): SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace] = new SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Backspace.type): SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace] = new SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace](js.Array(this.component, js.Dictionary.empty))()
}

