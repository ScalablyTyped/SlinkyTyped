package typingsSlinky.phaser.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.phaser.spine.webgl.AssetManager
import typingsSlinky.phaser.spine.webgl.Color2Attribute
import typingsSlinky.phaser.spine.webgl.ColorAttribute
import typingsSlinky.phaser.spine.webgl.GLTexture
import typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext
import typingsSlinky.phaser.spine.webgl.Matrix4
import typingsSlinky.phaser.spine.webgl.Mesh
import typingsSlinky.phaser.spine.webgl.OrthoCamera
import typingsSlinky.phaser.spine.webgl.PolygonBatcher
import typingsSlinky.phaser.spine.webgl.Position2Attribute
import typingsSlinky.phaser.spine.webgl.Position3Attribute
import typingsSlinky.phaser.spine.webgl.SceneRenderer
import typingsSlinky.phaser.spine.webgl.Shader
import typingsSlinky.phaser.spine.webgl.ShapeRenderer
import typingsSlinky.phaser.spine.webgl.SkeletonDebugRenderer
import typingsSlinky.phaser.spine.webgl.SkeletonRenderer
import typingsSlinky.phaser.spine.webgl.TexCoordAttribute
import typingsSlinky.phaser.spine.webgl.Vector3
import typingsSlinky.phaser.spine.webgl.VertexAttribute
import typingsSlinky.phaser.spine.webgl.VertexAttributeType
import typingsSlinky.phaser.spine.webgl.WebGLBlendModeConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwebgl extends StObject {
  
  var AssetManager: Instantiable2[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* pathPrefix */ js.UndefOr[String], 
    typingsSlinky.phaser.spine.webgl.AssetManager
  ] = js.native
  
  var Color2Attribute: Instantiable0[typingsSlinky.phaser.spine.webgl.Color2Attribute] = js.native
  
  var ColorAttribute: Instantiable0[typingsSlinky.phaser.spine.webgl.ColorAttribute] = js.native
  
  var GLTexture: Instantiable3[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* image */ HTMLImageElement, 
    /* useMipMaps */ js.UndefOr[Boolean], 
    typingsSlinky.phaser.spine.webgl.GLTexture
  ] = js.native
  
  val M00: /* 0 */ Double = js.native
  
  val M01: /* 4 */ Double = js.native
  
  val M02: /* 8 */ Double = js.native
  
  val M03: /* 12 */ Double = js.native
  
  val M10: /* 1 */ Double = js.native
  
  val M11: /* 5 */ Double = js.native
  
  val M12: /* 9 */ Double = js.native
  
  val M13: /* 13 */ Double = js.native
  
  val M20: /* 2 */ Double = js.native
  
  val M21: /* 6 */ Double = js.native
  
  val M22: /* 10 */ Double = js.native
  
  val M23: /* 14 */ Double = js.native
  
  val M30: /* 3 */ Double = js.native
  
  val M31: /* 7 */ Double = js.native
  
  val M32: /* 11 */ Double = js.native
  
  val M33: /* 15 */ Double = js.native
  
  var ManagedWebGLRenderingContext: Instantiable2[
    /* canvasOrContext */ HTMLCanvasElement | WebGLRenderingContext, 
    /* contextConfig */ js.UndefOr[js.Any], 
    typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext
  ] = js.native
  
  var Matrix4: Instantiable0[typingsSlinky.phaser.spine.webgl.Matrix4] with TypeofMatrix4 = js.native
  
  var Mesh: Instantiable4[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* attributes */ js.Array[VertexAttribute], 
    /* maxVertices */ Double, 
    /* maxIndices */ Double, 
    typingsSlinky.phaser.spine.webgl.Mesh
  ] = js.native
  
  var OrthoCamera: Instantiable2[
    /* viewportWidth */ Double, 
    /* viewportHeight */ Double, 
    typingsSlinky.phaser.spine.webgl.OrthoCamera
  ] = js.native
  
  var PolygonBatcher: Instantiable3[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* twoColorTint */ js.UndefOr[Boolean], 
    /* maxVertices */ js.UndefOr[Double], 
    typingsSlinky.phaser.spine.webgl.PolygonBatcher
  ] = js.native
  
  var Position2Attribute: Instantiable0[typingsSlinky.phaser.spine.webgl.Position2Attribute] = js.native
  
  var Position3Attribute: Instantiable0[typingsSlinky.phaser.spine.webgl.Position3Attribute] = js.native
  
  var SceneRenderer: Instantiable3[
    /* canvas */ HTMLCanvasElement, 
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* twoColorTint */ js.UndefOr[Boolean], 
    typingsSlinky.phaser.spine.webgl.SceneRenderer
  ] = js.native
  
  var Shader: (Instantiable3[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* vertexShader */ String, 
    /* fragmentShader */ String, 
    typingsSlinky.phaser.spine.webgl.Shader
  ]) with TypeofShader = js.native
  
  var ShapeRenderer: Instantiable2[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* maxVertices */ js.UndefOr[Double], 
    typingsSlinky.phaser.spine.webgl.ShapeRenderer
  ] = js.native
  
  var SkeletonDebugRenderer: (Instantiable1[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    typingsSlinky.phaser.spine.webgl.SkeletonDebugRenderer
  ]) with TypeofSkeletonDebugRender = js.native
  
  var SkeletonRenderer: (Instantiable2[
    /* context */ ManagedWebGLRenderingContext, 
    /* twoColorTint */ js.UndefOr[Boolean], 
    typingsSlinky.phaser.spine.webgl.SkeletonRenderer
  ]) with TypeofSkeletonRendererQUADTRIANGLES = js.native
  
  var TexCoordAttribute: Instantiable1[/* unit */ js.UndefOr[Double], typingsSlinky.phaser.spine.webgl.TexCoordAttribute] = js.native
  
  var Vector3: Instantiable3[
    /* x */ js.UndefOr[Double], 
    /* y */ js.UndefOr[Double], 
    /* z */ js.UndefOr[Double], 
    typingsSlinky.phaser.spine.webgl.Vector3
  ] = js.native
  
  var VertexAttribute: Instantiable3[
    /* name */ String, 
    /* type */ VertexAttributeType, 
    /* numElements */ Double, 
    typingsSlinky.phaser.spine.webgl.VertexAttribute
  ] = js.native
  
  var WebGLBlendModeConverter: Instantiable0[typingsSlinky.phaser.spine.webgl.WebGLBlendModeConverter] with TypeofWebGLBlendModeConve = js.native
}
object Typeofwebgl {
  
