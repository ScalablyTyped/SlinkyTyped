package typingsSlinky.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useCloseOnOutsideClickMod {
  type Contains = js.Function2[
    /* container */ typingsSlinky.reactMdUtils.containsElementMod.CheckableThing, 
    /* child */ typingsSlinky.reactMdUtils.containsElementMod.CheckableThing, 
    scala.Boolean
  ]
  type OnOutsideClick[E /* <: org.scalajs.dom.raw.HTMLElement */] = js.Function3[
    /* element */ E | scala.Null, 
    /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null, 
    /* contains */ typingsSlinky.reactMdUtils.useCloseOnOutsideClickMod.Contains, 
    scala.Unit
  ]
}
