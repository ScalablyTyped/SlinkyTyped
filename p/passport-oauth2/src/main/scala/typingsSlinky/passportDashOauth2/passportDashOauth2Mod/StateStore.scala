package typingsSlinky.passportDashOauth2.passportDashOauth2Mod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateStore extends js.Object {
  def store(req: Request[ParamsDictionary], callback: StateStoreStoreCallback): Unit = js.native
  def store(req: Request[ParamsDictionary], meta: Metadata, callback: StateStoreStoreCallback): Unit = js.native
  def verify(req: Request[ParamsDictionary], state: String, callback: StateStoreVerifyCallback): Unit = js.native
  def verify(req: Request[ParamsDictionary], state: String, meta: Metadata, callback: StateStoreVerifyCallback): Unit = js.native
}

