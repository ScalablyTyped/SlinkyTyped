package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TonalColorsOutput extends js.Object {
  
  var ambient: js.typedarray.Float32Array = js.native
  
  var spot: js.typedarray.Float32Array = js.native
}
object TonalColorsOutput {
  
  @scala.inline
  def apply(ambient: js.typedarray.Float32Array, spot: js.typedarray.Float32Array): TonalColorsOutput = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TonalColorsOutput]
  }
  
  @scala.inline
  implicit class TonalColorsOutputOps[Self <: TonalColorsOutput] (val x: Self) extends AnyVal {
    
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
    def setAmbient(value: js.typedarray.Float32Array): Self = this.set("ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpot(value: js.typedarray.Float32Array): Self = this.set("spot", value.asInstanceOf[js.Any])
  }
}
