package typingsSlinky.jpm.pageModMod

import typingsSlinky.jpm.AnonAttachTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageMod extends js.Object {
  var include: String | (js.Array[js.RegExp | String]) | js.RegExp
  def destroy(): Unit
}

@JSImport("sdk/page-mod", "PageMod")
@js.native
object PageMod extends js.Object {
  def apply(options: AnonAttachTo): PageMod = js.native
}

