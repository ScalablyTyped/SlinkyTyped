package typingsSlinky.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type APICallback[T] = js.Function2[
    /* err */ typingsSlinky.googleCloudTasks.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    scala.Unit
  ]
  type APIPaginatedCallback[T, U, V] = js.Function4[
    /* err */ typingsSlinky.googleCloudTasks.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    /* next */ js.UndefOr[U | scala.Null], 
    /* rawResponse */ js.UndefOr[V], 
    scala.Unit
  ]
  type CallOptions = js.Any
  type CreateNamedRequest[N /* <: java.lang.String */, T] = typingsSlinky.googleCloudTasks.mod.ParentRequest with typingsSlinky.googleCloudTasks.googleCloudTasksStrings.CreateNamedRequest with org.scalablytyped.runtime.TopLevel[js.Any]
  type EnhancedPick[T, Req /* <: /* keyof T */ java.lang.String */, Opt /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.std.Required[typingsSlinky.std.Pick[T, Req]]) with (typingsSlinky.std.Partial[typingsSlinky.std.Pick[T, Req]])
  type GoogleAuth = js.Any
  type GoogleAuthOptions = js.Any
  type GoogleError = js.Any
  type Keys[T] = /* keyof T */ java.lang.String
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  type UpdateNamedRequest[N /* <: java.lang.String */, T] = typingsSlinky.googleCloudTasks.mod.ParentRequest with typingsSlinky.googleCloudTasks.googleCloudTasksStrings.UpdateNamedRequest with org.scalablytyped.runtime.TopLevel[js.Any]
}
