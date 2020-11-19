package typingsSlinky.featherRouteMatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Matcher[T] = js.Function1[/* path */ java.lang.String, typingsSlinky.featherRouteMatcher.mod.Match[T]]
  
  type RouteConfig[T] = org.scalablytyped.runtime.StringDictionary[T]
}
