package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nano.nanoStrings.asc
import typingsSlinky.nano.nanoStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - org.scalablytyped.runtime.StringDictionary[typingsSlinky.nano.nanoStrings.asc | typingsSlinky.nano.nanoStrings.desc]
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  implicit def apply(value: js.Array[String]): SortOrder = value.asInstanceOf[SortOrder]
  @scala.inline
  implicit def apply(value: String): SortOrder = value.asInstanceOf[SortOrder]
  @scala.inline
  implicit def apply(value: StringDictionary[asc | desc]): SortOrder = value.asInstanceOf[SortOrder]
}

