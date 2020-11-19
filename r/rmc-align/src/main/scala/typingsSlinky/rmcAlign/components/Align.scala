package typingsSlinky.rmcAlign.components

import typingsSlinky.rmcAlign.alignMod.IAlignProps
import typingsSlinky.rmcAlign.alignMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Align {
  
  @JSImport("rmc-align/lib/Align", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IAlignProps): SharedBuilder_IAlignProps_1056058104[default] = new SharedBuilder_IAlignProps_1056058104[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(target: () => Unit): SharedBuilder_IAlignProps_1056058104[default] = {
    val __props = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    new SharedBuilder_IAlignProps_1056058104[default](js.Array(this.component, __props.asInstanceOf[IAlignProps]))
  }
}
