package typingsSlinky.luminoDatagrid.jsonmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSONModel {
  
  /**
    * A type alias for a data source for a JSON data model.
    *
    * A data source is an array of JSON object records which represent
    * the rows of the table. The keys of the records correspond to the
    * field names of the columns.
    */
  type DataSource = js.Array[typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONObject]
}
