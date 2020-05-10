package typingsSlinky.phaser

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
import typingsSlinky.phaser.spine.webgl.Mesh
import typingsSlinky.phaser.spine.webgl.OrthoCamera
import typingsSlinky.phaser.spine.webgl.PolygonBatcher
import typingsSlinky.phaser.spine.webgl.Position2Attribute
import typingsSlinky.phaser.spine.webgl.Position3Attribute
import typingsSlinky.phaser.spine.webgl.SceneRenderer
import typingsSlinky.phaser.spine.webgl.ShapeRenderer
import typingsSlinky.phaser.spine.webgl.TexCoordAttribute
import typingsSlinky.phaser.spine.webgl.Vector3
import typingsSlinky.phaser.spine.webgl.VertexAttribute
import typingsSlinky.phaser.spine.webgl.VertexAttributeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwebgl extends js.Object {
  var AssetManager: Instantiable2[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* pathPrefix */ String], 
    typingsSlinky.phaser.spine.webgl.AssetManager
  ] = js.native
  var Color2Attribute: Instantiable0[typingsSlinky.phaser.spine.webgl.Color2Attribute] = js.native
  var ColorAttribute: Instantiable0[typingsSlinky.phaser.spine.webgl.ColorAttribute] = js.native
  var GLTexture: Instantiable3[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    /* image */ HTMLImageElement, 
    js.UndefOr[/* useMipMaps */ Boolean], 
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
    js.UndefOr[/* contextConfig */ js.Any], 
    typingsSlinky.phaser.spine.webgl.ManagedWebGLRenderingContext
  ] = js.native
  var Matrix4: TypeofMatrix4 = js.native
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
    js.UndefOr[/* twoColorTint */ Boolean], 
    js.UndefOr[/* maxVertices */ Double], 
    typingsSlinky.phaser.spine.webgl.PolygonBatcher
  ] = js.native
  var Position2Attribute: Instantiable0[typingsSlinky.phaser.spine.webgl.Position2Attribute] = js.native
  var Position3Attribute: Instantiable0[typingsSlinky.phaser.spine.webgl.Position3Attribute] = js.native
  var SceneRenderer: Instantiable3[
    /* canvas */ HTMLCanvasElement, 
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* twoColorTint */ Boolean], 
    typingsSlinky.phaser.spine.webgl.SceneRenderer
  ] = js.native
  var Shader: TypeofShader = js.native
  var ShapeRenderer: Instantiable2[
    /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
    js.UndefOr[/* maxVertices */ Double], 
    typingsSlinky.phaser.spine.webgl.ShapeRenderer
  ] = js.native
  var SkeletonDebugRenderer: TypeofSkeletonDebugRender = js.native
  var SkeletonRenderer: TypeofSkeletonRendererInstantiable = js.native
  var TexCoordAttribute: Instantiable1[js.UndefOr[/* unit */ Double], typingsSlinky.phaser.spine.webgl.TexCoordAttribute] = js.native
  var Vector3: Instantiable3[
    js.UndefOr[/* x */ Double], 
    js.UndefOr[/* y */ Double], 
    js.UndefOr[/* z */ Double], 
    typingsSlinky.phaser.spine.webgl.Vector3
  ] = js.native
  var VertexAttribute: Instantiable3[
    /* name */ String, 
    /* type */ VertexAttributeType, 
    /* numElements */ Double, 
    typingsSlinky.phaser.spine.webgl.VertexAttribute
  ] = js.native
  var WebGLBlendModeConverter: TypeofWebGLBlendModeConve = js.native
}

