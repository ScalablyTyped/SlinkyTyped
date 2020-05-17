package typingsSlinky.reactDom.experimentalMod.reactDomAugmentingMod

import org.scalajs.dom.raw.Comment
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "unstable_scheduleHydration")
@js.native
object unstableScheduleHydration extends js.Object {
  // enableSelectiveHydration feature
  /**
    * @see https://github.com/facebook/react/commit/3a2b5f148d450c69aab67f055fc441d294c23518
    */
  def apply(target: Element | Document | DocumentFragment | Comment): Unit = js.native
}

