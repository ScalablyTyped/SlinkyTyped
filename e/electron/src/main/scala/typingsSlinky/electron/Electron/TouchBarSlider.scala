package typingsSlinky.electron.Electron

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSlider extends EventEmitter {
  
  var label: String = js.native
  
  var maxValue: Double = js.native
  
  var minValue: Double = js.native
  
  var value: Double = js.native
}
