package typingsSlinky.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useKeyboardSearchMod {
  type ReturnValue[E /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.react.mod.KeyboardEventHandler[E]
  type SearchChangeEvent[D, E /* <: org.scalajs.dom.raw.HTMLElement */] = js.Function1[
    /* data */ typingsSlinky.reactMdUtils.useKeyboardSearchMod.SearchData[D, E], 
    scala.Unit
  ]
}
