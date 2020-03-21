package typingsSlinky.marko

import typingsSlinky.asyncWriter.mod.AsyncWriter
import typingsSlinky.marko.asyncStreamMod.AsyncStream
import typingsSlinky.marko.asyncVDOMBuilderMod.AsyncVDOMBuilder
import typingsSlinky.marko.renderResultMod.RenderResult
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html/Template", JSImport.Namespace)
@js.native
object templateMod extends js.Object {
  @js.native
  class Readable protected ()
    extends typingsSlinky.node.streamMod.Readable {
    def this(template: Template, data: js.Any, options: js.Any) = this()
    var _d: js.Any = js.native
    var _rendered: Boolean = js.native
    var _shouldBuffer: Boolean = js.native
    var _t: js.Any = js.native
    def write(data: js.Any): Unit = js.native
  }
  
  @js.native
  trait Renderable extends js.Object {
    var createOut: js.Any = js.native
    def render(): js.Promise[RenderResult] = js.native
    def render(data: js.Any): js.Promise[RenderResult] = js.native
    def render(data: js.Any, out: js.Function2[/* err */ js.Any, /* result */ RenderResult, Unit]): Unit = js.native
    def render(data: js.Any, out: AsyncWriter): Unit = js.native
    def render(data: js.Any, out: AsyncStream): Unit = js.native
    def render(data: js.Any, out: AsyncVDOMBuilder): Unit = js.native
    def render(data: js.Any, out: WritableStream): Unit = js.native
    def renderSync(): RenderResult = js.native
    def renderSync(data: js.Any): RenderResult = js.native
    def renderToString(): String = js.native
    def renderToString(data: js.Any): String = js.native
    def renderToString(data: js.Any, callback: js.Function2[/* err */ js.Error | Null, /* result */ String, Unit]): js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  trait Template extends Renderable {
    var ___shouldBuffer: Boolean = js.native
    @JSName("_")
    var _underscore: js.Any = js.native
    var meta: js.Any = js.native
    var path: String = js.native
    def apply(path: String, renderFunc: js.Any, options: js.Any): Template = js.native
    @JSName("createOut")
    def createOut_MTemplate(): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: js.Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: js.Any, writer: js.Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: js.Any, writer: js.Any, parentOut: js.Any): AsyncStream = js.native
    @JSName("createOut")
    def createOut_MTemplate(globalData: js.Any, writer: js.Any, parentOut: js.Any, buffer: js.Any): AsyncStream = js.native
    def stream(data: js.Any): Readable = js.native
  }
  
}

