package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.elasticsearch.elasticsearchStrings.internal
  - typingsSlinky.elasticsearch.elasticsearchStrings.external
  - typingsSlinky.elasticsearch.elasticsearchStrings.external_gte
  - typingsSlinky.elasticsearch.elasticsearchStrings.force
*/
trait VersionType extends js.Object

object VersionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsSlinky.elasticsearch.elasticsearchStrings.external = this.cast("external")
  @scala.inline
  def external_gte: typingsSlinky.elasticsearch.elasticsearchStrings.external_gte = this.cast("external_gte")
  @scala.inline
  def force: typingsSlinky.elasticsearch.elasticsearchStrings.force = this.cast("force")
  @scala.inline
  def internal: typingsSlinky.elasticsearch.elasticsearchStrings.internal = this.cast("internal")
}

