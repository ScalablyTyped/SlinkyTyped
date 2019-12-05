package typingsSlinky.mqtt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesLibClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.mqtt.Anon_Nl
  import typingsSlinky.mqttDashPacket.mqttDashPacketMod.Packet
  import typingsSlinky.node.Buffer

  type ClientSubscribeCallback = js.Function2[/* err */ js.Error, /* granted */ js.Array[ISubscriptionGrant], Unit]
  type CloseCallback = js.Function0[Unit]
  type ISubscriptionMap = /**
    * object which has topic names as object keys and as value the options, like {'test1': {qos: 0}, 'test2': {qos: 2}}.
    */
  StringDictionary[Anon_Nl]
  type OnErrorCallback = js.Function1[/* error */ js.Error, Unit]
  type OnMessageCallback = js.Function3[/* topic */ String, /* payload */ Buffer, /* packet */ Packet, Unit]
  type OnPacketCallback = js.Function1[/* packet */ Packet, Unit]
  type PacketCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* packet */ js.UndefOr[Packet], js.Any]
}
