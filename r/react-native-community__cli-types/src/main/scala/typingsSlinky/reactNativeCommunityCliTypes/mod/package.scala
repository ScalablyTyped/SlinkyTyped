package typingsSlinky.reactNativeCommunityCliTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CommandFunction[Args] = js.Function3[
    /* argv */ js.Array[java.lang.String], 
    /* ctx */ typingsSlinky.reactNativeCommunityCliTypes.mod.Config, 
    /* args */ Args, 
    js.Promise[scala.Unit] | scala.Unit
  ]
  
  type DetachedCommand = typingsSlinky.reactNativeCommunityCliTypes.mod.Command[
    typingsSlinky.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`true`
  ]
  
  type DetachedCommandFunction[Args] = js.Function2[
    /* argv */ js.Array[java.lang.String], 
    /* args */ Args, 
    js.Promise[scala.Unit] | scala.Unit
  ]
  
  type InquirerPrompt = js.Any
  
  type OptionValue = java.lang.String | scala.Boolean | scala.Double
}
