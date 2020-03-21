package typingsSlinky.saslExternal.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saslExternal.TypeofExternalMechanism
import typingsSlinky.saslExternal.saslExternalBooleans.`true`
import typingsSlinky.saslExternal.saslExternalStrings.EXTERNAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-external", JSImport.Namespace)
@js.native
class ^ () extends ExternalMechanism {
  /* CompleteClass */
  override var clientFirst: `true` = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_ExternalMechanism: EXTERNAL = js.native
  /* CompleteClass */
  override def challenge(chal: String): Unit = js.native
  /* CompleteClass */
  override def response(cred: StringDictionary[js.Any]): String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): String = js.native
}

@JSImport("sasl-external", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: TypeofExternalMechanism = js.native
}

