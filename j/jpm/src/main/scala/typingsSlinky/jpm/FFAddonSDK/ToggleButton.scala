package typingsSlinky.jpm.FFAddonSDK

import typingsSlinky.jpm.Anon_BadgeBadgeColorChecked
import typingsSlinky.jpm.jpmStrings.change
import typingsSlinky.jpm.jpmStrings.click
import typingsSlinky.jpm.jpmStrings.tab
import typingsSlinky.jpm.jpmStrings.window
import typingsSlinky.jpm.sdkPanelMod.PanelPosition
import typingsSlinky.jpm.sdkUiToolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleButton
  extends ToggleButtonState
     with PanelPosition
     with ToolbarItem {
  def click(): Unit = js.native
  def destroy(): Unit = js.native
  @JSName("on")
  def on_change(event: change, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  @JSName("on")
  def on_click(event: click, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  @JSName("once")
  def once_change(event: change, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  @JSName("once")
  def once_click(event: click, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  def removeListener(event: String, handler: js.Function): Unit = js.native
  def state(target: BrowserWindow): ToggleButtonState = js.native
  def state(target: BrowserWindow, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  def state(target: Tab): ToggleButtonState = js.native
  def state(target: Tab, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  def state(target: ToggleButton): ToggleButtonState = js.native
  def state(target: ToggleButton, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: tab): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: tab, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: window): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: window, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
}

