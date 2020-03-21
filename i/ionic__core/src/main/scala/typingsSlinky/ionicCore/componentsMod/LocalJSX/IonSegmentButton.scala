package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.ionicCoreStrings.button
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import typingsSlinky.ionicCore.ionicCoreStrings.reset
import typingsSlinky.ionicCore.ionicCoreStrings.submit
import typingsSlinky.ionicCore.segmentSegmentInterfaceMod.SegmentButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSegmentButton extends js.Object {
  /**
    * If `true`, the segment button is selected.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the layout of the text and icon in the segment.
    */
  var layout: js.UndefOr[SegmentButtonLayout] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted when the segment button is clicked.
    */
  var onIonSelect: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
  /**
    * The value of the segment button.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IonSegmentButton {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    layout: SegmentButtonLayout = null,
    mode: ios | md = null,
    onIonSelect: /* event */ CustomEvent => Unit = null,
    `type`: submit | reset | button = null,
    value: String = null
  ): IonSegmentButton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonSelect != null) __obj.updateDynamic("onIonSelect")(js.Any.fromFunction1(onIonSelect))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSegmentButton]
  }
}

