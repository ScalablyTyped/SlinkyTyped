package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.guidesMod.IGuideLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GuideLayer {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/guides", "GuideLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.guidesMod.GuideLayer] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalGuidesVarargs(value: Double*): this.type = set("horizontalGuides", js.Array(value :_*))
    
    @scala.inline
    def horizontalGuides(value: js.Array[Double]): this.type = set("horizontalGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalGuidesVarargs(value: Double*): this.type = set("verticalGuides", js.Array(value :_*))
    
    @scala.inline
    def verticalGuides(value: js.Array[Double]): this.type = set("verticalGuides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGuideLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GuideLayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
