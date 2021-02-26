package typingsSlinky.rcTextarea.components

import typingsSlinky.rcTextarea.mod.TextAreaProps
import typingsSlinky.rcTextarea.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTextarea {
  
  @JSImport("rc-textarea", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcTextarea.type): SharedBuilder_TextAreaProps_1237784874[default] = new SharedBuilder_TextAreaProps_1237784874[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextAreaProps): SharedBuilder_TextAreaProps_1237784874[default] = new SharedBuilder_TextAreaProps_1237784874[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
