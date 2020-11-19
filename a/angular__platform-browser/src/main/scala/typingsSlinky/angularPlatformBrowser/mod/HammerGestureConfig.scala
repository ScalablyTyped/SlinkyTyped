package typingsSlinky.angularPlatformBrowser.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularPlatformBrowser.anon.CssProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "HammerGestureConfig")
@js.native
class HammerGestureConfig () extends js.Object {
  
  /**
    * Creates a [HammerJS Manager](http://hammerjs.github.io/api/#hammer.manager)
    * and attaches it to a given HTML element.
    * @param element The element that will recognize gestures.
    * @returns A HammerJS event-manager object.
    */
  def buildHammer(element: HTMLElement): HammerInstance = js.native
  
  /**
    * A set of supported event names for gestures to be used in Angular.
    * Angular supports all built-in recognizers, as listed in
    * [HammerJS documentation](http://hammerjs.github.io/).
    */
  var events: js.Array[String] = js.native
  
  /**
    * Properties whose default values can be overridden for a given event.
    * Different sets of properties apply to different events.
    * For information about which properties are supported for which events,
    * and their allowed and default values, see
    * [HammerJS documentation](http://hammerjs.github.io/).
    */
  var options: js.UndefOr[CssProps] = js.native
  
  /**
    * Maps gesture event names to a set of configuration options
    * that specify overrides to the default values for specific properties.
    *
    * The key is a supported event name to be configured,
    * and the options object contains a set of properties, with override values
    * to be applied to the named recognizer event.
    * For example, to disable recognition of the rotate event, specify
    *  `{"rotate": {"enable": false}}`.
    *
    * Properties that are not present take the HammerJS default values.
    * For information about which properties are supported for which events,
    * and their allowed and default values, see
    * [HammerJS documentation](http://hammerjs.github.io/).
    *
    */
  var overrides: StringDictionary[js.Object] = js.native
}
