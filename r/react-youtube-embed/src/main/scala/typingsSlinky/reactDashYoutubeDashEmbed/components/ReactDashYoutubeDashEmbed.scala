package typingsSlinky.reactDashYoutubeDashEmbed.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashYoutubeDashEmbed.reactDashYoutubeDashEmbedMod.YouTubeEmbedProps
import typingsSlinky.reactDashYoutubeDashEmbed.reactDashYoutubeDashEmbedMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashYoutubeDashEmbed
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-youtube-embed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    id: String,
    appendSrc: String = null,
    aspectRatio: String = null,
    prependSrc: String = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (appendSrc != null) __obj.updateDynamic("appendSrc")(appendSrc.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (prependSrc != null) __obj.updateDynamic("prependSrc")(prependSrc.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = YouTubeEmbedProps
}

