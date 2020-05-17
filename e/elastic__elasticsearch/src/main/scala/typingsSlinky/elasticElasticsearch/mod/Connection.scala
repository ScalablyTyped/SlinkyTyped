package typingsSlinky.elasticElasticsearch.mod

import typingsSlinky.elasticElasticsearch.anon.ALIVE
import typingsSlinky.elasticElasticsearch.anon.DATA_
import typingsSlinky.elasticElasticsearch.connectionMod.ConnectionOptions
import typingsSlinky.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "Connection")
@js.native
class Connection () extends default {
  def this(opts: ConnectionOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch", "Connection")
@js.native
object Connection extends js.Object {
  var roles: DATA_ = js.native
  var statuses: ALIVE = js.native
}

