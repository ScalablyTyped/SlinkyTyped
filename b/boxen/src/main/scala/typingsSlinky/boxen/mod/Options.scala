package typingsSlinky.boxen.mod

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
import typingsSlinky.typeFest.mod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Align the text in the box based on the widest line.
  		@default 'left'
  		*/
  val align: js.UndefOr[left | right | center] = js.native
  /**
  		Color of the background.
  		*/
  val backgroundColor: js.UndefOr[
    LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ]
  ] = js.native
  /**
  		Color of the box border.
  		*/
  val borderColor: js.UndefOr[
    LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ]
  ] = js.native
  /**
  		Style of the box border.
  		@default BorderStyle.Single
  		*/
  val borderStyle: js.UndefOr[BorderStyle | CustomBorderStyle] = js.native
  /**
  		Reduce opacity of the border.
  		@default false
  		*/
  val dimBorder: js.UndefOr[Boolean] = js.native
  /**
  		Float the box on the available terminal screen space.
  		@default 'left'
  		*/
  val float: js.UndefOr[left | right | center] = js.native
  /**
  		Space around the box.
  		@default 0
  		*/
  val margin: js.UndefOr[Double | Spacing] = js.native
  /**
  		Space between the text and box border.
  		@default 0
  		*/
  val padding: js.UndefOr[Double | Spacing] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | right | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(
      value: LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(
      value: LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStyle(value: BorderStyle | CustomBorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDimBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: left | right | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double | Spacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | Spacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

