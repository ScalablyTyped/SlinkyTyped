package typingsSlinky.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable10
import org.scalablytyped.runtime.Instantiable12
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.Instantiable8
import org.scalablytyped.runtime.Instantiable9
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactThreeFiber.anon.Dispose
import typingsSlinky.reactThreeFiber.anon.FnCall
import typingsSlinky.reactThreeFiber.anon.FnCallXY
import typingsSlinky.reactThreeFiber.anon.FnCallXYZ
import typingsSlinky.reactThreeFiber.anon.TypeofBufferGeometry
import typingsSlinky.reactThreeFiber.anon.TypeofColor
import typingsSlinky.reactThreeFiber.anon.TypeofEuler
import typingsSlinky.reactThreeFiber.anon.TypeofQuaternion
import typingsSlinky.reactThreeFiber.anon.TypeofTexture
import typingsSlinky.reactThreeFiber.anon.Vertices
import typingsSlinky.reactThreeFiber.canvasMod.MouseEvent
import typingsSlinky.reactThreeFiber.canvasMod.PointerEvent
import typingsSlinky.reactThreeFiber.canvasMod.WheelEvent
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Omit
import typingsSlinky.std.Parameters
import typingsSlinky.std.Partial
import typingsSlinky.three.box3Mod.Box3
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.constantsMod.CompressedPixelFormat
import typingsSlinky.three.constantsMod.Mapping
import typingsSlinky.three.constantsMod.PixelFormat
import typingsSlinky.three.constantsMod.TextureDataType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.TextureFilter
import typingsSlinky.three.constantsMod.Wrapping
import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.directionalLightMod.DirectionalLight
import typingsSlinky.three.hemisphereLightMod.HemisphereLight
import typingsSlinky.three.lineBasicMaterialMod.LineBasicMaterialParameters
import typingsSlinky.three.lineDashedMaterialMod.LineDashedMaterialParameters
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.materialMod.MaterialParameters
import typingsSlinky.three.meshBasicMaterialMod.MeshBasicMaterialParameters
import typingsSlinky.three.meshDepthMaterialMod.MeshDepthMaterialParameters
import typingsSlinky.three.meshDistanceMaterialMod.MeshDistanceMaterialParameters
import typingsSlinky.three.meshLambertMaterialMod.MeshLambertMaterialParameters
import typingsSlinky.three.meshMatcapMaterialMod.MeshMatcapMaterialParameters
import typingsSlinky.three.meshNormalMaterialMod.MeshNormalMaterialParameters
import typingsSlinky.three.meshPhongMaterialMod.MeshPhongMaterialParameters
import typingsSlinky.three.meshPhysicalMaterialMod.MeshPhysicalMaterialParameters
import typingsSlinky.three.meshStandardMaterialMod.MeshStandardMaterialParameters
import typingsSlinky.three.meshToonMaterialMod.MeshToonMaterialParameters
import typingsSlinky.three.mod.AmbientLight
import typingsSlinky.three.mod.AmbientLightProbe
import typingsSlinky.three.mod.ArrayCamera
import typingsSlinky.three.mod.ArrowHelper
import typingsSlinky.three.mod.AudioListener
import typingsSlinky.three.mod.AxesHelper
import typingsSlinky.three.mod.Bone
import typingsSlinky.three.mod.Box3Helper
import typingsSlinky.three.mod.BoxBufferGeometry
import typingsSlinky.three.mod.BoxGeometry
import typingsSlinky.three.mod.BoxHelper
import typingsSlinky.three.mod.BufferAttribute
import typingsSlinky.three.mod.BufferGeometry
import typingsSlinky.three.mod.CameraHelper
import typingsSlinky.three.mod.CanvasTexture
import typingsSlinky.three.mod.CircleBufferGeometry
import typingsSlinky.three.mod.CircleGeometry
import typingsSlinky.three.mod.CompressedTexture
import typingsSlinky.three.mod.ConeBufferGeometry
import typingsSlinky.three.mod.ConeGeometry
import typingsSlinky.three.mod.CubeCamera
import typingsSlinky.three.mod.CubeTexture
import typingsSlinky.three.mod.CylinderBufferGeometry
import typingsSlinky.three.mod.CylinderGeometry
import typingsSlinky.three.mod.DataTexture
import typingsSlinky.three.mod.DataTexture3D
import typingsSlinky.three.mod.DepthTexture
import typingsSlinky.three.mod.DirectionalLightHelper
import typingsSlinky.three.mod.DirectionalLightShadow
import typingsSlinky.three.mod.DodecahedronBufferGeometry
import typingsSlinky.three.mod.DodecahedronGeometry
import typingsSlinky.three.mod.EdgesGeometry
import typingsSlinky.three.mod.ExtrudeBufferGeometry
import typingsSlinky.three.mod.ExtrudeGeometry
import typingsSlinky.three.mod.Face3
import typingsSlinky.three.mod.Fog
import typingsSlinky.three.mod.Geometry
import typingsSlinky.three.mod.GridHelper
import typingsSlinky.three.mod.Group
import typingsSlinky.three.mod.HemisphereLightHelper
import typingsSlinky.three.mod.HemisphereLightProbe
import typingsSlinky.three.mod.IcosahedronBufferGeometry
import typingsSlinky.three.mod.IcosahedronGeometry
import typingsSlinky.three.mod.ImmediateRenderObject
import typingsSlinky.three.mod.InstancedBufferAttribute
import typingsSlinky.three.mod.InstancedBufferGeometry
import typingsSlinky.three.mod.InstancedMesh
import typingsSlinky.three.mod.LOD
import typingsSlinky.three.mod.LatheBufferGeometry
import typingsSlinky.three.mod.LatheGeometry
import typingsSlinky.three.mod.Light
import typingsSlinky.three.mod.LightProbe
import typingsSlinky.three.mod.LightShadow
import typingsSlinky.three.mod.LineBasicMaterial
import typingsSlinky.three.mod.LineDashedMaterial
import typingsSlinky.three.mod.LineLoop
import typingsSlinky.three.mod.LineSegments
import typingsSlinky.three.mod.Matrix3
import typingsSlinky.three.mod.Mesh
import typingsSlinky.three.mod.MeshBasicMaterial
import typingsSlinky.three.mod.MeshDepthMaterial
import typingsSlinky.three.mod.MeshDistanceMaterial
import typingsSlinky.three.mod.MeshLambertMaterial
import typingsSlinky.three.mod.MeshMatcapMaterial
import typingsSlinky.three.mod.MeshNormalMaterial
import typingsSlinky.three.mod.MeshPhongMaterial
import typingsSlinky.three.mod.MeshPhysicalMaterial
import typingsSlinky.three.mod.MeshStandardMaterial
import typingsSlinky.three.mod.MeshToonMaterial
import typingsSlinky.three.mod.OctahedronBufferGeometry
import typingsSlinky.three.mod.OctahedronGeometry
import typingsSlinky.three.mod.OrthographicCamera
import typingsSlinky.three.mod.ParametricBufferGeometry
import typingsSlinky.three.mod.ParametricGeometry
import typingsSlinky.three.mod.PerspectiveCamera
import typingsSlinky.three.mod.PlaneBufferGeometry
import typingsSlinky.three.mod.PlaneGeometry
import typingsSlinky.three.mod.PlaneHelper
import typingsSlinky.three.mod.PointLightHelper
import typingsSlinky.three.mod.Points
import typingsSlinky.three.mod.PointsMaterial
import typingsSlinky.three.mod.PolarGridHelper
import typingsSlinky.three.mod.PolyhedronBufferGeometry
import typingsSlinky.three.mod.PolyhedronGeometry
import typingsSlinky.three.mod.PositionalAudio
import typingsSlinky.three.mod.RawShaderMaterial
import typingsSlinky.three.mod.Raycaster
import typingsSlinky.three.mod.RectAreaLight
import typingsSlinky.three.mod.RingBufferGeometry
import typingsSlinky.three.mod.RingGeometry
import typingsSlinky.three.mod.Scene
import typingsSlinky.three.mod.ShaderMaterial
import typingsSlinky.three.mod.ShadowMaterial
import typingsSlinky.three.mod.ShapeBufferGeometry
import typingsSlinky.three.mod.ShapeGeometry
import typingsSlinky.three.mod.Skeleton
import typingsSlinky.three.mod.SkeletonHelper
import typingsSlinky.three.mod.SkinnedMesh
import typingsSlinky.three.mod.SphereBufferGeometry
import typingsSlinky.three.mod.SphereGeometry
import typingsSlinky.three.mod.SpotLight
import typingsSlinky.three.mod.SpotLightHelper
import typingsSlinky.three.mod.SpotLightShadow
import typingsSlinky.three.mod.Sprite
import typingsSlinky.three.mod.SpriteMaterial
import typingsSlinky.three.mod.TetrahedronBufferGeometry
import typingsSlinky.three.mod.TetrahedronGeometry
import typingsSlinky.three.mod.TextBufferGeometry
import typingsSlinky.three.mod.TextGeometry
import typingsSlinky.three.mod.Texture
import typingsSlinky.three.mod.TorusBufferGeometry
import typingsSlinky.three.mod.TorusGeometry
import typingsSlinky.three.mod.TorusKnotBufferGeometry
import typingsSlinky.three.mod.TorusKnotGeometry
import typingsSlinky.three.mod.TubeBufferGeometry
import typingsSlinky.three.mod.TubeGeometry
import typingsSlinky.three.mod.Vector4
import typingsSlinky.three.mod.VideoTexture
import typingsSlinky.three.mod.WireframeGeometry
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.planeMod.Plane
import typingsSlinky.three.pointLightMod.PointLight
import typingsSlinky.three.pointsMaterialMod.PointsMaterialParameters
import typingsSlinky.three.polyfillsMod.TypedArray
import typingsSlinky.three.shaderMaterialMod.ShaderMaterialParameters
import typingsSlinky.three.shapeMod.Shape
import typingsSlinky.three.spriteMaterialMod.SpriteMaterialParameters
import typingsSlinky.three.textBufferGeometryMod.TextGeometryParameters
import typingsSlinky.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threeTypesMod {
  
  type AmbientLightProbeProps = LightNode[AmbientLightProbe, Instantiable0[AmbientLightProbe]]
  
  type AmbientLightProps = LightNode[AmbientLight, Instantiable0[AmbientLight]]
  
  type Args[T] = T | ConstructorParameters[T]
  
  type ArrayCameraProps = Object3DNode[ArrayCamera, Instantiable0[ArrayCamera]]
  
  type ArrowHelperProps = Object3DNode[
    ArrowHelper, 
    Instantiable6[
      /* dir */ typingsSlinky.three.vector3Mod.Vector3, 
      /* origin */ js.UndefOr[typingsSlinky.three.vector3Mod.Vector3], 
      /* length */ js.UndefOr[Double], 
      /* color */ js.UndefOr[typingsSlinky.three.colorMod.Color | String | Double], 
      /* headLength */ js.UndefOr[Double], 
      /* headWidth */ js.UndefOr[Double], 
      ArrowHelper
    ]
  ]
  
  type AudioListenerProps = Object3DNode[AudioListener, Instantiable0[AudioListener]]
  
  type AxesHelperProps = Object3DNode[AxesHelper, Instantiable0[AxesHelper]]
  
  type BoneProps = Object3DNode[Bone, Instantiable0[Bone]]
  
  type Box3HelperProps = Object3DNode[Box3Helper, Instantiable1[/* box */ Box3, Box3Helper]]
  
  type BoxBufferGeometryProps = BufferGeometryNode[
    BoxBufferGeometry, 
    Instantiable6[
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* depth */ js.UndefOr[Double], 
      /* widthSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* depthSegments */ js.UndefOr[Double], 
      BoxBufferGeometry
    ]
  ]
  
  type BoxGeometryProps = GeometryNode[
    BoxGeometry, 
    Instantiable6[
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* depth */ js.UndefOr[Double], 
      /* widthSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* depthSegments */ js.UndefOr[Double], 
      BoxGeometry
    ]
  ]
  
  type BoxHelperProps = Object3DNode[BoxHelper, Instantiable1[/* object */ Object3D, BoxHelper]]
  
  type BufferAttributeProps = Node[
    BufferAttribute, 
    Instantiable2[/* array */ ArrayLike[Double], /* itemSize */ Double, BufferAttribute]
  ]
  
  type BufferGeometryNode[T /* <: BufferGeometry */, P] = Overwrite[Node[T, P], js.Object]
  
  type BufferGeometryProps = BufferGeometryNode[BufferGeometry, TypeofBufferGeometry]
  
  type CameraHelperProps = Object3DNode[CameraHelper, Instantiable1[/* camera */ Camera, CameraHelper]]
  
  type CameraProps = Object3DNode[typingsSlinky.three.mod.Camera, Instantiable0[typingsSlinky.three.mod.Camera]]
  
  type CanvasTextureProps = Node[
    CanvasTexture, 
    Instantiable9[
      /* canvas */ HTMLImageElement | HTMLCanvasElement | HTMLVideoElement, 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      CanvasTexture
    ]
  ]
  
  type CircleBufferGeometryProps = BufferGeometryNode[CircleBufferGeometry, Instantiable0[CircleBufferGeometry]]
  
  type CircleGeometryProps = GeometryNode[CircleGeometry, Instantiable0[CircleGeometry]]
  
  type Color = typingsSlinky.three.mod.Color | Double | String
  
  type ColorProps = Node[typingsSlinky.three.mod.Color, TypeofColor]
  
  type CompressedTextureProps = Node[
    CompressedTexture, 
    Instantiable12[
      /* mipmaps */ js.Array[ImageData], 
      /* width */ Double, 
      /* height */ Double, 
      /* format */ js.UndefOr[CompressedPixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      CompressedTexture
    ]
  ]
  
  type ConeBufferGeometryProps = BufferGeometryNode[
    ConeBufferGeometry, 
    Instantiable7[
      /* radius */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* openEnded */ js.UndefOr[Boolean], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      ConeBufferGeometry
    ]
  ]
  
  type ConeGeometryProps = GeometryNode[
    ConeGeometry, 
    Instantiable7[
      /* radius */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* openEnded */ js.UndefOr[Boolean], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      ConeGeometry
    ]
  ]
  
  type CubeCameraProps = Object3DNode[
    CubeCamera, 
    Instantiable3[
      /* near */ Double, 
      /* far */ Double, 
      /* renderTarget */ WebGLCubeRenderTarget, 
      CubeCamera
    ]
  ]
  
  type CubeTextureProps = Node[
    CubeTexture, 
    Instantiable10[
      /* images */ js.UndefOr[js.Array[js.Any]], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      CubeTexture
    ]
  ]
  
  type CylinderBufferGeometryProps = BufferGeometryNode[
    CylinderBufferGeometry, 
    Instantiable8[
      /* radiusTop */ js.UndefOr[Double], 
      /* radiusBottom */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* openEnded */ js.UndefOr[Boolean], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      CylinderBufferGeometry
    ]
  ]
  
  type CylinderGeometryProps = GeometryNode[
    CylinderGeometry, 
    Instantiable8[
      /* radiusTop */ js.UndefOr[Double], 
      /* radiusBottom */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* openEnded */ js.UndefOr[Boolean], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      CylinderGeometry
    ]
  ]
  
  type DataTexture3DProps = Node[
    DataTexture3D, 
    Instantiable4[
      /* data */ TypedArray, 
      /* width */ Double, 
      /* height */ Double, 
      /* depth */ Double, 
      DataTexture3D
    ]
  ]
  
  type DataTextureProps = Node[
    DataTexture, 
    Instantiable12[
      /* data */ TypedArray, 
      /* width */ Double, 
      /* height */ Double, 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      DataTexture
    ]
  ]
  
  type DepthTextureProps = Node[
    DepthTexture, 
    Instantiable9[
      /* width */ Double, 
      /* height */ Double, 
      /* type */ js.UndefOr[TextureDataType], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* anisotropy */ js.UndefOr[Double], 
      DepthTexture
    ]
  ]
  
  type DirectionalLightHelperProps = Object3DNode[
    DirectionalLightHelper, 
    Instantiable1[/* light */ DirectionalLight, DirectionalLightHelper]
  ]
  
  type DirectionalLightProps = LightNode[
    typingsSlinky.three.mod.DirectionalLight, 
    Instantiable0[typingsSlinky.three.mod.DirectionalLight]
  ]
  
  type DirectionalLightShadowProps = Node[DirectionalLightShadow, Instantiable1[/* camera */ Camera, DirectionalLightShadow]]
  
  type DodecahedronBufferGeometryProps = BufferGeometryNode[DodecahedronBufferGeometry, Instantiable0[DodecahedronBufferGeometry]]
  
  type DodecahedronGeometryProps = GeometryNode[DodecahedronGeometry, Instantiable0[DodecahedronGeometry]]
  
  type EdgesGeometryProps = BufferGeometryNode[
    EdgesGeometry, 
    Instantiable1[/* geometry */ typingsSlinky.three.bufferGeometryMod.BufferGeometry, EdgesGeometry]
  ]
  
  type Euler = typingsSlinky.three.mod.Euler | Parameters[FnCall]
  
  type EulerProps = Node[typingsSlinky.three.mod.Euler, TypeofEuler]
  
  @js.native
  trait EventHandlers extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    var onDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
    
    var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
    
    var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
    
    var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.native
  }
  object EventHandlers {
    
    @scala.inline
    def apply(): EventHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit class EventHandlersMutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnWheel(value: /* event */ WheelEvent => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    }
  }
  
  type ExtrudeBufferGeometryProps = BufferGeometryNode[ExtrudeBufferGeometry, Instantiable1[/* shapes */ Shape, ExtrudeBufferGeometry]]
  
  type ExtrudeGeometryProps = GeometryNode[ExtrudeGeometry, Instantiable1[/* shapes */ Shape, ExtrudeGeometry]]
  
  type Face3Props = Node[Face3, Instantiable3[/* a */ Double, /* b */ Double, /* c */ Double, Face3]]
  
  type FogProps = Node[Fog, Instantiable1[/* color */ typingsSlinky.three.colorMod.Color, Fog]]
  
  type GeometryNode[T /* <: Geometry */, P] = Overwrite[Node[T, P], Vertices]
  
  type GeometryProps = GeometryNode[Geometry, Instantiable0[Geometry]]
  
  type GridHelperProps = Object3DNode[
    GridHelper, 
    Instantiable4[
      /* size */ js.UndefOr[Double], 
      /* divisions */ js.UndefOr[Double], 
      /* color1 */ js.UndefOr[typingsSlinky.three.colorMod.Color | String | Double], 
      /* color2 */ js.UndefOr[typingsSlinky.three.colorMod.Color | String | Double], 
      GridHelper
    ]
  ]
  
  type GroupProps = Object3DNode[Group, Instantiable0[Group]]
  
  type HemisphereLightHelperProps = Object3DNode[
    HemisphereLightHelper, 
    Instantiable2[/* light */ HemisphereLight, /* size */ Double, HemisphereLightHelper]
  ]
  
  type HemisphereLightProbeProps = LightNode[HemisphereLightProbe, Instantiable0[HemisphereLightProbe]]
  
  type HemisphereLightProps = LightNode[
    typingsSlinky.three.mod.HemisphereLight, 
    Instantiable0[typingsSlinky.three.mod.HemisphereLight]
  ]
  
  type IcosahedronBufferGeometryProps = BufferGeometryNode[IcosahedronBufferGeometry, Instantiable0[IcosahedronBufferGeometry]]
  
  type IcosahedronGeometryProps = GeometryNode[IcosahedronGeometry, Instantiable0[IcosahedronGeometry]]
  
  type ImmediateRenderObjectProps = Object3DNode[
    ImmediateRenderObject, 
    Instantiable1[/* material */ Material, ImmediateRenderObject]
  ]
  
  type InstancedBufferAttributeProps = Node[
    InstancedBufferAttribute, 
    Instantiable2[/* array */ ArrayLike[Double], /* itemSize */ Double, InstancedBufferAttribute]
  ]
  
  type InstancedBufferGeometryProps = BufferGeometryNode[InstancedBufferGeometry, Instantiable0[InstancedBufferGeometry]]
  
  type InstancedMeshProps = Object3DNode[
    InstancedMesh[
      typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable3[
      /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ /* geometry */ js.Any, 
      /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ /* material */ js.Any, 
      /* count */ Double, 
      InstancedMesh[
        typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type LODProps = Object3DNode[LOD, Instantiable0[LOD]]
  
  type LatheBufferGeometryProps = BufferGeometryNode[
    LatheBufferGeometry, 
    Instantiable1[/* points */ js.Array[typingsSlinky.three.vector2Mod.Vector2], LatheBufferGeometry]
  ]
  
  type LatheGeometryProps = GeometryNode[
    LatheGeometry, 
    Instantiable1[/* points */ js.Array[typingsSlinky.three.vector2Mod.Vector2], LatheGeometry]
  ]
  
  type Layers = typingsSlinky.three.mod.Layers | (Parameters[js.Function1[/* channel */ Double, Unit]])
  
  type LightNode[T /* <: Light */, P] = Overwrite[Object3DNode[T, P], typingsSlinky.reactThreeFiber.anon.Color]
  
  type LightProbeProps = LightNode[LightProbe, Instantiable0[LightProbe]]
  
  type LightProps = LightNode[Light, Instantiable0[Light]]
  
  type LightShadowProps = Node[LightShadow, Instantiable1[/* camera */ Camera, LightShadow]]
  
  type LineBasicMaterialProps = MaterialNode[LineBasicMaterial, js.Array[LineBasicMaterialParameters]]
  
  type LineDashedMaterialProps = MaterialNode[LineDashedMaterial, js.Array[LineDashedMaterialParameters]]
  
  type LineLoopProps = Object3DNode[
    LineLoop[
      typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      LineLoop[
        typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type LineSegmentsProps = Object3DNode[
    LineSegments[
      typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      LineSegments[
        typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type MaterialNode[T /* <: typingsSlinky.three.mod.Material */, P] = Overwrite[Node[T, P], typingsSlinky.reactThreeFiber.anon.Color]
  
  type MaterialProps = MaterialNode[typingsSlinky.three.mod.Material, js.Array[MaterialParameters]]
  
  type Matrix3Props = Node[Matrix3, Instantiable0[Matrix3]]
  
  type Matrix4 = typingsSlinky.three.mod.Matrix4 | (Parameters[
    js.Function16[
      /* n11 */ Double, 
      /* n12 */ Double, 
      /* n13 */ Double, 
      /* n14 */ Double, 
      /* n21 */ Double, 
      /* n22 */ Double, 
      /* n23 */ Double, 
      /* n24 */ Double, 
      /* n31 */ Double, 
      /* n32 */ Double, 
      /* n33 */ Double, 
      /* n34 */ Double, 
      /* n41 */ Double, 
      /* n42 */ Double, 
      /* n43 */ Double, 
      /* n44 */ Double, 
      typingsSlinky.three.matrix4Mod.Matrix4
    ]
  ])
  
  type Matrix4Props = Node[typingsSlinky.three.mod.Matrix4, Instantiable0[typingsSlinky.three.mod.Matrix4]]
  
  type MeshBasicMaterialProps = MaterialNode[MeshBasicMaterial, js.Array[MeshBasicMaterialParameters]]
  
  type MeshDepthMaterialProps = MaterialNode[MeshDepthMaterial, js.Array[MeshDepthMaterialParameters]]
  
  type MeshDistanceMaterialProps = MaterialNode[MeshDistanceMaterial, js.Array[MeshDistanceMaterialParameters]]
  
  type MeshLambertMaterialProps = MaterialNode[MeshLambertMaterial, js.Array[MeshLambertMaterialParameters]]
  
  type MeshMatcapMaterialProps = MaterialNode[MeshMatcapMaterial, js.Array[MeshMatcapMaterialParameters]]
  
  type MeshNormalMaterialProps = MaterialNode[MeshNormalMaterial, js.Array[MeshNormalMaterialParameters]]
  
  type MeshPhongMaterialProps = MaterialNode[MeshPhongMaterial, js.Array[MeshPhongMaterialParameters]]
  
  type MeshPhysicalMaterialProps = MaterialNode[MeshPhysicalMaterial, js.Array[MeshPhysicalMaterialParameters]]
  
  type MeshProps = Object3DNode[
    Mesh[
      typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      Mesh[
        typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type MeshStandardMaterialProps = MaterialNode[MeshStandardMaterial, js.Array[MeshStandardMaterialParameters]]
  
  type MeshToonMaterialProps = MaterialNode[MeshToonMaterial, js.Array[MeshToonMaterialParameters]]
  
  type NamedArrayTuple[T /* <: js.Function1[/* args */ js.Any, _] */] = Parameters[T]
  
  type Node[T, P] = Overwrite[Partial[T], NodeProps[T, P]]
  
  @js.native
  trait NodeProps[T, P] extends StObject {
    
    var args: js.UndefOr[Args[P]] = js.native
    
    var attach: js.UndefOr[String] = js.native
    
    var attachArray: js.UndefOr[String] = js.native
    
    var attachObject: js.UndefOr[NamedArrayTuple[js.Function2[/* target */ String, /* name */ String, Unit]]] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* self */ T, Unit]] = js.native
    
    var ref: js.UndefOr[Ref[ReactElement]] = js.native
  }
  object NodeProps {
    
    @scala.inline
    def apply[T, P](): NodeProps[T, P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeProps[T, P]]
    }
    
    @scala.inline
    implicit class NodePropsMutableBuilder[Self <: NodeProps[_, _], T, P] (val x: Self with (NodeProps[T, P])) extends AnyVal {
      
      @scala.inline
      def setArgs(value: Args[P]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setAttach(value: String): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachArray(value: String): Self = StObject.set(x, "attachArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachArrayUndefined: Self = StObject.set(x, "attachArray", js.undefined)
      
      @scala.inline
      def setAttachObject(value: NamedArrayTuple[js.Function2[/* target */ String, /* name */ String, Unit]]): Self = StObject.set(x, "attachObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachObjectUndefined: Self = StObject.set(x, "attachObject", js.undefined)
      
      @scala.inline
      def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* self */ T => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[ReactElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ ReactElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[ReactElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  type NonFunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  type Object3DNode[T, P] = (Overwrite[Node[T, P], Dispose]) with EventHandlers
  
  type OctahedronBufferGeometryProps = BufferGeometryNode[OctahedronBufferGeometry, Instantiable0[OctahedronBufferGeometry]]
  
  type OctahedronGeometryProps = GeometryNode[OctahedronGeometry, Instantiable0[OctahedronGeometry]]
  
  type OrthographicCameraProps = Object3DNode[
    OrthographicCamera, 
    Instantiable4[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      OrthographicCamera
    ]
  ]
  
  type Overwrite[T, O] = (Omit[T, NonFunctionKeys[O]]) with O
  
  type ParametricBufferGeometryProps = BufferGeometryNode[
    ParametricBufferGeometry, 
    Instantiable3[
      /* func */ js.Function3[
        /* u */ Double, 
        /* v */ Double, 
        /* dest */ typingsSlinky.three.vector3Mod.Vector3, 
        Unit
      ], 
      /* slices */ Double, 
      /* stacks */ Double, 
      ParametricBufferGeometry
    ]
  ]
  
  type ParametricGeometryProps = GeometryNode[
    ParametricGeometry, 
    Instantiable3[
      /* func */ js.Function3[
        /* u */ Double, 
        /* v */ Double, 
        /* dest */ typingsSlinky.three.vector3Mod.Vector3, 
        Unit
      ], 
      /* slices */ Double, 
      /* stacks */ Double, 
      ParametricGeometry
    ]
  ]
  
  type PerspectiveCameraProps = Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]
  
  type PlaneBufferGeometryProps = BufferGeometryNode[PlaneBufferGeometry, Instantiable0[PlaneBufferGeometry]]
  
  type PlaneGeometryProps = GeometryNode[PlaneGeometry, Instantiable0[PlaneGeometry]]
  
  type PlaneHelperProps = Object3DNode[PlaneHelper, Instantiable1[/* plane */ Plane, PlaneHelper]]
  
  type PointLightHelperProps = Object3DNode[PointLightHelper, Instantiable1[/* light */ PointLight, PointLightHelper]]
  
  type PointLightProps = LightNode[
    typingsSlinky.three.mod.PointLight, 
    Instantiable0[typingsSlinky.three.mod.PointLight]
  ]
  
  type PointsMaterialProps = MaterialNode[PointsMaterial, js.Array[PointsMaterialParameters]]
  
  type PointsProps = Object3DNode[
    Points[
      typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      Points[
        typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type PolarGridHelperProps = Object3DNode[
    PolarGridHelper, 
    Instantiable4[
      /* radius */ Double, 
      /* radials */ Double, 
      /* circles */ Double, 
      /* divisions */ Double, 
      PolarGridHelper
    ]
  ]
  
  type PolyhedronBufferGeometryProps = BufferGeometryNode[
    PolyhedronBufferGeometry, 
    Instantiable2[
      /* vertices */ js.Array[Double], 
      /* indices */ js.Array[Double], 
      PolyhedronBufferGeometry
    ]
  ]
  
  type PolyhedronGeometryProps = GeometryNode[
    PolyhedronGeometry, 
    Instantiable2[/* vertices */ js.Array[Double], /* indices */ js.Array[Double], PolyhedronGeometry]
  ]
  
  type PositionalAudioProps = Object3DNode[
    PositionalAudio, 
    Instantiable1[/* listener */ typingsSlinky.three.audioListenerMod.AudioListener, PositionalAudio]
  ]
  
  @js.native
  trait PrimitiveProps
    extends /* properties */ StringDictionary[js.Any] {
    
    var `object`: js.Any = js.native
  }
  object PrimitiveProps {
    
    @scala.inline
    def apply(`object`: js.Any): PrimitiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimitiveProps]
    }
    
    @scala.inline
    implicit class PrimitivePropsMutableBuilder[Self <: PrimitiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  type Quaternion = typingsSlinky.three.mod.Quaternion | (Parameters[
    js.Function4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typingsSlinky.three.quaternionMod.Quaternion
    ]
  ])
  
  type QuaternionProps = Node[typingsSlinky.three.mod.Quaternion, TypeofQuaternion]
  
  type RawShaderMaterialProps = MaterialNode[RawShaderMaterial, js.Array[ShaderMaterialParameters]]
  
  type RaycasterProps = Node[Raycaster, Instantiable0[Raycaster]]
  
  type RectAreaLightProps = LightNode[RectAreaLight, Instantiable0[RectAreaLight]]
  
  type RingBufferGeometryProps = BufferGeometryNode[
    RingBufferGeometry, 
    Instantiable6[
      /* innerRadius */ js.UndefOr[Double], 
      /* outerRadius */ js.UndefOr[Double], 
      /* thetaSegments */ js.UndefOr[Double], 
      /* phiSegments */ js.UndefOr[Double], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      RingBufferGeometry
    ]
  ]
  
  type RingGeometryProps = GeometryNode[
    RingGeometry, 
    Instantiable6[
      /* innerRadius */ js.UndefOr[Double], 
      /* outerRadius */ js.UndefOr[Double], 
      /* thetaSegments */ js.UndefOr[Double], 
      /* phiSegments */ js.UndefOr[Double], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      RingGeometry
    ]
  ]
  
  type SceneProps = Object3DNode[Scene, Instantiable0[Scene]]
  
  type ShaderMaterialProps = MaterialNode[ShaderMaterial, js.Array[ShaderMaterialParameters]]
  
  type ShadowMaterialProps = MaterialNode[ShadowMaterial, js.Array[ShaderMaterialParameters]]
  
  type ShapeBufferGeometryProps = BufferGeometryNode[ShapeBufferGeometry, Instantiable1[/* shapes */ Shape, ShapeBufferGeometry]]
  
  type ShapeGeometryProps = GeometryNode[ShapeGeometry, Instantiable1[/* shapes */ Shape, ShapeGeometry]]
  
  type SkeletonHelperProps = Object3DNode[SkeletonHelper, Instantiable1[/* object */ Object3D, SkeletonHelper]]
  
  type SkeletonProps = Object3DNode[
    Skeleton, 
    Instantiable1[/* bones */ js.Array[typingsSlinky.three.boneMod.Bone], Skeleton]
  ]
  
  type SkinnedMeshProps = Object3DNode[
    SkinnedMesh[
      typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
      Material | js.Array[Material]
    ], 
    Instantiable0[
      SkinnedMesh[
        typingsSlinky.three.geometryMod.Geometry | typingsSlinky.three.bufferGeometryMod.BufferGeometry, 
        Material | js.Array[Material]
      ]
    ]
  ]
  
  type SphereBufferGeometryProps = BufferGeometryNode[
    SphereBufferGeometry, 
    Instantiable7[
      /* radius */ js.UndefOr[Double], 
      /* widthSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* phiStart */ js.UndefOr[Double], 
      /* phiLength */ js.UndefOr[Double], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      SphereBufferGeometry
    ]
  ]
  
  type SphereGeometryProps = GeometryNode[
    SphereGeometry, 
    Instantiable7[
      /* radius */ js.UndefOr[Double], 
      /* widthSegments */ js.UndefOr[Double], 
      /* heightSegments */ js.UndefOr[Double], 
      /* phiStart */ js.UndefOr[Double], 
      /* phiLength */ js.UndefOr[Double], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      SphereGeometry
    ]
  ]
  
  type SpotLightHelperProps = Object3DNode[
    SpotLightHelper, 
    Instantiable1[/* light */ typingsSlinky.three.lightMod.Light, SpotLightHelper]
  ]
  
  type SpotLightProps = LightNode[
    SpotLight, 
    Instantiable6[
      /* color */ js.UndefOr[typingsSlinky.three.colorMod.Color | String | Double], 
      /* intensity */ js.UndefOr[Double], 
      /* distance */ js.UndefOr[Double], 
      /* angle */ js.UndefOr[Double], 
      /* penumbra */ js.UndefOr[Double], 
      /* decay */ js.UndefOr[Double], 
      SpotLight
    ]
  ]
  
  type SpotLightShadowProps = Node[SpotLightShadow, Instantiable1[/* camera */ Camera, SpotLightShadow]]
  
  type SpriteMaterialProps = MaterialNode[SpriteMaterial, js.Array[SpriteMaterialParameters]]
  
  type SpriteProps = Object3DNode[Sprite, Instantiable0[Sprite]]
  
  type TetrahedronBufferGeometryProps = BufferGeometryNode[TetrahedronBufferGeometry, Instantiable0[TetrahedronBufferGeometry]]
  
  type TetrahedronGeometryProps = GeometryNode[TetrahedronGeometry, Instantiable0[TetrahedronGeometry]]
  
  type TextBufferGeometryProps = BufferGeometryNode[
    TextBufferGeometry, 
    Instantiable2[/* text */ String, /* parameters */ TextGeometryParameters, TextBufferGeometry]
  ]
  
  type TextGeometryProps = GeometryNode[
    TextGeometry, 
    Instantiable2[/* text */ String, /* parameters */ TextGeometryParameters, TextGeometry]
  ]
  
  type TextureProps = Node[Texture, TypeofTexture]
  
  type TorusBufferGeometryProps = BufferGeometryNode[TorusBufferGeometry, Instantiable0[TorusBufferGeometry]]
  
  type TorusGeometryProps = GeometryNode[TorusGeometry, Instantiable0[TorusGeometry]]
  
  type TorusKnotBufferGeometryProps = BufferGeometryNode[
    TorusKnotBufferGeometry, 
    Instantiable6[
      /* radius */ js.UndefOr[Double], 
      /* tube */ js.UndefOr[Double], 
      /* tubularSegments */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* p */ js.UndefOr[Double], 
      /* q */ js.UndefOr[Double], 
      TorusKnotBufferGeometry
    ]
  ]
  
  type TorusKnotGeometryProps = GeometryNode[
    TorusKnotGeometry, 
    Instantiable6[
      /* radius */ js.UndefOr[Double], 
      /* tube */ js.UndefOr[Double], 
      /* tubularSegments */ js.UndefOr[Double], 
      /* radialSegments */ js.UndefOr[Double], 
      /* p */ js.UndefOr[Double], 
      /* q */ js.UndefOr[Double], 
      TorusKnotGeometry
    ]
  ]
  
  type TubeBufferGeometryProps = BufferGeometryNode[
    TubeBufferGeometry, 
    Instantiable1[/* path */ Curve[typingsSlinky.three.vector3Mod.Vector3], TubeBufferGeometry]
  ]
  
  type TubeGeometryProps = GeometryNode[
    TubeGeometry, 
    Instantiable1[/* path */ Curve[typingsSlinky.three.vector3Mod.Vector3], TubeGeometry]
  ]
  
  type Vector2 = typingsSlinky.three.mod.Vector2 | Parameters[FnCallXY]
  
  type Vector2Props = Node[typingsSlinky.three.mod.Vector2, Instantiable0[typingsSlinky.three.mod.Vector2]]
  
  type Vector3 = typingsSlinky.three.mod.Vector3 | Parameters[FnCallXYZ]
  
  type Vector3Props = Node[typingsSlinky.three.mod.Vector3, Instantiable0[typingsSlinky.three.mod.Vector3]]
  
  type Vector4Props = Node[Vector4, Instantiable0[Vector4]]
  
  type VideoTextureProps = Node[
    VideoTexture, 
    Instantiable9[
      /* video */ HTMLVideoElement, 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      VideoTexture
    ]
  ]
  
  type WireframeGeometryProps = BufferGeometryNode[
    WireframeGeometry, 
    Instantiable1[/* geometry */ typingsSlinky.three.geometryMod.Geometry, WireframeGeometry]
  ]
  
  object global {
    
    object JSX {
      
      @js.native
      trait IntrinsicElements extends StObject {
        
        var ambientLight: AmbientLightProps = js.native
        
        var ambientLightProbe: AmbientLightProbeProps = js.native
        
        var arrayCamera: ArrayCameraProps = js.native
        
        var arrowHelper: ArrowHelperProps = js.native
        
        var audioListener: AudioListenerProps = js.native
        
        var axesHelper: AxesHelperProps = js.native
        
        var bone: BoneProps = js.native
        
        var box3Helper: Box3HelperProps = js.native
        
        var boxBufferGeometry: BoxBufferGeometryProps = js.native
        
        var boxGeometry: BoxGeometryProps = js.native
        
        var boxHelper: BoxHelperProps = js.native
        
        var bufferAttribute: BufferAttributeProps = js.native
        
        var bufferGeometry: BufferGeometryProps = js.native
        
        var camera: CameraProps = js.native
        
        var cameraHelper: CameraHelperProps = js.native
        
        var canvasTexture: CanvasTextureProps = js.native
        
        var circleBufferGeometry: CircleBufferGeometryProps = js.native
        
        var circleGeometry: CircleGeometryProps = js.native
        
        var color: ColorProps = js.native
        
        var compressedTexture: CompressedTextureProps = js.native
        
        var coneBufferGeometry: ConeBufferGeometryProps = js.native
        
        var coneGeometry: ConeGeometryProps = js.native
        
        var cubeCamera: CubeCameraProps = js.native
        
        var cubeTexture: CubeTextureProps = js.native
        
        var cylinderBufferGeometry: CylinderBufferGeometryProps = js.native
        
        var cylinderGeometry: CylinderGeometryProps = js.native
        
        var dataTexture: DataTextureProps = js.native
        
        var dataTexture3D: DataTexture3DProps = js.native
        
        var depthTexture: DepthTextureProps = js.native
        
        var directionalLight: DirectionalLightProps = js.native
        
        var directionalLightHelper: DirectionalLightHelperProps = js.native
        
        var directionalLightShadow: DirectionalLightShadowProps = js.native
        
        var dodecahedronBufferGeometry: DodecahedronBufferGeometryProps = js.native
        
        var dodecahedronGeometry: DodecahedronGeometryProps = js.native
        
        var edgesGeometry: EdgesGeometryProps = js.native
        
        var euler: EulerProps = js.native
        
        var extrudeBufferGeometry: ExtrudeBufferGeometryProps = js.native
        
        var extrudeGeometry: ExtrudeGeometryProps = js.native
        
        var face3: Face3Props = js.native
        
        var fog: FogProps = js.native
        
        var geometry: GeometryProps = js.native
        
        var gridHelper: GridHelperProps = js.native
        
        var group: GroupProps = js.native
        
        var hemisphereLight: HemisphereLightProps = js.native
        
        var hemisphereLightHelper: HemisphereLightHelperProps = js.native
        
        var hemisphereLightProbe: HemisphereLightProbeProps = js.native
        
        var icosahedronBufferGeometry: IcosahedronBufferGeometryProps = js.native
        
        var icosahedronGeometry: IcosahedronGeometryProps = js.native
        
        var immediateRenderObject: ImmediateRenderObjectProps = js.native
        
        var instancedBufferAttribute: InstancedBufferAttributeProps = js.native
        
        var instancedBufferGeometry: InstancedBufferGeometryProps = js.native
        
        var instancedMesh: InstancedMeshProps = js.native
        
        var lOD: LODProps = js.native
        
        var latheBufferGeometry: LatheBufferGeometryProps = js.native
        
        var latheGeometry: LatheGeometryProps = js.native
        
        var light: LightProps = js.native
        
        var lightProbe: LightProbeProps = js.native
        
        var lightShadow: LightShadowProps = js.native
        
        var lineBasicMaterial: LineBasicMaterialProps = js.native
        
        var lineDashedMaterial: LineDashedMaterialProps = js.native
        
        var lineLoop: LineLoopProps = js.native
        
        var lineSegments: LineSegmentsProps = js.native
        
        var material: MaterialProps = js.native
        
        var matrix3: Matrix3Props = js.native
        
        var matrix4: Matrix4Props = js.native
        
        var mesh: MeshProps = js.native
        
        var meshBasicMaterial: MeshBasicMaterialProps = js.native
        
        var meshDepthMaterial: MeshDepthMaterialProps = js.native
        
        var meshDistanceMaterial: MeshDistanceMaterialProps = js.native
        
        var meshLambertMaterial: MeshLambertMaterialProps = js.native
        
        var meshMatcapMaterial: MeshMatcapMaterialProps = js.native
        
        var meshNormalMaterial: MeshNormalMaterialProps = js.native
        
        var meshPhongMaterial: MeshPhongMaterialProps = js.native
        
        var meshPhysicalMaterial: MeshPhysicalMaterialProps = js.native
        
        var meshStandardMaterial: MeshStandardMaterialProps = js.native
        
        var meshToonMaterial: MeshToonMaterialProps = js.native
        
        var octahedronBufferGeometry: OctahedronBufferGeometryProps = js.native
        
        var octahedronGeometry: OctahedronGeometryProps = js.native
        
        var orthographicCamera: OrthographicCameraProps = js.native
        
        var parametricBufferGeometry: ParametricBufferGeometryProps = js.native
        
        var parametricGeometry: ParametricGeometryProps = js.native
        
        var perspectiveCamera: PerspectiveCameraProps = js.native
        
        var planeBufferGeometry: PlaneBufferGeometryProps = js.native
        
        var planeGeometry: PlaneGeometryProps = js.native
        
        var planeHelper: PlaneHelperProps = js.native
        
        var pointLight: PointLightProps = js.native
        
        var pointLightHelper: PointLightHelperProps = js.native
        
        var points: PointsProps = js.native
        
        var pointsMaterial: PointsMaterialProps = js.native
        
        var polarGridHelper: PolarGridHelperProps = js.native
        
        var polyhedronBufferGeometry: PolyhedronBufferGeometryProps = js.native
        
        var polyhedronGeometry: PolyhedronGeometryProps = js.native
        
        var positionalAudio: PositionalAudioProps = js.native
        
        var primitive: PrimitiveProps = js.native
        
        var quaternion: QuaternionProps = js.native
        
        var rawShaderMaterial: RawShaderMaterialProps = js.native
        
        var raycaster: RaycasterProps = js.native
        
        var rectAreaLight: RectAreaLightProps = js.native
        
        var ringBufferGeometry: RingBufferGeometryProps = js.native
        
        var ringGeometry: RingGeometryProps = js.native
        
        var scene: SceneProps = js.native
        
        var shaderMaterial: ShaderMaterialProps = js.native
        
        var shadowMaterial: ShadowMaterialProps = js.native
        
        var shapeBufferGeometry: ShapeBufferGeometryProps = js.native
        
        var shapeGeometry: ShapeGeometryProps = js.native
        
        var skeleton: SkeletonProps = js.native
        
        var skeletonHelper: SkeletonHelperProps = js.native
        
        var skinnedMesh: SkinnedMeshProps = js.native
        
        var sphereBufferGeometry: SphereBufferGeometryProps = js.native
        
        var sphereGeometry: SphereGeometryProps = js.native
        
        var spotLight: SpotLightProps = js.native
        
        var spotLightHelper: SpotLightHelperProps = js.native
        
        var spotLightShadow: SpotLightShadowProps = js.native
        
        var sprite: SpriteProps = js.native
        
        var spriteMaterial: SpriteMaterialProps = js.native
        
        var tetrahedronBufferGeometry: TetrahedronBufferGeometryProps = js.native
        
        var tetrahedronGeometry: TetrahedronGeometryProps = js.native
        
        var textBufferGeometry: TextBufferGeometryProps = js.native
        
        var textGeometry: TextGeometryProps = js.native
        
        var texture: TextureProps = js.native
        
        var torusBufferGeometry: TorusBufferGeometryProps = js.native
        
        var torusGeometry: TorusGeometryProps = js.native
        
        var torusKnotBufferGeometry: TorusKnotBufferGeometryProps = js.native
        
        var torusKnotGeometry: TorusKnotGeometryProps = js.native
        
        var tubeBufferGeometry: TubeBufferGeometryProps = js.native
        
        var tubeGeometry: TubeGeometryProps = js.native
        
        var vector2: Vector2Props = js.native
        
        var vector3: Vector3Props = js.native
        
        var vector4: Vector4Props = js.native
        
        var videoTexture: VideoTextureProps = js.native
        
        var wireframeGeometry: WireframeGeometryProps = js.native
      }
      object IntrinsicElements {
        
        @scala.inline
        implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAmbientLight(value: AmbientLightProps): Self = StObject.set(x, "ambientLight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAmbientLightProbe(value: AmbientLightProbeProps): Self = StObject.set(x, "ambientLightProbe", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArrayCamera(value: ArrayCameraProps): Self = StObject.set(x, "arrayCamera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArrowHelper(value: ArrowHelperProps): Self = StObject.set(x, "arrowHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAudioListener(value: AudioListenerProps): Self = StObject.set(x, "audioListener", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAxesHelper(value: AxesHelperProps): Self = StObject.set(x, "axesHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBone(value: BoneProps): Self = StObject.set(x, "bone", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBox3Helper(value: Box3HelperProps): Self = StObject.set(x, "box3Helper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoxBufferGeometry(value: BoxBufferGeometryProps): Self = StObject.set(x, "boxBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoxGeometry(value: BoxGeometryProps): Self = StObject.set(x, "boxGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoxHelper(value: BoxHelperProps): Self = StObject.set(x, "boxHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBufferAttribute(value: BufferAttributeProps): Self = StObject.set(x, "bufferAttribute", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBufferGeometry(value: BufferGeometryProps): Self = StObject.set(x, "bufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCamera(value: CameraProps): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCameraHelper(value: CameraHelperProps): Self = StObject.set(x, "cameraHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCanvasTexture(value: CanvasTextureProps): Self = StObject.set(x, "canvasTexture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCircleBufferGeometry(value: CircleBufferGeometryProps): Self = StObject.set(x, "circleBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCircleGeometry(value: CircleGeometryProps): Self = StObject.set(x, "circleGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColor(value: ColorProps): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCompressedTexture(value: CompressedTextureProps): Self = StObject.set(x, "compressedTexture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConeBufferGeometry(value: ConeBufferGeometryProps): Self = StObject.set(x, "coneBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setConeGeometry(value: ConeGeometryProps): Self = StObject.set(x, "coneGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCubeCamera(value: CubeCameraProps): Self = StObject.set(x, "cubeCamera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCubeTexture(value: CubeTextureProps): Self = StObject.set(x, "cubeTexture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCylinderBufferGeometry(value: CylinderBufferGeometryProps): Self = StObject.set(x, "cylinderBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCylinderGeometry(value: CylinderGeometryProps): Self = StObject.set(x, "cylinderGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataTexture(value: DataTextureProps): Self = StObject.set(x, "dataTexture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataTexture3D(value: DataTexture3DProps): Self = StObject.set(x, "dataTexture3D", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDepthTexture(value: DepthTextureProps): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDirectionalLight(value: DirectionalLightProps): Self = StObject.set(x, "directionalLight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDirectionalLightHelper(value: DirectionalLightHelperProps): Self = StObject.set(x, "directionalLightHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDirectionalLightShadow(value: DirectionalLightShadowProps): Self = StObject.set(x, "directionalLightShadow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDodecahedronBufferGeometry(value: DodecahedronBufferGeometryProps): Self = StObject.set(x, "dodecahedronBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDodecahedronGeometry(value: DodecahedronGeometryProps): Self = StObject.set(x, "dodecahedronGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEdgesGeometry(value: EdgesGeometryProps): Self = StObject.set(x, "edgesGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEuler(value: EulerProps): Self = StObject.set(x, "euler", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtrudeBufferGeometry(value: ExtrudeBufferGeometryProps): Self = StObject.set(x, "extrudeBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtrudeGeometry(value: ExtrudeGeometryProps): Self = StObject.set(x, "extrudeGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFace3(value: Face3Props): Self = StObject.set(x, "face3", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFog(value: FogProps): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGeometry(value: GeometryProps): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGridHelper(value: GridHelperProps): Self = StObject.set(x, "gridHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGroup(value: GroupProps): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHemisphereLight(value: HemisphereLightProps): Self = StObject.set(x, "hemisphereLight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHemisphereLightHelper(value: HemisphereLightHelperProps): Self = StObject.set(x, "hemisphereLightHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHemisphereLightProbe(value: HemisphereLightProbeProps): Self = StObject.set(x, "hemisphereLightProbe", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIcosahedronBufferGeometry(value: IcosahedronBufferGeometryProps): Self = StObject.set(x, "icosahedronBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIcosahedronGeometry(value: IcosahedronGeometryProps): Self = StObject.set(x, "icosahedronGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImmediateRenderObject(value: ImmediateRenderObjectProps): Self = StObject.set(x, "immediateRenderObject", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInstancedBufferAttribute(value: InstancedBufferAttributeProps): Self = StObject.set(x, "instancedBufferAttribute", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInstancedBufferGeometry(value: InstancedBufferGeometryProps): Self = StObject.set(x, "instancedBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInstancedMesh(value: InstancedMeshProps): Self = StObject.set(x, "instancedMesh", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLOD(value: LODProps): Self = StObject.set(x, "lOD", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLatheBufferGeometry(value: LatheBufferGeometryProps): Self = StObject.set(x, "latheBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLatheGeometry(value: LatheGeometryProps): Self = StObject.set(x, "latheGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLight(value: LightProps): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLightProbe(value: LightProbeProps): Self = StObject.set(x, "lightProbe", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLightShadow(value: LightShadowProps): Self = StObject.set(x, "lightShadow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLineBasicMaterial(value: LineBasicMaterialProps): Self = StObject.set(x, "lineBasicMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLineDashedMaterial(value: LineDashedMaterialProps): Self = StObject.set(x, "lineDashedMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLineLoop(value: LineLoopProps): Self = StObject.set(x, "lineLoop", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLineSegments(value: LineSegmentsProps): Self = StObject.set(x, "lineSegments", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaterial(value: MaterialProps): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMatrix3(value: Matrix3Props): Self = StObject.set(x, "matrix3", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMatrix4(value: Matrix4Props): Self = StObject.set(x, "matrix4", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMesh(value: MeshProps): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshBasicMaterial(value: MeshBasicMaterialProps): Self = StObject.set(x, "meshBasicMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshDepthMaterial(value: MeshDepthMaterialProps): Self = StObject.set(x, "meshDepthMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshDistanceMaterial(value: MeshDistanceMaterialProps): Self = StObject.set(x, "meshDistanceMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshLambertMaterial(value: MeshLambertMaterialProps): Self = StObject.set(x, "meshLambertMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshMatcapMaterial(value: MeshMatcapMaterialProps): Self = StObject.set(x, "meshMatcapMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshNormalMaterial(value: MeshNormalMaterialProps): Self = StObject.set(x, "meshNormalMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshPhongMaterial(value: MeshPhongMaterialProps): Self = StObject.set(x, "meshPhongMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshPhysicalMaterial(value: MeshPhysicalMaterialProps): Self = StObject.set(x, "meshPhysicalMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshStandardMaterial(value: MeshStandardMaterialProps): Self = StObject.set(x, "meshStandardMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMeshToonMaterial(value: MeshToonMaterialProps): Self = StObject.set(x, "meshToonMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOctahedronBufferGeometry(value: OctahedronBufferGeometryProps): Self = StObject.set(x, "octahedronBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOctahedronGeometry(value: OctahedronGeometryProps): Self = StObject.set(x, "octahedronGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOrthographicCamera(value: OrthographicCameraProps): Self = StObject.set(x, "orthographicCamera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParametricBufferGeometry(value: ParametricBufferGeometryProps): Self = StObject.set(x, "parametricBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParametricGeometry(value: ParametricGeometryProps): Self = StObject.set(x, "parametricGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPerspectiveCamera(value: PerspectiveCameraProps): Self = StObject.set(x, "perspectiveCamera", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlaneBufferGeometry(value: PlaneBufferGeometryProps): Self = StObject.set(x, "planeBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlaneGeometry(value: PlaneGeometryProps): Self = StObject.set(x, "planeGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlaneHelper(value: PlaneHelperProps): Self = StObject.set(x, "planeHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPointLight(value: PointLightProps): Self = StObject.set(x, "pointLight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPointLightHelper(value: PointLightHelperProps): Self = StObject.set(x, "pointLightHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPoints(value: PointsProps): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPointsMaterial(value: PointsMaterialProps): Self = StObject.set(x, "pointsMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPolarGridHelper(value: PolarGridHelperProps): Self = StObject.set(x, "polarGridHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPolyhedronBufferGeometry(value: PolyhedronBufferGeometryProps): Self = StObject.set(x, "polyhedronBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPolyhedronGeometry(value: PolyhedronGeometryProps): Self = StObject.set(x, "polyhedronGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionalAudio(value: PositionalAudioProps): Self = StObject.set(x, "positionalAudio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrimitive(value: PrimitiveProps): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setQuaternion(value: QuaternionProps): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRawShaderMaterial(value: RawShaderMaterialProps): Self = StObject.set(x, "rawShaderMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRaycaster(value: RaycasterProps): Self = StObject.set(x, "raycaster", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRectAreaLight(value: RectAreaLightProps): Self = StObject.set(x, "rectAreaLight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRingBufferGeometry(value: RingBufferGeometryProps): Self = StObject.set(x, "ringBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRingGeometry(value: RingGeometryProps): Self = StObject.set(x, "ringGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScene(value: SceneProps): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShaderMaterial(value: ShaderMaterialProps): Self = StObject.set(x, "shaderMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShadowMaterial(value: ShadowMaterialProps): Self = StObject.set(x, "shadowMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShapeBufferGeometry(value: ShapeBufferGeometryProps): Self = StObject.set(x, "shapeBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShapeGeometry(value: ShapeGeometryProps): Self = StObject.set(x, "shapeGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkeleton(value: SkeletonProps): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkeletonHelper(value: SkeletonHelperProps): Self = StObject.set(x, "skeletonHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkinnedMesh(value: SkinnedMeshProps): Self = StObject.set(x, "skinnedMesh", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSphereBufferGeometry(value: SphereBufferGeometryProps): Self = StObject.set(x, "sphereBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSphereGeometry(value: SphereGeometryProps): Self = StObject.set(x, "sphereGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpotLight(value: SpotLightProps): Self = StObject.set(x, "spotLight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpotLightHelper(value: SpotLightHelperProps): Self = StObject.set(x, "spotLightHelper", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpotLightShadow(value: SpotLightShadowProps): Self = StObject.set(x, "spotLightShadow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSprite(value: SpriteProps): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpriteMaterial(value: SpriteMaterialProps): Self = StObject.set(x, "spriteMaterial", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTetrahedronBufferGeometry(value: TetrahedronBufferGeometryProps): Self = StObject.set(x, "tetrahedronBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTetrahedronGeometry(value: TetrahedronGeometryProps): Self = StObject.set(x, "tetrahedronGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextBufferGeometry(value: TextBufferGeometryProps): Self = StObject.set(x, "textBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextGeometry(value: TextGeometryProps): Self = StObject.set(x, "textGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTexture(value: TextureProps): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTorusBufferGeometry(value: TorusBufferGeometryProps): Self = StObject.set(x, "torusBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTorusGeometry(value: TorusGeometryProps): Self = StObject.set(x, "torusGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTorusKnotBufferGeometry(value: TorusKnotBufferGeometryProps): Self = StObject.set(x, "torusKnotBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTorusKnotGeometry(value: TorusKnotGeometryProps): Self = StObject.set(x, "torusKnotGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTubeBufferGeometry(value: TubeBufferGeometryProps): Self = StObject.set(x, "tubeBufferGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTubeGeometry(value: TubeGeometryProps): Self = StObject.set(x, "tubeGeometry", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVector2(value: Vector2Props): Self = StObject.set(x, "vector2", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVector3(value: Vector3Props): Self = StObject.set(x, "vector3", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVector4(value: Vector4Props): Self = StObject.set(x, "vector4", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVideoTexture(value: VideoTextureProps): Self = StObject.set(x, "videoTexture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWireframeGeometry(value: WireframeGeometryProps): Self = StObject.set(x, "wireframeGeometry", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
