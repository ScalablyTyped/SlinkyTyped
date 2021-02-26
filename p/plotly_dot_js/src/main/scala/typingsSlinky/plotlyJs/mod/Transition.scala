package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.`back-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`back-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`back-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bounce-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bounce-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bounce-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`circle-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`circle-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`circle-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`cubic-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`cubic-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`cubic-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`elastic-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`elastic-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`elastic-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`exp-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`exp-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`exp-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`layout first`
import typingsSlinky.plotlyJs.plotlyJsStrings.`linear-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`linear-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`linear-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`quad-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`quad-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`quad-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`sin-in-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`sin-in`
import typingsSlinky.plotlyJs.plotlyJsStrings.`sin-out`
import typingsSlinky.plotlyJs.plotlyJsStrings.`traces first`
import typingsSlinky.plotlyJs.plotlyJsStrings.back
import typingsSlinky.plotlyJs.plotlyJsStrings.bounce
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.cubic
import typingsSlinky.plotlyJs.plotlyJsStrings.elastic
import typingsSlinky.plotlyJs.plotlyJsStrings.exp
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.quad
import typingsSlinky.plotlyJs.plotlyJsStrings.sin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transition extends StObject {
  
  /**
    * Sets the duration of the slider transition
    */
  var duration: Double = js.native
  
  /**
    * Sets the easing function of the slider transition
    */
  var easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out` = js.native
  
  /**
    * Determines whether the figure's layout or traces smoothly transitions during updates that make both traces
    * and layout change. Default is "layout first".
    */
  var ordering: js.UndefOr[(`layout first`) | (`traces first`)] = js.native
}
object Transition {
  
  @scala.inline
  def apply(
    duration: Double,
    easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
  ): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(
      value: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
    ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering(value: (`layout first`) | (`traces first`)): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
  }
}
