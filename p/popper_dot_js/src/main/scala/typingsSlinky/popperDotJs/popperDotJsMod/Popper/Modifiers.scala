package typingsSlinky.popperDotJs.popperDotJsMod.Popper

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popperDotJs.Anon_Behavior
import typingsSlinky.popperDotJs.Anon_Bottom
import typingsSlinky.popperDotJs.Anon_BoundariesElement
import typingsSlinky.popperDotJs.Anon_Element
import typingsSlinky.popperDotJs.Anon_GpuAcceleration
import typingsSlinky.popperDotJs.Anon_Offset
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* name */ StringDictionary[
      js.UndefOr[
        typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with (Record[String, _])
      ]
    ] {
  var applyStyle: js.UndefOr[
    typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_GpuAcceleration
  ] = js.undefined
  var arrow: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Element] = js.undefined
  var computeStyle: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Bottom] = js.undefined
  var flip: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Behavior] = js.undefined
  var hide: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var inner: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var keepTogether: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
  var offset: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Offset] = js.undefined
  var preventOverflow: js.UndefOr[
    typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_BoundariesElement
  ] = js.undefined
  var shift: js.UndefOr[typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      js.UndefOr[
        typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with (Record[String, _])
      ]
    ] = null,
    applyStyle: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_GpuAcceleration = null,
    arrow: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Element = null,
    computeStyle: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Bottom = null,
    flip: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Behavior = null,
    hide: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    inner: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    keepTogether: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier = null,
    offset: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_Offset = null,
    preventOverflow: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier with Anon_BoundariesElement = null,
    shift: typingsSlinky.popperDotJs.popperDotJsMod.Popper.BaseModifier = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (applyStyle != null) __obj.updateDynamic("applyStyle")(applyStyle.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (computeStyle != null) __obj.updateDynamic("computeStyle")(computeStyle.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (keepTogether != null) __obj.updateDynamic("keepTogether")(keepTogether.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
}

