package typingsSlinky.backboneFetchCache.mod.backboneAugmentingMod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionWithCache
  extends Collection[Model[js.Any, ModelSetOptions]] {
  
  def fetch(options: CollectionFetchWithCacheOptions): JQueryXHR = js.native
}
