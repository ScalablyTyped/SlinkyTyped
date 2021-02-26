package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.antd.spinMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Spin")
@js.native
class Spin protected () extends default {
  def this(props: SpinProps) = this()
}
object Spin {
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd", "Spin.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Spin.defaultProps.size")
    @js.native
    def size: small | large | typingsSlinky.antd.antdStrings.default = js.native
    @scala.inline
    def size_=(x: small | large | typingsSlinky.antd.antdStrings.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Spin.defaultProps.spinning")
    @js.native
    def spinning: Boolean = js.native
    @scala.inline
    def spinning_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spinning")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Spin.defaultProps.wrapperClassName")
    @js.native
    def wrapperClassName: String = js.native
    @scala.inline
    def wrapperClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("antd", "Spin.setDefaultIndicator")
  @js.native
  def setDefaultIndicator(indicator: ReactElement): Unit = js.native
}
