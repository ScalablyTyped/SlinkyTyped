package typingsSlinky.ecurve

import typingsSlinky.bigi.mod.^
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecurve", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getCurveByName(name: String): Curve = js.native
  
  @js.native
  class Curve protected () extends js.Object {
    def this(p: ^, a: ^, b: ^, Gx: ^, Gy: ^, n: ^, h: ^) = this()
    
    var G: Point = js.native
    
    var a: ^ = js.native
    
    var b: ^ = js.native
    
    var h: ^ = js.native
    
    def isInfinity(Q: js.Any): Boolean = js.native
    
    def isOnCurve(Q: js.Any): Boolean = js.native
    
    var n: ^ = js.native
    
    var p: ^ = js.native
    
    def pointFromX(isOdd: Boolean, x: Point): Point = js.native
    
    def validate(Q: js.Any): Boolean = js.native
  }
  
  @js.native
  class Point protected () extends js.Object {
    def this(curve: Curve, x: ^, y: ^, z: ^) = this()
    
    def add(b: Point): Point = js.native
    
    var affineX: ^ = js.native
    
    var affineY: ^ = js.native
    
    def equals(other: Point): Boolean = js.native
    
    def getEncoded(): Buffer = js.native
    def getEncoded(compressed: Boolean): Buffer = js.native
    
    def multiply(k: js.Any): Point = js.native
    
    def multiplyTwo(j: js.Any, x: js.Any, k: js.Any): Point = js.native
    
    def negate(): Point = js.native
    
    def twice(): Point = js.native
    
    var x: ^ = js.native
    
    var y: ^ = js.native
    
    var z: ^ = js.native
  }
  /* static members */
  @js.native
  object Point extends js.Object {
    
    def decodeFrom(curve: Curve, buffer: Buffer): js.Any = js.native
    
    def fromAffine(curve: Curve, x: ^, y: ^): Point = js.native
  }
}
