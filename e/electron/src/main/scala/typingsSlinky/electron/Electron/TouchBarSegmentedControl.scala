package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.buttons
import typingsSlinky.electron.electronStrings.multiple
import typingsSlinky.electron.electronStrings.single
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSegmentedControl extends EventEmitter {
  
  var mode: single | multiple | buttons = js.native
  
  var segmentStyle: String = js.native
  
  var segments: js.Array[SegmentedControlSegment] = js.native
  
  var selectedIndex: Double = js.native
}
