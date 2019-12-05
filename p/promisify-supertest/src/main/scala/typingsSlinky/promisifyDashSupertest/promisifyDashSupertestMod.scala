package typingsSlinky.promisifyDashSupertest

import typingsSlinky.express.expressMod.Express
import typingsSlinky.promisifyDashSupertest.promisifyDashSupertestMod.CallbackHandler
import typingsSlinky.promisifyDashSupertest.promisifyDashSupertestMod.Response
import typingsSlinky.promisifyDashSupertest.promisifyDashSupertestMod.SuperTest
import typingsSlinky.promisifyDashSupertest.promisifyDashSupertestMod.Test
import typingsSlinky.std.RegExp
import typingsSlinky.superagent.superagentMod.SuperAgent
import typingsSlinky.superagent.superagentMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promisify-supertest", JSImport.Namespace)
@js.native
object promisifyDashSupertestMod extends js.Object {
  @js.native
  trait Test extends SuperAgentRequest {
    def expect(body: String): this.type = js.native
    def expect(body: String, callback: CallbackHandler): this.type = js.native
    def expect(body: js.Object): this.type = js.native
    def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
    def expect(body: RegExp): this.type = js.native
    def expect(body: RegExp, callback: CallbackHandler): this.type = js.native
    def expect(checker: js.Function1[/* res */ Response, _]): this.type = js.native
    def expect(field: String, `val`: String): this.type = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): this.type = js.native
    def expect(field: String, `val`: RegExp): this.type = js.native
    def expect(field: String, `val`: RegExp, callback: CallbackHandler): this.type = js.native
    def expect(status: Double): this.type = js.native
    def expect(status: Double, body: String): this.type = js.native
    def expect(status: Double, body: String, callback: CallbackHandler): this.type = js.native
    def expect(status: Double, callback: CallbackHandler): this.type = js.native
    def serverAddress(app: js.Any, path: String): String = js.native
  }
  
  def apply(app: Express): SuperTest = js.native
  def agent(): SuperTest = js.native
  def agent(app: js.Any): SuperTest = js.native
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Response = typingsSlinky.superagent.superagentMod.Response
  type SuperTest = SuperAgent[Test]
}

