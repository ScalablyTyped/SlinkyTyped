package typingsSlinky.nodeRedNodeTestHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TestCredentials[TCred] = typingsSlinky.nodeRed.mod.NodeCredentials[TCred]
  
  type TestFlows = js.Array[typingsSlinky.nodeRedNodeTestHelper.anon.TestFlowsItemNodeDef]
  
  type TestFlowsItem[TNodeDef /* <: typingsSlinky.nodeRed.mod.NodeDef */] = typingsSlinky.std.Partial[TNodeDef] with typingsSlinky.nodeRedNodeTestHelper.anon.Id
  
  type TestNodeInitializer = typingsSlinky.nodeRed.mod.NodeInitializer[typingsSlinky.nodeRed.mod.NodeAPISettingsWithData] | (js.Array[
    typingsSlinky.nodeRed.mod.NodeInitializer[typingsSlinky.nodeRed.mod.NodeAPISettingsWithData]
  ])
}
