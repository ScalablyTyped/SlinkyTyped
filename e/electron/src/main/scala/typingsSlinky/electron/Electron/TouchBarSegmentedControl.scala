package typingsSlinky.electron.Electron

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSegmentedControl extends EventEmitter {
  
  var segmentStyle: String = js.native
  
  var segments: js.Array[SegmentedControlSegment] = js.native
  
  var selectedIndex: Double = js.native
}
