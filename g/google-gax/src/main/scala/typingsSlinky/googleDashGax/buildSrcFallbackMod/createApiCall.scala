package typingsSlinky.googleDashGax.buildSrcFallbackMod

import typingsSlinky.googleDashGax.buildSrcApitypesMod.GRPCCall
import typingsSlinky.googleDashGax.buildSrcApitypesMod.GaxCall
import typingsSlinky.googleDashGax.buildSrcDescriptorMod.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "createApiCall")
@js.native
object createApiCall extends js.Object {
  def apply(func: js.Promise[GRPCCall], settings: typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings): GaxCall = js.native
  def apply(
    func: js.Promise[GRPCCall],
    settings: typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings,
    descriptor: Descriptor
  ): GaxCall = js.native
  def apply(func: GRPCCall, settings: typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings): GaxCall = js.native
  def apply(
    func: GRPCCall,
    settings: typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings,
    descriptor: Descriptor
  ): GaxCall = js.native
}

