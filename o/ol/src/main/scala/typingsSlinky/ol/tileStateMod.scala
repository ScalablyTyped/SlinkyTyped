package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/TileState", JSImport.Namespace)
@js.native
object tileStateMod extends js.Object {
  
  @js.native
  sealed trait TileState extends js.Object
  @js.native
  object TileState extends js.Object {
    
    @js.native
    sealed trait EMPTY extends TileState
    
    @js.native
    sealed trait ERROR extends TileState
    
    @js.native
    sealed trait IDLE extends TileState
    
    @js.native
    sealed trait LOADED extends TileState
    
    @js.native
    sealed trait LOADING extends TileState
  }
  
  @js.native
  object default extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TileState with Double] = js.native
    
    /* 4 */ val EMPTY: typingsSlinky.ol.tileStateMod.TileState.EMPTY with Double = js.native
    
    /* 3 */ val ERROR: typingsSlinky.ol.tileStateMod.TileState.ERROR with Double = js.native
    
    /* 0 */ val IDLE: typingsSlinky.ol.tileStateMod.TileState.IDLE with Double = js.native
    
    /* 2 */ val LOADED: typingsSlinky.ol.tileStateMod.TileState.LOADED with Double = js.native
    
    /* 1 */ val LOADING: typingsSlinky.ol.tileStateMod.TileState.LOADING with Double = js.native
  }
}
