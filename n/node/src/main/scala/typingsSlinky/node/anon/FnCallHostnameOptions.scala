package typingsSlinky.node.anon

import typingsSlinky.node.dnsMod.RecordWithTtl
import typingsSlinky.node.dnsMod.ResolveOptions
import typingsSlinky.node.dnsMod.ResolveWithTtlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallHostnameOptions extends js.Object {
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def apply(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
}

