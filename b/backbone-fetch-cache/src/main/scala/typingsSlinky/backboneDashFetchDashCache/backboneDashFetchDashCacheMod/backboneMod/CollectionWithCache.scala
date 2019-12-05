package typingsSlinky.backboneDashFetchDashCache.backboneDashFetchDashCacheMod.backboneMod

import typingsSlinky.backbone.backboneMod.Collection
import typingsSlinky.backbone.backboneMod.Model
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWithCache extends Collection[Model] {
  def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
}

