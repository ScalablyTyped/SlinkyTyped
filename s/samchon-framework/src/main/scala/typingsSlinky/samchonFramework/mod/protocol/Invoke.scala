package typingsSlinky.samchonFramework.mod.protocol

import typingsSlinky.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon-framework", "protocol.Invoke")
@js.native
/**
  * Default Constructor.
  */
class Invoke ()
  extends typingsSlinky.samchon.mod.protocol.Invoke {
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
  def this(listener: String, parameters: (Boolean | Double | String | XML | js.typedarray.Uint8Array)*) = this()
}
