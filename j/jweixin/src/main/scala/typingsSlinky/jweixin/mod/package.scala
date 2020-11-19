package typingsSlinky.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // 所有JS接口列表
  type jsApiList = js.Array[typingsSlinky.jweixin.mod.ApiMethod]
  
  type menuList = js.Array[
    typingsSlinky.jweixin.mod.menuBase | typingsSlinky.jweixin.mod.menuProtected | typingsSlinky.jweixin.mod.menuShare
  ]
}
