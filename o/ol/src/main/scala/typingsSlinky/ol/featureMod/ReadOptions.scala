package typingsSlinky.ol.featureMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOptions extends js.Object {
  
  var dataProjection: js.UndefOr[ProjectionLike] = js.native
  
  var extent: js.UndefOr[Extent] = js.native
  
  var featureProjection: js.UndefOr[ProjectionLike] = js.native
}
object ReadOptions {
  
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit class ReadOptionsOps[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
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
    def setDataProjection(value: ProjectionLike): Self = this.set("dataProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataProjection: Self = this.set("dataProjection", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setFeatureProjection(value: ProjectionLike): Self = this.set("featureProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureProjection: Self = this.set("featureProjection", js.undefined)
  }
}
