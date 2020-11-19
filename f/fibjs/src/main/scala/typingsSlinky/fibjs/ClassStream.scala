package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 流操作对象，用于二进制数据流读写
  * @detail Stream 为基础对象，用于为流处理定义标准借口，不能独立创建
  */
@js.native
trait ClassStream extends ClassObject {
  
  /**
    * 
    * @brief 关闭当前流对象
    * 
    * @async
    */
  def close(): Unit = js.native
  
  /**
    * 
    * @brief 复制流数据到目标流中
    * @param stm 目标流对象
    * @param bytes 复制的字节数
    * @return 返回复制的字节数
    * 
    * 
    * @async
    */
  def copyTo(stm: ClassStream): Double = js.native
  def copyTo(stm: ClassStream, bytes: Double): Double = js.native
  
  /**
    * 
    * @brief 将文件缓冲区内容写入物理设备
    * 
    * @async
    */
  def flush(): Unit = js.native
  
  /**
    * 
    * @brief 从流内读取指定大小的数据
    * @param bytes 指定要读取的数据量，缺省为读取随机大小的数据块，读出的数据尺寸取决于设备
    * @return 返回从流内读取的数据，若无数据可读，或者连接中断，则返回 null
    * 
    * 
    * @async
    */
  def read(): ClassBuffer = js.native
  def read(bytes: Double): ClassBuffer = js.native
  
  /**
    * 
    * @brief 将给定的数据写入流
    * @param data 给定要写入的数据
    * 
    * 
    * @async
    */
  def write(data: ClassBuffer): Unit = js.native
}
