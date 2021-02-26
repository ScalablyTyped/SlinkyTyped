package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.anon.Flows
import typingsSlinky.matrixAppserviceBridge.anon.TypeString
import typingsSlinky.matrixAppserviceBridge.eventTypesMod.EphemeralEvent
import typingsSlinky.matrixAppserviceBridge.eventTypesMod.WeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "EncryptedEventBroker")
@js.native
class EncryptedEventBroker protected ()
  extends typingsSlinky.matrixAppserviceBridge.encryptionMod.EncryptedEventBroker {
  def this(
    membership: typingsSlinky.matrixAppserviceBridge.membershipCacheMod.MembershipCache,
    asBot: typingsSlinky.matrixAppserviceBridge.appServiceBotMod.AppServiceBot,
    onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
    onEphemeralEvent: js.UndefOr[scala.Nothing],
    getIntent: js.Function1[/* userId */ String, typingsSlinky.matrixAppserviceBridge.intentMod.Intent]
  ) = this()
  def this(
    membership: typingsSlinky.matrixAppserviceBridge.membershipCacheMod.MembershipCache,
    asBot: typingsSlinky.matrixAppserviceBridge.appServiceBotMod.AppServiceBot,
    onEvent: js.Function1[/* weakEvent */ WeakEvent, Unit],
    onEphemeralEvent: js.Function1[/* event */ EphemeralEvent, Unit],
    getIntent: js.Function1[/* userId */ String, typingsSlinky.matrixAppserviceBridge.intentMod.Intent]
  ) = this()
}
/* static members */
object EncryptedEventBroker {
  
  @JSImport("matrix-appservice-bridge", "EncryptedEventBroker.supportsLoginFlow")
  @js.native
  def supportsLoginFlow(loginFlows: Flows): js.UndefOr[TypeString] = js.native
}
