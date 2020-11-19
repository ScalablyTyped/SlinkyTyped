package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.regionsMod.IRegionLayerProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegionLayer {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/regions", "RegionLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.regionsMod.RegionLayer] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def regionStylesVarargs(value: CSSProperties*): this.type = set("regionStyles", js.Array(value :_*))
    
    @scala.inline
    def regionStyles(value: js.Array[CSSProperties]): this.type = set("regionStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def regionsVarargs(value: IRegion*): this.type = set("regions", js.Array(value :_*))
    
    @scala.inline
    def regions(value: js.Array[IRegion]): this.type = set("regions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IRegionLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RegionLayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
