package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityStatus extends StObject
@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityStatus")
@js.native
object EntityStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityStatus with String] = js.native
  
  @js.native
  sealed trait Active extends EntityStatus
  /* "Active" */ val Active: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Active with String = js.native
  
  @js.native
  sealed trait Creating extends EntityStatus
  /* "Creating" */ val Creating: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Creating with String = js.native
  
  @js.native
  sealed trait Deleting extends EntityStatus
  /* "Deleting" */ val Deleting: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Deleting with String = js.native
  
  @js.native
  sealed trait Disabled extends EntityStatus
  /* "Disabled" */ val Disabled: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Disabled with String = js.native
  
  @js.native
  sealed trait ReceiveDisabled extends EntityStatus
  /* "ReceiveDisabled" */ val ReceiveDisabled: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.ReceiveDisabled with String = js.native
  
  @js.native
  sealed trait Renaming extends EntityStatus
  /* "Renaming" */ val Renaming: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Renaming with String = js.native
  
  @js.native
  sealed trait Restoring extends EntityStatus
  /* "Restoring" */ val Restoring: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Restoring with String = js.native
  
  @js.native
  sealed trait SendDisabled extends EntityStatus
  /* "SendDisabled" */ val SendDisabled: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.SendDisabled with String = js.native
  
  @js.native
  sealed trait Unknown extends EntityStatus
  /* "Unknown" */ val Unknown: typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.EntityStatus.Unknown with String = js.native
}
