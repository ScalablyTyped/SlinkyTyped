package typingsSlinky.reactInstantsearch.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactInstantsearchDom.AnonHit
import typingsSlinky.reactInstantsearchDom.mod.HitsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hits
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactInstantsearch.domMod.Hits[js.Any]] {
  @JSImport("react-instantsearch/dom", "Hits")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](hitComponent: ReactComponentClass[AnonHit[T]] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactInstantsearch.domMod.Hits[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (hitComponent != null) __obj.updateDynamic("hitComponent")(hitComponent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactInstantsearch.domMod.Hits[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactInstantsearch.domMod.Hits[js.Any]] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactInstantsearch.domMod.Hits[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HitsProps[js.Any]
}

