package typingsSlinky.exceljs.mod.stream.xlsx

import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: Double
   // compression only
  var dictionary: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView
  /**
    * @default constants.Z_FINISH
    */
  var finishFlush: Double
  /**
    * @default constants.Z_NO_FLUSH
    */
  var flush: Double
  var level: Double
   // compression only
  var memLevel: Double
   // compression only
  var strategy: Double
  var windowBits: Double
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: Double,
    dictionary: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView,
    finishFlush: Double,
    flush: Double,
    level: Double,
    memLevel: Double,
    strategy: Double,
    windowBits: Double
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], finishFlush = finishFlush.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], memLevel = memLevel.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], windowBits = windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

