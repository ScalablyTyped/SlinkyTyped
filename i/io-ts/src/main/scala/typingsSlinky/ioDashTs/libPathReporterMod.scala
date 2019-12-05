package typingsSlinky.ioDashTs

import typingsSlinky.ioDashTs.ioDashTsMod.ValidationError
import typingsSlinky.ioDashTs.libReporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/PathReporter", JSImport.Namespace)
@js.native
object libPathReporterMod extends js.Object {
  val PathReporter: Reporter[js.Array[String]] = js.native
  def failure(es: js.Array[ValidationError]): js.Array[String] = js.native
  def success(): js.Array[String] = js.native
}