  @scala.inline
  def apply(
    AssetManager: Instantiable2[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* pathPrefix */ js.UndefOr[String], 
      AssetManager
    ],
    Color2Attribute: Instantiable0[Color2Attribute],
    ColorAttribute: Instantiable0[ColorAttribute],
    GLTexture: Instantiable3[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* image */ HTMLImageElement, 
      /* useMipMaps */ js.UndefOr[Boolean], 
      GLTexture
    ],
    M00: /* 0 */ Double,
    M01: /* 4 */ Double,
    M02: /* 8 */ Double,
    M03: /* 12 */ Double,
    M10: /* 1 */ Double,
    M11: /* 5 */ Double,
    M12: /* 9 */ Double,
    M13: /* 13 */ Double,
    M20: /* 2 */ Double,
    M21: /* 6 */ Double,
    M22: /* 10 */ Double,
    M23: /* 14 */ Double,
    M30: /* 3 */ Double,
    M31: /* 7 */ Double,
    M32: /* 11 */ Double,
    M33: /* 15 */ Double,
    ManagedWebGLRenderingContext: Instantiable2[
      /* canvasOrContext */ HTMLCanvasElement | WebGLRenderingContext, 
      /* contextConfig */ js.UndefOr[js.Any], 
      ManagedWebGLRenderingContext
    ],
    Matrix4: Instantiable0[Matrix4] with TypeofMatrix4,
    Mesh: Instantiable4[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* attributes */ js.Array[VertexAttribute], 
      /* maxVertices */ Double, 
      /* maxIndices */ Double, 
      Mesh
    ],
    OrthoCamera: Instantiable2[/* viewportWidth */ Double, /* viewportHeight */ Double, OrthoCamera],
    PolygonBatcher: Instantiable3[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* twoColorTint */ js.UndefOr[Boolean], 
      /* maxVertices */ js.UndefOr[Double], 
      PolygonBatcher
    ],
    Position2Attribute: Instantiable0[Position2Attribute],
    Position3Attribute: Instantiable0[Position3Attribute],
    SceneRenderer: Instantiable3[
      /* canvas */ HTMLCanvasElement, 
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* twoColorTint */ js.UndefOr[Boolean], 
      SceneRenderer
    ],
    Shader: (Instantiable3[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* vertexShader */ String, 
      /* fragmentShader */ String, 
      Shader
    ]) with TypeofShader,
    ShapeRenderer: Instantiable2[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* maxVertices */ js.UndefOr[Double], 
      ShapeRenderer
    ],
    SkeletonDebugRenderer: (Instantiable1[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      SkeletonDebugRenderer
    ]) with TypeofSkeletonDebugRender,
    SkeletonRenderer: (Instantiable2[
      /* context */ ManagedWebGLRenderingContext, 
      /* twoColorTint */ js.UndefOr[Boolean], 
      SkeletonRenderer
    ]) with TypeofSkeletonRendererQUADTRIANGLES,
    TexCoordAttribute: Instantiable1[/* unit */ js.UndefOr[Double], TexCoordAttribute],
    Vector3: Instantiable3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* z */ js.UndefOr[Double], 
      Vector3
    ],
    VertexAttribute: Instantiable3[
      /* name */ String, 
      /* type */ VertexAttributeType, 
      /* numElements */ Double, 
      VertexAttribute
    ],
    WebGLBlendModeConverter: Instantiable0[WebGLBlendModeConverter] with TypeofWebGLBlendModeConve
  ): Typeofwebgl = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], Color2Attribute = Color2Attribute.asInstanceOf[js.Any], ColorAttribute = ColorAttribute.asInstanceOf[js.Any], GLTexture = GLTexture.asInstanceOf[js.Any], M00 = M00.asInstanceOf[js.Any], M01 = M01.asInstanceOf[js.Any], M02 = M02.asInstanceOf[js.Any], M03 = M03.asInstanceOf[js.Any], M10 = M10.asInstanceOf[js.Any], M11 = M11.asInstanceOf[js.Any], M12 = M12.asInstanceOf[js.Any], M13 = M13.asInstanceOf[js.Any], M20 = M20.asInstanceOf[js.Any], M21 = M21.asInstanceOf[js.Any], M22 = M22.asInstanceOf[js.Any], M23 = M23.asInstanceOf[js.Any], M30 = M30.asInstanceOf[js.Any], M31 = M31.asInstanceOf[js.Any], M32 = M32.asInstanceOf[js.Any], M33 = M33.asInstanceOf[js.Any], ManagedWebGLRenderingContext = ManagedWebGLRenderingContext.asInstanceOf[js.Any], Matrix4 = Matrix4.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], OrthoCamera = OrthoCamera.asInstanceOf[js.Any], PolygonBatcher = PolygonBatcher.asInstanceOf[js.Any], Position2Attribute = Position2Attribute.asInstanceOf[js.Any], Position3Attribute = Position3Attribute.asInstanceOf[js.Any], SceneRenderer = SceneRenderer.asInstanceOf[js.Any], Shader = Shader.asInstanceOf[js.Any], ShapeRenderer = ShapeRenderer.asInstanceOf[js.Any], SkeletonDebugRenderer = SkeletonDebugRenderer.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any], TexCoordAttribute = TexCoordAttribute.asInstanceOf[js.Any], Vector3 = Vector3.asInstanceOf[js.Any], VertexAttribute = VertexAttribute.asInstanceOf[js.Any], WebGLBlendModeConverter = WebGLBlendModeConverter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwebgl]
  }
  
  @scala.inline
  implicit class TypeofwebglMutableBuilder[Self <: Typeofwebgl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetManager(
      value: Instantiable2[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* pathPrefix */ js.UndefOr[String], 
          AssetManager
        ]
    ): Self = StObject.set(x, "AssetManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor2Attribute(value: Instantiable0[Color2Attribute]): Self = StObject.set(x, "Color2Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAttribute(value: Instantiable0[ColorAttribute]): Self = StObject.set(x, "ColorAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGLTexture(
      value: Instantiable3[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* image */ HTMLImageElement, 
          /* useMipMaps */ js.UndefOr[Boolean], 
          GLTexture
        ]
    ): Self = StObject.set(x, "GLTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM00(value: /* 0 */ Double): Self = StObject.set(x, "M00", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM01(value: /* 4 */ Double): Self = StObject.set(x, "M01", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM02(value: /* 8 */ Double): Self = StObject.set(x, "M02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM03(value: /* 12 */ Double): Self = StObject.set(x, "M03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM10(value: /* 1 */ Double): Self = StObject.set(x, "M10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM11(value: /* 5 */ Double): Self = StObject.set(x, "M11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM12(value: /* 9 */ Double): Self = StObject.set(x, "M12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM13(value: /* 13 */ Double): Self = StObject.set(x, "M13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM20(value: /* 2 */ Double): Self = StObject.set(x, "M20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM21(value: /* 6 */ Double): Self = StObject.set(x, "M21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM22(value: /* 10 */ Double): Self = StObject.set(x, "M22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM23(value: /* 14 */ Double): Self = StObject.set(x, "M23", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM30(value: /* 3 */ Double): Self = StObject.set(x, "M30", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM31(value: /* 7 */ Double): Self = StObject.set(x, "M31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM32(value: /* 11 */ Double): Self = StObject.set(x, "M32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM33(value: /* 15 */ Double): Self = StObject.set(x, "M33", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedWebGLRenderingContext(
      value: Instantiable2[
          /* canvasOrContext */ HTMLCanvasElement | WebGLRenderingContext, 
          /* contextConfig */ js.UndefOr[js.Any], 
          ManagedWebGLRenderingContext
        ]
    ): Self = StObject.set(x, "ManagedWebGLRenderingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix4(value: Instantiable0[Matrix4] with TypeofMatrix4): Self = StObject.set(x, "Matrix4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(
      value: Instantiable4[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* attributes */ js.Array[VertexAttribute], 
          /* maxVertices */ Double, 
          /* maxIndices */ Double, 
          Mesh
        ]
    ): Self = StObject.set(x, "Mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrthoCamera(value: Instantiable2[/* viewportWidth */ Double, /* viewportHeight */ Double, OrthoCamera]): Self = StObject.set(x, "OrthoCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonBatcher(
      value: Instantiable3[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* twoColorTint */ js.UndefOr[Boolean], 
          /* maxVertices */ js.UndefOr[Double], 
          PolygonBatcher
        ]
    ): Self = StObject.set(x, "PolygonBatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition2Attribute(value: Instantiable0[Position2Attribute]): Self = StObject.set(x, "Position2Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition3Attribute(value: Instantiable0[Position3Attribute]): Self = StObject.set(x, "Position3Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneRenderer(
      value: Instantiable3[
          /* canvas */ HTMLCanvasElement, 
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* twoColorTint */ js.UndefOr[Boolean], 
          SceneRenderer
        ]
    ): Self = StObject.set(x, "SceneRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShader(
      value: (Instantiable3[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* vertexShader */ String, 
          /* fragmentShader */ String, 
          Shader
        ]) with TypeofShader
    ): Self = StObject.set(x, "Shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderer(
      value: Instantiable2[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* maxVertices */ js.UndefOr[Double], 
          ShapeRenderer
        ]
    ): Self = StObject.set(x, "ShapeRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonDebugRenderer(
      value: (Instantiable1[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          SkeletonDebugRenderer
        ]) with TypeofSkeletonDebugRender
    ): Self = StObject.set(x, "SkeletonDebugRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonRenderer(
      value: (Instantiable2[
          /* context */ ManagedWebGLRenderingContext, 
          /* twoColorTint */ js.UndefOr[Boolean], 
          SkeletonRenderer
        ]) with TypeofSkeletonRendererQUADTRIANGLES
    ): Self = StObject.set(x, "SkeletonRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexCoordAttribute(value: Instantiable1[/* unit */ js.UndefOr[Double], TexCoordAttribute]): Self = StObject.set(x, "TexCoordAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVector3(
      value: Instantiable3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* z */ js.UndefOr[Double], 
          Vector3
        ]
    ): Self = StObject.set(x, "Vector3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexAttribute(
      value: Instantiable3[
          /* name */ String, 
          /* type */ VertexAttributeType, 
          /* numElements */ Double, 
          VertexAttribute
        ]
    ): Self = StObject.set(x, "VertexAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebGLBlendModeConverter(value: Instantiable0[WebGLBlendModeConverter] with TypeofWebGLBlendModeConve): Self = StObject.set(x, "WebGLBlendModeConverter", value.asInstanceOf[js.Any])
  }
}
