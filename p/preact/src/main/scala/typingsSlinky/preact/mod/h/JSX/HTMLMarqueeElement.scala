package typingsSlinky.preact.mod.h.JSX

import typingsSlinky.preact.preactStrings.alternate
import typingsSlinky.preact.preactStrings.down
import typingsSlinky.preact.preactStrings.left
import typingsSlinky.preact.preactStrings.right
import typingsSlinky.preact.preactStrings.scroll
import typingsSlinky.preact.preactStrings.slide
import typingsSlinky.preact.preactStrings.up
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLMarqueeElement extends HTMLElement {
  var behavior: js.UndefOr[scroll | slide | alternate] = js.native
  var bgColor: js.UndefOr[String] = js.native
  var direction: js.UndefOr[left | right | up | down] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hspace: js.UndefOr[Double | String] = js.native
  var loop: js.UndefOr[Double | String] = js.native
  var scrollAmount: js.UndefOr[Double | String] = js.native
  var scrollDelay: js.UndefOr[Double | String] = js.native
  var trueSpeed: js.UndefOr[Boolean] = js.native
  var vspace: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

