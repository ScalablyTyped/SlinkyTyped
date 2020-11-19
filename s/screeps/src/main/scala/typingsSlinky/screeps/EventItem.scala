package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.anon.Data
  - typingsSlinky.screeps.anon.Event
  - typingsSlinky.screeps.anon.ObjectId
  - typingsSlinky.screeps.anon.DataEvent
  - typingsSlinky.screeps.anon.EventObjectId
  - typingsSlinky.screeps.anon.DataEventObjectId
  - typingsSlinky.screeps.anon.EventEVENTREPAIR
  - typingsSlinky.screeps.anon.EventEVENTRESERVECONTROLLER
  - typingsSlinky.screeps.anon.EventEVENTUPGRADECONTROLLER
  - typingsSlinky.screeps.anon.EventEVENTEXIT
  - typingsSlinky.screeps.anon.EventEVENTPOWER
  - typingsSlinky.screeps.anon.EventEVENTTRANSFER
*/
trait EventItem extends js.Object
object EventItem {
  
  @scala.inline
  def ObjectId(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any,
    event: EVENT_ATTACK_CONTROLLER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventEVENTTRANSFER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any,
    event: EVENT_TRANSFER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventEVENTPOWER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any,
    event: EVENT_POWER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def DataEventObjectId(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HEAL] */ js.Any,
    event: EVENT_HEAL,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventEVENTEXIT(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any,
    event: EVENT_EXIT,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def DataEvent(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any,
    event: EVENT_BUILD,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventEVENTUPGRADECONTROLLER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_UPGRADE_CONTROLLER] */ js.Any,
    event: EVENT_UPGRADE_CONTROLLER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def Event(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any,
    event: EVENT_OBJECT_DESTROYED,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def Data(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK] */ js.Any,
    event: EVENT_ATTACK,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventObjectId(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HARVEST] */ js.Any,
    event: EVENT_HARVEST,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventEVENTREPAIR(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_REPAIR] */ js.Any,
    event: EVENT_REPAIR,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  def EventEVENTRESERVECONTROLLER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any,
    event: EVENT_RESERVE_CONTROLLER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
}
