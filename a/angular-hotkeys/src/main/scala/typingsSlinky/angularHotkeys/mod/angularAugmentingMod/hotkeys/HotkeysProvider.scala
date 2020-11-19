package typingsSlinky.angularHotkeys.mod.angularAugmentingMod.hotkeys

import org.scalajs.dom.raw.Event
import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotkeysProvider extends js.Object {
  
  /**
    * Creates a new Hotkey and creates the Mousetrap binding.
    */
  def add(
    combo: String | js.Array[String],
    description: js.UndefOr[String],
    callback: js.UndefOr[js.Function2[/* event */ Event, /* hotkey */ Hotkey, Unit]],
    action: js.UndefOr[String],
    allowIn: js.UndefOr[js.Array[String]],
    persistent: js.UndefOr[Boolean]
  ): Hotkey = js.native
  /**
    * Creates a new Hotkey and creates the Mousetrap binding.
    */
  def add(hotkeyObj: Hotkey): Hotkey = js.native
  
  /**
    * Binds the hotkey to a particular scope.
    * Useful if the scope is destroyed, we can automatically destroy the hotkey binding.
    * @param scope The scope to bind to
    */
  def bindTo(scope: IScope): HotkeysProviderChained = js.native
  
  /**
    * Configurable setting for the cheat sheet description.
    * @default 'Show / hide this help menu'
    */
  var cheatSheetDescription: String = js.native
  
  /**
    * Configurable setting for the cheat sheet hotkey.
    * @default '?'
    */
  var cheatSheetHotkey: String = js.native
  
  /**
    * Removes and unbinds a hotkey
    * @param combo The keyboard combo (shortcut) or the HotKey object
    */
  def del(combo: String): Unit = js.native
  def del(combo: js.Array[String]): Unit = js.native
  def del(combo: Hotkey): Unit = js.native
  
  /**
    * Returns the Hotkey object
    * @param combo The keyboard combo (shortcut)
    */
  def get(combo: String): Hotkey = js.native
  def get(combo: js.Array[String]): Hotkey = js.native
  
  /**
    * Configurable setting to disable the cheatsheet entirely.
    * @default true
    */
  var includeCheatSheet: Boolean = js.native
  
  /**
    * Purges all non-persistent hotkeys (such as those defined in routes)
    *
    * Without this, the same hotkey would get recreated everytime
    * the route is accessed.
    */
  def purgeHotkeys(): Unit = js.native
  
  /**
    * Cheat sheet template in the event you want to totally customize it.
    */
  var template: String = js.native
  
  /**
    * Configurable settings for the cheat sheet footer in HTML.
    * @default null
    */
  var templateFooter: String | Null = js.native
  
  /**
    * Configurable settings for the cheat sheet header in HTML.
    * This overrides the normal title if specified.
    * @default null
    */
  var templateHeader: String | Null = js.native
  
  /**
    * Configurable setting for the cheat sheet title
    * @default 'Keyboard Shortcuts'
    */
  var templateTitle: String = js.native
  
  /**
    * Toggles the help menu element's visiblity
    */
  def toggleCheatSheet(): Unit = js.native
  
  /**
    * Configurable setting to disable ngRoute hooks.
    */
  var useNgRoute: Boolean = js.native
}
