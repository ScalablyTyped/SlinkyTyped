package typingsSlinky.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm/fields", "RelationalField")
@js.native
class RelationalField protected () extends Field {
  def this(opts: RelationalFieldOpts) = this()
  def this(toModelName: String) = this()
  def this(toModelName: String, relatedName: String) = this()
}
