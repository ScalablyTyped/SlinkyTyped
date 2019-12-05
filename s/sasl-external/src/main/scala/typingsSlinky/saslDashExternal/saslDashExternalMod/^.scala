package typingsSlinky.saslDashExternal.saslDashExternalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.saslDashExternal.TypeofClassExternalMechanism
import typingsSlinky.saslDashExternal.saslDashExternalNumbers.`true`
import typingsSlinky.saslDashExternal.saslDashExternalStrings.EXTERNAL
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
  var Mechanism: TypeofClassExternalMechanism = js.native
}

