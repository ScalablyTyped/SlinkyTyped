package typingsSlinky.reactDashMovable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMovable.Anon_Children
import typingsSlinky.reactDashMovable.Anon_Elements
import typingsSlinky.reactDashMovable.Anon_Index
import typingsSlinky.reactDashMovable.Anon_NewIndex
import typingsSlinky.reactDashMovable.libListMod.default
import typingsSlinky.reactDashMovable.libTypesMod.IProps
import typingsSlinky.reactDashMovable.libTypesMod.IVoiceover
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
    onChange: Anon_NewIndex => Unit,
    removableByMove: Boolean,
    renderItem: Anon_Index[Value] => TagMod[Any],
    renderList: Anon_Children => TagMod[Any],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ Anon_Elements => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashMovable.libListMod.default[js.Any]]]
  }
  type Props = IProps[js.Any]
}

