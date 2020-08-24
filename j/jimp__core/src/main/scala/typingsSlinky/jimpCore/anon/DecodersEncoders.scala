package typingsSlinky.jimpCore.anon

import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.jimpCore.pluginsMod.JimpPlugin
import typingsSlinky.jimpCore.pluginsMod.JimpType
import typingsSlinky.jimpCore.utilsMod.FunctionRet
import typingsSlinky.jimpCore.utilsMod.GetPluginFuncArrDecoders
import typingsSlinky.jimpCore.utilsMod.GetPluginFuncArrEncoders
import typingsSlinky.jimpCore.utilsMod.UnionToIntersection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodersEncoders[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] extends js.Object {
  var decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]] = js.native
  var encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]] = js.native
}

object DecodersEncoders {
  @scala.inline
  def apply[/* <: typingsSlinky.jimpCore.utilsMod.FunctionRet[
  typingsSlinky.jimpCore.pluginsMod.JimpPlugin[typingsSlinky.jimpCore.etcMod.Image] | typingsSlinky.jimpCore.pluginsMod.JimpType[typingsSlinky.jimpCore.etcMod.Image]] */ PluginFuncArr](
    decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]],
    encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]
  ): DecodersEncoders[PluginFuncArr] = {
    val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodersEncoders[PluginFuncArr]]
  }
  @scala.inline
  implicit class DecodersEncodersOps[Self <: DecodersEncoders[_], /* <: typingsSlinky.jimpCore.utilsMod.FunctionRet[
  typingsSlinky.jimpCore.pluginsMod.JimpPlugin[typingsSlinky.jimpCore.etcMod.Image] | typingsSlinky.jimpCore.pluginsMod.JimpType[typingsSlinky.jimpCore.etcMod.Image]] */ PluginFuncArr] (val x: Self with DecodersEncoders[PluginFuncArr]) extends AnyVal {
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
    def setDecoders(value: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]]): Self = this.set("decoders", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoders(value: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]): Self = this.set("encoders", value.asInstanceOf[js.Any])
  }
  
}

