package typingsSlinky.boxen.boxenMod

import typingsSlinky.boxen.boxenStrings.black
import typingsSlinky.boxen.boxenStrings.blackBright
import typingsSlinky.boxen.boxenStrings.blue
import typingsSlinky.boxen.boxenStrings.blueBright
import typingsSlinky.boxen.boxenStrings.center
import typingsSlinky.boxen.boxenStrings.cyan
import typingsSlinky.boxen.boxenStrings.cyanBright
import typingsSlinky.boxen.boxenStrings.gray
import typingsSlinky.boxen.boxenStrings.green
import typingsSlinky.boxen.boxenStrings.greenBright
import typingsSlinky.boxen.boxenStrings.grey
import typingsSlinky.boxen.boxenStrings.left
import typingsSlinky.boxen.boxenStrings.magenta
import typingsSlinky.boxen.boxenStrings.magentaBright
import typingsSlinky.boxen.boxenStrings.red
import typingsSlinky.boxen.boxenStrings.redBright
import typingsSlinky.boxen.boxenStrings.right
import typingsSlinky.boxen.boxenStrings.white
import typingsSlinky.boxen.boxenStrings.whiteBright
import typingsSlinky.boxen.boxenStrings.yellow
import typingsSlinky.boxen.boxenStrings.yellowBright
import typingsSlinky.typeDashFest.typeDashFestMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Align the text in the box based on the widest line.
  		@default 'left'
  		*/
  val align: js.UndefOr[left | right | center] = js.undefined
  /**
  		Color of the background.
  		*/
  val backgroundColor: js.UndefOr[
    LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ]
  ] = js.undefined
  /**
  		Color of the box border.
  		*/
  val borderColor: js.UndefOr[
    LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ]
  ] = js.undefined
  /**
  		Style of the box border.
  		@default BorderStyle.Single
  		*/
  val borderStyle: js.UndefOr[BorderStyle | CustomBorderStyle] = js.undefined
  /**
  		Reduce opacity of the border.
  		@default false
  		*/
  val dimBorder: js.UndefOr[Boolean] = js.undefined
  /**
  		Float the box on the available terminal screen space.
  		@default 'left'
  		*/
  val float: js.UndefOr[left | right | center] = js.undefined
  /**
  		Space around the box.
  		@default 0
  		*/
  val margin: js.UndefOr[Double | Spacing] = js.undefined
  /**
  		Space between the text and box border.
  		@default 0
  		*/
  val padding: js.UndefOr[Double | Spacing] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: left | right | center = null,
    backgroundColor: LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ] = null,
    borderColor: LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ] = null,
    borderStyle: BorderStyle | CustomBorderStyle = null,
    dimBorder: js.UndefOr[Boolean] = js.undefined,
    float: left | right | center = null,
    margin: Double | Spacing = null,
    padding: Double | Spacing = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dimBorder)) __obj.updateDynamic("dimBorder")(dimBorder.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

