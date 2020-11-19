package typingsSlinky.ol.dragAndDropMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var formatConstructors: js.UndefOr[js.Array[typingsSlinky.ol.featureMod.default]] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  var target: js.UndefOr[HTMLElement] = js.native
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
    def setFormatConstructorsVarargs(value: typingsSlinky.ol.featureMod.default*): Self = this.set("formatConstructors", js.Array(value :_*))
    
    @scala.inline
    def setFormatConstructors(value: js.Array[typingsSlinky.ol.featureMod.default]): Self = this.set("formatConstructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatConstructors: Self = this.set("formatConstructors", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setSource(value: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
