package typingsSlinky.samchon.mod.protocol

import typingsSlinky.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "protocol.Invoke")
@js.native
/**
  * Default Constructor.
  */
class Invoke ()
  extends typingsSlinky.samchon.protocolMod.Invoke {
  /**
    * Copy Constructor.
    *
    * @param invoke
    */
  def this(invoke: typingsSlinky.samchon.invokeMod.Invoke) = this()
  def this(listener: String) = this()
  /**
    * Construct from listener and parametric values.
    *
    * @param listener
    * @param parameters
    */
  def this(
    listener: String,
    parameters: (Boolean | Double | String | XML | scala.scalajs.js.typedarray.Uint8Array)*
  ) = this()
}

