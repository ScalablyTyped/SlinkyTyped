package typingsSlinky.cloudeventsSdk

import typingsSlinky.cloudeventsSdk.cloudeventMod.CloudEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cloudevents-sdk/lib/bindings/http/validation/structured", JSImport.Namespace)
@js.native
object structuredMod extends js.Object {
  
  def check(payload: js.Any, headers: js.Any, receiver: js.Any): Boolean = js.native
  
  def parse(payload: js.Any, headers: js.Any, receiver: js.Any): CloudEvent = js.native
}
