package typingsSlinky.reactJsonTree.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactJsonTree.mod.JSONTreeProps
import typingsSlinky.reactJsonTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonTree
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-json-tree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[_] | js.Object,
    collectionLimit: Int | Double = null,
    getItemString: (/* type */ String, /* data */ js.Array[_] | js.Object, /* itemType */ String, /* itemString */ String) => ReactElement = null,
    hideRoot: js.UndefOr[Boolean] = js.undefined,
    invertTheme: js.UndefOr[Boolean] = js.undefined,
    isCustomNode: () => Boolean = null,
    keyPath: js.Array[String | Double] = null,
    labelRenderer: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => ReactElement = null,
    postprocessValue: /* raw */ String => ReactElement = null,
    shouldExpandNode: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[_] | js.Object, /* level */ Double) => Boolean = null,
    sortObjectKeys: js.Function | Boolean = null,
    theme: js.Object | String = null,
    valueRenderer: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (collectionLimit != null) __obj.updateDynamic("collectionLimit")(collectionLimit.asInstanceOf[js.Any])
    if (getItemString != null) __obj.updateDynamic("getItemString")(js.Any.fromFunction4(getItemString))
    if (!js.isUndefined(hideRoot)) __obj.updateDynamic("hideRoot")(hideRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(invertTheme)) __obj.updateDynamic("invertTheme")(invertTheme.asInstanceOf[js.Any])
    if (isCustomNode != null) __obj.updateDynamic("isCustomNode")(js.Any.fromFunction0(isCustomNode))
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(js.Any.fromFunction4(labelRenderer))
    if (postprocessValue != null) __obj.updateDynamic("postprocessValue")(js.Any.fromFunction1(postprocessValue))
    if (shouldExpandNode != null) __obj.updateDynamic("shouldExpandNode")(js.Any.fromFunction3(shouldExpandNode))
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueRenderer != null) __obj.updateDynamic("valueRenderer")(js.Any.fromFunction3(valueRenderer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = JSONTreeProps
}

