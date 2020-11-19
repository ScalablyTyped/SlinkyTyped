package typingsSlinky.firebaseMessaging

import typingsSlinky.sinon.mod.SinonSpy
import typingsSlinky.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/testing/sinon-types", JSImport.Namespace)
@js.native
object sinonTypesMod extends js.Object {
  
  type Spy[T /* <: js.Function1[/* args */ js.Any, _] */] = SinonSpy
  
  type Stub[T /* <: js.Function1[/* args */ js.Any, _] */] = SinonStub
}
