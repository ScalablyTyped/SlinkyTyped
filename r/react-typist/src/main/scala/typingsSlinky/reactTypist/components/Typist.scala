package typingsSlinky.reactTypist.components

import typingsSlinky.reactTypist.mod.TypistProps
import typingsSlinky.reactTypist.mod.Typist_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typist {
  
  @JSImport("react-typist", "Typist")
  @js.native
  object component extends js.Object
  
  def withProps(p: TypistProps): SharedBuilder_TypistProps1183841886[Typist_] = new SharedBuilder_TypistProps1183841886[Typist_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Typist.type): SharedBuilder_TypistProps1183841886[Typist_] = new SharedBuilder_TypistProps1183841886[Typist_](js.Array(this.component, js.Dictionary.empty))()
}
