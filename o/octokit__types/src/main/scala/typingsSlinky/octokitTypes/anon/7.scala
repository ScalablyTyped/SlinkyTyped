package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.octokitTypesStrings.wyandotte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends js.Object {
  
  var previews: Array[wyandotte | String] = js.native
}
object `7` {
  
  @scala.inline
  def apply(previews: Array[wyandotte | String]): `7` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
    
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
    def setPreviews(value: Array[wyandotte | String]): Self = this.set("previews", value.asInstanceOf[js.Any])
  }
}
