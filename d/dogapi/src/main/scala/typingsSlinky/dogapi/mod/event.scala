package typingsSlinky.dogapi.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.dogapi.anon.Aggregationkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait event extends js.Object {
  
  def create(
    title: String,
    text: String,
    callback: js.Function2[/* err */ js.Error | Null, /* res */ EventCreateResponse, Unit]
  ): Unit = js.native
  def create(
    title: String,
    text: String,
    properties: Aggregationkey,
    callback: js.Function2[/* err */ js.Error | Null, /* res */ EventCreateResponse, Unit]
  ): Unit = js.native
}
@JSImport("dogapi", "event")
@js.native
object event extends TopLevel[event]
