package typingsSlinky.openjscad.global

import org.scalajs.dom.experimental.URL
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.Worker
import typingsSlinky.openjscad.OpenJsCad.EventHandler
import typingsSlinky.openjscad.OpenJsCad.ILog
import typingsSlinky.openjscad.OpenJsCad.IViewerOptions
import typingsSlinky.openjscad.OpenJsCad.ProcessorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OpenJsCad")
@js.native
object OpenJsCad extends js.Object {
  @js.native
  class Processor protected ()
    extends typingsSlinky.openjscad.OpenJsCad.Processor {
    def this(containerdiv: HTMLDivElement) = this()
    def this(containerdiv: HTMLDivElement, options: ProcessorOptions) = this()
    def this(containerdiv: HTMLDivElement, options: ProcessorOptions, onchange: EventHandler) = this()
  }
  
  @js.native
  class Viewer protected ()
    extends typingsSlinky.openjscad.OpenJsCad.Viewer {
    def this(containerElm: js.Any, size: js.Any, options: IViewerOptions) = this()
  }
  
  var log: ILog = js.native
  def AlertUserOfUncaughtExceptions(): Unit = js.native
  def FileSystemApiErrorHandler(fileError: js.Any, operation: js.Any): Unit = js.native
  def checkResult(result: js.Any): Unit = js.native
  def expandResultObjectArray(result: js.Any): js.Any = js.native
  def getParamDefinitions(script: js.Any): js.Array[_] = js.native
  def getWindowURL(): URL = js.native
  def isChrome(): Boolean = js.native
  def makeAbsoluteUrl(url: js.Any, baseurl: js.Any): js.Any = js.native
  def parseJsCadScriptASync(script: js.Any, mainParameters: js.Any, options: js.Any, callback: js.Any): Worker = js.native
  def parseJsCadScriptSync(script: js.Any, mainParameters: js.Any, debugging: js.Any): js.Any = js.native
  def resultFromCompactBinary(resultin: js.Any): js.Any = js.native
  def resultToCompactBinary(resultin: js.Any): js.Any = js.native
  def revokeBlobUrl(url: js.Any): Unit = js.native
  def runMainInWorker(mainParameters: js.Any): Unit = js.native
  def textToBlobUrl(txt: js.Any): String = js.native
  /* static members */
  @js.native
  object Processor extends js.Object {
    var heightDefault: js.Any = js.native
    var widthDefault: js.Any = js.native
    def convertToSolid(obj: js.Any): js.Any = js.native
  }
  
}

