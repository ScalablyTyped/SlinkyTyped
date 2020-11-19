package typingsSlinky.reactMdUtils.anon

import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import typingsSlinky.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Max extends WidthMediaQuerys {
  
  var max: QuerySize = js.native
}
object Max {
  
  @scala.inline
  def apply(max: QuerySize): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
    
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
    def setMax(value: QuerySize): Self = this.set("max", value.asInstanceOf[js.Any])
  }
}
