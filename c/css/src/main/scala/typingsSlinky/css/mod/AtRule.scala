package typingsSlinky.css.mod

import typingsSlinky.css.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.css.mod.Charset
  - typingsSlinky.css.mod.CustomMedia
  - typingsSlinky.css.mod.Document
  - typingsSlinky.css.mod.FontFace
  - typingsSlinky.css.mod.Host
  - typingsSlinky.css.mod.Import
  - typingsSlinky.css.mod.KeyFrames
  - typingsSlinky.css.mod.Media
  - typingsSlinky.css.mod.Namespace
  - typingsSlinky.css.mod.Page
  - typingsSlinky.css.mod.Supports
*/
trait AtRule extends js.Object

object AtRule {
  @scala.inline
  def CustomMedia(
    media: String = null,
    name: String = null,
    parent: Node = null,
    position: Content = null,
    `type`: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Media(
    media: String = null,
    parent: Node = null,
    position: Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def FontFace(
    declarations: js.Array[Declaration | Comment] = null,
    parent: Node = null,
    position: Content = null,
    `type`: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def KeyFrames(
    keyframes: js.Array[KeyFrame | Comment] = null,
    name: String = null,
    parent: Node = null,
    position: Content = null,
    `type`: String = null,
    vendor: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Import(`import`: String = null, parent: Node = null, position: Content = null, `type`: String = null): AtRule = {
    val __obj = js.Dynamic.literal()
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Namespace(namespace: String = null, parent: Node = null, position: Content = null, `type`: String = null): AtRule = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Host(
    parent: Node = null,
    position: Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Page(
    declarations: js.Array[Declaration | Comment] = null,
    parent: Node = null,
    position: Content = null,
    selectors: js.Array[String] = null,
    `type`: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Charset(charset: String = null, parent: Node = null, position: Content = null, `type`: String = null): AtRule = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Supports(
    parent: Node = null,
    position: Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    supports: String = null,
    `type`: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
  @scala.inline
  def Document(
    document: String = null,
    parent: Node = null,
    position: Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: String = null,
    vendor: String = null
  ): AtRule = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRule]
  }
}

