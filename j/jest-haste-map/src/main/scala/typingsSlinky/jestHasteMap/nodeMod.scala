package typingsSlinky.jestHasteMap

import typingsSlinky.jestHasteMap.typesMod.CrawlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/crawlers/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  def apply(options: CrawlerOptions): js.Promise[AnonHasteMap] = js.native
}

