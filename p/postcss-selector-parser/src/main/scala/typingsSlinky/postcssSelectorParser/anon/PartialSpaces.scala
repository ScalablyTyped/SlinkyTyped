package typingsSlinky.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Spaces> */
@js.native
trait PartialSpaces extends js.Object {
  
  var after: js.UndefOr[String] = js.native
  
  var before: js.UndefOr[String] = js.native
}
object PartialSpaces {
  
  @scala.inline
  def apply(): PartialSpaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSpaces]
  }
  
  @scala.inline
  implicit class PartialSpacesOps[Self <: PartialSpaces] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
