package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.tasksMod.ITask
import typingsSlinky.mrmlncReaddirEnhanced.mod.Options
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/reader-stream", JSImport.Namespace)
@js.native
object readerStreamMod extends js.Object {
  @js.native
  trait ReaderStream
    extends typingsSlinky.fastGlob.readerMod.default[ReadableStream] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typingsSlinky.fastGlob.fsStreamMod.default = js.native
    /**
      * Returns founded paths.
      */
    def api(root: String, task: ITask, options: Options): ReadableStream = js.native
    /**
      * Api for dynamic tasks.
      */
    def dynamicApi(root: String, options: Options): ReadableStream = js.native
    /**
      * Api for static tasks.
      */
    def staticApi(task: ITask, options: Options): ReadableStream = js.native
  }
  
  @js.native
  class default () extends ReaderStream
  
}

