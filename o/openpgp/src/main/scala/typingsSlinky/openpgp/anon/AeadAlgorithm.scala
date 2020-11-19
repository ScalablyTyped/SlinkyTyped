package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AeadAlgorithm extends js.Object {
  
  var aeadAlgorithm: String = js.native
  
  var algorithm: String = js.native
  
  var data: js.typedarray.Uint8Array = js.native
}
object AeadAlgorithm {
  
  @scala.inline
  def apply(aeadAlgorithm: String, algorithm: String, data: js.typedarray.Uint8Array): AeadAlgorithm = {
    val __obj = js.Dynamic.literal(aeadAlgorithm = aeadAlgorithm.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AeadAlgorithm]
  }
  
  @scala.inline
  implicit class AeadAlgorithmOps[Self <: AeadAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setAeadAlgorithm(value: String): Self = this.set("aeadAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.typedarray.Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
