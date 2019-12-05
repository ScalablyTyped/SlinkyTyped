package typingsSlinky.ganacheDashCore.ganacheDashCoreMod

import typingsSlinky.ganacheDashCore.ganacheDashCoreMod.Ganache.IProviderOptions
import typingsSlinky.ganacheDashCore.ganacheDashCoreMod.Ganache.IServerOptions
import typingsSlinky.ganacheDashCore.ganacheDashCoreMod.Ganache.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ganache-core", JSImport.Default)
@js.native
object default extends js.Object {
  def provider(): Provider = js.native
  def provider(opts: IProviderOptions): Provider = js.native
  def server(): js.Any = js.native
  def server(opts: IServerOptions): js.Any = js.native
}

