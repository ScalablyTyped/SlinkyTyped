package typingsSlinky.algoliaRequesterNodeHttp

import typingsSlinky.algoliaRequesterCommon.mod.Destroyable
import typingsSlinky.algoliaRequesterCommon.mod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/requester-node-http", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createNodeHttpRequester(): Requester with Destroyable = js.native
}

