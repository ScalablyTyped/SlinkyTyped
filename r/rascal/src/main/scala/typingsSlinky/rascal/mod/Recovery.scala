package typingsSlinky.rascal.mod

import typingsSlinky.rascal.rascalStrings.ack
import typingsSlinky.rascal.rascalStrings.forward
import typingsSlinky.rascal.rascalStrings.nack
import typingsSlinky.rascal.rascalStrings.republish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recovery extends StObject {
  
  var attempts: js.UndefOr[Double] = js.native
  
  var defer: js.UndefOr[Double] = js.native
  
  var immediateNack: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[PublicationConfig] = js.native
  
  var publication: js.UndefOr[String] = js.native
  
  var requeue: js.UndefOr[Boolean] = js.native
  
  var strategy: ack | nack | republish | forward = js.native
  
  var xDeathFix: js.UndefOr[Boolean] = js.native
}
object Recovery {
  
  @scala.inline
  def apply(strategy: ack | nack | republish | forward): Recovery = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recovery]
  }
  
  @scala.inline
  implicit class RecoveryMutableBuilder[Self <: Recovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setImmediateNack(value: Boolean): Self = StObject.set(x, "immediateNack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateNackUndefined: Self = StObject.set(x, "immediateNack", js.undefined)
    
    @scala.inline
    def setOptions(value: PublicationConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPublication(value: String): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
    
    @scala.inline
    def setRequeue(value: Boolean): Self = StObject.set(x, "requeue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequeueUndefined: Self = StObject.set(x, "requeue", js.undefined)
    
    @scala.inline
    def setStrategy(value: ack | nack | republish | forward): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDeathFix(value: Boolean): Self = StObject.set(x, "xDeathFix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDeathFixUndefined: Self = StObject.set(x, "xDeathFix", js.undefined)
  }
}
