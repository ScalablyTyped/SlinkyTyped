package typingsSlinky.emberData.mod.DS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `DS.InvalidError` is used by an adapter to signal the external API
  * was unable to process a request because the content was not
  * semantically correct or meaningful per the API. Usually this means a
  * record failed some form of server side validation. When a promise
  * from an adapter is rejected with a `DS.InvalidError` the record will
  * transition to the `invalid` state and the errors will be set to the
  * `errors` property on the record.
  */
@JSImport("ember-data", "DS.InvalidError")
@js.native
class InvalidError protected () extends AdapterError {
  def this(errors: js.Array[_]) = this()
}
