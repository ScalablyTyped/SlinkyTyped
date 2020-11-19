package typingsSlinky.rcRate

import typingsSlinky.rcRate.anon.AllowClear
import typingsSlinky.rcRate.rateMod.RateProps
import typingsSlinky.rcRate.rateMod.RateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-rate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typingsSlinky.rcRate.rateMod.default {
    def this(props: RateProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AllowClear = js.native
    
    def getDerivedStateFromProps(nextProps: RateProps, state: RateState): RateState = js.native
  }
}
