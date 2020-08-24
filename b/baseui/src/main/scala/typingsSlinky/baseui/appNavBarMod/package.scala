package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appNavBarMod {
  type ItemT = js.Any
  type mapItemToNode = js.Function1[
    /* item */ typingsSlinky.baseui.appNavBarMod.ItemT, 
    slinky.core.facade.ReactElement
  ]
  type mapItemToString = js.Function1[/* item */ typingsSlinky.baseui.appNavBarMod.ItemT, java.lang.String]
}
