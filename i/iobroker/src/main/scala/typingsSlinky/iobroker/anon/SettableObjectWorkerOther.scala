package typingsSlinky.iobroker.anon

import typingsSlinky.iobroker.iobrokerStrings.adapter
import typingsSlinky.iobroker.iobrokerStrings.config
import typingsSlinky.iobroker.iobrokerStrings.enum
import typingsSlinky.iobroker.iobrokerStrings.group
import typingsSlinky.iobroker.iobrokerStrings.host
import typingsSlinky.iobroker.iobrokerStrings.info
import typingsSlinky.iobroker.iobrokerStrings.instance
import typingsSlinky.iobroker.iobrokerStrings.meta
import typingsSlinky.iobroker.iobrokerStrings.script
import typingsSlinky.iobroker.iobrokerStrings.user
import typingsSlinky.iobroker.mod.global.ioBroker.ObjectACL
import typingsSlinky.iobroker.mod.global.ioBroker.ObjectField
import typingsSlinky.iobroker.mod.global.ioBroker.OtherCommon
import typingsSlinky.iobroker.mod.global.ioBroker.SettableObject
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined iobroker.iobroker.<global>.ioBroker.SettableObjectWorker<iobroker.iobroker.<global>.ioBroker.OtherObject> */
@js.native
trait SettableObjectWorkerOther extends SettableObject {
  
  var _id: js.UndefOr[String] = js.native
  
  var acl: js.UndefOr[ObjectACL] = js.native
  
  var common: OtherCommon = js.native
  
  var encryptedNative: js.UndefOr[js.Array[String]] = js.native
  
  var enums: js.UndefOr[Record[String, String]] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var native: Record[String, ObjectField] = js.native
  
  var protectedNative: js.UndefOr[js.Array[String]] = js.native
  
  var ts: js.UndefOr[Double] = js.native
  
  var `type`: adapter | config | enum | group | host | info | instance | meta | script | user = js.native
}
object SettableObjectWorkerOther {
  
  @scala.inline
  def apply(
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user
  ): SettableObjectWorkerOther = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObjectWorkerOther]
  }
  
  @scala.inline
  implicit class SettableObjectWorkerOtherOps[Self <: SettableObjectWorkerOther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommon(value: OtherCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Record[String, ObjectField]): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: adapter | config | enum | group | host | info | instance | meta | script | user): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    
    @scala.inline
    def setAcl(value: ObjectACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setEncryptedNativeVarargs(value: String*): Self = this.set("encryptedNative", js.Array(value :_*))
    
    @scala.inline
    def setEncryptedNative(value: js.Array[String]): Self = this.set("encryptedNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedNative: Self = this.set("encryptedNative", js.undefined)
    
    @scala.inline
    def setEnums(value: Record[String, String]): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setProtectedNativeVarargs(value: String*): Self = this.set("protectedNative", js.Array(value :_*))
    
    @scala.inline
    def setProtectedNative(value: js.Array[String]): Self = this.set("protectedNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedNative: Self = this.set("protectedNative", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
  }
}
