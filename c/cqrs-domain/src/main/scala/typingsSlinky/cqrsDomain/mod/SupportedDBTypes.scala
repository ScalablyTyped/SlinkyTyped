package typingsSlinky.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cqrsDomain.cqrsDomainStrings.mongodb
  - typingsSlinky.cqrsDomain.cqrsDomainStrings.redis
  - typingsSlinky.cqrsDomain.cqrsDomainStrings.tingodb
  - typingsSlinky.cqrsDomain.cqrsDomainStrings.azuretable
  - typingsSlinky.cqrsDomain.cqrsDomainStrings.inmemory
*/
trait SupportedDBTypes extends js.Object

object SupportedDBTypes {
  @scala.inline
  def azuretable: typingsSlinky.cqrsDomain.cqrsDomainStrings.azuretable = this.cast("azuretable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inmemory: typingsSlinky.cqrsDomain.cqrsDomainStrings.inmemory = this.cast("inmemory")
  @scala.inline
  def mongodb: typingsSlinky.cqrsDomain.cqrsDomainStrings.mongodb = this.cast("mongodb")
  @scala.inline
  def redis: typingsSlinky.cqrsDomain.cqrsDomainStrings.redis = this.cast("redis")
  @scala.inline
  def tingodb: typingsSlinky.cqrsDomain.cqrsDomainStrings.tingodb = this.cast("tingodb")
}

