package typingsSlinky.rcMentions.mentionsMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mentions
  extends Component[MentionsProps, MentionsState, js.Any] {
  
  def blur(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMentions(): Unit = js.native
  
  def focus(): Unit = js.native
  
  var focusId: js.UndefOr[Double] = js.native
  
  def getOptions(): js.Array[OptionProps] = js.native
  def getOptions(measureText: String): js.Array[OptionProps] = js.native
  
  var measure: js.UndefOr[HTMLDivElement] = js.native
  
  def onBlur(): Unit = js.native
  def onBlur(event: SyntheticFocusEvent[HTMLTextAreaElement]): Unit = js.native
  
  var onChange: ChangeEventHandler[HTMLTextAreaElement] = js.native
  
  def onDropdownBlur(): Unit = js.native
  
  def onDropdownFocus(): Unit = js.native
  
  def onFocus(): Unit = js.native
  def onFocus(event: SyntheticFocusEvent[HTMLTextAreaElement]): Unit = js.native
  
  var onInputBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  
  var onInputFocus: FocusEventHandler[HTMLTextAreaElement] = js.native
  
  var onKeyDown: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  
  /**
    * When to start measure:
    * 1. When user press `prefix`
    * 2. When measureText !== prevMeasureText
    *  - If measure hit
    *  - If measuring
    *
    * When to stop measure:
    * 1. Selection is out of range
    * 2. Contains `space`
    * 3. ESC or select one
    */
  var onKeyUp: KeyboardEventHandler[HTMLTextAreaElement] = js.native
  
  def selectOption(option: OptionProps): Unit = js.native
  
  def setActiveIndex(activeIndex: Double): Unit = js.native
  
  def setMeasureRef(element: HTMLDivElement): Unit = js.native
  
  def setTextAreaRef(element: typingsSlinky.rcTextarea.mod.default): Unit = js.native
  
  def startMeasure(measureText: String, measurePrefix: String, measureLocation: Double): Unit = js.native
  
  def stopMeasure(): Unit = js.native
  def stopMeasure(callback: js.Function0[Unit]): Unit = js.native
  
  var textarea: js.UndefOr[HTMLTextAreaElement] = js.native
  
  def triggerChange(value: String): Unit = js.native
}
