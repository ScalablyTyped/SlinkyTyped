package typingsSlinky.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait bindingMode extends StObject
@JSImport("aurelia-binding", "bindingMode")
@js.native
object bindingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[bindingMode with Double] = js.native
  
  /**
    * Updates the binding source (source) when the binding target (target) property changes.
    * This type of binding is appropriate if the element being bound (target)
    * is implicitly write-only - serves only as an intput.
    */
  @js.native
  sealed trait fromView extends bindingMode
  /* 3 */ val fromView: typingsSlinky.aureliaBinding.mod.bindingMode.fromView with Double = js.native
  
  /**
    * Updates the binding target once. This is essentially a simpler form of to-view binding
    * that provides better performance in cases where the source value does not change.
    */
  @js.native
  sealed trait oneTime extends bindingMode
  /* 0 */ val oneTime: typingsSlinky.aureliaBinding.mod.bindingMode.oneTime with Double = js.native
  
  /**
    * Updates the binding target (target) property when the binding source (source) changes.
    * This type of binding is appropriate if the element being bound (target)
    * is implicitly read-only - serves only as an output.
    * If there is no need to monitor the changes of the target property, using the one-way
    * binding mode avoids the overhead of the two-way binding mode.
    * @deprecated Use `toView` instead.
    */
  @js.native
  sealed trait oneWay extends bindingMode
  /* 1 */ val oneWay: typingsSlinky.aureliaBinding.mod.bindingMode.oneWay with Double = js.native
  
  /**
    * Updates the binding target (target) property when the binding source (source) changes.
    * This type of binding is appropriate if the element being bound (target)
    * is implicitly read-only - serves only as an output.
    * If there is no need to monitor the changes of the target property, using the to-view
    * binding mode avoids the overhead of the two-way binding mode.
    */
  @js.native
  sealed trait toView extends bindingMode
  /* 1 */ val toView: typingsSlinky.aureliaBinding.mod.bindingMode.toView with Double = js.native
  
  /**
    * Causes changes to either the source property or the target property to automatically update
    * the other. This type of binding is appropriate for editable forms or other fully-interactive
    * UI scenarios.
    */
  @js.native
  sealed trait twoWay extends bindingMode
  /* 2 */ val twoWay: typingsSlinky.aureliaBinding.mod.bindingMode.twoWay with Double = js.native
}
