package typingsSlinky.ol.overviewMapMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var collapseLabel: js.UndefOr[String | HTMLElement] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String | HTMLElement] = js.native
  
  var layers: js.UndefOr[
    js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]]
  ] = js.native
  
  var render: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapEventMod.default, Unit]] = js.native
  
  var rotateWithView: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[HTMLElement | String] = js.native
  
  var tipLabel: js.UndefOr[String] = js.native
  
  var view: js.UndefOr[typingsSlinky.ol.viewMod.default] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCollapseLabelHTMLElement(value: HTMLElement): Self = this.set("collapseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseLabel(value: String | HTMLElement): Self = this.set("collapseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseLabel: Self = this.set("collapseLabel", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setLabelHTMLElement(value: HTMLElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String | HTMLElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(
      value: js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] | typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]]
    ): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setRender(value: /* p0 */ typingsSlinky.ol.mapEventMod.default => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRotateWithView(value: Boolean): Self = this.set("rotateWithView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateWithView: Self = this.set("rotateWithView", js.undefined)
    
    @scala.inline
    def setTargetHTMLElement(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTipLabel(value: String): Self = this.set("tipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipLabel: Self = this.set("tipLabel", js.undefined)
    
    @scala.inline
    def setView(value: typingsSlinky.ol.viewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
