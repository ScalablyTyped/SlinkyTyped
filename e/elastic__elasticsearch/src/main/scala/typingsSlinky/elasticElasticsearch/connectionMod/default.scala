package typingsSlinky.elasticElasticsearch.connectionMod

import typingsSlinky.elasticElasticsearch.anon.ALIVE
import typingsSlinky.elasticElasticsearch.anon.DATA_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch/lib/Connection", JSImport.Default)
@js.native
class default () extends Connection {
  def this(opts: ConnectionOptions) = this()
}

/* static members */
@JSImport("@elastic/elasticsearch/lib/Connection", JSImport.Default)
@js.native
object default extends js.Object {
  var roles: DATA_ = js.native
  var statuses: ALIVE = js.native
}

