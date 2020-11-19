package typingsSlinky.elasticElasticsearch.poolMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionPoolOptions extends BaseConnectionPoolOptions {
  
  var pingTimeout: js.UndefOr[Double] = js.native
  
  var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.native
  
  var sniffEnabled: js.UndefOr[Boolean] = js.native
}
