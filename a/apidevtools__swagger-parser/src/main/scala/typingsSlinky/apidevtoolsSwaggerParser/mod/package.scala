package typingsSlinky.apidevtoolsSwaggerParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApiCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* api */ js.UndefOr[typingsSlinky.openapiTypes.mod.OpenAPI.Document], 
    js.Any
  ]
  type RefsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* $refs */ js.UndefOr[typingsSlinky.apidevtoolsSwaggerParser.mod.Refs], 
    js.Any
  ]
}
