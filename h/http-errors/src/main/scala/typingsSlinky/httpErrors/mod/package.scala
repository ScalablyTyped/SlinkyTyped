package typingsSlinky.httpErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CreateHttpError = js.Function1[
    /* repeated */ typingsSlinky.httpErrors.mod.UnknownError, 
    typingsSlinky.httpErrors.mod.HttpError
  ]
  
  type HttpErrorConstructor = org.scalablytyped.runtime.Instantiable1[/* msg */ js.UndefOr[java.lang.String], typingsSlinky.httpErrors.mod.HttpError]
  
  type IsHttpError = js.Function1[/* error */ js.Any, /* is http-errors.http-errors.HttpError */ scala.Boolean]
  
  type UnknownError = js.Error | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any]
}
