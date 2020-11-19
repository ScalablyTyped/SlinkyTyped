package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.channel
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.device
import typingsSlinky.iobroker.iobrokerStrings.enum
import typingsSlinky.iobroker.iobrokerStrings.folder
import typingsSlinky.iobroker.iobrokerStrings.group
import typingsSlinky.iobroker.iobrokerStrings.host
import typingsSlinky.iobroker.iobrokerStrings.info
import typingsSlinky.iobroker.iobrokerStrings.instance
import typingsSlinky.iobroker.iobrokerStrings.meta
import typingsSlinky.iobroker.iobrokerStrings.script
import typingsSlinky.iobroker.iobrokerStrings.state
import typingsSlinky.iobroker.iobrokerStrings.user
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.anon.SettableObjectWorkerState
  - typingsSlinky.iobroker.anon.SettableObjectWorkerChann
  - typingsSlinky.iobroker.anon.SettableObjectWorkerDevic
  - typingsSlinky.iobroker.anon.SettableObjectWorkerFolde
  - typingsSlinky.iobroker.anon.SettableObjectWorkerOther
*/
trait SettableObject extends js.Object
object SettableObject {
  
  @scala.inline
  def SettableObjectWorkerState(common: StateCommon, native: Record[String, ObjectField], `type`: state): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  
  @scala.inline
  def SettableObjectWorkerOther(
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user
  ): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  
  @scala.inline
  def SettableObjectWorkerChann(common: ChannelCommon, native: Record[String, ObjectField], `type`: channel): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  
  @scala.inline
  def SettableObjectWorkerDevic(common: DeviceCommon, native: Record[String, ObjectField], `type`: device): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  
  @scala.inline
  def SettableObjectWorkerFolde(common: OtherCommon, native: Record[String, ObjectField], `type`: folder): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
}
