package typingsSlinky.mobxReact

import slinky.core.ReactComponentClass
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposeOnUnmountMod {
  
  @JSImport("mobx-react/dist/disposeOnUnmount", "disposeOnUnmount")
  @js.native
  def disposeOnUnmount(target: ReactComponentClass[_], propertyKey: PropertyKey): Unit = js.native
  @JSImport("mobx-react/dist/disposeOnUnmount", "disposeOnUnmount")
  @js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: ReactComponentClass[_], fn: TF): TF = js.native
  
  type Disposer = js.Function0[Unit]
}
