package typingsSlinky.math3d

import typingsSlinky.math3d.anon.Angle
import typingsSlinky.math3d.anon.Columns
import typingsSlinky.math3d.anon.X
import typingsSlinky.math3d.mod.Transform.Space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("math3d", "Matrix4x4")
  @js.native
  class Matrix4x4 protected () extends StObject {
    def this(data: js.Array[Double]) = this()
    
    def add(matrix4x4: Matrix4x4): Matrix4x4 = js.native
    
    var columns: js.Array[js.Array[Double]] = js.native
    
    def determinant(): Double = js.native
    
    def inverse(): Matrix4x4 = js.native
    
    var m11: Double = js.native
    
    var m12: Double = js.native
    
    var m13: Double = js.native
    
    var m14: Double = js.native
    
    var m21: Double = js.native
    
    var m22: Double = js.native
    
    var m23: Double = js.native
    
    var m24: Double = js.native
    
    var m31: Double = js.native
    
    var m32: Double = js.native
    
    var m33: Double = js.native
    
    var m34: Double = js.native
    
    var m41: Double = js.native
    
    var m42: Double = js.native
    
    var m43: Double = js.native
    
    var m44: Double = js.native
    
    def mul(matrix4x4: Matrix4x4): Matrix4x4 = js.native
    
    def mulScalar(scalar: Double): Matrix4x4 = js.native
    
    def mulVector3(vector3: Vector3): Vector3 = js.native
    
    def negate(): Matrix4x4 = js.native
    
    var rows: js.Array[js.Array[Double]] = js.native
    
    var size: Columns = js.native
    
    def sub(matrix4x4: Matrix4x4): Matrix4x4 = js.native
    
    def transpose(): Matrix4x4 = js.native
    
    var values: js.Array[Double] = js.native
  }
  /* static members */
  object Matrix4x4 {
    
    @JSImport("math3d", "Matrix4x4")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("math3d", "Matrix4x4.FlipMatrix")
    @js.native
    def FlipMatrix(flipX: Boolean, flipY: Boolean, flipZ: Boolean): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.LocalToWorldMatrix")
    @js.native
    def LocalToWorldMatrix(position: Vector3, rotation: Quaternion, scale: Double): Matrix4x4 = js.native
    @JSImport("math3d", "Matrix4x4.LocalToWorldMatrix")
    @js.native
    def LocalToWorldMatrix(position: Vector3, rotation: Quaternion, scale: Vector3): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.RotationMatrix")
    @js.native
    def RotationMatrix(quaternion: Quaternion): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.ScaleMatrix")
    @js.native
    def ScaleMatrix(scale: Double): Matrix4x4 = js.native
    @JSImport("math3d", "Matrix4x4.ScaleMatrix")
    @js.native
    def ScaleMatrix(scale: Vector3): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.TRS")
    @js.native
    def TRS(translation: Vector3, rotation: Quaternion, scale: Double): Matrix4x4 = js.native
    @JSImport("math3d", "Matrix4x4.TRS")
    @js.native
    def TRS(translation: Vector3, rotation: Quaternion, scale: Vector3): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.TranslationMatrix")
    @js.native
    def TranslationMatrix(translation: Vector3): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.WorldToLocalMatrix")
    @js.native
    def WorldToLocalMatrix(position: Vector3, rotation: Quaternion, scale: Double): Matrix4x4 = js.native
    @JSImport("math3d", "Matrix4x4.WorldToLocalMatrix")
    @js.native
    def WorldToLocalMatrix(position: Vector3, rotation: Quaternion, scale: Vector3): Matrix4x4 = js.native
    
    @JSImport("math3d", "Matrix4x4.identity")
    @js.native
    def identity: Matrix4x4 = js.native
    @scala.inline
    def identity_=(x: Matrix4x4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Matrix4x4.zero")
    @js.native
    def zero: Matrix4x4 = js.native
    @scala.inline
    def zero_=(x: Matrix4x4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("math3d", "Quaternion")
  @js.native
  class Quaternion () extends StObject {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    
    var angleAxis: Angle = js.native
    
    def angleTo(quaternion: Quaternion): Double = js.native
    
    def conjugate(): Quaternion = js.native
    
    def distanceTo(quaternion: Quaternion): Double = js.native
    
    def dot(quaternion: Quaternion): Double = js.native
    
    def equals(quaternion: Quaternion): Boolean = js.native
    
    var eulerAngles: X = js.native
    
    def inverse(): Quaternion = js.native
    
    def mul(quaternion: Quaternion): Quaternion = js.native
    
    def mulVector3(vector3: Vector3): Vector3 = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Quaternion {
    
    @JSImport("math3d", "Quaternion")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("math3d", "Quaternion.AngleAxis")
    @js.native
    def AngleAxis(axis: Vector3, angle: Double): Quaternion = js.native
    
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: js.UndefOr[scala.Nothing], y: Double): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: js.UndefOr[scala.Nothing], y: Double, z: Double): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: Double): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: Double, y: Double): Quaternion = js.native
    @JSImport("math3d", "Quaternion.Euler")
    @js.native
    def Euler(x: Double, y: Double, z: Double): Quaternion = js.native
    
    @JSImport("math3d", "Quaternion.identity")
    @js.native
    def identity: Quaternion = js.native
    @scala.inline
    def identity_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Quaternion.zero")
    @js.native
    def zero: Quaternion = js.native
    @scala.inline
    def zero_=(x: Quaternion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("math3d", "Transform")
  @js.native
  class Transform () extends StObject {
    def this(position: Vector3) = this()
    def this(position: js.UndefOr[scala.Nothing], rotation: Quaternion) = this()
    def this(position: Vector3, rotation: Quaternion) = this()
    
    def addChild(child: Transform): Unit = js.native
    
    var forward: Vector3 = js.native
    
    def inverseTransformPosition(position: Vector3): Vector3 = js.native
    
    var localPosition: Vector3 = js.native
    
    var localRotation: Quaternion = js.native
    
    var localToWorldMatrix: Matrix4x4 = js.native
    
    var name: String = js.native
    
    var parent: Transform = js.native
    
    var position: Vector3 = js.native
    
    def removeChild(child: Transform): Unit = js.native
    
    var right: Vector3 = js.native
    
    var root: Transform = js.native
    
    def rotate(x: Double, y: Double, z: Double): Transform = js.native
    def rotate(x: Double, y: Double, z: Double, relativeTo: Space): Transform = js.native
    
    var rotation: Quaternion = js.native
    
    def transformPosition(position: Vector3): Vector3 = js.native
    
    def translate(translation: Vector3): Transform = js.native
    def translate(translation: Vector3, relativeTo: Space): Transform = js.native
    
    var up: Vector3 = js.native
    
    var worldToLocalMatrix: Matrix4x4 = js.native
  }
  object Transform {
    
    @js.native
    sealed trait Space extends StObject
    @JSImport("math3d", "Transform.Space")
    @js.native
    object Space extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Space with Double] = js.native
      
      @js.native
      sealed trait Self extends Space
      /* 0 */ val Self: typingsSlinky.math3d.mod.Transform.Space.Self with Double = js.native
      
      @js.native
      sealed trait World extends Space
      /* 1 */ val World: typingsSlinky.math3d.mod.Transform.Space.World with Double = js.native
    }
  }
  
  @JSImport("math3d", "Vector3")
  @js.native
  class Vector3 () extends StObject {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    
    def add(vector3: Vector3): Vector3 = js.native
    
    def average(vector3: Vector3): Vector3 = js.native
    
    def cross(vector3: Vector3): Vector3 = js.native
    
    def distanceTo(vector3: Vector3): Double = js.native
    
    def dot(vector3: Vector3): Double = js.native
    
    def equals(vector3: Vector3): Boolean = js.native
    
    var homogeneous: Vector4 = js.native
    
    var magnitude: Double = js.native
    
    def mulScalar(scalar: Double): Vector3 = js.native
    
    def negate(): Vector3 = js.native
    
    def normalize(): Vector3 = js.native
    
    def scale(vector3: Vector3): Vector3 = js.native
    
    def sub(vector3: Vector3): Vector3 = js.native
    
    var values: js.Array[Double] = js.native
    
    var vector4: Vector4 = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vector3 {
    
    @JSImport("math3d", "Vector3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("math3d", "Vector3.FromVector4")
    @js.native
    def FromVector4(vector4: Vector4): Vector3 = js.native
    
    @JSImport("math3d", "Vector3.back")
    @js.native
    def back: Vector3 = js.native
    @scala.inline
    def back_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.dimension")
    @js.native
    def dimension: Double = js.native
    @scala.inline
    def dimension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dimension")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.down")
    @js.native
    def down: Vector3 = js.native
    @scala.inline
    def down_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("down")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.forward")
    @js.native
    def forward: Vector3 = js.native
    @scala.inline
    def forward_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forward")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.left")
    @js.native
    def left: Vector3 = js.native
    @scala.inline
    def left_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.one")
    @js.native
    def one: Vector3 = js.native
    @scala.inline
    def one_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("one")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.right")
    @js.native
    def right: Vector3 = js.native
    @scala.inline
    def right_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.up")
    @js.native
    def up: Vector3 = js.native
    @scala.inline
    def up_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector3.zero")
    @js.native
    def zero: Vector3 = js.native
    @scala.inline
    def zero_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("math3d", "Vector4")
  @js.native
  class Vector4 () extends StObject {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    
    def add(vector4: Vector4): Vector4 = js.native
    
    def distanceTo(vector4: Vector4): Double = js.native
    
    def dot(vector4: Vector4): Double = js.native
    
    def equals(vector4: Vector4): Boolean = js.native
    
    var magnitude: Double = js.native
    
    def mulScalar(scalar: Double): Vector4 = js.native
    
    def negate(): Vector4 = js.native
    
    def normalize(): Vector3 = js.native
    
    def sub(vector4: Vector4): Vector3 = js.native
    
    var values: js.Array[Double] = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vector4 {
    
    @JSImport("math3d", "Vector4")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("math3d", "Vector4.dimension")
    @js.native
    def dimension: Double = js.native
    @scala.inline
    def dimension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dimension")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector4.one")
    @js.native
    def one: Vector4 = js.native
    @scala.inline
    def one_=(x: Vector4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("one")(x.asInstanceOf[js.Any])
    
    @JSImport("math3d", "Vector4.zero")
    @js.native
    def zero: Vector4 = js.native
    @scala.inline
    def zero_=(x: Vector4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
}
