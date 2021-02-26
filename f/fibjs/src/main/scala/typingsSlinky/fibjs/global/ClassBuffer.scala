package typingsSlinky.fibjs.global

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 二进制数据缓存对象，用于 io 读写的数据处理
  * @detail Buffer 对象为全局基础类，在任何时候都可以直接以 new Buffer(...) 创建：,```JavaScript,var buf = new Buffer();,```
  */
@JSGlobal("Class_Buffer")
@js.native
/**
  * 
  * @brief 缓存对象构造函数
  * @param size 初始化缓冲区大小
  * 
  * 
  * 
  */
class ClassBuffer ()
  extends typingsSlinky.fibjs.ClassBuffer {
  /**
    * 
    * @brief 缓存对象构造函数
    * @param buffer 初始化Buffer对象
    * 
    * 
    * 
    */
  def this(buffer: typingsSlinky.fibjs.ClassBuffer) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: js.Array[_]) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: js.typedarray.ArrayBuffer) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: js.typedarray.ArrayBufferView) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param datas 初始化数据数组
    * 
    * 
    * 
    */
  def this(datas: ArrayLike[_]) = this()
  def this(size: Double) = this()
  /**
    * 
    * @brief 缓存对象构造函数
    * @param str 初始化字符串，字符串将以 utf-8 格式写入，缺省则创建一个空对象
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * 
    * 
    * 
    */
  def this(str: String) = this()
  def this(str: String, codec: String) = this()
}
object ClassBuffer {
  
  /**
    * 
    * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
    * @param size 缓冲区的所需长度
    * @param fill 预先填充新缓冲区的值，可使用 string/buffer/integer 值类型。 默认值：0
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 填充好的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: js.UndefOr[scala.Nothing], codec: String): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: String): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: String, codec: String): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: Double, codec: String): typingsSlinky.fibjs.ClassBuffer = js.native
  /**
    * 
    * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
    * @param size 缓冲区的所需长度
    * @param fill 预先填充新缓冲区的值，可使用 string/buffer/integer 值类型。 默认值：0
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 填充好的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: typingsSlinky.fibjs.ClassBuffer): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.alloc")
  @js.native
  def alloc(size: Double, fill: typingsSlinky.fibjs.ClassBuffer, codec: String): typingsSlinky.fibjs.ClassBuffer = js.native
  
  /**
    * 
    * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
    * @param size 缓冲区的所需长度
    * @return 指定尺寸的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.allocUnsafe")
  @js.native
  def allocUnsafe(size: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  
  /**
    * 
    * @brief 分配一个指定长度的新缓存区。如果大小为0，将创建一个零长度的缓存区。
    * @param size 缓冲区的所需长度
    * @return 指定尺寸的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.allocUnsafeSlow")
  @js.native
  def allocUnsafeSlow(size: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  
  /**
    * 
    * @brief 返回字符串的实际字节长度
    * @param str 待取字节的字符串，如果str为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 返回实际字节长度
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: String): Double = js.native
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: String, codec: String): Double = js.native
  /**
    * 
    * @brief 返回字符串的实际字节长度
    * @param str 待取字节的字符串，如果str为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 返回实际字节长度
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: js.typedarray.ArrayBuffer): Double = js.native
  /**
    * 
    * @brief 返回字符串的实际字节长度
    * @param str 待取字节的字符串，如果 str 为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 返回实际字节长度
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: js.typedarray.ArrayBufferView): Double = js.native
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: js.typedarray.ArrayBufferView, codec: String): Double = js.native
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: js.typedarray.ArrayBuffer, codec: String): Double = js.native
  /**
    * 
    * @brief 返回字符串的实际字节长度
    * @param str 待取字节的字符串，如果str为 ArrayBuffer/TypedArray/DataView/Buffer 对象，则返回它们的实际长度
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 返回实际字节长度
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: typingsSlinky.fibjs.ClassBuffer): Double = js.native
  @JSGlobal("Class_Buffer.byteLength")
  @js.native
  def byteLength(str: typingsSlinky.fibjs.ClassBuffer, codec: String): Double = js.native
  
  /**
    * 
    * @brief 拼接多个缓存区中的数据
    * @param buflist 待拼接的Buffer数组
    * @param cutLength 截取多少个Buffer对象
    * @return 拼接后产生的新 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.concat")
  @js.native
  def concat(buflist: js.Array[_]): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.concat")
  @js.native
  def concat(buflist: js.Array[_], cutLength: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  
  /**
    * 
    * @brief 通过其他 Buffer 创建 Buffer 对象
    * @param buffer 给定 Buffer 类型变量用于创建 Buffer 对象
    * @param byteOffset 指定数据起始位置，起始为 0
    * @param length 指定数据长度，起始位 -1，表示剩余所有数据
    * @return 返回 Buffer 实例
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(buffer: typingsSlinky.fibjs.ClassBuffer): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(buffer: typingsSlinky.fibjs.ClassBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(buffer: typingsSlinky.fibjs.ClassBuffer, byteOffset: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(buffer: typingsSlinky.fibjs.ClassBuffer, byteOffset: Double, length: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  /**
    * 
    * @brief 通过字符串创建 Buffer 对象
    * @param str 初始化字符串，字符串将以 utf-8 格式写入
    * @param byteOffset 指定数据起始位置，起始为 0
    * @param length 指定数据长度，起始位 -1，表示剩余所有数据
    * @return 返回 Buffer 实例
    * 
    * 
    * 
    */
  /* static member */
  /**
    * 
    * @brief 通过字符串创建 Buffer 对象
    * @param str 初始化字符串，字符串将以 utf-8 格式写入，缺省则创建一个空对象
    * @param codec 指定编码格式，允许值为："hex", "base64", "utf8", 或者系统支持的字符集
    * @return 返回 Buffer 实例
    * 
    * 
    * 
    */
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(str: String): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(str: String, byteOffset: js.UndefOr[scala.Nothing], length: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(str: String, byteOffset: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(str: String, byteOffset: Double, length: Double): typingsSlinky.fibjs.ClassBuffer = js.native
  @JSGlobal("Class_Buffer.from")
  @js.native
  def from(str: String, codec: String): typingsSlinky.fibjs.ClassBuffer = js.native
  
  /**
    * 
    * @brief 检测给定的变量是否是 Buffer 对象
    * @param v 给定需要检测的变量
    * @return 传入对象是否 Buffer 对象
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.isBuffer")
  @js.native
  def isBuffer(v: js.Any): Boolean = js.native
  
  /**
    * 
    * @brief 检测编码格式是否被支持
    * @param codec 待检测的编码格式
    * @return 是否支持
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Buffer.isEncoding")
  @js.native
  def isEncoding(codec: String): Boolean = js.native
}
