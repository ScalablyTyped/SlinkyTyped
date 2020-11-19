package typingsSlinky.openlayers.mod.olx.control

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreenOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var keys: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String | Node] = js.native
  
  var labelActive: js.UndefOr[String | Node] = js.native
  
  var source: js.UndefOr[Element | String] = js.native
  
  var target: js.UndefOr[Element] = js.native
  
  var tipLabel: js.UndefOr[String] = js.native
}
object FullScreenOptions {
  
  @scala.inline
  def apply(): FullScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullScreenOptions]
  }
  
  @scala.inline
  implicit class FullScreenOptionsOps[Self <: FullScreenOptions] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setKeys(value: Boolean): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLabelNode(value: Node): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String | Node): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelActiveNode(value: Node): Self = this.set("labelActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelActive(value: String | Node): Self = this.set("labelActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelActive: Self = this.set("labelActive", js.undefined)
    
    @scala.inline
    def setSourceElement(value: Element): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Element | String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTipLabel(value: String): Self = this.set("tipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipLabel: Self = this.set("tipLabel", js.undefined)
  }
}
