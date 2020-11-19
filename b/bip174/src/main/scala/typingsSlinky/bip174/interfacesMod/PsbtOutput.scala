package typingsSlinky.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtOutput extends PsbtOutputUpdate {
  
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.native
}
object PsbtOutput {
  
  @scala.inline
  def apply(): PsbtOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOutput]
  }
  
  @scala.inline
  implicit class PsbtOutputOps[Self <: PsbtOutput] (val x: Self) extends AnyVal {
    
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
    def setUnknownKeyValsVarargs(value: KeyValue*): Self = this.set("unknownKeyVals", js.Array(value :_*))
    
    @scala.inline
    def setUnknownKeyVals(value: js.Array[KeyValue]): Self = this.set("unknownKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownKeyVals: Self = this.set("unknownKeyVals", js.undefined)
  }
}
