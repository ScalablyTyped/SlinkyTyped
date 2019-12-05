package typingsSlinky.reactDashJss

import slinky.core.TagMod
import typingsSlinky.jss.jssMod.CreateGenerateIdOptions
import typingsSlinky.jss.jssMod.GenerateId
import typingsSlinky.jss.jssMod.Jss
import typingsSlinky.jss.jssMod.Rule
import typingsSlinky.jss.jssMod.SheetsRegistry
import typingsSlinky.jss.jssMod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: TagMod[Any]
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: TagMod[Any],
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    id: CreateGenerateIdOptions = null,
    jss: Jss = null,
    registry: SheetsRegistry = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

