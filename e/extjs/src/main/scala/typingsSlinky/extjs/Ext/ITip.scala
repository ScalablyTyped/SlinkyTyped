package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITip
  extends typingsSlinky.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (Boolean) */
  var constrainPosition: js.UndefOr[Boolean] = js.native
}
object ITip {
  
  @scala.inline
  def apply(): ITip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITip]
  }
  
  @scala.inline
  implicit class ITipOps[Self <: ITip] (val x: Self) extends AnyVal {
    
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
    def setConstrainPosition(value: Boolean): Self = this.set("constrainPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainPosition: Self = this.set("constrainPosition", js.undefined)
  }
}
