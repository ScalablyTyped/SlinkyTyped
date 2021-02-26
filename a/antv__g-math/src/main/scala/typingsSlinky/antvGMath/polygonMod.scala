package typingsSlinky.antvGMath

import typingsSlinky.antvGMath.typesMod.BBox
import typingsSlinky.antvGMath.typesMod.Point
import typingsSlinky.antvGMath.typesMod.PointTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonMod {
  
  object default {
    
    /**
      * 计算多边形的包围盒
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 包围盒
      */
    @JSImport("@antv/g-math/lib/polygon", "default.box")
    @js.native
    def box(points: js.Array[PointTuple]): BBox = js.native
    
    /**
      * 计算多边形的长度
      * @param {array} points 点的集合 [x,y] 的形式
      * @return {object} 多边形边的长度
      */
    @JSImport("@antv/g-math/lib/polygon", "default.length")
    @js.native
    def length(points: js.Array[PointTuple]): Double = js.native
    
    /**
      * 根据比例获取多边形的点
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多边形的长度上的比例
      * @return {object} 根据比例值计算出来的点
      */
    @JSImport("@antv/g-math/lib/polygon", "default.pointAt")
    @js.native
    def pointAt(points: js.Array[PointTuple], t: Double): Point = js.native
    
    /**
      * 指定点到多边形的距离
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} x 指定点的 x
      * @param {number} y 指定点的 y
      * @return {number} 点到多边形的距离
      */
    @JSImport("@antv/g-math/lib/polygon", "default.pointDistance")
    @js.native
    def pointDistance(points: js.Array[PointTuple], x: Double, y: Double): Double = js.native
    
    /**
      * 根据比例获取多边形的切线角度
      * @param {array} points 点的集合 [x,y] 的形式
      * @param {number} t 在多边形的长度上的比例
      * @return {object} 根据比例值计算出来的角度
      */
    @JSImport("@antv/g-math/lib/polygon", "default.tangentAngle")
    @js.native
    def tangentAngle(points: js.Array[PointTuple], t: Double): Double = js.native
  }
}
