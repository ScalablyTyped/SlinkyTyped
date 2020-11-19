package typingsSlinky.jqueryEasyLoading.JQueryEasyLoading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends js.Object {
  
  /**
    * Extend the Loading plugin default settings with the user options
    * Use it as `$.Loading.setDefaults({ ... })`
    *
    * @param {Object} options Custom options to override the plugin defaults
    */
  def setDefaults(options: Options): Unit = js.native
}
object Static {
  
  @scala.inline
  def apply(setDefaults: Options => Unit): Static = {
    val __obj = js.Dynamic.literal(setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[Static]
  }
  
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
    
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
    def setSetDefaults(value: Options => Unit): Self = this.set("setDefaults", js.Any.fromFunction1(value))
  }
}
