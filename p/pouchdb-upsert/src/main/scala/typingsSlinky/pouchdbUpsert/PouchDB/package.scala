package typingsSlinky.pouchdbUpsert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PouchDB {
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ typingsSlinky.std.Partial[typingsSlinky.pouchdbCore.PouchDB.Core.Document[Content]], 
    (Content with typingsSlinky.pouchdbUpsert.anon.PartialIdMeta) | typingsSlinky.pouchdbUpsert.PouchDB.CancelUpsert
  ]
}
