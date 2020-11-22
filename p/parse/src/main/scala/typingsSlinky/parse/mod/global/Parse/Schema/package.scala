package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Schema {
  
  type AttrType[T /* <: typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes] */, V] = typingsSlinky.std.Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T['attributes'] ]: T['attributes'][K] extends V? K : never}[keyof T['attributes']] */ js.Any, 
    java.lang.String
  ]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsSlinky.std.Date
    - typingsSlinky.parse.mod.global.Parse.File
    - typingsSlinky.parse.mod.global.Parse.GeoPoint
    - typingsSlinky.parse.mod.global.Parse.Polygon
    - js.Array[js.Any]
    - js.Object
    - typingsSlinky.parse.mod.global.Parse.Pointer
    - typingsSlinky.parse.mod.global.Parse.Relation[
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes], 
  typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]]
  */
  type FieldType = typingsSlinky.parse.mod.global.Parse.Schema._FieldType | js.Array[js.Any] | (typingsSlinky.parse.mod.global.Parse.Relation[
    typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes], 
    typingsSlinky.parse.mod.global.Parse.Object[typingsSlinky.parse.mod.global.Parse.Attributes]
  ]) | java.lang.String | scala.Double | scala.Boolean | js.Date | js.Object
  
  type Index = org.scalablytyped.runtime.StringDictionary[typingsSlinky.parse.mod.global.Parse.Schema.TYPE]
}
