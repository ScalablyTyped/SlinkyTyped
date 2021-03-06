package typingsSlinky.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/minimal", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typingsSlinky.protobufjs.mod.Root {
  def this(options: StringDictionary[js.Any]) = this()
}
/* static members */
object Root {
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  @JSImport("protobufjs/minimal", "Root.fromJSON")
  @js.native
  def fromJSON(json: INamespace): typingsSlinky.protobufjs.mod.Root = js.native
  @JSImport("protobufjs/minimal", "Root.fromJSON")
  @js.native
  def fromJSON(json: INamespace, root: typingsSlinky.protobufjs.mod.Root): typingsSlinky.protobufjs.mod.Root = js.native
}
