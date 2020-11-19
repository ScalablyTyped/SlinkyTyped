package typingsSlinky.loadableServer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.loadableServer.mod.ChunkExtractor
import typingsSlinky.loadableServer.mod.ChunkExtractorManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChunkExtractorManager {
  
  @JSImport("@loadable/server", "ChunkExtractorManager")
  @js.native
  object component extends js.Object
  
  def withProps(p: ChunkExtractorManagerProps): Default[tag.type, typingsSlinky.loadableServer.mod.ChunkExtractorManager] = new Default[tag.type, typingsSlinky.loadableServer.mod.ChunkExtractorManager](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(extractor: ChunkExtractor): Default[tag.type, typingsSlinky.loadableServer.mod.ChunkExtractorManager] = {
    val __props = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.loadableServer.mod.ChunkExtractorManager](js.Array(this.component, __props.asInstanceOf[ChunkExtractorManagerProps]))
  }
}
