package typingsSlinky.firebird.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @desc
  * Here is Firebird to Node data type accordance:
  *
  * | Firebird  | Node      |
  * | :-------  | :-------- |
  * | DATE	   |	Date   |
  * | TIME	   |	Date   |
  * | TIMESTAMP | 	Date   |
  * | CHAR      | 	String |
  * | VARCHAR   | 	String |
  * | SMALLINT  | 	Integer|
  * | INTEGER   | 	Integer|
  * | NUMERIC   | 	Number |
  * | DECIMAL   | 	Number |
  * | FLOAT     | 	Number |
  * | DOUBLE    | 	Number |
  * | BLOB      | 	FBblob |
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - java.lang.String
  - scala.Double
  - typingsSlinky.firebird.mod.FBBlob
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  implicit def apply(value: js.Date): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: Double): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: FBBlob): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: String): DataType = value.asInstanceOf[DataType]
}

