package typingsSlinky.reactTypist.components

import typingsSlinky.reactTypist.mod.Typist.BackSpaceProps
import typingsSlinky.reactTypist.mod.Typist.DelayProps
import typingsSlinky.reactTypist.mod.TypistProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typist {
  
  object Backspace {
    
    @JSImport("react-typist", "Typist.Backspace")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Backspace.type): SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.Typist.Backspace] = new SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.Typist.Backspace](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BackSpaceProps): SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.Typist.Backspace] = new SharedBuilder_BackSpaceProps_1527818222[typingsSlinky.reactTypist.mod.Typist.Backspace](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Delay {
    
    @scala.inline
    def apply(ms: Double): SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay] = {
      val __props = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
      new SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay](js.Array(this.component, __props.asInstanceOf[DelayProps]))
    }
    
    @JSImport("react-typist", "Typist.Delay")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: DelayProps): SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay] = new SharedBuilder_DelayProps_1968894352[typingsSlinky.reactTypist.mod.Typist.Delay](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-typist", "Typist")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Typist.type): SharedBuilder_TypistProps1183841886[typingsSlinky.reactTypist.mod.Typist] = new SharedBuilder_TypistProps1183841886[typingsSlinky.reactTypist.mod.Typist](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TypistProps): SharedBuilder_TypistProps1183841886[typingsSlinky.reactTypist.mod.Typist] = new SharedBuilder_TypistProps1183841886[typingsSlinky.reactTypist.mod.Typist](js.Array(this.component, p.asInstanceOf[js.Any]))
}
