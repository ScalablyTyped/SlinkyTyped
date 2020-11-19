package typingsSlinky.nodelibFsWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object settingsMod {
  
  type DeepFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.FilterFunction[typingsSlinky.nodelibFsWalk.typesMod.Entry]
  
  type EntryFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.FilterFunction[typingsSlinky.nodelibFsWalk.typesMod.Entry]
  
  type ErrorFilterFunction = typingsSlinky.nodelibFsWalk.settingsMod.FilterFunction[typingsSlinky.nodelibFsWalk.typesMod.Errno]
  
  type FilterFunction[T] = js.Function1[/* value */ T, scala.Boolean]
}
