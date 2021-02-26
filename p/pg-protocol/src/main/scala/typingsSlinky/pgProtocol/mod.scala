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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-protocol", "DatabaseError")
  @js.native
  class DatabaseError protected ()
    extends typingsSlinky.pgProtocol.messagesMod.DatabaseError {
    def this(message: String, length: Double, name: MessageName) = this()
  }
  
  @JSImport("pg-protocol", "parse")
  @js.native
  def parse(stream: ReadableStream, callback: MessageCallback): js.Promise[Unit] = js.native
  
  object serialize {
    
    @JSImport("pg-protocol", "serialize.bind")
    @js.native
    def bind(): Buffer = js.native
    @JSImport("pg-protocol", "serialize.bind")
    @js.native
    def bind(config: BindOpts): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.cancel")
    @js.native
    def cancel(processID: Double, secretKey: Double): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.close")
    @js.native
    def close(msg: PortalOpts): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.copyData")
    @js.native
    def copyData(chunk: Buffer): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.copyDone")
    @js.native
    def copyDone(): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.copyFail")
    @js.native
    def copyFail(message: String): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.describe")
    @js.native
    def describe(msg: PortalOpts): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.end")
    @js.native
    def end(): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.execute")
    @js.native
    def execute(): Buffer = js.native
    @JSImport("pg-protocol", "serialize.execute")
    @js.native
    def execute(config: ExecOpts): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.flush")
    @js.native
    def flush(): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.parse")
    @js.native
    def parse(query: ParseOpts): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.password")
    @js.native
    def password(password: String): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.query")
    @js.native
    def query(text: String): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.requestSsl")
    @js.native
    def requestSsl(): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.sendSASLInitialResponseMessage")
    @js.native
    def sendSASLInitialResponseMessage(mechanism: String, initialResponse: String): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.sendSCRAMClientFinalMessage")
    @js.native
    def sendSCRAMClientFinalMessage(additionalData: String): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.startup")
    @js.native
    def startup(opts: Record[String, String]): Buffer = js.native
    
    @JSImport("pg-protocol", "serialize.sync")
    @js.native
    def sync(): Buffer = js.native
  }
}
