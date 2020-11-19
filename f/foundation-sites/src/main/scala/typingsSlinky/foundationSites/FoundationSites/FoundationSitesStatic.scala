package typingsSlinky.foundationSites.FoundationSites

import typingsSlinky.foundationSites.anon.Instantiable
import typingsSlinky.foundationSites.anon.InstantiableAccordion
import typingsSlinky.foundationSites.anon.InstantiableAccordionMenu
import typingsSlinky.foundationSites.anon.InstantiableDrilldown
import typingsSlinky.foundationSites.anon.InstantiableDropdown
import typingsSlinky.foundationSites.anon.InstantiableDropdownMenu
import typingsSlinky.foundationSites.anon.InstantiableEqualizer
import typingsSlinky.foundationSites.anon.InstantiableInterchange
import typingsSlinky.foundationSites.anon.InstantiableMagellan
import typingsSlinky.foundationSites.anon.InstantiableOffCanvas
import typingsSlinky.foundationSites.anon.InstantiableOrbit
import typingsSlinky.foundationSites.anon.InstantiableReveal
import typingsSlinky.foundationSites.anon.InstantiableSlider
import typingsSlinky.foundationSites.anon.InstantiableSticky
import typingsSlinky.foundationSites.anon.InstantiableTabs
import typingsSlinky.foundationSites.anon.InstantiableToggler
import typingsSlinky.foundationSites.anon.InstantiableTooltip
import typingsSlinky.foundationSites.anon.Throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundationSitesStatic extends js.Object {
  
  var Abide: Instantiable = js.native
  
  var Accordion: InstantiableAccordion = js.native
  
  var AccordionMenu: InstantiableAccordionMenu = js.native
  
  // utils
  var Box: typingsSlinky.foundationSites.FoundationSites.Box = js.native
  
  var Drilldown: InstantiableDrilldown = js.native
  
  var Dropdown: InstantiableDropdown = js.native
  
  var DropdownMenu: InstantiableDropdownMenu = js.native
  
  var Equalizer: InstantiableEqualizer = js.native
  
  def GetYoDigits(length: Double): String = js.native
  def GetYoDigits(length: Double, namespace: String): String = js.native
  
  var Interchange: InstantiableInterchange = js.native
  
  var Keyboard: typingsSlinky.foundationSites.FoundationSites.Keyboard = js.native
  
  var Magellan: InstantiableMagellan = js.native
  
  var MediaQuery: typingsSlinky.foundationSites.FoundationSites.MediaQuery = js.native
  
  var Motion: typingsSlinky.foundationSites.FoundationSites.Motion = js.native
  
  var Move: typingsSlinky.foundationSites.FoundationSites.Move = js.native
  
  var Nest: typingsSlinky.foundationSites.FoundationSites.Nest = js.native
  
  var OffCanvas: InstantiableOffCanvas = js.native
  
  var Orbit: InstantiableOrbit = js.native
  
  var Reveal: InstantiableReveal = js.native
  
  var Slider: InstantiableSlider = js.native
  
  var Sticky: InstantiableSticky = js.native
  
  var Tabs: InstantiableTabs = js.native
  
  var Timer: typingsSlinky.foundationSites.FoundationSites.Timer = js.native
  
  var Toggler: InstantiableToggler = js.native
  
  var Tooltip: InstantiableTooltip = js.native
  
  var Touch: typingsSlinky.foundationSites.FoundationSites.Touch = js.native
  
  var Triggers: typingsSlinky.foundationSites.FoundationSites.Triggers = js.native
  
  def getFnName(fn: String): String = js.native
  
  def plugin(plugin: js.Object, name: String): Unit = js.native
  
  def reInit(plugins: js.Array[_]): Unit = js.native
  
  def reflow(elem: js.Object): Unit = js.native
  def reflow(elem: js.Object, plugins: String): Unit = js.native
  def reflow(elem: js.Object, plugins: js.Array[String]): Unit = js.native
  
  def registerPlugin(plugin: js.Object): Unit = js.native
  
  def rtl(): Boolean = js.native
  
  def transitionend(): String = js.native
  
  def unregisterPlugin(plugin: js.Object): Unit = js.native
  
  var util: Throttle = js.native
  
  var version: String = js.native
}
