package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frameworkFrameworkMod {
  type FrameworkMetadata = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.Any]
  type Frameworks = /** @public */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Framework[js.Function]]
  type Headers = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  type StandardHandler = js.Function3[
    /* body */ typingsSlinky.actionsOnGoogle.commonMod.JsonObject, 
    /* headers */ typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Headers, 
    /* metadata */ js.UndefOr[typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata], 
    js.Promise[typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.StandardResponse]
  ]
}
