package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.mod.AsyncProps
import typingsSlinky.reactAsync.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAsync {
  @JSImport("react-async", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AsyncProps[T]): SharedBuilder_AsyncProps2057177666[default[js.Any], T] = new SharedBuilder_AsyncProps2057177666[default[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: ReactAsync.type): SharedBuilder_AsyncProps2057177666[default[js.Any], T] = new SharedBuilder_AsyncProps2057177666[default[js.Any], T](js.Array(this.component, js.Dictionary.empty))()
}

