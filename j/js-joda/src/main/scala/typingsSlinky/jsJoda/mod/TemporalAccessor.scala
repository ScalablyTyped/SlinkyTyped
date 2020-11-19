package typingsSlinky.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "TemporalAccessor")
@js.native
abstract class TemporalAccessor () extends js.Object {
  
  def get(field: TemporalField): Double = js.native
  
  def query(query: TemporalQuery): js.Any = js.native
  
  def range(field: TemporalField): ValueRange = js.native
}
