package typingsSlinky.pouchdbDashUpsert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PouchDB {
  import typingsSlinky.pouchdbDashCore.PouchDB.Core.Document
  import typingsSlinky.pouchdbDashCore.PouchDB.Core.IdMeta
  import typingsSlinky.std.Partial

  /* Rewritten from type alias, can be one of: 
    - typings.pouchdbDashUpsert.pouchdbDashUpsertStrings.Empty
    - typings.pouchdbDashUpsert.pouchdbDashUpsertNumbers.`0`
    - typings.pouchdbDashUpsert.pouchdbDashUpsertNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type CancelUpsert = js.UndefOr[_CancelUpsert | Null]
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ Partial[Document[Content]], 
    (Content with Partial[IdMeta]) | CancelUpsert
  ]
}
