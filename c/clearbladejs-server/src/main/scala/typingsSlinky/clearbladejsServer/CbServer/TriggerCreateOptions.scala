package typingsSlinky.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerCreateOptions extends js.Object {
  var def_module: TriggerModule = js.native
  var def_name: String = js.native
  var key_value_pairs: js.Array[KeyValuePair] = js.native
  var name: String = js.native
  var service_name: String = js.native
  var system_key: String = js.native
}

object TriggerCreateOptions {
  @scala.inline
  def apply(
    def_module: TriggerModule,
    def_name: String,
    key_value_pairs: js.Array[KeyValuePair],
    name: String,
    service_name: String,
    system_key: String
  ): TriggerCreateOptions = {
    val __obj = js.Dynamic.literal(def_module = def_module.asInstanceOf[js.Any], def_name = def_name.asInstanceOf[js.Any], key_value_pairs = key_value_pairs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service_name = service_name.asInstanceOf[js.Any], system_key = system_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerCreateOptions]
  }
  @scala.inline
  implicit class TriggerCreateOptionsOps[Self <: TriggerCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDef_module(value: TriggerModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def_module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDef_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("def_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey_value_pairs(value: js.Array[KeyValuePair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_value_pairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

