package typingsSlinky.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends js.Object {
  
  var path: js.Array[Bucket] = js.native
  
  var rootBucket: js.Any = js.native
}
object Path {
  
  @scala.inline
  def apply(path: js.Array[Bucket], rootBucket: js.Any): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], rootBucket = rootBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: Bucket*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Bucket]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBucket(value: js.Any): Self = this.set("rootBucket", value.asInstanceOf[js.Any])
  }
}
