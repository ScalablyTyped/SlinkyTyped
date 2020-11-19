package typingsSlinky.elasticElasticsearch.poolMod

import typingsSlinky.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@elastic/elasticsearch/lib/pool", "CloudConnectionPool")
@js.native
class CloudConnectionPool () extends BaseConnectionPool {
  def this(opts: BaseConnectionPoolOptions) = this()
  
  var cloudConnection: default | Null = js.native
}
