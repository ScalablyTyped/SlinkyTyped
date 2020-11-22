package typingsSlinky.pgProtocol

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.pgProtocol.messagesMod.MessageName
import typingsSlinky.pgProtocol.parserMod.MessageCallback
import typingsSlinky.pgProtocol.serializerMod.BindOpts
import typingsSlinky.pgProtocol.serializerMod.ExecOpts
import typingsSlinky.pgProtocol.serializerMod.ParseOpts
import typingsSlinky.pgProtocol.serializerMod.PortalOpts
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parse(stream: ReadableStream, callback: MessageCallback): js.Promise[Unit] = js.native
  
  @js.native
  class DatabaseError protected ()
    extends typingsSlinky.pgProtocol.messagesMod.DatabaseError {
    def this(message: String, length: Double, name: MessageName) = this()
  }
  
  @js.native
  object serialize extends js.Object {
    
    def bind(): Buffer = js.native
    def bind(config: BindOpts): Buffer = js.native
    
    def cancel(processID: Double, secretKey: Double): Buffer = js.native
    
    def close(msg: PortalOpts): Buffer = js.native
    
    def copyData(chunk: Buffer): Buffer = js.native
    
    def copyDone(): Buffer = js.native
    
    def copyFail(message: String): Buffer = js.native
    
    def describe(msg: PortalOpts): Buffer = js.native
    
    def end(): Buffer = js.native
    
    def execute(): Buffer = js.native
    def execute(config: ExecOpts): Buffer = js.native
    
    def flush(): Buffer = js.native
    
    def parse(query: ParseOpts): Buffer = js.native
    
    def password(password: String): Buffer = js.native
    
    def query(text: String): Buffer = js.native
    
    def requestSsl(): Buffer = js.native
    
    def sendSASLInitialResponseMessage(mechanism: String, initialResponse: String): Buffer = js.native
    
    def sendSCRAMClientFinalMessage(additionalData: String): Buffer = js.native
    
    def startup(opts: Record[String, String]): Buffer = js.native
    
    def sync(): Buffer = js.native
  }
}
