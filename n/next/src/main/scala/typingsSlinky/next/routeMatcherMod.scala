package typingsSlinky.next

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.next.anon.Groups
import typingsSlinky.next.nextBooleans.`false`
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/next-server/lib/router/utils/route-matcher", JSImport.Namespace)
@js.native
object routeMatcherMod extends js.Object {
  
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[
    /* pathname */ js.UndefOr[String | Null], 
    `false` | (StringDictionary[String | js.Array[String]])
  ] = js.native
}
