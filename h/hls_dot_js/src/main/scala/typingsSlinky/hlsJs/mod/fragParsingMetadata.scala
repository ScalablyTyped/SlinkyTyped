package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fragParsingMetadata extends js.Object {
  
  var frag: Fragment = js.native
  
  var id: String = js.native
  
  var samples: js.Array[_] = js.native
}
object fragParsingMetadata {
  
  @scala.inline
  def apply(frag: Fragment, id: String, samples: js.Array[_]): fragParsingMetadata = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingMetadata]
  }
  
  @scala.inline
  implicit class fragParsingMetadataOps[Self <: fragParsingMetadata] (val x: Self) extends AnyVal {
    
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
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesVarargs(value: js.Any*): Self = this.set("samples", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: js.Array[_]): Self = this.set("samples", value.asInstanceOf[js.Any])
  }
}
