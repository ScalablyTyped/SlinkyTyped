package typingsSlinky.reactInlinesvg

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-inlinesvg/lib/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  @js.native
  class InlineSVGError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, data: js.Object) = this()
    var data: js.UndefOr[js.Object] = js.native
  }
  
  def canUseDOM(): Boolean = js.native
  def isSupportedEnvironment(): Boolean | Null = js.native
  def randomString(length: Double): String = js.native
  def supportsInlineSVG(): Boolean | Null = js.native
}

