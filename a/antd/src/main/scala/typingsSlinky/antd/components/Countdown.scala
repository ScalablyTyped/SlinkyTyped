package typingsSlinky.antd.components

import typingsSlinky.antd.countdownMod.CountdownProps
import typingsSlinky.antd.countdownMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Countdown {
  
  @JSImport("antd/lib/statistic/Countdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Countdown.type): SharedBuilder_CountdownProps1944798938[default] = new SharedBuilder_CountdownProps1944798938[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CountdownProps): SharedBuilder_CountdownProps1944798938[default] = new SharedBuilder_CountdownProps1944798938[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
