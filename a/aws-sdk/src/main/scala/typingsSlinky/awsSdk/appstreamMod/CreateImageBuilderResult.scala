package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageBuilderResult extends js.Object {
  
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ImageBuilder] = js.native
}
object CreateImageBuilderResult {
  
  @scala.inline
  def apply(): CreateImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageBuilderResult]
  }
  
  @scala.inline
  implicit class CreateImageBuilderResultOps[Self <: CreateImageBuilderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageBuilder(value: ImageBuilder): Self = this.set("ImageBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBuilder: Self = this.set("ImageBuilder", js.undefined)
  }
}
