package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.bip174.interfacesMod.PsbtOutput
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtOutputExtendedScript
  extends PsbtOutput
     with PsbtOutputExtended {
  var script: Buffer = js.native
  var value: Double = js.native
}

object PsbtOutputExtendedScript {
  @scala.inline
  def apply(script: Buffer, value: Double): PsbtOutputExtendedScript = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputExtendedScript]
  }
  @scala.inline
  implicit class PsbtOutputExtendedScriptOps[Self <: PsbtOutputExtendedScript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScript(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

