package typingsSlinky.officeJsPreview.PowerPoint.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the collection of slides in the presentation.
  *
  * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait SlideCollectionLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the unique ID of the slide.
    *
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[Boolean] = js.native
}
object SlideCollectionLoadOptions {
  
  @scala.inline
  def apply(): SlideCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class SlideCollectionLoadOptionsOps[Self <: SlideCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
