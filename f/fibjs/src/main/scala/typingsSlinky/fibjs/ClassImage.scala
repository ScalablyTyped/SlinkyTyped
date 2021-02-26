package typingsSlinky.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 图像处理对象，用以对图像进行转换，绘制，存储等操作
  * @detail Image 对象属于 gd 模块，创建：,```JavaScript,var img = gd.create(640, 480);,var img1 = gd.load(data);,```
  */
@js.native
trait ClassImage extends ClassObject {
  
  /**
    * 
    * @brief 根据给定的矩阵，对当前图像进行仿射
    * 
    * 参数 affine 是一个数组：
    * ```JavaScript
    * affine = [ a0, a1, b0, b1, a2, b2 ];
    * x' = a0x + a1y + a2;
    * y' = b0x + b1y + b2;
    * ```
    * @param affine 仿射矩阵，由  6 个 double 类型的数字组成
    * @param x 可选剪切区域的原点 x 坐标
    * @param y 可选剪切区域的原点 y 坐标
    * @param width 可选剪切区域的的宽度
    * @param height 可选剪切区域的的高度
    * @return 返回仿射后的图像
    * 
    * 
    * @async
    */
  def affine(affine: js.Array[_]): ClassImage = js.native
  def affine(
    affine: js.Array[_],
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): ClassImage = js.native
  def affine(affine: js.Array[_], x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): ClassImage = js.native
  def affine(
    affine: js.Array[_],
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: Double,
    height: Double
  ): ClassImage = js.native
  def affine(affine: js.Array[_], x: js.UndefOr[scala.Nothing], y: Double): ClassImage = js.native
  def affine(
    affine: js.Array[_],
    x: js.UndefOr[scala.Nothing],
    y: Double,
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): ClassImage = js.native
  def affine(affine: js.Array[_], x: js.UndefOr[scala.Nothing], y: Double, width: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double): ClassImage = js.native
  def affine(
    affine: js.Array[_],
    x: Double,
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double, y: js.UndefOr[scala.Nothing], width: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double, y: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double, y: Double, width: Double): ClassImage = js.native
  def affine(affine: js.Array[_], x: Double, y: Double, width: Double, height: Double): ClassImage = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief查询和设定绘图时是否计算 alpha 层，缺省为 true
    * 
    * 
    * @type Boolean
    */
  var alphaBlending: Boolean = js.native
  
