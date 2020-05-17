package typingsSlinky.pouchdbCore.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Core {
  type AttachmentId = java.lang.String
  type Attachments = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pouchdbCore.PouchDB.Core.Attachment]
  type Callback[R] = js.Function2[
    /* error */ typingsSlinky.pouchdbCore.PouchDB.Core.Error | scala.Null, 
    /* result */ R | scala.Null, 
    scala.Unit
  ]
  type Document[Content /* <: js.Object */] = Content with typingsSlinky.pouchdbCore.PouchDB.Core.IdMeta
  type DocumentId = java.lang.String
  type DocumentKey = java.lang.String
  type ExistingDocument[Content /* <: js.Object */] = typingsSlinky.pouchdbCore.PouchDB.Core.Document[Content] with typingsSlinky.pouchdbCore.PouchDB.Core.RevisionIdMeta
  type NewDocument[Content /* <: js.Object */] = Content
  type PostDocument[Content /* <: js.Object */] = typingsSlinky.pouchdbCore.PouchDB.Core.NewDocument[Content] with typingsSlinky.pouchdbCore.anon.Attachments
  type PutDocument[Content /* <: js.Object */] = typingsSlinky.pouchdbCore.PouchDB.Core.PostDocument[Content] with typingsSlinky.pouchdbCore.PouchDB.Core.ChangesMeta with typingsSlinky.pouchdbCore.anon.Id
  /** Existing doc or just object with `_id` and `_rev` */
  type RemoveDocument = typingsSlinky.pouchdbCore.PouchDB.Core.IdMeta with typingsSlinky.pouchdbCore.PouchDB.Core.RevisionIdMeta
  type RevisionDiffOptions = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type RevisionDiffResponse = org.scalablytyped.runtime.StringDictionary[typingsSlinky.pouchdbCore.PouchDB.Core.RevisionDiff]
  type RevisionId = java.lang.String
}
