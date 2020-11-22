package typingsSlinky.rcVirtualList.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcVirtualList.anon.Align
  - typingsSlinky.rcVirtualList.anon.Key
*/
trait ScrollConfig extends js.Object
object ScrollConfig {
  
  @scala.inline
  def Align(index: Double): ScrollConfig = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollConfig]
  }
  
  @scala.inline
  def Key(key: typingsSlinky.react.mod.Key): ScrollConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollConfig]
  }
}
