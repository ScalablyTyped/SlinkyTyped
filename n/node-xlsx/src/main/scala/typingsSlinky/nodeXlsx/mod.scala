package typingsSlinky.nodeXlsx

import typingsSlinky.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xlsx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def build(worksheets: js.Array[AnonName]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def build(worksheets: js.Array[AnonName], options: js.Object): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def parse(mixed: String): js.Array[AnonData] = js.native
  def parse(mixed: String, options: js.Object): js.Array[AnonData] = js.native
  def parse(mixed: ArrayBuffer): js.Array[AnonData] = js.native
  def parse(mixed: ArrayBuffer, options: js.Object): js.Array[AnonData] = js.native
  @js.native
  object default extends js.Object {
    @JSName("build")
    var build_Original: js.Function2[
        /* worksheets */ js.Array[AnonName], 
        /* options */ js.UndefOr[js.Object], 
        scala.scalajs.js.typedarray.ArrayBuffer
      ] = js.native
    @JSName("parse")
    var parse_Original: js.Function2[
        /* mixed */ String | scala.scalajs.js.typedarray.ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[AnonData]
      ] = js.native
    def build(worksheets: js.Array[AnonName]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
    def build(worksheets: js.Array[AnonName], options: js.Object): scala.scalajs.js.typedarray.ArrayBuffer = js.native
    def parse(mixed: String): js.Array[AnonData] = js.native
    def parse(mixed: String, options: js.Object): js.Array[AnonData] = js.native
    def parse(mixed: ArrayBuffer): js.Array[AnonData] = js.native
    def parse(mixed: ArrayBuffer, options: js.Object): js.Array[AnonData] = js.native
  }
  
}

