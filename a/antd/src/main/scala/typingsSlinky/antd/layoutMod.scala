package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.layoutLayoutMod.BasicProps
import typingsSlinky.antd.siderMod.SiderProps
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  
  val default: LayoutType = js.native
  
  @js.native
  trait LayoutType extends FunctionComponent[BasicProps] {
    
    var Content: ReactComponentClass[BasicProps] = js.native
    
    var Footer: ReactComponentClass[BasicProps] = js.native
    
    var Header: ReactComponentClass[BasicProps] = js.native
    
    var Sider: ReactComponentClass[SiderProps] = js.native
  }
}
