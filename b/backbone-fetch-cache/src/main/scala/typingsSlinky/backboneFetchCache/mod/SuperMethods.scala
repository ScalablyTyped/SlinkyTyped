package typingsSlinky.backboneFetchCache.mod

import typingsSlinky.backbone.mod.CollectionFetchOptions
import typingsSlinky.backbone.mod.ModelFetchOptions
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperMethods extends js.Object {
  
  def collectionFetch(): JQueryXHR = js.native
  def collectionFetch(options: CollectionFetchOptions): JQueryXHR = js.native
  
  def modelFetch(): JQueryXHR = js.native
  def modelFetch(options: ModelFetchOptions): JQueryXHR = js.native
  
  def modelSync(arg: js.Any*): JQueryXHR = js.native
}
