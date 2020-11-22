package typingsSlinky.reactNavigationCore.useOnGetStateMod

import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.GetStateListener
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  def getState(): NavigationState[ParamListBase] = js.native
  
  var getStateListeners: Record[String, js.UndefOr[GetStateListener]] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    getState: () => NavigationState[ParamListBase],
    getStateListeners: Record[String, js.UndefOr[GetStateListener]]
  ): Options = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), getStateListeners = getStateListeners.asInstanceOf[js.Any])
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
    def setGetState(value: () => NavigationState[ParamListBase]): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStateListeners(value: Record[String, js.UndefOr[GetStateListener]]): Self = this.set("getStateListeners", value.asInstanceOf[js.Any])
  }
}
