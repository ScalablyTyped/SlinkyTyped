package typingsSlinky.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides efficient API resolving using globs, allowing you to quickly
  * find functions by name, with globs permitted.
  */
@js.native
trait ApiResolver extends StObject {
  
  /**
    * Performs the resolver-specific query.
    *
    * @param query Resolver-specific query, optionally suffixed with `/i` to
    *              perform case-insensitive matching.
    */
  def enumerateMatches(query: String): js.Array[ApiResolverMatch] = js.native
}
object ApiResolver {
  
  @scala.inline
  def apply(enumerateMatches: String => js.Array[ApiResolverMatch]): ApiResolver = {
    val __obj = js.Dynamic.literal(enumerateMatches = js.Any.fromFunction1(enumerateMatches))
    __obj.asInstanceOf[ApiResolver]
  }
  
  @scala.inline
  implicit class ApiResolverMutableBuilder[Self <: ApiResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumerateMatches(value: String => js.Array[ApiResolverMatch]): Self = StObject.set(x, "enumerateMatches", js.Any.fromFunction1(value))
  }
}