object Typeofwebgl {
  @scala.inline
  def apply(
    AssetManager: Instantiable2[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* pathPrefix */ String], 
      AssetManager
    ],
    Color2Attribute: Instantiable0[Color2Attribute],
    ColorAttribute: Instantiable0[ColorAttribute],
    GLTexture: Instantiable3[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      /* image */ HTMLImageElement, 
      js.UndefOr[/* useMipMaps */ Boolean], 
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
      js.UndefOr[/* contextConfig */ js.Any], 
      ManagedWebGLRenderingContext
    ],
    Matrix4: TypeofMatrix4,
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
      js.UndefOr[/* twoColorTint */ Boolean], 
      js.UndefOr[/* maxVertices */ Double], 
      PolygonBatcher
    ],
    Position2Attribute: Instantiable0[Position2Attribute],
    Position3Attribute: Instantiable0[Position3Attribute],
    SceneRenderer: Instantiable3[
      /* canvas */ HTMLCanvasElement, 
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* twoColorTint */ Boolean], 
      SceneRenderer
    ],
    Shader: TypeofShader,
    ShapeRenderer: Instantiable2[
      /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
      js.UndefOr[/* maxVertices */ Double], 
      ShapeRenderer
    ],
    SkeletonDebugRenderer: TypeofSkeletonDebugRender,
    SkeletonRenderer: TypeofSkeletonRendererInstantiable,
    TexCoordAttribute: Instantiable1[js.UndefOr[/* unit */ Double], TexCoordAttribute],
    Vector3: Instantiable3[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      js.UndefOr[/* z */ Double], 
      Vector3
    ],
    VertexAttribute: Instantiable3[
      /* name */ String, 
      /* type */ VertexAttributeType, 
      /* numElements */ Double, 
      VertexAttribute
    ],
    WebGLBlendModeConverter: TypeofWebGLBlendModeConve
  ): Typeofwebgl = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], Color2Attribute = Color2Attribute.asInstanceOf[js.Any], ColorAttribute = ColorAttribute.asInstanceOf[js.Any], GLTexture = GLTexture.asInstanceOf[js.Any], M00 = M00.asInstanceOf[js.Any], M01 = M01.asInstanceOf[js.Any], M02 = M02.asInstanceOf[js.Any], M03 = M03.asInstanceOf[js.Any], M10 = M10.asInstanceOf[js.Any], M11 = M11.asInstanceOf[js.Any], M12 = M12.asInstanceOf[js.Any], M13 = M13.asInstanceOf[js.Any], M20 = M20.asInstanceOf[js.Any], M21 = M21.asInstanceOf[js.Any], M22 = M22.asInstanceOf[js.Any], M23 = M23.asInstanceOf[js.Any], M30 = M30.asInstanceOf[js.Any], M31 = M31.asInstanceOf[js.Any], M32 = M32.asInstanceOf[js.Any], M33 = M33.asInstanceOf[js.Any], ManagedWebGLRenderingContext = ManagedWebGLRenderingContext.asInstanceOf[js.Any], Matrix4 = Matrix4.asInstanceOf[js.Any], Mesh = Mesh.asInstanceOf[js.Any], OrthoCamera = OrthoCamera.asInstanceOf[js.Any], PolygonBatcher = PolygonBatcher.asInstanceOf[js.Any], Position2Attribute = Position2Attribute.asInstanceOf[js.Any], Position3Attribute = Position3Attribute.asInstanceOf[js.Any], SceneRenderer = SceneRenderer.asInstanceOf[js.Any], Shader = Shader.asInstanceOf[js.Any], ShapeRenderer = ShapeRenderer.asInstanceOf[js.Any], SkeletonDebugRenderer = SkeletonDebugRenderer.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any], TexCoordAttribute = TexCoordAttribute.asInstanceOf[js.Any], Vector3 = Vector3.asInstanceOf[js.Any], VertexAttribute = VertexAttribute.asInstanceOf[js.Any], WebGLBlendModeConverter = WebGLBlendModeConverter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwebgl]
  }
  @scala.inline
  implicit class TypeofwebglOps[Self <: Typeofwebgl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetManager(
      value: Instantiable2[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          js.UndefOr[/* pathPrefix */ String], 
          AssetManager
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor2Attribute(value: Instantiable0[Color2Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color2Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorAttribute(value: Instantiable0[ColorAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGLTexture(
      value: Instantiable3[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* image */ HTMLImageElement, 
          js.UndefOr[/* useMipMaps */ Boolean], 
          GLTexture
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GLTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM00(value: /* 0 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M00")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM01(value: /* 4 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M01")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM02(value: /* 8 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M02")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM03(value: /* 12 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M03")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM10(value: /* 1 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM11(value: /* 5 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM12(value: /* 9 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM13(value: /* 13 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M13")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM20(value: /* 2 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M20")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM21(value: /* 6 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M21")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM22(value: /* 10 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M22")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM23(value: /* 14 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M23")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM30(value: /* 3 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M30")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM31(value: /* 7 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M31")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM32(value: /* 11 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM33(value: /* 15 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M33")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagedWebGLRenderingContext(
      value: Instantiable2[
          /* canvasOrContext */ HTMLCanvasElement | WebGLRenderingContext, 
          js.UndefOr[/* contextConfig */ js.Any], 
          ManagedWebGLRenderingContext
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedWebGLRenderingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix4(value: TypeofMatrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Matrix4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMesh(
      value: Instantiable4[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          /* attributes */ js.Array[VertexAttribute], 
          /* maxVertices */ Double, 
          /* maxIndices */ Double, 
          Mesh
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrthoCamera(value: Instantiable2[/* viewportWidth */ Double, /* viewportHeight */ Double, OrthoCamera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrthoCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonBatcher(
      value: Instantiable3[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          js.UndefOr[/* twoColorTint */ Boolean], 
          js.UndefOr[/* maxVertices */ Double], 
          PolygonBatcher
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolygonBatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition2Attribute(value: Instantiable0[Position2Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position2Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition3Attribute(value: Instantiable0[Position3Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position3Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSceneRenderer(
      value: Instantiable3[
          /* canvas */ HTMLCanvasElement, 
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          js.UndefOr[/* twoColorTint */ Boolean], 
          SceneRenderer
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShader(value: TypeofShader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeRenderer(
      value: Instantiable2[
          /* context */ ManagedWebGLRenderingContext | WebGLRenderingContext, 
          js.UndefOr[/* maxVertices */ Double], 
          ShapeRenderer
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonDebugRenderer(value: TypeofSkeletonDebugRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonDebugRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonRenderer(value: TypeofSkeletonRendererInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexCoordAttribute(value: Instantiable1[js.UndefOr[/* unit */ Double], TexCoordAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TexCoordAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVector3(
      value: Instantiable3[
          js.UndefOr[/* x */ Double], 
          js.UndefOr[/* y */ Double], 
          js.UndefOr[/* z */ Double], 
          Vector3
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vector3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexAttribute(
      value: Instantiable3[
          /* name */ String, 
          /* type */ VertexAttributeType, 
          /* numElements */ Double, 
          VertexAttribute
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VertexAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebGLBlendModeConverter(value: TypeofWebGLBlendModeConve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebGLBlendModeConverter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