  /**
    * 
    * @brief 画一个扇形
    * @param x 扇形中心的 x 坐标
    * @param y 扇形中心的 y 坐标
    * @param width 扇形所在椭圆的宽度
    * @param height 扇形所在椭圆的高度
    * @param start 扇形开始的角度，范围为 0-360
    * @param end 扇形结束的角度，范围为 0-360
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def arc(x: Double, y: Double, width: Double, height: Double, start: Double, end: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 设定绘图的剪切窗口，设定后，所有的绘制将被剪切在窗口内部
    * @param x1 剪切窗口的左上 x 坐标
    * @param y1 剪切窗口的左上 y 坐标
    * @param x2 剪切窗口的右下 x 坐标
    * @param y2 剪切窗口的右下 y 坐标
    * 
    * 
    * 
    */
  def clip(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  
  /**
    * 
    * @brief 为指定的颜色申请一个颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorAllocate(color: Double): Double = js.native
  /**
    * 
    * @brief 为指定的颜色申请一个颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorAllocate(red: Double, green: Double, blue: Double): Double = js.native
  
  /**
    * 
    * @brief 为指定的颜色及透明申请一个颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorAllocateAlpha(color: Double): Double = js.native
  /**
    * 
    * @brief 为指定的颜色及透明申请一个颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @param alpha 透明分量，范围为 0-1.0
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorAllocateAlpha(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
  
  /**
    * 
    * @brief 为指定的颜色查找一个最接近的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorClosest(color: Double): Double = js.native
  /**
    * 
    * @brief 为指定的颜色查找一个最接近的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorClosest(red: Double, green: Double, blue: Double): Double = js.native
  
  /**
    * 
    * @brief 为指定的颜色及透明查找一个最接近的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorClosestAlpha(color: Double): Double = js.native
  /**
    * 
    * @brief 为指定的颜色及透明查找一个最接近的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @param alpha 透明分量，范围为 0-1.0
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorClosestAlpha(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
  
  /**
    * 
    * @brief 为指定的颜色查找一个最接近的颜色号，此方法使用 Hue/White/Black 计算查找最接近颜色，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorClosestHWB(color: Double): Double = js.native
  /**
    * 
    * @brief 为指定的颜色查找一个最接近的颜色号，此方法使用 Hue/White/Black 计算查找最接近颜色，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorClosestHWB(red: Double, green: Double, blue: Double): Double = js.native
  
  /**
    * 
    * @brief 释放指定的颜色号，释放的颜色号将会被再次申请后替换
    * @param color 指定要释放的颜色号
    * 
    * 
    * 
    */
  def colorDeallocate(color: Double): Unit = js.native
  
  /**
    * 
    * @brief 查找指定的颜色对应的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorExact(color: Double): Double = js.native
  /**
    * 
    * @brief 查找指定的颜色对应的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorExact(red: Double, green: Double, blue: Double): Double = js.native
  
  /**
    * 
    * @brief 查找指定的颜色及透明对应的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorExactAlpha(color: Double): Double = js.native
  /**
    * 
    * @brief 查找指定的颜色及透明对应的颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @param alpha 透明分量，范围为 0-1.0
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorExactAlpha(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
  
  /**
    * 
    * @brief 替换图像中指定的颜色为新颜色
    * @param src 指定要替换的颜色
    * @param dst 指定新颜色
    * 
    * 
    * @async
    */
  def colorReplace(src: Double, dst: Double): Unit = js.native
  
  /**
    * 
    * @brief 查找指定的颜色对应的颜色号，如果颜色不存在，则为其申请一个新颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorResolve(color: Double): Double = js.native
  /**
    * 
    * @brief 查找指定的颜色对应的颜色号，如果颜色不存在，则为其申请一个新颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgb 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorResolve(red: Double, green: Double, blue: Double): Double = js.native
  
  /**
    * 
    * @brief 查找指定的颜色及透明对应的颜色号，如果颜色不存在，则为其申请一个新颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param color 组合颜色值，可由 gd.color, gb.rgb, gd.rgba 等函数生成
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorResolveAlpha(color: Double): Double = js.native
  /**
    * 
    * @brief 查找指定的颜色及透明对应的颜色号，如果颜色不存在，则为其申请一个新颜色号，对于 gd.PALETTE 图像，颜色号为调色板索引，对于 gd.TRUECOLOR 图像，颜色号为 rgba 编码数值
    * @param red 红色分量，范围为 0-255
    * @param green 绿色分量，范围为 0-255
    * @param blue 蓝色分量，范围为 0-255
    * @param alpha 透明分量，范围为 0-1.0
    * @return 返回颜色号，不成功返回 -1
    * 
    * 
    * 
    */
  def colorResolveAlpha(red: Double, green: Double, blue: Double, alpha: Double): Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询图像颜色表内的颜色总数
    * 
    * @readonly
    * @type Integer
    */
  var colorsTotal: Double = js.native
  
  /**
    * 
    * @brief 转换当前图像类型
    * @param color 指定图像类型，允许值为 gd.TRUECOLOR 或 gd.PALETTE
    * 
    * 
    * @async
    */
  def convert(): Unit = js.native
  def convert(color: Double): Unit = js.native
  
  /**
    * 
    * @brief 从一个图像中复制一个区域到指定的位置
    * @param source 源图像对象
    * @param dstX 指定复制目标的 x 坐标
    * @param dstY 指定复制目标的 y 坐标
    * @param srcX 指定复制源左上角的 x 坐标
    * @param srcY 指定复制源左上角的 y 坐标
    * @param width 指定复制的宽度
    * @param height 指定复制的高度
    * 
    * 
    * @async
    */
  def copy(
    source: ClassImage,
    dstX: Double,
    dstY: Double,
    srcX: Double,
    srcY: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 从一个图像中复制一个区域覆盖到指定的位置
    * @param source 源图像对象
    * @param dstX 指定复制目标的 x 坐标
    * @param dstY 指定复制目标的 y 坐标
    * @param srcX 指定复制源左上角的 x 坐标
    * @param srcY 指定复制源左上角的 y 坐标
    * @param width 指定复制的宽度
    * @param height 指定复制的高度
    * @param percent 指定覆盖的透明度
    * 
    * 
    * @async
    */
  def copyMerge(
    source: ClassImage,
    dstX: Double,
    dstY: Double,
    srcX: Double,
    srcY: Double,
    width: Double,
    height: Double,
    percent: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 从一个图像中复制一个区域的灰度覆盖到指定的位置
    * @param source 源图像对象
    * @param dstX 指定复制目标的 x 坐标
    * @param dstY 指定复制目标的 y 坐标
    * @param srcX 指定复制源左上角的 x 坐标
    * @param srcY 指定复制源左上角的 y 坐标
    * @param width 指定复制的宽度
    * @param height 指定复制的高度
    * @param percent 指定覆盖的透明度
    * 
    * 
    * @async
    */
  def copyMergeGray(
    source: ClassImage,
    dstX: Double,
    dstY: Double,
    srcX: Double,
    srcY: Double,
    width: Double,
    height: Double,
    percent: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 将一个图像中的一个区域拉伸后复制到指定的位置，不同与 copyResized，此方法拉伸时会对图像进行抖动
    * @param source 源图像对象
    * @param dstX 指定复制目标的 x 坐标
    * @param dstY 指定复制目标的 y 坐标
    * @param srcX 指定复制源左上角的 x 坐标
    * @param srcY 指定复制源左上角的 y 坐标
    * @param dstW 指定复制的拉伸宽度
    * @param dstH 指定复制的拉伸高度
    * @param srcW 指定复制的源宽度
    * @param srcH 指定复制的源高度
    * 
    * 
    * @async
    */
  def copyResampled(
    source: ClassImage,
    dstX: Double,
    dstY: Double,
    srcX: Double,
    srcY: Double,
    dstW: Double,
    dstH: Double,
    srcW: Double,
    srcH: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 将一个图像中的一个区域拉伸后复制到指定的位置
    * @param source 源图像对象
    * @param dstX 指定复制目标的 x 坐标
    * @param dstY 指定复制目标的 y 坐标
    * @param srcX 指定复制源左上角的 x 坐标
    * @param srcY 指定复制源左上角的 y 坐标
    * @param dstW 指定复制的拉伸宽度
    * @param dstH 指定复制的拉伸高度
    * @param srcW 指定复制的源宽度
    * @param srcH 指定复制的源高度
    * 
    * 
    * @async
    */
  def copyResized(
    source: ClassImage,
    dstX: Double,
    dstY: Double,
    srcX: Double,
    srcY: Double,
    dstW: Double,
    dstH: Double,
    srcW: Double,
    srcH: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 将一个图像中的一个区域旋转后复制到指定的位置
    * @param source 源图像对象
    * @param dstX 指定复制目标的 x 坐标
    * @param dstY 指定复制目标的 y 坐标
    * @param srcX 指定复制源左上角的 x 坐标
    * @param srcY 指定复制源左上角的 y 坐标
    * @param width 指定复制的宽度
    * @param height 指定复制的高度
    * @param angle 指定旋转的角度
    * 
    * 
    * @async
    */
  def copyRotated(
    source: ClassImage,
    dstX: Double,
    dstY: Double,
    srcX: Double,
    srcY: Double,
    width: Double,
    height: Double,
    angle: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 剪切图像的一部分为一个新的图像
    * @param x 剪切窗口的左上 x 坐标
    * @param y 剪切窗口的左上 y 坐标
    * @param width 剪切窗口的宽度
    * @param height 剪切窗口的高度
    * @return 返回剪切出的图像
    * 
    * 
    * @async
    */
  def crop(x: Double, y: Double, width: Double, height: Double): ClassImage = js.native
  
  /**
    * 
    * @brief 画一个椭圆
    * @param x 椭圆中心的 x 坐标
    * @param y 椭圆中心的 y 坐标
    * @param width 椭圆的宽度
    * @param height 椭圆的高度
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def ellipse(x: Double, y: Double, width: Double, height: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 从指定的点开始填充封闭区域
    * @param x 开始填充的 x 坐标
    * @param y 开始填充的 y 坐标
    * @param color 指定填充的颜色号
    * 
    * 
    * 
    */
  def fill(x: Double, y: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 从指定的点开始在指定颜色的边框内填充封闭区域
    * @param x 开始填充的 x 坐标
    * @param y 开始填充的 y 坐标
    * @param borderColor 指定边框的颜色号
    * @param color 指定填充的颜色号
    * 
    * 
    * 
    */
  def fillToBorder(x: Double, y: Double, borderColor: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 画一个填充扇形
    * @param x 扇形中心的 x 坐标
    * @param y 扇形中心的 y 坐标
    * @param width 扇形所在椭圆的宽度
    * @param height 扇形所在椭圆的高度
    * @param start 扇形开始的角度，范围为 0-360
    * @param end 扇形结束的角度，范围为 0-360
    * @param color 指定矩形的颜色号
    * @param style 指定扇形的样式，允许的值有 gd.ARC, gd.CHORD, gd.NOFILL, gd.EDGED 及其组合
    * 
    * 
    * 
    */
  def filledArc(x: Double, y: Double, width: Double, height: Double, start: Double, end: Double, color: Double): Unit = js.native
  def filledArc(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    start: Double,
    end: Double,
    color: Double,
    style: Double
  ): Unit = js.native
  
  /**
    * 
    * @brief 画一个填充的椭圆
    * @param x 椭圆中心的 x 坐标
    * @param y 椭圆中心的 y 坐标
    * @param width 椭圆的宽度
    * @param height 椭圆的高度
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def filledEllipse(x: Double, y: Double, width: Double, height: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 根据给定的点绘制一个填充多边形
    * @param points 包含多边形点的数组，如 [[1, 1], [1, 10], [10, 15], [10, 20]]
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def filledPolygon(points: js.Array[_], color: Double): Unit = js.native
  
  /**
    * 
    * @brief 在指定的位置画一个填充的矩形
    * @param x1 指定左上角 x 坐标
    * @param y1 指定左上角 y 坐标
    * @param x2 指定右下角 x 坐标
    * @param y2 指定右下角 y 坐标
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def filledRectangle(x1: Double, y1: Double, x2: Double, y2: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 把过滤器 filterType应用到图像上，根据过滤器类型传入所需参数
    * 
    * 参数 filterType 可以为以下数值：
    * - MEAN_REMOVAL,    用平均移除法来达到轮廓效果
    * - EDGEDETECT,      用边缘检测来突出图像的边缘
    * - EMBOSS,          使图像浮雕化
    * - SELECTIVE_BLUR,  模糊图像
    * - GAUSSIAN_BLUR,   用高斯算法模糊图像
    * - NEGATE,          将图像中所有颜色反转
    * - GRAYSCALE,       将图像转换为灰度图
    * - SMOOTH,          使图像更柔滑，用arg1设定柔滑级别
    * - BRIGHTNESS,      改变图像的亮度，用arg1设定亮度级别，取值范围是-255~255
    * - CONTRAST,        改变图像的对比度，用arg1设定对比度级别，取值范围是0~100
    * - COLORIZE,        改变图像的色调，用arg1、arg2、arg3分别指定red、blue、green分值，每种颜色范围是0~255，arg4为透明度，取值返回是0~127
    * @param filterType 过滤器类型
    * @param arg1 过滤器所需参数: SMOOTH 的平滑级别、BRIGHTNESS 的亮度级别、CONTRAST 的对比度级别、COLORIZE 的 red 分值
    * @param arg2 过滤器所需参数: COLORIZE 的 green 分值
    * @param arg3 过滤器所需参数: COLORIZE 的 blue 分值
    * @param arg4 过滤器所需参数: COLORIZE 的透明度 alpha 分值
    * 
    * 
    * @async
    */
  def filter(filterType: Double): Unit = js.native
  def filter(
    filterType: Double,
    arg1: js.UndefOr[scala.Nothing],
    arg2: js.UndefOr[scala.Nothing],
    arg3: js.UndefOr[scala.Nothing],
    arg4: Double
  ): Unit = js.native
  def filter(filterType: Double, arg1: js.UndefOr[scala.Nothing], arg2: js.UndefOr[scala.Nothing], arg3: Double): Unit = js.native
  def filter(
    filterType: Double,
    arg1: js.UndefOr[scala.Nothing],
    arg2: js.UndefOr[scala.Nothing],
    arg3: Double,
    arg4: Double
  ): Unit = js.native
  def filter(filterType: Double, arg1: js.UndefOr[scala.Nothing], arg2: Double): Unit = js.native
  def filter(
    filterType: Double,
    arg1: js.UndefOr[scala.Nothing],
    arg2: Double,
    arg3: js.UndefOr[scala.Nothing],
    arg4: Double
  ): Unit = js.native
  def filter(filterType: Double, arg1: js.UndefOr[scala.Nothing], arg2: Double, arg3: Double): Unit = js.native
  def filter(filterType: Double, arg1: js.UndefOr[scala.Nothing], arg2: Double, arg3: Double, arg4: Double): Unit = js.native
  def filter(filterType: Double, arg1: Double): Unit = js.native
  def filter(
    filterType: Double,
    arg1: Double,
    arg2: js.UndefOr[scala.Nothing],
    arg3: js.UndefOr[scala.Nothing],
    arg4: Double
  ): Unit = js.native
  def filter(filterType: Double, arg1: Double, arg2: js.UndefOr[scala.Nothing], arg3: Double): Unit = js.native
  def filter(filterType: Double, arg1: Double, arg2: js.UndefOr[scala.Nothing], arg3: Double, arg4: Double): Unit = js.native
  def filter(filterType: Double, arg1: Double, arg2: Double): Unit = js.native
  def filter(filterType: Double, arg1: Double, arg2: Double, arg3: js.UndefOr[scala.Nothing], arg4: Double): Unit = js.native
  def filter(filterType: Double, arg1: Double, arg2: Double, arg3: Double): Unit = js.native
  def filter(filterType: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double): Unit = js.native
  
  /**
    * 
    * @brief 镜像当前图像
    * @param dir 镜像方向，允许值为 gd.BOTH,gd.HORIZONTAL, gd.VERTICAL, 缺省为 gd.HORIZONTAL
    * 
    * 
    * @async
    */
  def flip(): Unit = js.native
  def flip(dir: Double): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询图像来源格式，结果为 gd.PNG, gd.JPEG, gd.GIF, gd.BMP, gd.WEBP
    * 
    * @readonly
    * @type Integer
    */
  var format: Double = js.native
  
  /**
    * 
    * @brief 对当前图像进行高斯模糊处理
    * @param radius 模糊半径
    * 
    * 
    * @async
    */
  def gaussianBlur(radius: Double): Unit = js.native
  
  /**
    * 
    * @brief 按照指定的格式返回图像数据
    * @param format 指定返回数据的格式，允许值为 gd.PNG, gd.JPEG, gd.GIF, gd.BMP, gd.WEBP, 缺省为 gd.PNG
    * @param quality 当格式为 gd.JPEG 或 gd.WEBP 时用于指定压缩质量，缺省为 85，其他格式忽略此参数
    * @return 返回格式化的数据
    * 
    * 
    * @async
    */
  def getData(): ClassBuffer = js.native
  def getData(format: js.UndefOr[scala.Nothing], quality: Double): ClassBuffer = js.native
  def getData(format: Double): ClassBuffer = js.native
  def getData(format: Double, quality: Double): ClassBuffer = js.native
  
  /**
    * 
    * @brief 查询指定位置点的颜色
    * @param x 指定查询的 x 坐标
    * @param y 指定查询的 y 坐标
    * @return 返回指定点的颜色号
    * 
    * 
    * 
    */
  def getPixel(x: Double, y: Double): Double = js.native
  
  /**
    * 
    * @brief 查询指定位置点的真彩色颜色
    * @param x 指定查询的 x 坐标
    * @param y 指定查询的 y 坐标
    * @return 返回指定点的颜色号
    * 
    * 
    * 
    */
  def getTrueColorPixel(x: Double, y: Double): Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询图像高度
    * 
    * @readonly
    * @type Integer
    */
  var height: Double = js.native
  
  /**
    * 
    * @brief 在指定的位置画一条线
    * @param x1 指定画线的起始 x 坐标
    * @param y1 指定画线的起始 y 坐标
    * @param x2 指定画线的结束 x 坐标
    * @param y2 指定画线的结束 y 坐标
    * @param color 指定画线的颜色号
    * 
    * 
    * 
    */
  def line(x1: Double, y1: Double, x2: Double, y2: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 根据给定的点绘制一个开放多边形
    * @param points 包含多边形点的数组，如 [[1, 1], [1, 10], [10, 15], [10, 20]]
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def openPolygon(points: js.Array[_], color: Double): Unit = js.native
  
  /**
    * 
    * @brief 根据给定的点绘制一个多边形
    * @param points 包含多边形点的数组，如 [[1, 1], [1, 10], [10, 15], [10, 20]]
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def polygon(points: js.Array[_], color: Double): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设定图像是否渐进式，仅支持 jpeg 格式时
    * 
    * 
    * @type Boolean
    */
  var progressive: Boolean = js.native
  
  /**
    * 
    * @brief 在指定的位置画一个矩形
    * @param x1 指定左上角 x 坐标
    * @param y1 指定左上角 y 坐标
    * @param x2 指定右下角 x 坐标
    * @param y2 指定右下角 y 坐标
    * @param color 指定矩形的颜色号
    * 
    * 
    * 
    */
  def rectangle(x1: Double, y1: Double, x2: Double, y2: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 根据图像拉伸生成一个新尺寸的图像
    * @param width 指定拉伸的宽度
    * @param height 指定拉伸的高度
    * @return 返回新图像对象
    * 
    * 
    * @async
    */
  def resample(width: Double, height: Double): ClassImage = js.native
  
  /**
    * 
    * @brief 旋转当前图像
    * @param dir 旋转方向，允许值为 gd.LEFT, gd.RIGHT
    * 
    * 
    * @async
    */
  def rotate(dir: Double): Unit = js.native
  
  /**
    * 
    * @brief 按照指定的格式将图像数据存入指定文件，文件将被强制覆盖
    * @param fname 指定文件名
    * @param format 指定返回数据的格式，允许值为 gd.PNG, gd.JPEG, gd.GIF, gd.BMP, gd.WEBP, 缺省为 gd.PNG
    * @param quality 当格式为 gd.JPEG 时用于指定压缩质量，缺省为 85，其他格式忽略此参数
    * 
    * 
    * @async
    */
  def save(fname: String): Unit = js.native
  def save(fname: String, format: js.UndefOr[scala.Nothing], quality: Double): Unit = js.native
  def save(fname: String, format: Double): Unit = js.native
  def save(fname: String, format: Double, quality: Double): Unit = js.native
  /**
    * 
    * @brief 按照指定的格式将图像数据存入流对象
    * @param stm 指定要存入的流对象
    * @param format 指定返回数据的格式，允许值为 gd.PNG, gd.JPEG, gd.GIF, gd.BMP, gd.WEBP, 缺省为 gd.PNG
    * @param quality 当格式为 gd.JPEG 或 gd.WEBP 时用于指定压缩质量，缺省为 85，其他格式忽略此参数
    * 
    * 
    * @async
    */
  def save(stm: ClassStream): Unit = js.native
  def save(stm: ClassStream, format: js.UndefOr[scala.Nothing], quality: Double): Unit = js.native
  def save(stm: ClassStream, format: Double): Unit = js.native
  def save(stm: ClassStream, format: Double, quality: Double): Unit = js.native
  
  /**
    * 
    * @brief 在指定位置画一个点
    * @param x 指定画点的 x 坐标
    * @param y 指定画点的 y 坐标
    * @param color 指定画点的颜色号
    * 
    * 
    * 
    */
  def setPixel(x: Double, y: Double, color: Double): Unit = js.native
  
  /**
    * 
    * @brief 设定画线的宽度，line, rectangle, arc 等方法画线时缺省宽度为一个像素，可使用此方法改变线的宽度
    * @param thickness 画线的宽度
    * 
    * 
    * 
    */
  def setThickness(thickness: Double): Unit = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设定指定的颜色为透明色
    * 
    * 
    * @type Integer
    */
  var transparent: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询图像类型，结果为 gd.TRUECOLOR, gd.PALETTE
    * 
    * @readonly
    * @type Integer
    */
  var `type`: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询图像宽度
    * 
    * @readonly
    * @type Integer
    */
  var width: Double = js.native
}
