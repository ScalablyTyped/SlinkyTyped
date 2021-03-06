package typingsSlinky.mobx

import typingsSlinky.mobx.coreActionMod.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("mobx/lib/api/action", "action")
  @js.native
  val action: IActionFactory = js.native
  
  @JSImport("mobx/lib/api/action", "defineBoundAction")
  @js.native
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = js.native
  
  @JSImport("mobx/lib/api/action", "isAction")
  @js.native
  def isAction(thing: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/api/action", "runInAction")
  @js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  @JSImport("mobx/lib/api/action", "runInAction")
  @js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
  
  @js.native
  trait IActionFactory extends StObject {
    
    def apply(customName: String): js.Function3[
        /* target */ js.Object, 
        /* key */ String | js.Symbol, 
        /* baseDescriptor */ js.UndefOr[js.PropertyDescriptor], 
        Unit
      ] = js.native
    def apply(target: js.Object, propertyKey: String): Unit = js.native
    def apply(target: js.Object, propertyKey: String, descriptor: js.PropertyDescriptor): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def apply(target: js.Object, propertyKey: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
    def apply[T /* <: js.UndefOr[js.Function | Null] */](fn: T): T with IAction = js.native
    def apply[T /* <: js.UndefOr[js.Function | Null] */](name: String, fn: T): T with IAction = js.native
    
    def bound(target: js.Object, propertyKey: String): Unit = js.native
    def bound(target: js.Object, propertyKey: String, descriptor: js.PropertyDescriptor): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def bound(target: js.Object, propertyKey: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
  }
}
