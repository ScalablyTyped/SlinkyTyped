package typingsSlinky.openfin.anon

import typingsSlinky.openfin.downloadPreloadMod.DownloadPreloadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends js.Object {
  
  var newVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
  
  var oldVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
}
object `10` {
  
  @scala.inline
  def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10Ops`[Self <: `10`] (val x: Self) extends AnyVal {
    
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
    def setNewValVarargs(value: DownloadPreloadOption*): Self = this.set("newVal", js.Array(value :_*))
    
    @scala.inline
    def setNewVal(value: js.Array[DownloadPreloadOption]): Self = this.set("newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewVal: Self = this.set("newVal", js.undefined)
    
    @scala.inline
    def setOldValVarargs(value: DownloadPreloadOption*): Self = this.set("oldVal", js.Array(value :_*))
    
    @scala.inline
    def setOldVal(value: js.Array[DownloadPreloadOption]): Self = this.set("oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldVal: Self = this.set("oldVal", js.undefined)
  }
}
