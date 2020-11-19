package typingsSlinky.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeAssign extends js.Object {
  
  def adapterArgs(mapper: js.Any, records: js.Any, opts: js.Any): js.Array[_] = js.native
  
  var beforeAssign: Double = js.native
  
  var defaults: js.Array[js.Object] = js.native
  
  var types: js.Array[_] = js.native
}
object BeforeAssign {
  
  @scala.inline
  def apply(
    adapterArgs: (js.Any, js.Any, js.Any) => js.Array[_],
    beforeAssign: Double,
    defaults: js.Array[js.Object],
    types: js.Array[_]
  ): BeforeAssign = {
    val __obj = js.Dynamic.literal(adapterArgs = js.Any.fromFunction3(adapterArgs), beforeAssign = beforeAssign.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeAssign]
  }
  
  @scala.inline
  implicit class BeforeAssignOps[Self <: BeforeAssign] (val x: Self) extends AnyVal {
    
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
    def setAdapterArgs(value: (js.Any, js.Any, js.Any) => js.Array[_]): Self = this.set("adapterArgs", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeAssign(value: Double): Self = this.set("beforeAssign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsVarargs(value: js.Object*): Self = this.set("defaults", js.Array(value :_*))
    
    @scala.inline
    def setDefaults(value: js.Array[js.Object]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: js.Any*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[_]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
