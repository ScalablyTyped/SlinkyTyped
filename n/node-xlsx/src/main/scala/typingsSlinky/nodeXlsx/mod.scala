package typingsSlinky.nodeXlsx

import typingsSlinky.nodeXlsx.anon.Data
import typingsSlinky.nodeXlsx.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-xlsx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def build(worksheets: js.Array[Name]): js.typedarray.ArrayBuffer = js.native
  def build(worksheets: js.Array[Name], options: js.Object): js.typedarray.ArrayBuffer = js.native
  
  def parse(mixed: String): js.Array[Data] = js.native
  def parse(mixed: String, options: js.Object): js.Array[Data] = js.native
  def parse(mixed: js.typedarray.ArrayBuffer): js.Array[Data] = js.native
  def parse(mixed: js.typedarray.ArrayBuffer, options: js.Object): js.Array[Data] = js.native
  
  @js.native
  object default extends js.Object {
    
    def build(worksheets: js.Array[Name]): js.typedarray.ArrayBuffer = js.native
    def build(worksheets: js.Array[Name], options: js.Object): js.typedarray.ArrayBuffer = js.native
    @JSName("build")
    var build_Original: js.Function2[
        /* worksheets */ js.Array[Name], 
        /* options */ js.UndefOr[js.Object], 
        js.typedarray.ArrayBuffer
      ] = js.native
    
    def parse(mixed: String): js.Array[Data] = js.native
    def parse(mixed: String, options: js.Object): js.Array[Data] = js.native
    def parse(mixed: js.typedarray.ArrayBuffer): js.Array[Data] = js.native
    def parse(mixed: js.typedarray.ArrayBuffer, options: js.Object): js.Array[Data] = js.native
    @JSName("parse")
    var parse_Original: js.Function2[
        /* mixed */ String | js.typedarray.ArrayBuffer, 
        /* options */ js.UndefOr[js.Object], 
        js.Array[Data]
      ] = js.native
  }
}
