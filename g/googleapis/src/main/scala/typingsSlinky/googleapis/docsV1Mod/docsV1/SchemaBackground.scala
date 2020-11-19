package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the background of a document.
  */
@js.native
trait SchemaBackground extends js.Object {
  
  /**
    * The background color.
    */
  var color: js.UndefOr[SchemaOptionalColor] = js.native
}
object SchemaBackground {
  
  @scala.inline
  def apply(): SchemaBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackground]
  }
  
  @scala.inline
  implicit class SchemaBackgroundOps[Self <: SchemaBackground] (val x: Self) extends AnyVal {
    
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
    def setColor(value: SchemaOptionalColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
