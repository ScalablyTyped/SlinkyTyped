package typingsSlinky.blessed.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "BlessedProgram")
@js.native
class BlessedProgram () extends EventEmitter {
  def this(options: IBlessedProgramOptions) = this()
  
  def HPositionRelative(): Boolean = js.native
  def HPositionRelative(param: Double): Boolean = js.native
  
  def HVPosition(): Boolean = js.native
  def HVPosition(row: js.UndefOr[scala.Nothing], col: Double): Boolean = js.native
  def HVPosition(row: Double): Boolean = js.native
  def HVPosition(row: Double, col: Double): Boolean = js.native
  
  def VPositionRelative(): Boolean = js.native
  def VPositionRelative(param: Double): Boolean = js.native
  
  def ae(): Boolean = js.native
  
  def alternate(): Boolean = js.native
  
  def alternateBuffer(): Boolean = js.native
  
  def as(): Boolean = js.native
  
  def back(): Boolean = js.native
  def back(param: Double): Boolean = js.native
  
  def backspace(): Boolean = js.native
  
  def bel(): Boolean = js.native
  
  def bell(): Boolean = js.native
  
  def bg(color: String): Boolean = js.native
  def bg(color: String, `val`: Boolean): Boolean = js.native
  
  def bindMouse(): Unit = js.native
  
  def bindResponse(): Unit = js.native
  
  def cbt(): Boolean = js.native
  def cbt(param: Double): Boolean = js.native
  
  def cha(): Boolean = js.native
  def cha(param: Double): Boolean = js.native
  
  def charAttributes(param: String): Boolean = js.native
  def charAttributes(param: String, `val`: Boolean): Boolean = js.native
  def charAttributes(param: js.Array[String]): Boolean = js.native
  def charAttributes(param: js.Array[String], `val`: Boolean): Boolean = js.native
  
  def charPosAbsolute(): Boolean = js.native
  def charPosAbsolute(param: Double): Boolean = js.native
  
  def charset(): Boolean = js.native
  def charset(`val`: js.UndefOr[scala.Nothing], level: Double): Boolean = js.native
  def charset(`val`: String): Boolean = js.native
  def charset(`val`: String, level: Double): Boolean = js.native
  
  def cht(): Boolean = js.native
  def cht(param: Double): Boolean = js.native
  
  def civis(): Boolean = js.native
  
  def clear(): Boolean = js.native
  
  def cnl(): Boolean = js.native
  def cnl(param: Double): Boolean = js.native
  
  var cols: Double = js.native
  
  def copyRectangle(args: String*): Boolean = js.native
  
  def copyToClipboard(text: String): Boolean = js.native
  
  def cpl(): Boolean = js.native
  def cpl(param: Double): Boolean = js.native
  
  def cr(): Boolean = js.native
  
  def csr(top: Double, bottom: Double): Boolean = js.native
  
  def cub(): Boolean = js.native
  def cub(param: Double): Boolean = js.native
  
  def cud(): Boolean = js.native
  def cud(param: Double): Boolean = js.native
  
  def cuf(): Boolean = js.native
  def cuf(param: Double): Boolean = js.native
  
  def cup(): Boolean = js.native
  def cup(row: js.UndefOr[scala.Nothing], col: Double): Boolean = js.native
  def cup(row: Double): Boolean = js.native
  def cup(row: Double, col: Double): Boolean = js.native
  
  def cursorBackward(): Boolean = js.native
  def cursorBackward(param: Double): Boolean = js.native
  
  def cursorBackwardTab(): Boolean = js.native
  def cursorBackwardTab(param: Double): Boolean = js.native
  
  def cursorCharAbsolute(): Boolean = js.native
  def cursorCharAbsolute(param: Double): Boolean = js.native
  
  def cursorColor(color: String): Boolean = js.native
  
  def cursorDown(): Boolean = js.native
  def cursorDown(param: Double): Boolean = js.native
  
  def cursorForward(): Boolean = js.native
  def cursorForward(param: Double): Boolean = js.native
  
  def cursorForwardTab(): Boolean = js.native
  def cursorForwardTab(param: Double): Boolean = js.native
  
  def cursorNextLine(): Boolean = js.native
  def cursorNextLine(param: Double): Boolean = js.native
  
  def cursorPos(): Boolean = js.native
  def cursorPos(row: js.UndefOr[scala.Nothing], col: Double): Boolean = js.native
  def cursorPos(row: Double): Boolean = js.native
  def cursorPos(row: Double, col: Double): Boolean = js.native
  
