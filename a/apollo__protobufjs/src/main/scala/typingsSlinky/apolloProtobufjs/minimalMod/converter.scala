package typingsSlinky.apolloProtobufjs.minimalMod

import typingsSlinky.apolloProtobufjs.mod.Codegen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "converter")
@js.native
object converter extends js.Object {
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def fromObject(mtype: typingsSlinky.apolloProtobufjs.mod.Type): Codegen = js.native
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def toObject(mtype: typingsSlinky.apolloProtobufjs.mod.Type): Codegen = js.native
}
