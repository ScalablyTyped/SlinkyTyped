package typingsSlinky.keystonejsListPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AtTrackingPluginProvider = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.keystonejsListPlugins.mod.AtTrackingOptions], 
    typingsSlinky.keystonejsKeystone.mod.Plugin
  ]
  
  type ByTrackingPluginProvider = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.keystonejsListPlugins.mod.ByTrackingOptions], 
    typingsSlinky.keystonejsKeystone.mod.Plugin
  ]
}
