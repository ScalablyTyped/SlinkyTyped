package typingsSlinky.rcRate.components

import typingsSlinky.rcRate.rateMod.RateProps
import typingsSlinky.rcRate.rateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rate {
  
  @JSImport("rc-rate/es/Rate", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RateProps): SharedBuilder_RateProps_1786259366[default] = new SharedBuilder_RateProps_1786259366[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Rate.type): SharedBuilder_RateProps_1786259366[default] = new SharedBuilder_RateProps_1786259366[default](js.Array(this.component, js.Dictionary.empty))()
}
