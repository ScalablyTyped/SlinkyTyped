package typingsSlinky.flowdoc.Flow

import typingsSlinky.flowdoc.Graphic
import typingsSlinky.flowdoc.flowdocStrings.IMAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends Graphic {
  
  var connections: js.UndefOr[js.Array[Connection]] = js.native
  
  @JSName("type")
  var type_Image: IMAGE = js.native
}
object Image {
  
  @scala.inline
  def apply(id: String, name: String, position: Point, size: Size, source: FileAsset | URLAsset, `type`: IMAGE): Image = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setType(value: IMAGE): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = this.set("connections", js.Array(value :_*))
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
  }
}
