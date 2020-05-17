package typingsSlinky.googleGax.mod

import typingsSlinky.googleGax.apitypesMod.GRPCCall
import typingsSlinky.googleGax.apitypesMod.GaxCall
import typingsSlinky.googleGax.descriptorMod.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "createApiCall")
@js.native
object createApiCall extends js.Object {
  def apply(func: js.Promise[GRPCCall], settings: typingsSlinky.googleGax.gaxMod.CallSettings): GaxCall = js.native
  def apply(
    func: js.Promise[GRPCCall],
    settings: typingsSlinky.googleGax.gaxMod.CallSettings,
    descriptor: Descriptor
  ): GaxCall = js.native
  def apply(func: GRPCCall, settings: typingsSlinky.googleGax.gaxMod.CallSettings): GaxCall = js.native
  def apply(func: GRPCCall, settings: typingsSlinky.googleGax.gaxMod.CallSettings, descriptor: Descriptor): GaxCall = js.native
}

