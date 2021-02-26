package typingsSlinky.rmcAlign.components

import typingsSlinky.rmcAlign.alignMod.IAlignProps
import typingsSlinky.rmcAlign.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcAlign {
  
  @scala.inline
  def apply(target: () => Unit): SharedBuilder_IAlignProps_1056058104[default] = {
    val __props = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    new SharedBuilder_IAlignProps_1056058104[default](js.Array(this.component, __props.asInstanceOf[IAlignProps]))
  }
  
  @JSImport("rmc-align", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IAlignProps): SharedBuilder_IAlignProps_1056058104[default] = new SharedBuilder_IAlignProps_1056058104[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
