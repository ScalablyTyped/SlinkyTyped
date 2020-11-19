package typingsSlinky.coreObject.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreObject extends js.Object {
  
  // TODO restrict to `Record<string, unknown>` once we can restrict to 3.0+ on DT
  def init(): Unit = js.native
  def init(options: Record[String, _]): Unit = js.native
}
