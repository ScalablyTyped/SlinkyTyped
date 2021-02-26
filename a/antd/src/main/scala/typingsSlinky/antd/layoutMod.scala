package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.layoutLayoutMod.BasicProps
import typingsSlinky.antd.siderMod.SiderProps
import typingsSlinky.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod extends Shortcut {
  
  @JSImport("antd/lib/layout", JSImport.Default)
  @js.native
  val default: LayoutType = js.native
  
  @js.native
  trait LayoutType extends FunctionComponent[BasicProps] {
    
    var Content: ReactComponentClass[BasicProps] = js.native
    
    var Footer: ReactComponentClass[BasicProps] = js.native
    
    var Header: ReactComponentClass[BasicProps] = js.native
    
    var Sider: ReactComponentClass[SiderProps] = js.native
  }
  
  type _To = LayoutType
  
  /* This means you don't have to write `default`, but can instead just say `layoutMod.foo` */
  override def _to: LayoutType = default
}
