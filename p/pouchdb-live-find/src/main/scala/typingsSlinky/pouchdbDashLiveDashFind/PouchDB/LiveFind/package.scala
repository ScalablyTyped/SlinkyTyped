package typingsSlinky.pouchdbDashLiveDashFind.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LiveFind {
  import typingsSlinky.pouchdbDashFind.PouchDB.Find.FindRequest
  import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.limit
  import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.skip
  import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.sort
  import typingsSlinky.std.Pick

  type PaginateOptions[Content /* <: js.Object */] = Pick[FindRequest[Content], sort | skip | limit]
}
