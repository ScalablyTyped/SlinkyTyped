package typingsSlinky.phonegap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: Boolean = js.native
  var isVisible: Boolean = js.native
  var onhide: js.Function = js.native
  var onhiding: js.Function = js.native
  var onshow: js.Function = js.native
  var onshowing: js.Function = js.native
  def disableScrollingInShrinkView(disable: Boolean): Unit = js.native
  def hideFormAccessoryBar(hide: Boolean): Unit = js.native
  def shrinkView(shrink: Boolean): Unit = js.native
}

@JSGlobal("Keyboard")
@js.native
object Keyboard extends TopLevel[Keyboard]

