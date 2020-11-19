package typingsSlinky.jpm.pageModMod

import typingsSlinky.jpm.anon.AttachTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageMod extends js.Object {
  
  def destroy(): Unit = js.native
  
  var include: String | (js.Array[js.RegExp | String]) | js.RegExp = js.native
}
@JSImport("sdk/page-mod", "PageMod")
@js.native
object PageMod extends js.Object {
  
  def apply(options: AttachTo): PageMod = js.native
}
