package typingsSlinky.openfin

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.openfin.openfinStrings.`external-window`
import typingsSlinky.openfin.openfinStrings.`global-hotkey`
import typingsSlinky.openfin.openfinStrings.application
import typingsSlinky.openfin.openfinStrings.system
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/events/emitterMap", JSImport.Namespace)
@js.native
object emitterMapMod extends js.Object {
  
  @js.native
  class EmitterMap () extends js.Object {
    
    def delete(keys: EmitterAccessor): Boolean = js.native
    
    def get(keys: EmitterAccessor): EventEmitter = js.native
    
    def has(keys: EmitterAccessor): Boolean = js.native
    
    var hashKeys: js.Any = js.native
    
    var storage: js.Any = js.native
  }
  
  type ApplicationEmitterAccessor = js.Tuple2[application, String]
  
  type EmitterAccessor = SystemEmitterAccessor | ApplicationEmitterAccessor | WindowEmitterAccessor | ExternalWindowEmitterAccessor | HotkeyEmitterAccessor | js.Array[String]
  
  type ExternalWindowEmitterAccessor = js.Tuple2[`external-window`, String]
  
  type HotkeyEmitterAccessor = js.Array[`global-hotkey`]
  
  type SystemEmitterAccessor = js.Array[system]
  
  type WindowEmitterAccessor = js.Tuple3[window, String, String]
}
