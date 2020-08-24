package typingsSlinky.progressbarJs.pathMod

import org.scalajs.dom.raw.Element
import typingsSlinky.progressbarJs.mod.AnimationSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface adds members from animation contract
@js.native
trait Path[SElement /* <: Element */] extends AnimationSupport {
  val path: js.UndefOr[SElement] = js.native
}

