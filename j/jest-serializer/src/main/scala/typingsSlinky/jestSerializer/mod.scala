package typingsSlinky.jestSerializer

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-serializer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def deserialize(buffer: Buffer): js.Any = js.native
  
  def readFileSync(filePath: Path): js.Any = js.native
  
  def serialize(content: js.Any): Buffer = js.native
  
  def writeFileSync(filePath: Path, content: js.Any): Unit = js.native
  
  @js.native
  object default extends js.Object {
    
    def deserialize(buffer: Buffer): js.Any = js.native
    @JSName("deserialize")
    var deserialize_Original: js.Function1[/* buffer */ Buffer, _] = js.native
    
    def readFileSync(filePath: Path): js.Any = js.native
    @JSName("readFileSync")
    var readFileSync_Original: js.Function1[/* filePath */ Path, _] = js.native
    
    def serialize(content: js.Any): Buffer = js.native
    @JSName("serialize")
    var serialize_Original: js.Function1[/* content */ js.Any, Buffer] = js.native
    
    def writeFileSync(filePath: Path, content: js.Any): Unit = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: js.Function2[/* filePath */ Path, /* content */ js.Any, Unit] = js.native
  }
  
  type Path = String
}
