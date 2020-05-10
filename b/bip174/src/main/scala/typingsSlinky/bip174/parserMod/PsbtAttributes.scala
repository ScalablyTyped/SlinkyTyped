package typingsSlinky.bip174.parserMod

import typingsSlinky.bip174.interfacesMod.PsbtGlobal
import typingsSlinky.bip174.interfacesMod.PsbtInput
import typingsSlinky.bip174.interfacesMod.PsbtOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtAttributes extends js.Object {
  var globalMap: PsbtGlobal = js.native
  var inputs: js.Array[PsbtInput] = js.native
  var outputs: js.Array[PsbtOutput] = js.native
}

object PsbtAttributes {
  @scala.inline
  def apply(globalMap: PsbtGlobal, inputs: js.Array[PsbtInput], outputs: js.Array[PsbtOutput]): PsbtAttributes = {
    val __obj = js.Dynamic.literal(globalMap = globalMap.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtAttributes]
  }
  @scala.inline
  implicit class PsbtAttributesOps[Self <: PsbtAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalMap(value: PsbtGlobal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[PsbtInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[PsbtOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

