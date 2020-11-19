package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridTooltipsMethods extends js.Object {
  
  def destroy(): Unit = js.native
  
  /**
    * Returns the ID of the parent div element bounding the ruler and the tooltip container
    */
  def id(): String = js.native
}
object IgTreeGridTooltipsMethods {
  
  @scala.inline
  def apply(destroy: () => Unit, id: () => String): IgTreeGridTooltipsMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = js.Any.fromFunction0(id))
    __obj.asInstanceOf[IgTreeGridTooltipsMethods]
  }
  
  @scala.inline
  implicit class IgTreeGridTooltipsMethodsOps[Self <: IgTreeGridTooltipsMethods] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: () => String): Self = this.set("id", js.Any.fromFunction0(value))
  }
}
