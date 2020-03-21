package typingsSlinky.backboneFetchCache.mod.backboneAugmentingMod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWithCache extends Collection[Model] {
  def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
}

