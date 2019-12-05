package typingsSlinky.nodeDashMailjet.nodeDashMailjetMod

import typingsSlinky.nodeDashMailjet.nodeDashMailjetMod.Email.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mailjet", "connect")
@js.native
object connect extends js.Object {
  def apply(apiKey: String, apiSecret: String): Client = js.native
  def apply(apiKey: String, apiSecret: String, options: ConnectOptions): Client = js.native
  def apply(apiToken: String): typingsSlinky.nodeDashMailjet.nodeDashMailjetMod.SMS.Client = js.native
  def apply(apiToken: String, options: ConnectOptions): typingsSlinky.nodeDashMailjet.nodeDashMailjetMod.SMS.Client = js.native
}

