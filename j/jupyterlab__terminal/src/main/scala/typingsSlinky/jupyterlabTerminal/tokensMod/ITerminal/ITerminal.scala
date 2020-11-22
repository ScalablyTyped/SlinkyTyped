package typingsSlinky.jupyterlabTerminal.tokensMod.ITerminal

import typingsSlinky.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.autoFit
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.cursorBlink
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.fontFamily
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.fontSize
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.initialCommand
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.lineHeight
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.macOptionIsMeta
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.pasteWithCtrlV
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.screenReaderMode
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.scrollback
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.shutdownOnClose
import typingsSlinky.jupyterlabTerminal.jupyterlabTerminalStrings.theme
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITerminal extends Widget {
  
  @JSName("getOption")
  def getOption_autoFit(option: autoFit): js.UndefOr[Boolean] = js.native
  @JSName("getOption")
  def getOption_cursorBlink(option: cursorBlink): Boolean = js.native
  /**
    * Get a config option for the terminal.
    */
  @JSName("getOption")
  def getOption_fontFamily(option: fontFamily): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_fontSize(option: fontSize): Double = js.native
  @JSName("getOption")
  def getOption_initialCommand(option: initialCommand): String = js.native
  @JSName("getOption")
  def getOption_lineHeight(option: lineHeight): js.UndefOr[Double] = js.native
  @JSName("getOption")
  def getOption_macOptionIsMeta(option: macOptionIsMeta): js.UndefOr[Boolean] = js.native
  @JSName("getOption")
  def getOption_pasteWithCtrlV(option: pasteWithCtrlV): Boolean = js.native
  @JSName("getOption")
  def getOption_screenReaderMode(option: screenReaderMode): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollback(option: scrollback): js.UndefOr[Double] = js.native
  @JSName("getOption")
  def getOption_shutdownOnClose(option: shutdownOnClose): Boolean = js.native
  @JSName("getOption")
  def getOption_theme(option: theme): Theme = js.native
  
  /**
    * Refresh the terminal session.
    */
  def refresh(): js.Promise[Unit] = js.native
  
  /**
    * The terminal session associated with the widget.
    */
  var session: ITerminalConnection = js.native
  
  @JSName("setOption")
  def setOption_autoFit(option: autoFit): Unit = js.native
  @JSName("setOption")
  def setOption_autoFit(option: autoFit, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_cursorBlink(option: cursorBlink, value: Boolean): Unit = js.native
  /**
    * Set a config option for the terminal.
    */
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_initialCommand(option: initialCommand, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: lineHeight): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: lineHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_macOptionIsMeta(option: macOptionIsMeta): Unit = js.native
  @JSName("setOption")
  def setOption_macOptionIsMeta(option: macOptionIsMeta, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_pasteWithCtrlV(option: pasteWithCtrlV, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_screenReaderMode(option: screenReaderMode, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(option: scrollback): Unit = js.native
  @JSName("setOption")
  def setOption_scrollback(option: scrollback, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_shutdownOnClose(option: shutdownOnClose, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_theme(option: theme, value: Theme): Unit = js.native
}
