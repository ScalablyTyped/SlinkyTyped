package typingsSlinky.mqttPacket

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def generate(packet: typingsSlinky.mqttPacket.mod.Packet): typingsSlinky.node.Buffer = typingsSlinky.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(packet.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def generate(packet: typingsSlinky.mqttPacket.mod.Packet, opts: js.Object): typingsSlinky.node.Buffer = (typingsSlinky.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(packet.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def parser(): typingsSlinky.mqttPacket.mod.Parser_ = typingsSlinky.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parser")().asInstanceOf[typingsSlinky.mqttPacket.mod.Parser_]
  @scala.inline
  def parser(opts: js.Object): typingsSlinky.mqttPacket.mod.Parser_ = typingsSlinky.mqttPacket.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parser")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mqttPacket.mod.Parser_]
}
