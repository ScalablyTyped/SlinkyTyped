package typingsSlinky.googleGax.fallbackMod.protobuf

import typingsSlinky.protobufjs.mod.Codegen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converter {
  
  /**
    * Generates a plain object to runtime message converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.converter.fromObject")
  @js.native
  def fromObject(mtype: typingsSlinky.protobufjs.mod.Type): Codegen = js.native
  
  /**
    * Generates a runtime message to plain object converter specific to the specified message type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.converter.toObject")
  @js.native
  def toObject(mtype: typingsSlinky.protobufjs.mod.Type): Codegen = js.native
}
