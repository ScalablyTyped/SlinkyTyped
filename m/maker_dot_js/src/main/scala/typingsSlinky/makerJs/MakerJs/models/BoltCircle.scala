package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoltCircle extends IModel {
  
  @JSName("paths")
  var paths_BoltCircle: IPathMap = js.native
}
object BoltCircle {
  
  @scala.inline
  def apply(paths: IPathMap): BoltCircle = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoltCircle]
  }
  
  @scala.inline
  implicit class BoltCircleOps[Self <: BoltCircle] (val x: Self) extends AnyVal {
    
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
    def setPaths(value: IPathMap): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
}
