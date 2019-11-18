package typingsSlinky.antd

import typingsSlinky.antd.libModalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestroyNewConfig extends js.Object {
  def destroy(): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Anon_DestroyNewConfig {
  @scala.inline
  def apply(destroy: () => Unit, update: ModalFuncProps => Unit): Anon_DestroyNewConfig = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_DestroyNewConfig]
  }
}

