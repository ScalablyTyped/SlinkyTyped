package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28` extends js.Object {
  
  def failure(error: js.Error): js.Any = js.native
  
  def success(thing: KiiThing, group: KiiGroup): js.Any = js.native
}
object `28` {
  
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiThing, KiiGroup) => js.Any): `28` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit class `28Ops`[Self <: `28`] (val x: Self) extends AnyVal {
    
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
    def setFailure(value: js.Error => js.Any): Self = this.set("failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: (KiiThing, KiiGroup) => js.Any): Self = this.set("success", js.Any.fromFunction2(value))
  }
}
