package typingsSlinky.reactTypist.components

import typingsSlinky.reactTypist.mod.Typist.BackSpaceProps
import typingsSlinky.reactTypist.mod.Typist.DelayProps
import typingsSlinky.reactTypist.mod.TypistProps
import typingsSlinky.reactTypist.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypist {
  
  @JSImport("react-typist", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TypistProps): SharedBuilder_TypistProps1183841886[default] = new SharedBuilder_TypistProps1183841886[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactTypist.type): SharedBuilder_TypistProps1183841886[default] = new SharedBuilder_TypistProps1183841886[default](js.Array(this.component, js.Dictionary.empty))()
  
  object Backspace {
    
    @JSImport("react-typist", "default.Backspace")
    @js.native
    object component extends js.Object
    
    def withProps(p: BackSpaceProps): SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace] = new SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Backspace.type): SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace] = new SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.default.Backspace](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Delay {
    
    @JSImport("react-typist", "default.Delay")
    @js.native
    object component extends js.Object
    
    def withProps(p: DelayProps): SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.default.Delay] = new SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.default.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(ms: Double): SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.default.Delay] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.default.Delay](js.Array(this.component, __props.asInstanceOf[DelayProps]))
    }
  }
}
