package typingsSlinky.googleDashGax

import typingsSlinky.googleDashGax.buildSrcApitypesMod.GRPCCall
import typingsSlinky.googleDashGax.buildSrcApitypesMod.GaxCall
import typingsSlinky.googleDashGax.buildSrcDescriptorMod.Descriptor
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/createApiCall", JSImport.Namespace)
@js.native
object buildSrcCreateApiCallMod extends js.Object {
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
}

