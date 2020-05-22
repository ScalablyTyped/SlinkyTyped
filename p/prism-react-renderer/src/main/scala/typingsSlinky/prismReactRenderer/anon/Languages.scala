package typingsSlinky.prismReactRenderer.anon

import typingsSlinky.prismReactRenderer.mod.Language
import typingsSlinky.prismReactRenderer.mod.PrismThemeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Languages extends js.Object {
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
  var style: PrismThemeEntry
  var types: js.Array[String]
}

object Languages {
  @scala.inline
  def apply(style: PrismThemeEntry, types: js.Array[String], languages: js.Array[Language] = null): Languages = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
}

