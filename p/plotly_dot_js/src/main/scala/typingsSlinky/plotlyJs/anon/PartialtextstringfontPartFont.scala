package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Padding
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.container
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text  :string,   font  :std.Partial<plotly.js.plotly.js.Font>,   xref  :'container' | 'paper',   yref  :'container' | 'paper',   x  :number,   y  :number,   xanchor  :'auto' | 'left' | 'center' | 'right',   yanchor  :'auto' | 'top' | 'middle' | 'bottom',   pad  :std.Partial<plotly.js.plotly.js.Padding>}> */
trait PartialtextstringfontPartFont extends js.Object {
  var font: js.UndefOr[Partial[typingsSlinky.plotlyJs.mod.Font]] = js.undefined
  var pad: js.UndefOr[Partial[Padding]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  var xref: js.UndefOr[container | paper] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
  var yref: js.UndefOr[container | paper] = js.undefined
}

object PartialtextstringfontPartFont {
  @scala.inline
  def apply(
    font: Partial[typingsSlinky.plotlyJs.mod.Font] = null,
    pad: Partial[Padding] = null,
    text: String = null,
    x: js.UndefOr[Double] = js.undefined,
    xanchor: auto | left | center | right = null,
    xref: container | paper = null,
    y: js.UndefOr[Double] = js.undefined,
    yanchor: auto | top | middle | bottom = null,
    yref: container | paper = null
  ): PartialtextstringfontPartFont = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (xanchor != null) __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    if (xref != null) __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (yanchor != null) __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    if (yref != null) __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialtextstringfontPartFont]
  }
}

