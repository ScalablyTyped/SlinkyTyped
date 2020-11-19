package typingsSlinky.expressValidator.matchedDataMod

import typingsSlinky.expressValidator.anon.PartialMatchedDataOptions
import typingsSlinky.expressValidator.baseMod.Request
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/matched-data", "matchedData")
@js.native
object matchedData extends js.Object {
  
  def apply(req: Request): Record[String, _] = js.native
  def apply(req: Request, options: PartialMatchedDataOptions): Record[String, _] = js.native
}
