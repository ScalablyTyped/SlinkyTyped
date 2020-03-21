package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/KeyCode", JSImport.Namespace)
@js.native
object keyCodeMod extends js.Object {
  @js.native
  sealed trait KeyCode extends js.Object
  
  @js.native
  object KeyCode extends js.Object {
    @js.native
    sealed trait DOWN extends KeyCode
    
    @js.native
    sealed trait LEFT extends KeyCode
    
    @js.native
    sealed trait RIGHT extends KeyCode
    
    @js.native
    sealed trait UP extends KeyCode
    
  }
  
  @js.native
  object default extends js.Object {
    /* 40 */ val DOWN: typingsSlinky.ol.keyCodeMod.KeyCode.DOWN with Double = js.native
    /* 37 */ val LEFT: typingsSlinky.ol.keyCodeMod.KeyCode.LEFT with Double = js.native
    /* 39 */ val RIGHT: typingsSlinky.ol.keyCodeMod.KeyCode.RIGHT with Double = js.native
    /* 38 */ val UP: typingsSlinky.ol.keyCodeMod.KeyCode.UP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyCode with Double] = js.native
  }
  
}

