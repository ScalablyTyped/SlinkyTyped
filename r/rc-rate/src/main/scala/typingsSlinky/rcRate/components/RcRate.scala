package typingsSlinky.rcRate.components

import typingsSlinky.rcRate.mod.default
import typingsSlinky.rcRate.rateMod.RateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcRate {
  
  @JSImport("rc-rate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcRate.type): SharedBuilder_RateProps_1786259366[default] = new SharedBuilder_RateProps_1786259366[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RateProps): SharedBuilder_RateProps_1786259366[default] = new SharedBuilder_RateProps_1786259366[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
