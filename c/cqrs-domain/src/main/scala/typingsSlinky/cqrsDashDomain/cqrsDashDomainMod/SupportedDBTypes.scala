package typingsSlinky.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cqrsDashDomain.cqrsDashDomainStrings.mongodb
  - typings.cqrsDashDomain.cqrsDashDomainStrings.redis
  - typings.cqrsDashDomain.cqrsDashDomainStrings.tingodb
  - typings.cqrsDashDomain.cqrsDashDomainStrings.azuretable
  - typings.cqrsDashDomain.cqrsDashDomainStrings.inmemory
*/
trait SupportedDBTypes extends js.Object

object SupportedDBTypes {
  @scala.inline
  def azuretable: typingsSlinky.cqrsDashDomain.cqrsDashDomainStrings.azuretable = this.cast("azuretable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inmemory: typingsSlinky.cqrsDashDomain.cqrsDashDomainStrings.inmemory = this.cast("inmemory")
  @scala.inline
  def mongodb: typingsSlinky.cqrsDashDomain.cqrsDashDomainStrings.mongodb = this.cast("mongodb")
  @scala.inline
  def redis: typingsSlinky.cqrsDashDomain.cqrsDashDomainStrings.redis = this.cast("redis")
  @scala.inline
  def tingodb: typingsSlinky.cqrsDashDomain.cqrsDashDomainStrings.tingodb = this.cast("tingodb")
}

