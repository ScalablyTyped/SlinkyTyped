package typingsSlinky.postcssSelectorParser.mod

import typingsSlinky.postcssSelectorParser.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss-selector-parser", "Processor")
@js.native
class Processor[TransformType, SyncSelectorsType /* <: Selectors | scala.Nothing */] () extends StObject {
  
  def ast(selectors: Selectors): js.Promise[Root_] = js.native
  def ast(selectors: Selectors, options: PartialOptions): js.Promise[Root_] = js.native
  
  def astSync(selectors: SyncSelectorsType): Root_ = js.native
  def astSync(selectors: SyncSelectorsType, options: PartialOptions): Root_ = js.native
  
  def process(selectors: Selectors): js.Promise[String] = js.native
  def process(selectors: Selectors, options: PartialOptions): js.Promise[String] = js.native
  
  def processSync(selectors: SyncSelectorsType): String = js.native
  def processSync(selectors: SyncSelectorsType, options: PartialOptions): String = js.native
  
  var res: Root_ = js.native
  
  val result: String_ = js.native
  
  def transform(selectors: Selectors): js.Promise[TransformType] = js.native
  def transform(selectors: Selectors, options: PartialOptions): js.Promise[TransformType] = js.native
  
  def transformSync(selectors: SyncSelectorsType): TransformType = js.native
  def transformSync(selectors: SyncSelectorsType, options: PartialOptions): TransformType = js.native
}
