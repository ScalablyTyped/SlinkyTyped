package typingsSlinky.ansiEscapeSequences

import typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesNumbers.`0`
import typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesNumbers.`1`
import typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesNumbers.`2`
import typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object cursor {
    
    /**
      * Moves the cursor `lines` cells back. If the cursor is already at the edge
      * of the screen, this has no effect.
      * @param lines default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.back")
    @js.native
    def back(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.back")
    @js.native
    def back(lines: Double): String = js.native
    
    /**
      * Moves the cursor `lines` cells down. If the cursor is already at the edge
      * of the screen, this has no effect.
      * @param lines default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.down")
    @js.native
    def down(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.down")
    @js.native
    def down(lines: Double): String = js.native
    
    /**
      * Moves the cursor `lines` cells forward. If the cursor is already at the
      * edge of the screen, this has no effect.
      * @param lines default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.forward")
    @js.native
    def forward(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.forward")
    @js.native
    def forward(lines: Double): String = js.native
    
    /**
      * Hides the cursor
      */
    @JSImport("ansi-escape-sequences", "cursor.hide")
    @js.native
    val hide: String = js.native
    
    /**
      * Moves the cursor to column n.
      * @param n column number
      */
    @JSImport("ansi-escape-sequences", "cursor.horizontalAbsolute")
    @js.native
    def horizontalAbsolute(n: Double): String = js.native
    
    /**
      * Moves cursor to beginning of the line n lines down.
      * @param lines default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.nextLine")
    @js.native
    def nextLine(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.nextLine")
    @js.native
    def nextLine(lines: Double): String = js.native
    
    /**
      * Moves the cursor to row n, column m. The values are 1-based, and default
      * to 1 (top left corner) if omitted.
      *
      * @param n row number, default=1
      * @param m column number, default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.position")
    @js.native
    def position(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.position")
    @js.native
    def position(n: js.UndefOr[scala.Nothing], m: Double): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.position")
    @js.native
    def position(n: Double): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.position")
    @js.native
    def position(n: Double, m: Double): String = js.native
    
    /**
      * Moves cursor to beginning of the line n lines up.
      * @param lines default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.previousLine")
    @js.native
    def previousLine(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.previousLine")
    @js.native
    def previousLine(lines: Double): String = js.native
    
    /**
      * Shows the cursor
      */
    @JSImport("ansi-escape-sequences", "cursor.show")
    @js.native
    val show: String = js.native
    
    /**
      * Moves the cursor `lines` cells up. If the cursor is already at the edge
      * of the screen, this has no effect.
      * @param lines default=1
      */
    @JSImport("ansi-escape-sequences", "cursor.up")
    @js.native
    def up(): String = js.native
    @JSImport("ansi-escape-sequences", "cursor.up")
    @js.native
    def up(lines: Double): String = js.native
  }
  
  object erase {
    
    /**
      * Clears part of the screen. If n is 0 (or missing), clear from cursor to
      * end of screen. If n is 1, clear from cursor to beginning of the screen.
      * If n is 2, clear entire screen. If n is 3, clear entire screen and delete
      * all lines saved in the scrollback buffer (some terminals only).
      */
    @JSImport("ansi-escape-sequences", "erase.display")
    @js.native
    def display(): String = js.native
    @JSImport("ansi-escape-sequences", "erase.display")
    @js.native
    def display_0(n: `0`): String = js.native
    @JSImport("ansi-escape-sequences", "erase.display")
    @js.native
    def display_1(n: `1`): String = js.native
    @JSImport("ansi-escape-sequences", "erase.display")
    @js.native
    def display_2(n: `2`): String = js.native
    @JSImport("ansi-escape-sequences", "erase.display")
    @js.native
    def display_3(n: `3`): String = js.native
    
    /**
      * Erases part of the line. If n is zero (or missing), clear from cursor to
      * the end of the line. If n is one, clear from cursor to beginning of the
      * line. If n is two, clear entire line. Cursor position does not change.
      */
    @JSImport("ansi-escape-sequences", "erase.inLine")
    @js.native
    def inLine(): String = js.native
    @JSImport("ansi-escape-sequences", "erase.inLine")
    @js.native
    def inLine_0(n: `0`): String = js.native
    @JSImport("ansi-escape-sequences", "erase.inLine")
    @js.native
    def inLine_1(n: `1`): String = js.native
    @JSImport("ansi-escape-sequences", "erase.inLine")
    @js.native
    def inLine_2(n: `2`): String = js.native
  }
  
  @JSImport("ansi-escape-sequences", "format")
  @js.native
  def format(str: String): String = js.native
  @JSImport("ansi-escape-sequences", "format")
  @js.native
  def format(str: String, styles: js.Array[Style_]): String = js.native
  @JSImport("ansi-escape-sequences", "format")
  @js.native
  def format(str: String, styles: Style_): String = js.native
  
  /* Inlined {[ K in ansi-escape-sequences.ansi-escape-sequences.Style ]: string} */
  object style {
    
    @JSImport("ansi-escape-sequences", "style")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ansi-escape-sequences", "style.bg-black")
    @js.native
    def bgBlack: String = js.native
    
    @scala.inline
    def bgBlack_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-black")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-blue")
    @js.native
    def bgBlue: String = js.native
    
    @scala.inline
    def bgBlue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-blue")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-cyan")
    @js.native
    def bgCyan: String = js.native
    
    @scala.inline
    def bgCyan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-cyan")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-gray")
    @js.native
    def bgGray: String = js.native
    
    @scala.inline
    def bgGray_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-gray")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-green")
    @js.native
    def bgGreen: String = js.native
    
    @scala.inline
    def bgGreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-green")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-grey")
    @js.native
    def bgGrey: String = js.native
    
    @scala.inline
    def bgGrey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-grey")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-magenta")
    @js.native
    def bgMagenta: String = js.native
    
    @scala.inline
    def bgMagenta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-magenta")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-red")
    @js.native
    def bgRed: String = js.native
    
    @scala.inline
    def bgRed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-red")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-white")
    @js.native
    def bgWhite: String = js.native
    
    @scala.inline
    def bgWhite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-white")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-yellow")
    @js.native
    def bgYellow: String = js.native
    
    @scala.inline
    def bgYellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-yellow")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.black")
    @js.native
    def black: String = js.native
    @scala.inline
    def black_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.blue")
    @js.native
    def blue: String = js.native
    @scala.inline
    def blue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bold")
    @js.native
    def bold: String = js.native
    @scala.inline
    def bold_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.cyan")
    @js.native
    def cyan: String = js.native
    @scala.inline
    def cyan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyan")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font2")
    @js.native
    def font2: String = js.native
    @scala.inline
    def font2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font2")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font3")
    @js.native
    def font3: String = js.native
    @scala.inline
    def font3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font3")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font4")
    @js.native
    def font4: String = js.native
    @scala.inline
    def font4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font4")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font5")
    @js.native
    def font5: String = js.native
    @scala.inline
    def font5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font5")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font6")
    @js.native
    def font6: String = js.native
    @scala.inline
    def font6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font6")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.fontDefault")
    @js.native
    def fontDefault: String = js.native
    @scala.inline
    def fontDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.gray")
    @js.native
    def gray: String = js.native
    @scala.inline
    def gray_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.green")
    @js.native
    def green: String = js.native
    @scala.inline
    def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.grey")
    @js.native
    def grey: String = js.native
    @scala.inline
    def grey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grey")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.imageNegative")
    @js.native
    def imageNegative: String = js.native
    @scala.inline
    def imageNegative_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageNegative")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.imagePositive")
    @js.native
    def imagePositive: String = js.native
    @scala.inline
    def imagePositive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePositive")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.italic")
    @js.native
    def italic: String = js.native
    @scala.inline
    def italic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("italic")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.magenta")
    @js.native
    def magenta: String = js.native
    @scala.inline
    def magenta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magenta")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.red")
    @js.native
    def red: String = js.native
    @scala.inline
    def red_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.reset")
    @js.native
    def reset: String = js.native
    @scala.inline
    def reset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.underline")
    @js.native
    def underline: String = js.native
    @scala.inline
    def underline_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underline")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.white")
    @js.native
    def white: String = js.native
    @scala.inline
    def white_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.yellow")
    @js.native
    def yellow: String = js.native
    @scala.inline
    def yellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ansi-escape-sequences", "styles")
  @js.native
  def styles(styles: js.Array[Style_]): String = js.native
  @JSImport("ansi-escape-sequences", "styles")
  @js.native
  def styles(styles: Style_): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.reset
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.bold
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.italic
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.underline
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.fontDefault
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font2
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font3
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font4
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font5
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font6
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.imageNegative
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.imagePositive
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.black
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.red
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.green
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.yellow
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.blue
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.magenta
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.cyan
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.white
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.grey
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.gray
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-black`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-red`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-green`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-yellow`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-blue`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-magenta`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-cyan`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-white`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-grey`
    - typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-gray`
  */
  trait Style_ extends StObject
  object Style_ {
    
    @scala.inline
    def `bg-black`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-black` = "bg-black".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-black`]
    
    @scala.inline
    def `bg-blue`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-blue` = "bg-blue".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-blue`]
    
    @scala.inline
    def `bg-cyan`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-cyan` = "bg-cyan".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-cyan`]
    
    @scala.inline
    def `bg-gray`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-gray` = "bg-gray".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-gray`]
    
    @scala.inline
    def `bg-green`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-green` = "bg-green".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-green`]
    
    @scala.inline
    def `bg-grey`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-grey` = "bg-grey".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-grey`]
    
    @scala.inline
    def `bg-magenta`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-magenta` = "bg-magenta".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-magenta`]
    
    @scala.inline
    def `bg-red`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-red` = "bg-red".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-red`]
    
    @scala.inline
    def `bg-white`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-white` = "bg-white".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-white`]
    
    @scala.inline
    def `bg-yellow`: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-yellow` = "bg-yellow".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-yellow`]
    
    @scala.inline
    def black: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.black = "black".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.black]
    
    @scala.inline
    def blue: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.blue = "blue".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.blue]
    
    @scala.inline
    def bold: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.bold = "bold".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.bold]
    
    @scala.inline
    def cyan: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.cyan = "cyan".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.cyan]
    
    @scala.inline
    def font2: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font2 = "font2".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font2]
    
    @scala.inline
    def font3: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font3 = "font3".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font3]
    
    @scala.inline
    def font4: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font4 = "font4".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font4]
    
    @scala.inline
    def font5: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font5 = "font5".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font5]
    
    @scala.inline
    def font6: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font6 = "font6".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.font6]
    
    @scala.inline
    def fontDefault: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.fontDefault = "fontDefault".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.fontDefault]
    
    @scala.inline
    def gray: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.gray = "gray".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.gray]
    
    @scala.inline
    def green: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.green = "green".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.green]
    
    @scala.inline
    def grey: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.grey = "grey".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.grey]
    
    @scala.inline
    def imageNegative: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.imageNegative = "imageNegative".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.imageNegative]
    
    @scala.inline
    def imagePositive: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.imagePositive = "imagePositive".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.imagePositive]
    
    @scala.inline
    def italic: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.italic = "italic".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.italic]
    
    @scala.inline
    def magenta: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.magenta = "magenta".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.magenta]
    
    @scala.inline
    def red: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.red = "red".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.red]
    
    @scala.inline
    def reset: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.reset = "reset".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.reset]
    
    @scala.inline
    def underline: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.underline = "underline".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.underline]
    
    @scala.inline
    def white: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.white = "white".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.white]
    
    @scala.inline
    def yellow: typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.yellow = "yellow".asInstanceOf[typingsSlinky.ansiEscapeSequences.ansiEscapeSequencesStrings.yellow]
  }
}
