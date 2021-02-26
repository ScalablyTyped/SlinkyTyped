package typingsSlinky.rpiGpio

import typingsSlinky.rpiGpio.mod.EDGE
import typingsSlinky.rpiGpio.mod.MODE
import typingsSlinky.rpiGpio.mod.PinDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpiGpioStrings {
  
  @js.native
  sealed trait both extends EDGE
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait falling extends EDGE
  @scala.inline
  def falling: falling = "falling".asInstanceOf[falling]
  
  @js.native
  sealed trait high extends PinDirection
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait in extends PinDirection
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait low extends PinDirection
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait mode_bcm extends MODE
  @scala.inline
  def mode_bcm: mode_bcm = "mode_bcm".asInstanceOf[mode_bcm]
  
  @js.native
  sealed trait mode_rpi extends MODE
  @scala.inline
  def mode_rpi: mode_rpi = "mode_rpi".asInstanceOf[mode_rpi]
  
  @js.native
  sealed trait none extends EDGE
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait out extends PinDirection
  @scala.inline
  def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait rising extends EDGE
  @scala.inline
  def rising: rising = "rising".asInstanceOf[rising]
}
