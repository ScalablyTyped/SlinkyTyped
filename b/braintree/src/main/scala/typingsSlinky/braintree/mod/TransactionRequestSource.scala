package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionRequestSource extends StObject
@JSImport("braintree", "TransactionRequestSource")
@js.native
object TransactionRequestSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionRequestSource with String] = js.native
  
  @js.native
  sealed trait moto extends TransactionRequestSource
  /* "moto" */ val moto: typingsSlinky.braintree.mod.TransactionRequestSource.moto with String = js.native
  
  @js.native
  sealed trait recurring extends TransactionRequestSource
  /* "recurring" */ val recurring: typingsSlinky.braintree.mod.TransactionRequestSource.recurring with String = js.native
  
  @js.native
  sealed trait recurring_first extends TransactionRequestSource
  /* "recurring_first" */ val recurring_first: typingsSlinky.braintree.mod.TransactionRequestSource.recurring_first with String = js.native
  
  @js.native
  sealed trait unscheduled extends TransactionRequestSource
  /* "unscheduled" */ val unscheduled: typingsSlinky.braintree.mod.TransactionRequestSource.unscheduled with String = js.native
}
