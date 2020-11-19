package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.chalk.mod.Chalk
import typingsSlinky.ink.colorMod.Props
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Color {
  
  @JSImport("ink/build/components/Color", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def ansi(value: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String): this.type = set("ansi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ansi256(value: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String): this.type = set("ansi256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgAnsi(value: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String): this.type = set("bgAnsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgAnsi256(value: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String): this.type = set("bgAnsi256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgBlack(value: Boolean): this.type = set("bgBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgBlackBright(value: Boolean): this.type = set("bgBlackBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgBlue(value: Boolean): this.type = set("bgBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgBlueBright(value: Boolean): this.type = set("bgBlueBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgCyan(value: Boolean): this.type = set("bgCyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgCyanBright(value: Boolean): this.type = set("bgCyanBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgGray(value: Boolean): this.type = set("bgGray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgGreen(value: Boolean): this.type = set("bgGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgGreenBright(value: Boolean): this.type = set("bgGreenBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgGrey(value: Boolean): this.type = set("bgGrey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgHex(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): this.type = set("bgHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgHsl(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
        ]) | String
    ): this.type = set("bgHsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgHsv(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
        ]) | String
    ): this.type = set("bgHsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgHwb(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
        ]) | String
    ): this.type = set("bgHwb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgKeyword(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): this.type = set("bgKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgMagenta(value: Boolean): this.type = set("bgMagenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgMagentaBright(value: Boolean): this.type = set("bgMagentaBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgRed(value: Boolean): this.type = set("bgRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgRedBright(value: Boolean): this.type = set("bgRedBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgRgb(
      value: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
    ): this.type = set("bgRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgWhite(value: Boolean): this.type = set("bgWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgWhiteBright(value: Boolean): this.type = set("bgWhiteBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgYellow(value: Boolean): this.type = set("bgYellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bgYellowBright(value: Boolean): this.type = set("bgYellowBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def black(value: Boolean): this.type = set("black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blackBright(value: Boolean): this.type = set("blackBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blue(value: Boolean): this.type = set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blueBright(value: Boolean): this.type = set("blueBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cyan(value: Boolean): this.type = set("cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cyanBright(value: Boolean): this.type = set("cyanBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dim(value: Boolean): this.type = set("dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gray(value: Boolean): this.type = set("gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def green(value: Boolean): this.type = set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def greenBright(value: Boolean): this.type = set("greenBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def grey(value: Boolean): this.type = set("grey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hex(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): this.type = set("hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hsl(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
        ]) | String
    ): this.type = set("hsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hsv(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
        ]) | String
    ): this.type = set("hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hwb(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
        ]) | String
    ): this.type = set("hwb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverse(value: Boolean): this.type = set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyword(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): this.type = set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magenta(value: Boolean): this.type = set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def magentaBright(value: Boolean): this.type = set("magentaBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def red(value: Boolean): this.type = set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def redBright(value: Boolean): this.type = set("redBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reset(value: Boolean): this.type = set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rgb(
      value: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
    ): this.type = set("rgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strikethrough(value: Boolean): this.type = set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def white(value: Boolean): this.type = set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def whiteBright(value: Boolean): this.type = set("whiteBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yellow(value: Boolean): this.type = set("yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yellowBright(value: Boolean): this.type = set("yellowBright", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Color.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
