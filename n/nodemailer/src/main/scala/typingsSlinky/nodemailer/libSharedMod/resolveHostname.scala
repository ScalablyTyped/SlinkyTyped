package typingsSlinky.nodemailer.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/shared", "resolveHostname")
@js.native
object resolveHostname extends js.Object {
  def apply(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  def apply(
    options: Null,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  def apply(
    options: ResolveHostnameOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
}

