package typingsSlinky.mobxReact

import slinky.core.ReactComponentClass
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/disposeOnUnmount", JSImport.Namespace)
@js.native
object disposeOnUnmountMod extends js.Object {
  def disposeOnUnmount(target: ReactComponentClass[_], propertyKey: PropertyKey): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: ReactComponentClass[_], fn: TF): TF = js.native
  type Disposer = js.Function0[Unit]
}

