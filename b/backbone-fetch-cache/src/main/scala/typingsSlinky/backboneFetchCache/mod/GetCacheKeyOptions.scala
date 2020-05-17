package typingsSlinky.backboneFetchCache.mod

import typingsSlinky.backboneFetchCache.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.backboneFetchCache.anon.Url
  - typingsSlinky.backboneFetchCache.mod.GetCacheKeyObject
*/
trait GetCacheKeyOptions extends js.Object

object GetCacheKeyOptions {
  @scala.inline
  implicit def apply(value: GetCacheKeyObject): GetCacheKeyOptions = value.asInstanceOf[GetCacheKeyOptions]
  @scala.inline
  implicit def apply(value: String): GetCacheKeyOptions = value.asInstanceOf[GetCacheKeyOptions]
  @scala.inline
  implicit def apply(value: Url): GetCacheKeyOptions = value.asInstanceOf[GetCacheKeyOptions]
}

