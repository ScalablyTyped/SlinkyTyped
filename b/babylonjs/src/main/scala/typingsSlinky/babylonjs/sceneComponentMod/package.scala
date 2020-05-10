package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sceneComponentMod {
  type ActiveMeshStageAction = js.Function2[
    /* sourceMesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, 
    /* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, 
    scala.Unit
  ]
  type CameraStageAction = js.Function1[/* camera */ typingsSlinky.babylonjs.cameraMod.Camera, scala.Unit]
  type CameraStageFrameBufferAction = js.Function1[/* camera */ typingsSlinky.babylonjs.cameraMod.Camera, scala.Boolean]
  type EvaluateSubMeshStageAction = js.Function2[
    /* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, 
    /* subMesh */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
    scala.Unit
  ]
  type MeshStageAction = js.Function2[
    /* mesh */ typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, 
    /* hardwareInstancedRendering */ scala.Boolean, 
    scala.Boolean
  ]
  type PointerMoveStageAction = js.Function5[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ typingsSlinky.babylonjs.typesMod.Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo], 
    /* isMeshPicked */ scala.Boolean, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    typingsSlinky.babylonjs.typesMod.Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]
  ]
  type PointerUpDownStageAction = js.Function4[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ typingsSlinky.babylonjs.typesMod.Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo], 
    /* evt */ org.scalajs.dom.raw.PointerEvent, 
    typingsSlinky.babylonjs.typesMod.Nullable[typingsSlinky.babylonjs.pickingInfoMod.PickingInfo]
  ]
  type RenderTargetStageAction = js.Function1[
    /* renderTarget */ typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture, 
    scala.Unit
  ]
  type RenderTargetsStageAction = js.Function1[
    /* renderTargets */ typingsSlinky.babylonjs.smartArrayMod.SmartArrayNoDuplicate[typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture], 
    scala.Unit
  ]
  type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ scala.Double, scala.Unit]
  type RenderingMeshStageAction = js.Function3[
    /* mesh */ typingsSlinky.babylonjs.meshMod.Mesh, 
    /* subMesh */ typingsSlinky.babylonjs.subMeshMod.SubMesh, 
    /* batch */ typingsSlinky.babylonjs.meshMod.InstancesBatch, 
    scala.Unit
  ]
  type SimpleStageAction = js.Function0[scala.Unit]
}
