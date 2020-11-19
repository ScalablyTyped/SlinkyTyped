package typingsSlinky.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useKeyboardMovementMod {
  
  type ItemRef[E /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.react.mod.MutableRefObject[E | scala.Null]
  
  type ItemRefList[E /* <: org.scalajs.dom.raw.HTMLElement */] = js.Array[typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRef[E]]
  
  type KeyboardMovementProviders[CE /* <: org.scalajs.dom.raw.HTMLElement */, IE /* <: org.scalajs.dom.raw.HTMLElement */] = js.Tuple2[
    /**
    * A list of mutable ref objects that must be applied to each focusable item
    * within the list. This list will automatically be generated based on the
    * number of items provided to the `useKeyboardMovement` hook
    */
  typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRefList[IE], 
    /**
    * The keydown event handler to apply to a "container" element that has custom
    * keyboard focus.
    */
  typingsSlinky.reactMdUtils.useKeyboardMovementMod.MovementHandler[CE]
  ]
  
  type MovementHandler[E /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.react.mod.KeyboardEventHandler[E]
}
