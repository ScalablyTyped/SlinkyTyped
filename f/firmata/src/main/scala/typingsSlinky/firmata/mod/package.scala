package typingsSlinky.firmata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO untested --- TWW
  /* static member */
  @scala.inline
  def decode(data: js.Array[scala.Double]): js.Array[scala.Double] = typingsSlinky.firmata.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[scala.Double]]
  
  // TODO untested --- TWW
  /* static member */
  @scala.inline
  def encode(data: js.Array[scala.Double]): js.Array[scala.Double] = typingsSlinky.firmata.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[scala.Double]]
  
  /* static member */
  @scala.inline
  def isAcceptablePort(port: typingsSlinky.firmata.mod.Port): scala.Boolean = typingsSlinky.firmata.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isAcceptablePort")(port.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /* static member */
  @scala.inline
  def requestPort(callback: js.Function2[/* error */ js.Any, /* port */ typingsSlinky.firmata.mod.Port, _]): scala.Unit = typingsSlinky.firmata.mod.^.asInstanceOf[js.Dynamic].applyDynamic("requestPort")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
