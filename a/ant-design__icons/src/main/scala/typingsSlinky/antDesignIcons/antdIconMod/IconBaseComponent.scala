package typingsSlinky.antDesignIcons.antdIconMod

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.antDesignIcons.twoTonePrimaryColorMod.TwoToneColor
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconBaseComponent[Props] extends ForwardRefExoticComponent[Props with RefAttributes[HTMLSpanElement]] {
  var getTwoToneColor: js.Function0[TwoToneColor] = js.native
  var setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
}

