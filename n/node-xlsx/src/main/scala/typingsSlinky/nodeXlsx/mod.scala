package typingsSlinky.nodeXlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-xlsx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def build(worksheets: js.Array[AnonName]): js.typedarray.ArrayBuffer = js.native
  def build(worksheets: js.Array[AnonName], options: js.Object): js.typedarray.ArrayBuffer = js.native
  def parse(mixed: String): js.Array[AnonData] = js.native
  def parse(mixed: String, options: js.Object): js.Array[AnonData] = js.native
  def parse(mixed: js.typedarray.ArrayBuffer): js.Array[AnonData] = js.native
  def parse(mixed: js.typedarray.ArrayBuffer, options: js.Object): js.Array[AnonData] = js.native
  @js.native
  object default extends js.Object {
    @JSName("build")
    var build_Original: js.Function2[
        /* worksheets */ js.Array[AnonName], 
        /* options */ js.UndefOr[js.Object], 
        js.typedarray.ArrayBuffer
      ] = js.native
    @JSName("parse")
    var parse_Original: js.Function2[
        /* mixed */ String | js.typedarray.ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[AnonData]
      ] = js.native
    def build(worksheets: js.Array[AnonName]): js.typedarray.ArrayBuffer = js.native
    def build(worksheets: js.Array[AnonName], options: js.Object): js.typedarray.ArrayBuffer = js.native
    def parse(mixed: String): js.Array[AnonData] = js.native
    def parse(mixed: String, options: js.Object): js.Array[AnonData] = js.native
    def parse(mixed: js.typedarray.ArrayBuffer): js.Array[AnonData] = js.native
    def parse(mixed: js.typedarray.ArrayBuffer, options: js.Object): js.Array[AnonData] = js.native
  }
  
}

