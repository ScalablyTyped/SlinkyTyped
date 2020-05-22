package typingsSlinky.backboneFetchCache.mod.backboneAugmentingMod

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelWithCache
  extends Model[js.Any, ModelSetOptions] {
  def fetch(options: ModelFetchWithCacheOptions): JQueryXHR = js.native
}

