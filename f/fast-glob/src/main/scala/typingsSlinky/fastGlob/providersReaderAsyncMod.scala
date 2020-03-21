package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.managersTasksMod.ITask
import typingsSlinky.fastGlob.typesEntriesMod.EntryItem
import typingsSlinky.mrmlncReaddirEnhanced.mod.Options
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader-async", JSImport.Namespace)
@js.native
object providersReaderAsyncMod extends js.Object {
  @js.native
  trait ReaderAsync
    extends typingsSlinky.fastGlob.providersReaderMod.default[js.Promise[js.Array[EntryItem]]] {
    /**
      * Returns FileSystem adapter.
      */
    val fsAdapter: typingsSlinky.fastGlob.adaptersFsStreamMod.default = js.native
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
  class default () extends ReaderAsync
  
}

