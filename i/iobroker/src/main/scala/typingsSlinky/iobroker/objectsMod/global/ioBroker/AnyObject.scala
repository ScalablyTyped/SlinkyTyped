package typingsSlinky.iobroker.objectsMod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.channel
import typingsSlinky.iobroker.iobrokerStrings.chart
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

// Base type for Objects. Should not be used directly
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.StateObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.ChannelObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.DeviceObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.FolderObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.EnumObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.MetaObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.HostObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.AdapterObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.InstanceObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.UserObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.GroupObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.ScriptObject
  - typingsSlinky.iobroker.objectsMod.global.ioBroker.OtherObject
*/
trait AnyObject extends js.Object
object AnyObject {
  
  @scala.inline
  def DeviceObject(_id: String, common: DeviceCommon, native: Record[String, _], `type`: device): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def StateObject(_id: String, common: StateCommon, native: Record[String, _], `type`: state): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def AdapterObject(_id: String, common: AdapterCommon, native: Record[String, _], `type`: adapter): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def OtherObject(
    _id: String,
    common: OtherCommon,
    native: Record[String, _],
    `type`: adapter | config | info | chart
  ): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def HostObject(_id: String, common: HostCommon, native: HostNative, `type`: host): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def GroupObject(_id: String, common: GroupCommon, native: Record[String, _], `type`: group): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def InstanceObject(_id: String, common: InstanceCommon, native: Record[String, _], `type`: instance): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def ScriptObject(_id: String, common: ScriptCommon, native: Record[String, _], `type`: script): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def UserObject(_id: String, common: UserCommon, native: Record[String, _], `type`: user): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def EnumObject(_id: String, common: EnumCommon, native: Record[String, _], `type`: enum): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def ChannelObject(_id: String, common: ChannelCommon, native: Record[String, _], `type`: channel): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def FolderObject(_id: String, common: OtherCommon, native: Record[String, _], `type`: folder): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
  
  @scala.inline
  def MetaObject(_id: String, common: MetaCommon, native: Record[String, _], `type`: meta): AnyObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObject]
  }
}
