package typingsSlinky.firebird

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * @desc
    * Here is Firebird to Node data type accordance:
    *
    * | Firebird  | Node      |
    * | :-------  | :-------- |
    * | DATE       |    Date   |
    * | TIME       |    Date   |
    * | TIMESTAMP |     Date   |
    * | CHAR      |     String |
    * | VARCHAR   |     String |
    * | SMALLINT  |     Integer|
    * | INTEGER   |     Integer|
    * | NUMERIC   |     Number |
    * | DECIMAL   |     Number |
    * | FLOAT     |     Number |
    * | DOUBLE    |     Number |
    * | BLOB      |     FBblob |
    */
  type DataType = js.Date | java.lang.String | scala.Double | typingsSlinky.firebird.mod.FBBlob
}
