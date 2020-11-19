package typingsSlinky.makerJs.global.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.solvers")
@js.native
object solvers extends js.Object {
  
  /**
    * Solves for the length of a side of a triangle when you know length of one side and 2 angles.
    *
    * @param oppositeAngleInDegrees Angle which is opposite of the side you are trying to find.
    * @param lengthOfSideBetweenAngles Length of one side of the triangle which is between the provided angles.
    * @param otherAngleInDegrees An other angle of the triangle.
    * @returns Length of the side of the triangle which is opposite of the first angle parameter.
    */
  def solveTriangleASA(oppositeAngleInDegrees: Double, lengthOfSideBetweenAngles: Double, otherAngleInDegrees: Double): Double = js.native
  
  /**
    * Solves for the angle of a triangle when you know lengths of 3 sides.
    *
    * @param lengthA Length of side of triangle, opposite of the angle you are trying to find.
    * @param lengthB Length of any other side of the triangle.
    * @param lengthC Length of the remaining side of the triangle.
    * @returns Angle opposite of the side represented by the first parameter.
    */
  def solveTriangleSSS(lengthA: Double, lengthB: Double, lengthC: Double): Double = js.native
}
