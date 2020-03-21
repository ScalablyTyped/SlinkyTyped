package typingsSlinky.reactAvatarEditor.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.File
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactAvatarEditor.mod.AvatarEditorProps
import typingsSlinky.reactAvatarEditor.mod.ImageState
import typingsSlinky.reactAvatarEditor.mod.Position
import typingsSlinky.reactAvatarEditor.mod.default
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAvatarEditor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-avatar-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    image: String | File,
    border: Double | js.Array[Double] = null,
    borderRadius: Int | Double = null,
    color: js.Array[Double] = null,
    crossOrigin: String = null,
    disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined,
    disableDrop: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onDropFile: /* event */ DragEvent => Unit = null,
    onImageChange: () => Unit = null,
    onImageReady: /* event */ Event_ => Unit = null,
    onLoadFailure: /* event */ Event_ => Unit = null,
    onLoadSuccess: /* imgInfo */ ImageState => Unit = null,
    onMouseMove: /* event */ Event_ => Unit = null,
    onMouseUp: () => Unit = null,
    onPositionChange: /* position */ Position => Unit = null,
    position: Position = null,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    style: js.Object = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBoundaryChecks)) __obj.updateDynamic("disableBoundaryChecks")(disableBoundaryChecks.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDrop)) __obj.updateDynamic("disableDrop")(disableDrop.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDropFile != null) __obj.updateDynamic("onDropFile")(js.Any.fromFunction1(onDropFile))
    if (onImageChange != null) __obj.updateDynamic("onImageChange")(js.Any.fromFunction0(onImageChange))
    if (onImageReady != null) __obj.updateDynamic("onImageReady")(js.Any.fromFunction1(onImageReady))
    if (onLoadFailure != null) __obj.updateDynamic("onLoadFailure")(js.Any.fromFunction1(onLoadFailure))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction0(onMouseUp))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1(onPositionChange))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AvatarEditorProps
}

