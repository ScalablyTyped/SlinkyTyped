package typingsSlinky.airtable.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Airtable {
  type Base = js.Function1[
    /* tableName */ java.lang.String, 
    typingsSlinky.airtable.mod.global.Airtable.Table[js.Object]
  ]
  type FieldSet = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      java.lang.String | scala.Double | scala.Boolean | typingsSlinky.airtable.mod.global.Airtable.Collaborator | (js.Array[
        typingsSlinky.airtable.mod.global.Airtable.Attachment | typingsSlinky.airtable.mod.global.Airtable.Collaborator | java.lang.String
      ])
    ]
  ]
  type Records[TFields] = js.Array[typingsSlinky.airtable.mod.global.Airtable.Record[TFields]]
}
