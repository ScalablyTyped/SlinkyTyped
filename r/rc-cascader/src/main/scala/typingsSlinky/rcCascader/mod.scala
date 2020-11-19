package typingsSlinky.rcCascader

import typingsSlinky.rcCascader.cascaderMod.CascaderProps
import typingsSlinky.rcCascader.cascaderMod.CascaderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-cascader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typingsSlinky.rcCascader.cascaderMod.default {
    def this(props: CascaderProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: CascaderProps = js.native
    
    def getDerivedStateFromProps(nextProps: CascaderProps, prevState: CascaderState): CascaderState = js.native
  }
}
