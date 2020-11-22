package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.reactNavigationCore.reactNavigationCoreBooleans.`true`
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOptionsGetter extends js.Object {
  
  var addOptionsGetter: js.UndefOr[
    js.Function2[/* key */ String, /* getter */ js.Function0[js.UndefOr[js.Object | Null]], Unit]
  ] = js.native
  
  def getIsInitial(): Boolean = js.native
  
  def getKey(): js.UndefOr[String] = js.native
  
  def getState(): js.UndefOr[NavigationState[ParamListBase] | PartialStateNavigationSta] = js.native
  
  var isDefault: js.UndefOr[`true`] = js.native
  
  def setKey(key: String): Unit = js.native
  
  def setState(): Unit = js.native
  def setState(state: PartialStateNavigationSta): Unit = js.native
  def setState(state: NavigationState[ParamListBase]): Unit = js.native
  
  var state: js.UndefOr[Readonlykeystringindexnum | PartialStateReadonlykeyst] = js.native
}
