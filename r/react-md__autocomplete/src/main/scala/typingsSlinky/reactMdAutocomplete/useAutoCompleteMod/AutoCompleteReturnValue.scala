package typingsSlinky.reactMdAutocomplete.useAutoCompleteMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactMdAutocomplete.anon.RequiredTransitionHooks
import typingsSlinky.reactMdAutocomplete.typesMod.AutoCompleteData
import typingsSlinky.reactMdList.listMod.ListElement
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRefList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteReturnValue extends js.Object {
  var activeId: String = js.native
  var filteredData: js.Array[AutoCompleteData] = js.native
  var fixedStyle: js.UndefOr[CSSProperties] = js.native
  var handleBlur: FocusEventHandler[HTMLInputElement] = js.native
  var handleChange: ChangeEventHandler[HTMLInputElement] = js.native
  var handleClick: MouseEventHandler[HTMLInputElement] = js.native
  var handleFocus: FocusEventHandler[HTMLInputElement] = js.native
  var handleKeyDown: KeyboardEventHandler[HTMLInputElement] = js.native
  var itemRefs: ItemRefList[HTMLLIElement] = js.native
  var listboxRef: MutableRefObject[ListElement | Null] = js.native
  var `match`: String = js.native
  var transitionHooks: RequiredTransitionHooks = js.native
  var value: String = js.native
  var visible: Boolean = js.native
  def handleAutoComplete(index: Double): Unit = js.native
  def ref(): Unit = js.native
  def ref(instance: HTMLInputElement): Unit = js.native
}

