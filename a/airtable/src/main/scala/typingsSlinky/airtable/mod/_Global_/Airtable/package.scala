package typingsSlinky.airtable.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Airtable {
  type Base = js.Function1[
    /* tableName */ java.lang.String, 
    typingsSlinky.airtable.mod._Global_.Airtable.Table[js.Object]
  ]
  type FieldSet = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      java.lang.String | scala.Double | scala.Boolean | typingsSlinky.airtable.mod._Global_.Airtable.Collaborator | (js.Array[
        typingsSlinky.airtable.mod._Global_.Airtable.Attachment | typingsSlinky.airtable.mod._Global_.Airtable.Collaborator | java.lang.String
      ])
    ]
  ]
  type Records[TFields] = js.Array[typingsSlinky.airtable.mod._Global_.Airtable.Record[TFields]]
}
