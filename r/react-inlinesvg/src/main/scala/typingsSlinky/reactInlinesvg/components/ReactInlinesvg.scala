package typingsSlinky.reactInlinesvg.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactInlinesvg.helpersMod.InlineSVGError
import typingsSlinky.reactInlinesvg.mod.IFetchError
import typingsSlinky.reactInlinesvg.mod.IProps
import typingsSlinky.reactInlinesvg.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInlinesvg
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-inlinesvg", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    src: String,
    baseURL: String = null,
    cacheRequests: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    innerRef: Ref[HTMLElement] = null,
    loader: TagMod[Any] = null,
    onError: /* error */ InlineSVGError | IFetchError => Unit = null,
    onLoad: (/* src */ String, /* isCached */ Boolean) => Unit = null,
    preProcessor: /* code */ String => String = null,
    uniqueHash: String = null,
    uniquifyIDs: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheRequests)) __obj.updateDynamic("cacheRequests")(cacheRequests.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2(onLoad))
    if (preProcessor != null) __obj.updateDynamic("preProcessor")(js.Any.fromFunction1(preProcessor))
    if (uniqueHash != null) __obj.updateDynamic("uniqueHash")(uniqueHash.asInstanceOf[js.Any])
    if (!js.isUndefined(uniquifyIDs)) __obj.updateDynamic("uniquifyIDs")(uniquifyIDs.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IProps
}

