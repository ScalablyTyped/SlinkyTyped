package typingsSlinky.rcMotion.components

import typingsSlinky.rcMotion.anon.CSSMotionPropsrefRefanyun
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSSMotion {
  
  @JSImport("rc-motion/es/CSSMotion", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CSSMotionPropsrefRefanyun): SharedBuilder_CSSMotionPropsrefRefanyun1753656749[js.Object] = new SharedBuilder_CSSMotionPropsrefRefanyun1753656749[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CSSMotion.type): SharedBuilder_CSSMotionPropsrefRefanyun1753656749[js.Object] = new SharedBuilder_CSSMotionPropsrefRefanyun1753656749[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
