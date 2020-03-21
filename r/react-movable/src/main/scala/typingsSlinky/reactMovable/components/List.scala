package typingsSlinky.reactMovable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactMovable.AnonChildren
import typingsSlinky.reactMovable.AnonElements
import typingsSlinky.reactMovable.AnonIndex
import typingsSlinky.reactMovable.AnonNewIndex
import typingsSlinky.reactMovable.listMod.default
import typingsSlinky.reactMovable.typesMod.IProps
import typingsSlinky.reactMovable.typesMod.IVoiceover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-movable/lib/List", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[Value](
    lockVertically: Boolean,
    onChange: AnonNewIndex => Unit,
    removableByMove: Boolean,
    renderItem: AnonIndex[Value] => TagMod[Any],
    renderList: AnonChildren => TagMod[Any],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ AnonElements => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMovable.listMod.default[js.Any]]]
  }
  type Props = IProps[js.Any]
}

