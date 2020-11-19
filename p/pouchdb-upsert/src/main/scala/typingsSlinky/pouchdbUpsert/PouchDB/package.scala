package typingsSlinky.pouchdbUpsert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object PouchDB {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pouchdbUpsert.pouchdbUpsertStrings._empty
    - typingsSlinky.pouchdbUpsert.pouchdbUpsertNumbers.`0`
    - typingsSlinky.pouchdbUpsert.pouchdbUpsertBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type CancelUpsert = js.UndefOr[typingsSlinky.pouchdbUpsert.PouchDB._CancelUpsert | scala.Null]
  
  // `Partial<Core.Document<Content>>` seems more useful than
  // `{} | Core.Document<Content>` since there isn't an easy way to narrow
  // `{} | Core.Document<Content>` to `Core.Document<Content>`.
  type UpsertDiffCallback[Content /* <: js.Object */] = js.Function1[
    /* doc */ typingsSlinky.std.Partial[typingsSlinky.pouchdbCore.PouchDB.Core.Document[Content]], 
    (Content with typingsSlinky.pouchdbUpsert.anon.PartialIdMeta) | typingsSlinky.pouchdbUpsert.PouchDB.CancelUpsert
  ]
}
