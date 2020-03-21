package typingsSlinky.passportOauth2.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStore extends js.Object {
  def store(req: Request_[ParamsDictionary], callback: StateStoreStoreCallback): Unit = js.native
  def store(req: Request_[ParamsDictionary], meta: Metadata, callback: StateStoreStoreCallback): Unit = js.native
  def verify(req: Request_[ParamsDictionary], state: String, callback: StateStoreVerifyCallback): Unit = js.native
  def verify(req: Request_[ParamsDictionary], state: String, meta: Metadata, callback: StateStoreVerifyCallback): Unit = js.native
}