  def cursorPrecedingLine(): Boolean = js.native
  def cursorPrecedingLine(param: Double): Boolean = js.native
  
  def cursorReset(): Boolean = js.native
  
  def cursorShape(shape: String): Boolean = js.native
  def cursorShape(shape: String, blink: Boolean): Boolean = js.native
  
  def cursorUp(): Boolean = js.native
  def cursorUp(param: Double): Boolean = js.native
  
  def cursor_invisible(): Boolean = js.native
  
  def cuu(): Boolean = js.native
  def cuu(param: Double): Boolean = js.native
  
  def da(): Boolean = js.native
  def da(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def da(param: Double): Boolean = js.native
  def da(param: Double, callback: js.Function): Boolean = js.native
  
  def dch(): Boolean = js.native
  def dch(param: Double): Boolean = js.native
  
  def debug(): Boolean = js.native
  
  def deccara(args: String*): Boolean = js.native
  
  def deccra(args: String*): Boolean = js.native
  
  def decdc(args: String*): Boolean = js.native
  
  def decefr(args: String*): Boolean = js.native
  
  def decelr(args: String*): Boolean = js.native
  
  def decera(args: String*): Boolean = js.native
  
  def decfra(args: String*): Boolean = js.native
  
  def decic(args: String*): Boolean = js.native
  
  def decll(): Boolean = js.native
  def decll(param: Double): Boolean = js.native
  
  def decrara(args: String*): Boolean = js.native
  
  def decreqtparm(param: Double): Boolean = js.native
  
  def decrqlp(): Boolean = js.native
  def decrqlp(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def decrqlp(param: String): Boolean = js.native
  def decrqlp(param: String, callback: js.Function): Boolean = js.native
  
  def decrqm(): Boolean = js.native
  def decrqm(param: Double): Boolean = js.native
  
  def decrqmp(): Boolean = js.native
  def decrqmp(param: Double): Boolean = js.native
  
  def decrst(args: String*): Boolean = js.native
  
  def decsace(): Boolean = js.native
  def decsace(param: Double): Boolean = js.native
  
  def decsca(): Boolean = js.native
  def decsca(param: Double): Boolean = js.native
  
  def decscl(args: String*): Boolean = js.native
  
  def decscursr(): Boolean = js.native
  def decscursr(param: String): Boolean = js.native
  
  def decsera(args: String*): Boolean = js.native
  
  def decset(args: String*): Boolean = js.native
  
  def decsle(args: String*): Boolean = js.native
  
  def decstbm(top: Double, bottom: Double): Boolean = js.native
  
  def decstr(): Boolean = js.native
  
  def decswbv(): Boolean = js.native
  def decswbv(param: Double): Boolean = js.native
  
  def dectcemh(): Boolean = js.native
  
  def deleteChars(): Boolean = js.native
  def deleteChars(param: Double): Boolean = js.native
  
  def deleteColumns(args: String*): Boolean = js.native
  
  def deleteLines(): Boolean = js.native
  def deleteLines(param: Double): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def deviceStatuses(): Boolean = js.native
  def deviceStatuses(
    param: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    dec: js.UndefOr[scala.Nothing],
    noBypass: Boolean
  ): Boolean = js.native
  def deviceStatuses(param: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], dec: Boolean): Boolean = js.native
  def deviceStatuses(
    param: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    dec: Boolean,
    noBypass: Boolean
  ): Boolean = js.native
  def deviceStatuses(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def deviceStatuses(
    param: js.UndefOr[scala.Nothing],
    callback: js.Function,
    dec: js.UndefOr[scala.Nothing],
    noBypass: Boolean
  ): Boolean = js.native
  def deviceStatuses(param: js.UndefOr[scala.Nothing], callback: js.Function, dec: Boolean): Boolean = js.native
  def deviceStatuses(param: js.UndefOr[scala.Nothing], callback: js.Function, dec: Boolean, noBypass: Boolean): Boolean = js.native
  def deviceStatuses(param: String): Boolean = js.native
  def deviceStatuses(
    param: String,
    callback: js.UndefOr[scala.Nothing],
    dec: js.UndefOr[scala.Nothing],
    noBypass: Boolean
  ): Boolean = js.native
  def deviceStatuses(param: String, callback: js.UndefOr[scala.Nothing], dec: Boolean): Boolean = js.native
  def deviceStatuses(param: String, callback: js.UndefOr[scala.Nothing], dec: Boolean, noBypass: Boolean): Boolean = js.native
  def deviceStatuses(param: String, callback: js.Function): Boolean = js.native
  def deviceStatuses(param: String, callback: js.Function, dec: js.UndefOr[scala.Nothing], noBypass: Boolean): Boolean = js.native
  def deviceStatuses(param: String, callback: js.Function, dec: Boolean): Boolean = js.native
  def deviceStatuses(param: String, callback: js.Function, dec: Boolean, noBypass: Boolean): Boolean = js.native
  
  def disableGpm(): Unit = js.native
  
  def disableModifieres(args: String*): Boolean = js.native
  
  def disableMouse(): Unit = js.native
  
  def dl(): Boolean = js.native
  def dl(param: Double): Boolean = js.native
  
  def down(): Boolean = js.native
  def down(param: Double): Boolean = js.native
  
  def dsr(): Boolean = js.native
  def dsr(
    param: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    dec: js.UndefOr[scala.Nothing],
    noBypass: Boolean
  ): Boolean = js.native
  def dsr(param: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], dec: Boolean): Boolean = js.native
  def dsr(
    param: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    dec: Boolean,
    noBypass: Boolean
  ): Boolean = js.native
  def dsr(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def dsr(
    param: js.UndefOr[scala.Nothing],
    callback: js.Function,
    dec: js.UndefOr[scala.Nothing],
    noBypass: Boolean
  ): Boolean = js.native
  def dsr(param: js.UndefOr[scala.Nothing], callback: js.Function, dec: Boolean): Boolean = js.native
  def dsr(param: js.UndefOr[scala.Nothing], callback: js.Function, dec: Boolean, noBypass: Boolean): Boolean = js.native
  def dsr(param: String): Boolean = js.native
  def dsr(
    param: String,
    callback: js.UndefOr[scala.Nothing],
    dec: js.UndefOr[scala.Nothing],
    noBypass: Boolean
  ): Boolean = js.native
  def dsr(param: String, callback: js.UndefOr[scala.Nothing], dec: Boolean): Boolean = js.native
  def dsr(param: String, callback: js.UndefOr[scala.Nothing], dec: Boolean, noBypass: Boolean): Boolean = js.native
  def dsr(param: String, callback: js.Function): Boolean = js.native
  def dsr(param: String, callback: js.Function, dec: js.UndefOr[scala.Nothing], noBypass: Boolean): Boolean = js.native
  def dsr(param: String, callback: js.Function, dec: Boolean): Boolean = js.native
  def dsr(param: String, callback: js.Function, dec: Boolean, noBypass: Boolean): Boolean = js.native
  
  def dynamicColors(): Boolean = js.native
  def dynamicColors(param: String): Boolean = js.native
  
  def ech(): Boolean = js.native
  def ech(param: Double): Boolean = js.native
  
  def echo(text: String): Boolean = js.native
  def echo(text: String, attr: Boolean): Boolean = js.native
  
  def ed(): Boolean = js.native
  def ed(param: String): Boolean = js.native
  
  def el(): Boolean = js.native
  def el(param: String): Boolean = js.native
  
  def enableFilterRectangle(args: String*): Boolean = js.native
  
  def enableGpm(): Unit = js.native
  
  def enableLocatorReporting(args: String*): Boolean = js.native
  
  def enableMouse(): Unit = js.native
  
  def enter_alt_charset_mode(): Boolean = js.native
  
  def eraseChars(): Boolean = js.native
  def eraseChars(param: Double): Boolean = js.native
  
  def eraseInDisplay(): Boolean = js.native
  def eraseInDisplay(param: String): Boolean = js.native
  
  def eraseInLine(): Boolean = js.native
  def eraseInLine(param: String): Boolean = js.native
  
  def eraseRectangle(args: String*): Boolean = js.native
  
  def exit_alt_charset_mode(): Boolean = js.native
  
  def feed(): Boolean = js.native
  
  def ff(): Boolean = js.native
  
  def fg(color: String): Boolean = js.native
  def fg(color: String, `val`: Boolean): Boolean = js.native
  
  def fillRectangle(args: String*): Boolean = js.native
  
  def flush(): Unit = js.native
  
  def form(): Boolean = js.native
  
  def forward(): Boolean = js.native
  def forward(param: Double): Boolean = js.native
  
  def getCursor(callback: js.Function): Boolean = js.native
  
  def getCursorColor(callback: js.Function): Boolean = js.native
  
  def getTextParams(param: String, callback: js.Function): Boolean = js.native
  
  def getWindowSize(): Boolean = js.native
  def getWindowSize(callback: js.Function): Boolean = js.native
  
  def has(name: String): Boolean = js.native
  
  def hideCursor(): Boolean = js.native
  
  def hpa(): Boolean = js.native
  def hpa(param: Double): Boolean = js.native
  
  def ht(): Boolean = js.native
  
  def hvp(): Boolean = js.native
  def hvp(row: js.UndefOr[scala.Nothing], col: Double): Boolean = js.native
  def hvp(row: Double): Boolean = js.native
  def hvp(row: Double, col: Double): Boolean = js.native
  
  def ich(): Boolean = js.native
  def ich(param: Double): Boolean = js.native
  
  def il(): Boolean = js.native
  def il(param: Double): Boolean = js.native
  
  def ind(): Boolean = js.native
  
  def index(): Boolean = js.native
  
  def initMouseTracking(args: String*): Boolean = js.native
  
  var input: Readable = js.native
  
  def insertChars(): Boolean = js.native
  def insertChars(param: Double): Boolean = js.native
  
  def insertColumns(args: String*): Boolean = js.native
  
  def insertLines(): Boolean = js.native
  def insertLines(param: Double): Boolean = js.native
  
  var isLXDE: Boolean = js.native
  
  var isOSXTerm: Boolean = js.native
  
  var isRxvt: Boolean = js.native
  
  var isTerminator: Boolean = js.native
  
  var isVTE: Boolean = js.native
  
  var isXFCE: Boolean = js.native
  
  var isXterm: Boolean = js.native
  
  var isiTerm2: Boolean = js.native
  
  def kbs(): Boolean = js.native
  
  def key(key: String, listener: js.Function): Unit = js.native
  def key(key: js.Array[String], listener: js.Function): Unit = js.native
  
  def left(): Boolean = js.native
  def left(param: Double): Boolean = js.native
  
  def lineHeight(): Boolean = js.native
  
  def linePosAbsolute(): Boolean = js.native
  def linePosAbsolute(param: Double): Boolean = js.native
  
  def listen(): Unit = js.native
  
  def loadLEDs(): Boolean = js.native
  def loadLEDs(param: Double): Boolean = js.native
  
  def log(): Boolean = js.native
  
  def lrestoreCursor(): Unit = js.native
  def lrestoreCursor(key: js.UndefOr[scala.Nothing], hide: Boolean): Unit = js.native
  def lrestoreCursor(key: String): Unit = js.native
  def lrestoreCursor(key: String, hide: Boolean): Unit = js.native
  
  def lsaveCursor(): Unit = js.native
  def lsaveCursor(key: String): Unit = js.native
  
  def manipulateWindow(args: js.Any*): Boolean = js.native
  
  def mc(args: String*): Boolean = js.native
  
  def mc0(): Boolean = js.native
  
  def mc4(): Boolean = js.native
  
  def mc5(): Boolean = js.native
  
  def mc5p(): Boolean = js.native
  
  def mediaCopy(args: String*): Boolean = js.native
  
  def move(x: Double, y: Double): Boolean = js.native
  
  def newline(): Boolean = js.native
  
  def nextLine(): Boolean = js.native
  
  def nl(): Boolean = js.native
  
  def normalBuffer(): Boolean = js.native
  
  def nul(): Boolean = js.native
  
  def omove(x: Double, y: Double): Unit = js.native
  
  def onceKey(key: String, listener: js.Function): Unit = js.native
  def onceKey(key: js.Array[String], listener: js.Function): Unit = js.native
  
  var options: IBlessedProgramOptions = js.native
  
  def out(param: String, args: js.Any*): Boolean = js.native
  
  var output: Writable = js.native
  
  def p0(): Boolean = js.native
  
  def pause(): js.Function = js.native
  def pause(callback: js.Function): js.Function = js.native
  
  def pf(): Boolean = js.native
  
  def po(): Boolean = js.native
  
  def pos(): Boolean = js.native
  def pos(row: js.UndefOr[scala.Nothing], col: Double): Boolean = js.native
  def pos(row: Double): Boolean = js.native
  def pos(row: Double, col: Double): Boolean = js.native
  
  def print(text: String): Boolean = js.native
  def print(text: String, attr: Boolean): Boolean = js.native
  
  def print_screen(): Boolean = js.native
  
  def prtr_non(): Boolean = js.native
  
  def prtr_off(): Boolean = js.native
  
  def prtr_on(): Boolean = js.native
  
  def ps(): Boolean = js.native
  
  def rc(): Boolean = js.native
  def rc(key: js.UndefOr[scala.Nothing], hide: Boolean): Boolean = js.native
  def rc(key: String): Boolean = js.native
  def rc(key: String, hide: Boolean): Boolean = js.native
  
  def rcA(): Boolean = js.native
  
  def removeKey(key: String, listener: js.Function): Unit = js.native
  def removeKey(key: js.Array[String], listener: js.Function): Unit = js.native
  
  def rep(): Boolean = js.native
  def rep(param: Double): Boolean = js.native
  
  def repeat(ch: String): String = js.native
  def repeat(ch: String, i: Double): String = js.native
  
  def repeatPrecedingCharacter(): Boolean = js.native
  def repeatPrecedingCharacter(param: Double): Boolean = js.native
  
  def req_mouse_pos(): Boolean = js.native
  def req_mouse_pos(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def req_mouse_pos(param: String): Boolean = js.native
  def req_mouse_pos(param: String, callback: js.Function): Boolean = js.native
  
  def reqmp(): Boolean = js.native
  def reqmp(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def reqmp(param: String): Boolean = js.native
  def reqmp(param: String, callback: js.Function): Boolean = js.native
  
  def requestAnsiMode(): Boolean = js.native
  def requestAnsiMode(param: Double): Boolean = js.native
  
  def requestLocatorPosition(): Boolean = js.native
  def requestLocatorPosition(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def requestLocatorPosition(param: String): Boolean = js.native
  def requestLocatorPosition(param: String, callback: js.Function): Boolean = js.native
  
  def requestParameters(): Boolean = js.native
  def requestParameters(param: Double): Boolean = js.native
  
  def requestPrivateMode(): Boolean = js.native
  def requestPrivateMode(param: Double): Boolean = js.native
  
  def reset(): Boolean = js.native
  
  def resetColors(): Boolean = js.native
  def resetColors(param: String): Boolean = js.native
  
  def resetCursor(): Boolean = js.native
  
  def resetMode(args: String*): Boolean = js.native
  
  def resetTitleModes(args: String*): Boolean = js.native
  
  def response(name: String): Boolean = js.native
  def response(name: String, callback: js.Function): Boolean = js.native
  def response(name: String, text: String, callback: js.Function): Boolean = js.native
  def response(name: String, text: String, callback: js.Function, noBypass: Boolean): Boolean = js.native
  
  def restoreCursor(): Boolean = js.native
  def restoreCursor(key: js.UndefOr[scala.Nothing], hide: Boolean): Boolean = js.native
  def restoreCursor(key: String): Boolean = js.native
  def restoreCursor(key: String, hide: Boolean): Boolean = js.native
  
  def restoreCursorA(): Boolean = js.native
  
  def restorePrivateValues(args: String*): Boolean = js.native
  
  def restoreReportedCursor(): Boolean = js.native
  
  def resume(): Unit = js.native
  
  def `return`(): Boolean = js.native
  
  def reverse(): Boolean = js.native
  
  def reverseAttrInRectangle(args: String*): Boolean = js.native
  
  def reverseIndex(): Boolean = js.native
  
  def ri(): Boolean = js.native
  
  def right(): Boolean = js.native
  def right(param: Double): Boolean = js.native
  
  def rm(args: String*): Boolean = js.native
  
  def rmacs(): Boolean = js.native
  
  def rmcup(): Boolean = js.native
  
  def rmove(x: Double, y: Double): Unit = js.native
  
  var rows: Double = js.native
  
  def rs2(): Boolean = js.native
  
  def rsetx(x: Double): Boolean = js.native
  
  def rsety(y: Double): Boolean = js.native
  
  def saveCursor(key: String): Boolean = js.native
  
  def saveCursorA(): Boolean = js.native
  
  def savePrivateValues(args: String*): Boolean = js.native
  
  def saveReportedCursor(callback: js.Function): Unit = js.native
  
  var savedX: Double = js.native
  
  var savedY: Double = js.native
  
  def sc(key: String): Boolean = js.native
  
  def scA(): Boolean = js.native
  
  var scrollBottom: Double = js.native
  
  def scrollDown(): Boolean = js.native
  def scrollDown(param: Double): Boolean = js.native
  
  var scrollTop: Double = js.native
  
  def scrollUp(): Boolean = js.native
  def scrollUp(param: Double): Boolean = js.native
  
  def sd(): Boolean = js.native
  def sd(param: Double): Boolean = js.native
  
  def selData(a: String, b: String): Boolean = js.native
  
  def selectChangeExtent(): Boolean = js.native
  def selectChangeExtent(param: Double): Boolean = js.native
  
  def selectiveEraseRectangle(args: String*): Boolean = js.native
  
  def sendDeviceAttributes(): Boolean = js.native
  def sendDeviceAttributes(param: js.UndefOr[scala.Nothing], callback: js.Function): Boolean = js.native
  def sendDeviceAttributes(param: Double): Boolean = js.native
  def sendDeviceAttributes(param: Double, callback: js.Function): Boolean = js.native
  
  def setAttrInRectangle(args: String*): Boolean = js.native
  
  def setBackground(color: String): Boolean = js.native
  def setBackground(color: String, `val`: Boolean): Boolean = js.native
  
  def setCharProtectionAttr(): Boolean = js.native
  def setCharProtectionAttr(param: Double): Boolean = js.native
  
  def setConformanceLevel(args: String*): Boolean = js.native
  
  def setCursorStyle(): Boolean = js.native
  def setCursorStyle(param: String): Boolean = js.native
  
  def setForeground(color: String): Boolean = js.native
  def setForeground(color: String, `val`: Boolean): Boolean = js.native
  
  def setG(`val`: Double): Boolean = js.native
  
  def setLocatorEvents(args: String*): Boolean = js.native
  
  def setMarginBellVolume(): Boolean = js.native
  def setMarginBellVolume(param: Double): Boolean = js.native
  
  def setMode(args: String*): Boolean = js.native
  
  def setMouse(): Unit = js.native
  def setMouse(opt: js.UndefOr[scala.Nothing], enable: Boolean): Unit = js.native
  def setMouse(opt: js.Object): Unit = js.native
  def setMouse(opt: js.Object, enable: Boolean): Unit = js.native
  
  def setPointerMode(args: String*): Boolean = js.native
  
  def setResources(args: String*): Boolean = js.native
  
  def setScrollRegion(top: Double, bottom: Double): Boolean = js.native
  
  def setTerminal(terminal: String): Unit = js.native
  
  def setTitle(title: String): Boolean = js.native
  
  def setTitleModeFeature(args: String*): Boolean = js.native
  
  def setWarningBellVolume(): Boolean = js.native
  def setWarningBellVolume(param: Double): Boolean = js.native
  
  def setupDump(): Unit = js.native
  
  def setupTput(): Unit = js.native
  
  def setx(x: Double): Boolean = js.native
  
  def sety(y: Double): Boolean = js.native
  
  def shiftIn(): Boolean = js.native
  
  def shiftOut(): Boolean = js.native
  
  def showCursor(): Boolean = js.native
  
  def sigtstp(): Boolean = js.native
  def sigtstp(callback: js.Function): Boolean = js.native
  
  def simpleInsert(ch: String): Boolean = js.native
  def simpleInsert(ch: String, i: js.UndefOr[scala.Nothing], attr: Boolean): Boolean = js.native
  def simpleInsert(ch: String, i: Double): Boolean = js.native
  def simpleInsert(ch: String, i: Double, attr: Boolean): Boolean = js.native
  
  def sm(args: String*): Boolean = js.native
  
  def smacs(): Boolean = js.native
  
  def smcup(): Boolean = js.native
  
  def softReset(): Boolean = js.native
  
  def su(): Boolean = js.native
  def su(param: Double): Boolean = js.native
  
  def tab(): Boolean = js.native
  
  def tabClear(): Boolean = js.native
  def tabClear(param: Double): Boolean = js.native
  
  def tabSet(): Boolean = js.native
  
  def tbc(): Boolean = js.native
  def tbc(param: Double): Boolean = js.native
  
  def term(is: String): Boolean = js.native
  
  var tmux: Boolean = js.native
  
  var tmuxVersion: Double = js.native
  
  var `type`: String = js.native
  
  def unKey(key: String, listener: js.Function): Unit = js.native
  def unKey(key: js.Array[String], listener: js.Function): Unit = js.native
  
  def up(): Boolean = js.native
  def up(param: Double): Boolean = js.native
  
  var useBuffer: Boolean = js.native
  
  def vi(): Boolean = js.native
  
  def vpa(): Boolean = js.native
  def vpa(param: Double): Boolean = js.native
  
  def vpr(): Boolean = js.native
  def vpr(param: Double): Boolean = js.native
  
  def vtab(): Boolean = js.native
  
  def write(text: String): Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var zero: Boolean = js.native
}
