package typingsSlinky.loadableServer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.loadableServer.mod.ChunkExtractor
import typingsSlinky.loadableServer.mod.ChunkExtractorManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ChunkExtractorManager
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.loadableServer.mod.ChunkExtractorManager] {
  @JSImport("@loadable/server", "ChunkExtractorManager")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(extractor: ChunkExtractor, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.loadableServer.mod.ChunkExtractorManager] = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChunkExtractorManagerProps
}

