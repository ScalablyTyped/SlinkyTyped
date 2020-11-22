package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAsyncMatcher extends js.Object {
  
  def compare(actual: js.Any, expected: js.Any*): js.Thenable[CustomMatcherResult] = js.native
  def compare[T](actual: T, expected: T, args: js.Any*): js.Thenable[CustomMatcherResult] = js.native
  
  var negativeCompare: (js.UndefOr[
    js.Function3[
      /* actual */ js.Any, 
      /* expected */ js.Any, 
      /* repeated */ js.Any, 
      js.Thenable[CustomMatcherResult]
    ]
  ]) with (js.UndefOr[
    js.Function2[/* actual */ js.Any, /* repeated */ js.Any, js.Thenable[CustomMatcherResult]]
  ]) = js.native
}
