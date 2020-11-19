package typingsSlinky.rabbitJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket extends js.Object {
  
  def close(): js.Any = js.native
  
  def connect(destination: String): js.Any = js.native
  def connect(destination: String, callback: js.Function): js.Any = js.native
  
  def setsockopt(opt: String, value: String): js.Any = js.native
}
