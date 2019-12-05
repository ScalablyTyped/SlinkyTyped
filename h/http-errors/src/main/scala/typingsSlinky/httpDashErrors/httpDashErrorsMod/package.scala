package typingsSlinky.httpDashErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashErrorsMod {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.httpDashErrors.Anon_Code
  import typingsSlinky.std.Record

  type CreateHttpError = js.Function1[/* repeated */ UnknownError, HttpError]
  type HttpErrorConstructor = Instantiable1[js.UndefOr[/* msg */ String], HttpError]
  type NamedConstructors = Anon_Code with (Record[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any, 
    HttpErrorConstructor
  ])
  type UnknownError = js.Error | String | Double | StringDictionary[js.Any]
}
