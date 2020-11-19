package typingsSlinky.promisifySupertest

import typingsSlinky.express.mod.Express
import typingsSlinky.superagent.mod.SuperAgent
import typingsSlinky.superagent.mod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promisify-supertest", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(app: Express): SuperTest = js.native
  
  def agent(): SuperTest = js.native
  def agent(app: js.Any): SuperTest = js.native
  
  @js.native
  trait Test extends SuperAgentRequest {
    
    def expect(body: String): this.type = js.native
    def expect(body: String, callback: CallbackHandler): this.type = js.native
    def expect(body: js.Object): this.type = js.native
    def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
    def expect(body: js.RegExp): this.type = js.native
    def expect(body: js.RegExp, callback: CallbackHandler): this.type = js.native
    def expect(checker: js.Function1[/* res */ Response, _]): this.type = js.native
    def expect(field: String, `val`: String): this.type = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): this.type = js.native
    def expect(field: String, `val`: js.RegExp): this.type = js.native
    def expect(field: String, `val`: js.RegExp, callback: CallbackHandler): this.type = js.native
    def expect(status: Double): this.type = js.native
    def expect(status: Double, body: String): this.type = js.native
    def expect(status: Double, body: String, callback: CallbackHandler): this.type = js.native
    def expect(status: Double, callback: CallbackHandler): this.type = js.native
    
    def serverAddress(app: js.Any, path: String): String = js.native
  }
  
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  
  type Response = typingsSlinky.superagent.mod.Response
  
  type SuperTest = SuperAgent[Test]
}
