package typingsSlinky.reactFloater.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsWithContent extends Props {
  
  /**
    * The Floater content. It can be anything that can be rendered.
    * This is the only required props, unless you pass a component.
    */
  var content: ReactElement = js.native
}
object PropsWithContent {
  
  @scala.inline
  def apply(): PropsWithContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithContent]
  }
  
  @scala.inline
  implicit class PropsWithContentOps[Self <: PropsWithContent] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
}
