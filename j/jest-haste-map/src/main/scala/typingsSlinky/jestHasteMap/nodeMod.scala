package typingsSlinky.jestHasteMap

import typingsSlinky.jestHasteMap.anon.HasteMap
import typingsSlinky.jestHasteMap.typesMod.CrawlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-haste-map/build/crawlers/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def apply(options: CrawlerOptions): js.Promise[HasteMap] = js.native
}
