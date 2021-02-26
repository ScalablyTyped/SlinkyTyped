package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialSystemValuesMod {
  
  @js.native
  sealed trait NodeMaterialSystemValues extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialSystemValues", "NodeMaterialSystemValues")
  @js.native
  object NodeMaterialSystemValues extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialSystemValues with Double] = js.native
    
    /** CameraPosition */
    @js.native
    sealed trait CameraPosition extends NodeMaterialSystemValues
    /* 7 */ val CameraPosition: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.CameraPosition with Double = js.native
    
    /** Delta time */
    @js.native
    sealed trait DeltaTime extends NodeMaterialSystemValues
    /* 9 */ val DeltaTime: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.DeltaTime with Double = js.native
    
    /** Fog Color */
    @js.native
    sealed trait FogColor extends NodeMaterialSystemValues
    /* 8 */ val FogColor: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.FogColor with Double = js.native
    
    /** Projection */
    @js.native
    sealed trait Projection extends NodeMaterialSystemValues
    /* 3 */ val Projection: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.Projection with Double = js.native
    
    /** View */
    @js.native
    sealed trait View extends NodeMaterialSystemValues
    /* 2 */ val View: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.View with Double = js.native
    
    /** ViewProjection */
    @js.native
    sealed trait ViewProjection extends NodeMaterialSystemValues
    /* 4 */ val ViewProjection: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.ViewProjection with Double = js.native
    
    /** World */
    @js.native
    sealed trait World extends NodeMaterialSystemValues
    /* 1 */ val World: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.World with Double = js.native
    
    /** WorldView */
    @js.native
    sealed trait WorldView extends NodeMaterialSystemValues
    /* 5 */ val WorldView: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.WorldView with Double = js.native
    
    /** WorldViewProjection */
    @js.native
    sealed trait WorldViewProjection extends NodeMaterialSystemValues
    /* 6 */ val WorldViewProjection: typingsSlinky.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.WorldViewProjection with Double = js.native
  }
}
