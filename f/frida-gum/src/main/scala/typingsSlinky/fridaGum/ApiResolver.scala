package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides efficient API resolving using globs, allowing you to quickly
  * find functions by name, with globs permitted.
  */
@js.native
trait ApiResolver extends js.Object {
  /**
    * Performs the resolver-specific query.
    *
    * @param query Resolver-specific query.
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
  implicit class ApiResolverOps[Self <: ApiResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumerateMatches(value: String => js.Array[ApiResolverMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerateMatches")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

