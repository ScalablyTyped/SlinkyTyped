package typingsSlinky.reapop.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reapop.mod.Notification
import typingsSlinky.reapop.mod.NotificationSystemProps
import typingsSlinky.reapop.mod.NotificationSystemTheme
import typingsSlinky.reapop.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reapop {
  
  @JSImport("reapop", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def filter(value: /* notification */ Notification => Boolean): this.type = set("filter", js.Any.fromFunction1(value))
  }
  
  def withProps(p: NotificationSystemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(theme: NotificationSystemTheme): Builder = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NotificationSystemProps]))
  }
}
