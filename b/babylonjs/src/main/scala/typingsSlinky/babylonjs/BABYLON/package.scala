package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object BABYLON {
  
  type ActiveMeshStageAction = js.Function2[
    /* sourceMesh */ typingsSlinky.babylonjs.BABYLON.AbstractMesh, 
    /* mesh */ typingsSlinky.babylonjs.BABYLON.AbstractMesh, 
    scala.Unit
  ]
  
  type BabylonFileParser = js.Function4[
    /* parsedData */ js.Any, 
    /* scene */ typingsSlinky.babylonjs.BABYLON.Scene, 
    /* container */ typingsSlinky.babylonjs.BABYLON.AssetContainer, 
    /* rootUrl */ java.lang.String, 
    scala.Unit
  ]
  
  type BaseError = js.Error
  
  type CameraInputsMap[TCamera /* <: typingsSlinky.babylonjs.BABYLON.Camera */] = (/**
    * Accessor to the input by input type.
    */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.babylonjs.BABYLON.ICameraInput[TCamera]]) with (/**
    * Accessor to the input by input index.
    */
  org.scalablytyped.runtime.NumberDictionary[typingsSlinky.babylonjs.BABYLON.ICameraInput[TCamera]])
  
  type CameraStageAction = js.Function1[/* camera */ typingsSlinky.babylonjs.BABYLON.Camera, scala.Unit]
  
  type CameraStageFrameBufferAction = js.Function1[/* camera */ typingsSlinky.babylonjs.BABYLON.Camera, scala.Boolean]
  
  type DataArray = js.Array[scala.Double] | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  type DeepImmutable[T] = typingsSlinky.babylonjs.BABYLON.DeepImmutableObject[T] | typingsSlinky.babylonjs.BABYLON.DeepImmutableArray[js.Any] | T
  
  type DeepImmutableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: babylonjs.BABYLON.DeepImmutable<T[K]>}
    */ typingsSlinky.babylonjs.babylonjsStrings.DeepImmutableObject with org.scalablytyped.runtime.TopLevel[T]
  
  type DisplayPassPostProcess = typingsSlinky.babylonjs.BABYLON.PostProcess
  
  type EvaluateSubMeshStageAction = js.Function2[
    /* mesh */ typingsSlinky.babylonjs.BABYLON.AbstractMesh, 
    /* subMesh */ typingsSlinky.babylonjs.BABYLON.SubMesh, 
    scala.Unit
  ]
  
  type FloatArray = js.Array[scala.Double] | js.typedarray.Float32Array
  
  type HighlightsPostProcess = typingsSlinky.babylonjs.BABYLON.PostProcess
  
  type IMotionControllerLayoutMap = /**
    * Layouts with handness type as a key
    */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.babylonjs.BABYLON.IMotionControllerLayout]
  
  type ISceneLoaderPluginExtensions = /**
    * Defines the list of supported extensions
    */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.babylonjs.anon.IsBinary]
  
  type Immutable[T] = typingsSlinky.babylonjs.BABYLON.DeepImmutable[T] | js.Array[js.Any] | T
  
  type IndicesArray = js.Array[scala.Double] | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array
  
  type IndividualBabylonFileParser = js.Function3[
    /* parsedData */ js.Any, 
    /* scene */ typingsSlinky.babylonjs.BABYLON.Scene, 
    /* rootUrl */ java.lang.String, 
    js.Any
  ]
  
  type KeepAssets = typingsSlinky.babylonjs.BABYLON.AbstractScene
  
  type MeshStageAction = js.Function2[
    /* mesh */ typingsSlinky.babylonjs.BABYLON.AbstractMesh, 
    /* hardwareInstancedRendering */ scala.Boolean, 
    scala.Boolean
  ]
  
  type MotionControllerConstructor = js.Function2[
    /* xrInput */ typingsSlinky.babylonjs.XRInputSource, 
    /* scene */ typingsSlinky.babylonjs.BABYLON.Scene, 
    typingsSlinky.babylonjs.BABYLON.WebXRAbstractMotionController
  ]
  
  type NodeConstructor = js.Function3[
    /* name */ java.lang.String, 
    /* scene */ typingsSlinky.babylonjs.BABYLON.Scene, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[typingsSlinky.babylonjs.BABYLON.Node]
  ]
  
  type Nullable[T] = T | scala.Null
  
  type PassPostProcess = typingsSlinky.babylonjs.BABYLON.PostProcess
  
  type PointerMoveStageAction = js.Function5[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ typingsSlinky.babylonjs.BABYLON.Nullable[typingsSlinky.babylonjs.BABYLON.PickingInfo], 
    /* isMeshPicked */ scala.Boolean, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    typingsSlinky.babylonjs.BABYLON.Nullable[typingsSlinky.babylonjs.BABYLON.PickingInfo]
  ]
  
  type PointerUpDownStageAction = js.Function4[
    /* unTranslatedPointerX */ scala.Double, 
    /* unTranslatedPointerY */ scala.Double, 
    /* pickResult */ typingsSlinky.babylonjs.BABYLON.Nullable[typingsSlinky.babylonjs.BABYLON.PickingInfo], 
    /* evt */ org.scalajs.dom.raw.PointerEvent, 
    typingsSlinky.babylonjs.BABYLON.Nullable[typingsSlinky.babylonjs.BABYLON.PickingInfo]
  ]
  
  /**
    * Alias type for primitive types
    * @ignorenaming
    */
  type Primitive = js.UndefOr[scala.Null | scala.Boolean | java.lang.String | scala.Double | js.Function]
  
  type RenderTargetStageAction = js.Function1[/* renderTarget */ typingsSlinky.babylonjs.BABYLON.RenderTargetTexture, scala.Unit]
  
  type RenderTargetsStageAction = js.Function1[
    /* renderTargets */ typingsSlinky.babylonjs.BABYLON.SmartArrayNoDuplicate[typingsSlinky.babylonjs.BABYLON.RenderTargetTexture], 
    scala.Unit
  ]
  
  type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ scala.Double, scala.Unit]
  
  type RenderingMeshStageAction = js.Function3[
    /* mesh */ typingsSlinky.babylonjs.BABYLON.Mesh, 
    /* subMesh */ typingsSlinky.babylonjs.BABYLON.SubMesh, 
    /* batch */ typingsSlinky.babylonjs.BABYLON.InstancesBatch, 
    scala.Unit
  ]
  
  type SimpleStageAction = js.Function0[scala.Unit]
  
  type TrianglePickingPredicate = js.Function4[
    /* p0 */ typingsSlinky.babylonjs.BABYLON.Vector3, 
    /* p1 */ typingsSlinky.babylonjs.BABYLON.Vector3, 
    /* p2 */ typingsSlinky.babylonjs.BABYLON.Vector3, 
    /* ray */ typingsSlinky.babylonjs.BABYLON.Ray, 
    scala.Boolean
  ]
  
  type VRMultiviewToSingleviewPostProcess = typingsSlinky.babylonjs.BABYLON.PostProcess
  
  type WebXRFeatureConstructor = js.Function2[
    /* xrSessionManager */ typingsSlinky.babylonjs.BABYLON.WebXRSessionManager, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[typingsSlinky.babylonjs.BABYLON.IWebXRFeature]
  ]
  
  type double = scala.Double
  
  type float = scala.Double
  
  type int = scala.Double
}
