package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.accelerate
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.accelerateDecelerate
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.decelerate
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.decelerateAccelerate
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.linear
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.overshoot
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeNavigation.anon.Factor
  - typingsSlinky.reactNativeNavigation.anon.Type
  - typingsSlinky.reactNativeNavigation.anon.`1`
  - typingsSlinky.reactNativeNavigation.anon.`2`
  - typingsSlinky.reactNativeNavigation.anon.`3`
  - typingsSlinky.reactNativeNavigation.anon.Tension
  - typingsSlinky.reactNativeNavigation.anon.AllowsOverdamping
*/
trait Interpolation extends js.Object
object Interpolation {
  
  @scala.inline
  def AllowsOverdamping(`type`: spring): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def `1`(`type`: decelerateAccelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def Type(`type`: decelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def Factor(`type`: accelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def `3`(`type`: linear): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def Tension(`type`: overshoot): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
  
  @scala.inline
  def `2`(`type`: accelerateDecelerate): Interpolation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
}
