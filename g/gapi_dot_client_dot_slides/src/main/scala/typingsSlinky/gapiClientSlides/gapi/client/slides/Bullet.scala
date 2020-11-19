package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bullet extends js.Object {
  
  /** The paragraph specific text style applied to this bullet. */
  var bulletStyle: js.UndefOr[TextStyle] = js.native
  
  /** The rendered bullet glyph for this paragraph. */
  var glyph: js.UndefOr[String] = js.native
  
  /** The ID of the list this paragraph belongs to. */
  var listId: js.UndefOr[String] = js.native
  
  /** The nesting level of this paragraph in the list. */
  var nestingLevel: js.UndefOr[Double] = js.native
}
object Bullet {
  
  @scala.inline
  def apply(): Bullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bullet]
  }
  
  @scala.inline
  implicit class BulletOps[Self <: Bullet] (val x: Self) extends AnyVal {
    
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
    def setBulletStyle(value: TextStyle): Self = this.set("bulletStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletStyle: Self = this.set("bulletStyle", js.undefined)
    
    @scala.inline
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Double): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
  }
}
