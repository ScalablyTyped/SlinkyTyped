package typingsSlinky.reactScroll

import slinky.core.ReactComponentClass
import typingsSlinky.reactScroll.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll/modules/mixins/scroll-element", JSImport.Namespace)
@js.native
object scrollElementMod extends js.Object {
  def default[P](component: ReactComponentClass[P]): ReactComponentClass[ScrollElementProps[P]] = js.native
  type ScrollElementProps[P] = P with Id
}

