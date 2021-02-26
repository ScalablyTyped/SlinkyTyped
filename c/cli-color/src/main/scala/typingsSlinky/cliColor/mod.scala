package typingsSlinky.cliColor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cliColor.columnsMod.Data
import typingsSlinky.cliColor.eraseMod.Erase
import typingsSlinky.cliColor.moveMod.Move
import typingsSlinky.cliColor.throbberMod.Throbber
import typingsSlinky.cliColor.windowSizeMod.WindowSize
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cli-color", JSImport.Namespace)
  @js.native
  val ^ : Color = js.native
  
  @js.native
  trait Color
    extends typingsSlinky.cliColor.bareMod.Format {
    
    def art(text: String, styleConf: Record[String, String]): String = js.native
    
    val beep: String = js.native
    
    def columns(data: js.Array[js.Array[_]]): String = js.native
    def columns(data: js.Array[js.Array[_]], options: typingsSlinky.cliColor.columnsMod.ColumnsOptions): String = js.native
    def columns(data: Data): String = js.native
    def columns(data: Data, options: typingsSlinky.cliColor.columnsMod.ColumnsOptions): String = js.native
    
    val erase: Erase = js.native
    
    def getStrippedLength(str: String): Double = js.native
    
    /**
      * Move cursor x columns and y rows away. Values can be positive or negative
      */
    def move(): String = js.native
    def move(x: js.UndefOr[scala.Nothing], y: Double): String = js.native
    def move(x: Double): String = js.native
    def move(x: Double, y: Double): String = js.native
    @JSName("move")
    val move_Original: Move = js.native
    
    val reset: String = js.native
    
    def slice(str: String): String = js.native
    def slice(str: String, begin: js.UndefOr[scala.Nothing], end: Double): String = js.native
    def slice(str: String, begin: Double): String = js.native
    def slice(str: String, begin: Double, end: Double): String = js.native
    
    def strip(str: String): String = js.native
    
    def throbber(write: js.Function1[/* str */ String, Unit], interval: Double): Throbber = js.native
    def throbber(
      write: js.Function1[/* str */ String, Unit],
      interval: Double,
      format: js.Function1[/* throbber */ String, String]
    ): Throbber = js.native
    
    val windowSize: WindowSize = js.native
  }
  
  type ColumnOptions = typingsSlinky.cliColor.columnsMod.ColumnOptions
  
  type ColumnsOptions = typingsSlinky.cliColor.columnsMod.ColumnsOptions
  
  type Format = typingsSlinky.cliColor.bareMod.Format
  
  type _To = Color
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Color = ^
}
