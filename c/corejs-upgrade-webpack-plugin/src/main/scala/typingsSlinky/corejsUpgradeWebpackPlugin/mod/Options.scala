package typingsSlinky.corejsUpgradeWebpackPlugin.mod

import typingsSlinky.corejsUpgradeWebpackPlugin.corejsUpgradeWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var resolveFrom: String | `false` = js.native
}
object Options {
  
  @scala.inline
  def apply(resolveFrom: String | `false`): Options = {
    val __obj = js.Dynamic.literal(resolveFrom = resolveFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setResolveFrom(value: String | `false`): Self = this.set("resolveFrom", value.asInstanceOf[js.Any])
  }
}
