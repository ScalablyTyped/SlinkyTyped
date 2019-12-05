package typingsSlinky.atNivoLegends.atNivoLegendsMod

import typingsSlinky.atNivoLegends.PartialitemTextColorstringitemBackgroundstringitem
import typingsSlinky.atNivoLegends.atNivoLegendsStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEffect extends js.Object {
  var on: hover
  var style: PartialitemTextColorstringitemBackgroundstringitem
}

object LegendEffect {
  @scala.inline
  def apply(on: hover, style: PartialitemTextColorstringitemBackgroundstringitem): LegendEffect = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LegendEffect]
  }
}

