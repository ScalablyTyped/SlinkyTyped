package typingsSlinky.rcSelect.selectorMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcSelect.anon.Selected
import typingsSlinky.rcSelect.generatorMod.CustomTagProps
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorProps extends js.Object {
  
  var accessibilityIndex: Double = js.native
  
  var activeValue: String = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var choiceTransitionName: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * @private get real dom for trigger align.
    * This may be removed after React provides replacement of `findDOMNode`
    */
  var domRef: Ref[HTMLDivElement] = js.native
  
  var id: String = js.native
  
  var inputElement: ReactElement = js.native
  
  var maxTagCount: js.UndefOr[Double] = js.native
  
  var maxTagPlaceholder: js.UndefOr[
    ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])
  ] = js.native
  
  var maxTagTextLength: js.UndefOr[Double] = js.native
  
  var mode: Mode = js.native
  
  var multiple: Boolean = js.native
  
  var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.native
  
  /** `onSearch` returns go next step boolean to check if need do toggle open */
  def onSearch(searchText: String, fromTyping: Boolean, isCompositing: Boolean): Boolean = js.native
  
  def onSearchSubmit(searchText: String): Unit = js.native
  
  def onSelect(value: RawValueType, option: Selected): Unit = js.native
  
  def onToggleOpen(): Unit = js.native
  def onToggleOpen(open: Boolean): Unit = js.native
  
  var open: Boolean = js.native
  
  var placeholder: js.UndefOr[ReactElement] = js.native
  
  var prefixCls: String = js.native
  
  var removeIcon: js.UndefOr[RenderNode] = js.native
  
  var searchValue: String = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
  
  /** Check if `tokenSeparators` contains `\n` or `\r\n` */
  var tokenWithEnter: js.UndefOr[Boolean] = js.native
  
  /** Display in the Selector value, it's not same as `value` prop */
  var values: js.Array[LabelValueType] = js.native
}
