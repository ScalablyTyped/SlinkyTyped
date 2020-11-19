package typingsSlinky.apolloCacheControl.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CacheScope extends js.Object
@JSImport("apollo-cache-control", "CacheScope")
@js.native
object CacheScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CacheScope with String] = js.native
  
  @js.native
  sealed trait Private extends CacheScope
  /* "PRIVATE" */ @js.native
  object Private extends TopLevel[Private with String]
  
  @js.native
  sealed trait Public extends CacheScope
  /* "PUBLIC" */ @js.native
  object Public extends TopLevel[Public with String]
}
