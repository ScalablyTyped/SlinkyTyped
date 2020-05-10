package typingsSlinky.babylonjs.dracoCompressionMod

import typingsSlinky.babylonjs.AnonFallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDracoCompressionConfiguration extends js.Object {
  /**
    * Configuration for the decoder.
    */
  var decoder: AnonFallbackUrl = js.native
}

object IDracoCompressionConfiguration {
  @scala.inline
  def apply(decoder: AnonFallbackUrl): IDracoCompressionConfiguration = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDracoCompressionConfiguration]
  }
  @scala.inline
  implicit class IDracoCompressionConfigurationOps[Self <: IDracoCompressionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoder(value: AnonFallbackUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

