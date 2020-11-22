package typingsSlinky.antvMatrixUtil

import typingsSlinky.glMatrix.mod.ReadonlyMat2
import typingsSlinky.glMatrix.mod.ReadonlyMat2d
import typingsSlinky.glMatrix.mod.ReadonlyMat3
import typingsSlinky.glMatrix.mod.ReadonlyMat4
import typingsSlinky.glMatrix.mod.ReadonlyQuat
import typingsSlinky.glMatrix.mod.ReadonlyVec2
import typingsSlinky.glMatrix.mod.ReadonlyVec3
import typingsSlinky.glMatrix.mod.mat3
import typingsSlinky.glMatrix.mod.vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/matrix-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object ext extends js.Object {
    
    def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = js.native
    
    def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = js.native
    
    def leftRotate(out: js.Any, a: js.Any, rad: js.Any): mat3 = js.native
    
    def leftScale(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
    
    def leftTranslate(out: js.Any, a: js.Any, v: js.Any): mat3 = js.native
    
    def transform(m: js.Array[Double], actions: js.Array[js.Array[_]]): js.Array[_] = js.native
    
    def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = js.native
  }
  
  @js.native
  object mat3 extends js.Object {
    
    def add(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def adjoint(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def clone(a: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def copy(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def create(): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def determinant(a: ReadonlyMat3): Double = js.native
    
    def equals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = js.native
    
    def exactEquals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = js.native
    
    def frob(a: ReadonlyMat3): Double = js.native
    
    def fromMat2d(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat2d): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def fromMat4(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat4): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def fromQuat(out: typingsSlinky.glMatrix.mod.mat3, q: ReadonlyQuat): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def fromRotation(out: typingsSlinky.glMatrix.mod.mat3, rad: Double): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def fromScaling(out: typingsSlinky.glMatrix.mod.mat3, v: ReadonlyVec2): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def fromTranslation(out: typingsSlinky.glMatrix.mod.mat3, v: ReadonlyVec2): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def identity(out: typingsSlinky.glMatrix.mod.mat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def invert(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def mul(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def multiply(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def multiplyScalar(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: Double): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def multiplyScalarAndAdd(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3, scale: Double): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def normalFromMat4(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat4): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def projection(out: typingsSlinky.glMatrix.mod.mat3, width: Double, height: Double): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def rotate(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, rad: Double): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def scale(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def set(
      out: typingsSlinky.glMatrix.mod.mat3,
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def str(a: ReadonlyMat3): String = js.native
    
    def sub(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def subtract(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def translate(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typingsSlinky.glMatrix.mod.mat3 = js.native
    
    def transpose(out: typingsSlinky.glMatrix.mod.mat3, a: ReadonlyMat3): typingsSlinky.glMatrix.mod.mat3 = js.native
  }
  
  @js.native
  object vec2 extends js.Object {
    
    def add(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def angle(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def ceil(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def clone(a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def copy(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def create(): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def cross(out: vec3, a: ReadonlyVec2, b: ReadonlyVec2): vec3 = js.native
    
    def dist(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def distance(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def div(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def divide(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def dot(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def equals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = js.native
    
    def exactEquals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = js.native
    
    def floor(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    def fromValues(x: Double, y: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def inverse(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def len(a: ReadonlyVec2): Double = js.native
    
    def length(a: ReadonlyVec2): Double = js.native
    
    def lerp(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, t: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def max(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def min(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def mul(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def multiply(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def negate(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def normalize(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def random(out: typingsSlinky.glMatrix.mod.vec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    def random(out: typingsSlinky.glMatrix.mod.vec2, scale: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def rotate(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, rad: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def round(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def scale(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def scaleAndAdd(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, scale: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def set(out: typingsSlinky.glMatrix.mod.vec2, x: Double, y: Double): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def sqrDist(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def sqrLen(a: ReadonlyVec2): Double = js.native
    
    def squaredDistance(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def squaredLength(a: ReadonlyVec2): Double = js.native
    
    def str(a: ReadonlyVec2): String = js.native
    
    def sub(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def subtract(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def transformMat2(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def transformMat2d(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2d): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def transformMat3(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat3): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def transformMat4(out: typingsSlinky.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat4): typingsSlinky.glMatrix.mod.vec2 = js.native
    
    def zero(out: typingsSlinky.glMatrix.mod.vec2): typingsSlinky.glMatrix.mod.vec2 = js.native
  }
  
  @js.native
  object vec3 extends js.Object {
    
    def add(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def angle(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def bezier(
      out: typingsSlinky.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def ceil(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def clone(a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def copy(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def create(): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def cross(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def dist(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def distance(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def div(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def divide(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def dot(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def equals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = js.native
    
    def exactEquals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = js.native
    
    def floor(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    def fromValues(x: Double, y: Double, z: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def hermite(
      out: typingsSlinky.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def inverse(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def len(a: ReadonlyVec3): Double = js.native
    
    def length(a: ReadonlyVec3): Double = js.native
    
    def lerp(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, t: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def max(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def min(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def mul(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def multiply(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def negate(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def normalize(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def random(out: typingsSlinky.glMatrix.mod.vec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    def random(out: typingsSlinky.glMatrix.mod.vec3, scale: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def rotateX(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def rotateY(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def rotateZ(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def round(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def scale(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def scaleAndAdd(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, scale: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def set(out: typingsSlinky.glMatrix.mod.vec3, x: Double, y: Double, z: Double): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def sqrDist(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def sqrLen(a: ReadonlyVec3): Double = js.native
    
    def squaredDistance(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def squaredLength(a: ReadonlyVec3): Double = js.native
    
    def str(a: ReadonlyVec3): String = js.native
    
    def sub(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def subtract(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def transformMat3(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat3): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def transformMat4(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat4): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def transformQuat(out: typingsSlinky.glMatrix.mod.vec3, a: ReadonlyVec3, q: ReadonlyQuat): typingsSlinky.glMatrix.mod.vec3 = js.native
    
    def zero(out: typingsSlinky.glMatrix.mod.vec3): typingsSlinky.glMatrix.mod.vec3 = js.native
  }
}
