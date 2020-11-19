package typingsSlinky.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.mod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root ()
  extends typingsSlinky.apolloProtobufjs.mod.Root {
  def this(options: StringDictionary[js.Any]) = this()
}
/* static members */
@JSImport("@apollo/protobufjs/light", "Root")
@js.native
object Root extends js.Object {
  
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  def fromJSON(json: INamespace): typingsSlinky.apolloProtobufjs.mod.Root = js.native
  def fromJSON(json: INamespace, root: typingsSlinky.apolloProtobufjs.mod.Root): typingsSlinky.apolloProtobufjs.mod.Root = js.native
}
