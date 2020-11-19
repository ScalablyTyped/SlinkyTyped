package typingsSlinky.pgPool.mod

import typingsSlinky.pg.mod.Client
import typingsSlinky.pg.mod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config[T /* <: Client */] extends PoolConfig {
  
  var Client: js.UndefOr[ClientLikeCtr[T]] = js.native
}
object Config {
  
  @scala.inline
  def apply[T /* <: Client */](): Config[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T]]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], T /* <: Client */] (val x: Self with Config[T]) extends AnyVal {
    
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
    def setClient(value: ClientLikeCtr[T]): Self = this.set("Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("Client", js.undefined)
  }
}
