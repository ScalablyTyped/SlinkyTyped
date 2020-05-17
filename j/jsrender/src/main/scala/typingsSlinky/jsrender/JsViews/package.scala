package typingsSlinky.jsrender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JsViews {
  // Converters
  type Converter = js.Function2[/* value */ js.Any, /* repeated */ js.Any, js.Any]
  /* Generic hash of objects of type T */
  type Hash[T] = org.scalablytyped.runtime.StringDictionary[T]
  type TagRenderMethod = js.Function1[/* repeated */ js.Any, java.lang.String]
}
