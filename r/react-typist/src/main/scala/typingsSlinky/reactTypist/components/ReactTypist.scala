package typingsSlinky.reactTypist.components

import typingsSlinky.reactTypist.mod.TypistProps
import typingsSlinky.reactTypist.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTypist {
  @JSImport("react-typist", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TypistProps): SharedBuilder_TypistProps1183841886[default] = new SharedBuilder_TypistProps1183841886[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactTypist.type): SharedBuilder_TypistProps1183841886[default] = new SharedBuilder_TypistProps1183841886[default](js.Array(this.component, js.Dictionary.empty))()
}

