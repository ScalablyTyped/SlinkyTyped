package typingsSlinky.charm

import typingsSlinky.charm.charmStrings.blink
import typingsSlinky.charm.charmStrings.bright
import typingsSlinky.charm.charmStrings.char
import typingsSlinky.charm.charmStrings.dim
import typingsSlinky.charm.charmStrings.down
import typingsSlinky.charm.charmStrings.end
import typingsSlinky.charm.charmStrings.hidden
import typingsSlinky.charm.charmStrings.line
import typingsSlinky.charm.charmStrings.reset
import typingsSlinky.charm.charmStrings.reverse
import typingsSlinky.charm.charmStrings.screen
import typingsSlinky.charm.charmStrings.start
import typingsSlinky.charm.charmStrings.underscore
import typingsSlinky.charm.charmStrings.up
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new readable/writable charm stream.
    *
    * You can pass in readable or writable streams as parameters
    * and they will be piped to or from accordingly.
    * You can also pass `process` in which case
    * `process.stdin` and `process.stdout` will be used.
    */
  @JSImport("charm", JSImport.Namespace)
  @js.native
  def apply(): CharmInstance = js.native
  @JSImport("charm", JSImport.Namespace)
  @js.native
  def apply(param: CharmAnyStream): CharmInstance = js.native
  
  type CharmAnyStream = WritableStream | ReadableStream | Process
  
  type CharmColor = CharmColorName | CharmColorHex
  
  type CharmColorHex = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.charm.charmStrings.red
    - typingsSlinky.charm.charmStrings.yellow
    - typingsSlinky.charm.charmStrings.green
    - typingsSlinky.charm.charmStrings.blue
    - typingsSlinky.charm.charmStrings.cyan
    - typingsSlinky.charm.charmStrings.magenta
    - typingsSlinky.charm.charmStrings.black
    - typingsSlinky.charm.charmStrings.white
  */
  trait CharmColorName extends StObject
  object CharmColorName {
    
    @scala.inline
    def black: typingsSlinky.charm.charmStrings.black = "black".asInstanceOf[typingsSlinky.charm.charmStrings.black]
    
    @scala.inline
    def blue: typingsSlinky.charm.charmStrings.blue = "blue".asInstanceOf[typingsSlinky.charm.charmStrings.blue]
    
    @scala.inline
    def cyan: typingsSlinky.charm.charmStrings.cyan = "cyan".asInstanceOf[typingsSlinky.charm.charmStrings.cyan]
    
    @scala.inline
    def green: typingsSlinky.charm.charmStrings.green = "green".asInstanceOf[typingsSlinky.charm.charmStrings.green]
    
    @scala.inline
    def magenta: typingsSlinky.charm.charmStrings.magenta = "magenta".asInstanceOf[typingsSlinky.charm.charmStrings.magenta]
    
    @scala.inline
    def red: typingsSlinky.charm.charmStrings.red = "red".asInstanceOf[typingsSlinky.charm.charmStrings.red]
    
    @scala.inline
    def white: typingsSlinky.charm.charmStrings.white = "white".asInstanceOf[typingsSlinky.charm.charmStrings.white]
    
    @scala.inline
    def yellow: typingsSlinky.charm.charmStrings.yellow = "yellow".asInstanceOf[typingsSlinky.charm.charmStrings.yellow]
  }
  
  @js.native
  trait CharmInstance extends WritableStream {
    
    /**
      * Set the background color with the string `color`, which can be:
      *
      *  - red
      *  - yellow
      *  - green
      *  - blue
      *  - cyan
      *  - magenta
      *  - black
      *  - white
      *  - or `color` can be an integer from 0 to 255, inclusive.
      */
    def background(color: CharmColor): this.type = js.native
    
    /** Set the cursor visibility with a boolean `visible`. */
    def cursor(visible: Boolean): js.Any = js.native
    
    @JSName("delete")
    def delete_char(mode: char): this.type = js.native
    @JSName("delete")
    def delete_char(mode: char, n: Double): this.type = js.native
    /**
      * Delete `'line'` or `'char'`s. delete differs from erase because it does not write over
      * the deleted characters with whitesapce, but instead removes the deleted space.
      *
      * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
      * `n` must be a positive integer.
      *
      * The cursor position is not updated.
      */
    @JSName("delete")
    def delete_line(mode: line): this.type = js.native
    @JSName("delete")
    def delete_line(mode: line, n: Double): this.type = js.native
    
    /** Emit an "end" event downstream. */
    def destroy(): Unit = js.native
    
    @JSName("display")
    def display_blink(attr: blink): this.type = js.native
    @JSName("display")
    def display_bright(attr: bright): this.type = js.native
    @JSName("display")
    def display_dim(attr: dim): this.type = js.native
    @JSName("display")
    def display_hidden(attr: hidden): this.type = js.native
    /**
      * Set the display mode with the string `attr.`
      *
      * `attr` can be:
      *
      *  - reset
      *  - bright
      *  - dim
      *  - underscore
      *  - blink
      *  - reverse
      *  - hidden
      */
    @JSName("display")
    def display_reset(attr: reset): this.type = js.native
    @JSName("display")
    def display_reverse(attr: reverse): this.type = js.native
    @JSName("display")
    def display_underscore(attr: underscore): this.type = js.native
    
    /** Move the cursor down by `y` rows. */
    def down(y: Double): this.type = js.native
    
    @JSName("erase")
    def erase_down(s: down): this.type = js.native
    /**
      * Erase a region defined by the string `s`.
      *
      * `s` can be:
      *
      *  - end - erase from the cursor to the end of the line
      *  - start - erase from the cursor to the start of the line
      *  - line - erase the current line
      *  - down - erase everything below the current line
      *  - up - erase everything above the current line
      *  - screen - erase the entire screen
      */
    @JSName("erase")
    def erase_end(s: end): this.type = js.native
    @JSName("erase")
    def erase_line(s: line): this.type = js.native
    @JSName("erase")
    def erase_screen(s: screen): this.type = js.native
    @JSName("erase")
    def erase_start(s: start): this.type = js.native
    @JSName("erase")
    def erase_up(s: up): this.type = js.native
    
    /**
      * Set the foreground color with the string `color`, which can be:
      *
      *  - red
      *  - yellow
      *  - green
      *  - blue
      *  - cyan
      *  - magenta
      *  - black
      *  - white
      *  - or `color` can be an integer from 0 to 255, inclusive.
      */
    def foreground(color: CharmColor): this.type = js.native
    
    @JSName("insert")
    def insert_char(mode: char, n: Double): this.type = js.native
    /**
      * Insert space into the terminal. `insert` is the opposite of `delete`,
      *
      * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
      * `n` must be a positive integer.
      */
    @JSName("insert")
    def insert_line(mode: line, n: Double): this.type = js.native
    
    /** Move the cursor left by `x` columns. */
    def left(x: Double): this.type = js.native
    
    /** Move the cursor position by the relative coordinates `x`, `y`. */
    def move(x: Double, y: Double): this.type = js.native
    
    /** Pipes the output of Charm to a writeable stream `stream` */
    def pipe(stream: WritableStream): Unit = js.native
    
    /** Pop the cursor state and optionally the attribute state. */
    def pop(): this.type = js.native
    def pop(withAttributes: Boolean): this.type = js.native
    
    /**
      * Query the absolute cursor position from the input stream through the output stream
      * (the shell does this automatically) and get the response back as `cb(x, y)`.
      */
    def position(callback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
    /** Set the cursor position to the absolute coordinates `x`, `y`. */
    def position(x: Double, y: Double): Unit = js.native
    
    /** Push the cursor state and optionally the attribute state. */
    def push(): this.type = js.native
    def push(withAttributes: Boolean): this.type = js.native
    
    /** Reset the entire screen, like the /usr/bin/reset command. */
    def reset(): Unit = js.native
    
    /** Move the cursor right by `x` columns. */
    def right(x: Double): this.type = js.native
    
    /** Move the cursor up by `y` rows. */
    def up(y: Double): this.type = js.native
    
    def write(msg: String, cb: js.Function): Boolean = js.native
    def write(msgs: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
    def write(msgs: String, encoding: String): Boolean = js.native
    def write(msgs: String, encoding: String, cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: String): Boolean = js.native
    def write(msgs: Buffer, encoding: String, cb: js.Function): Boolean = js.native
    def write(msg: Buffer): Boolean = js.native
    def write(msg: Buffer, cb: js.Function): Boolean = js.native
  }
}
