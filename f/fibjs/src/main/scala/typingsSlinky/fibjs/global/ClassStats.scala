package typingsSlinky.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 数据统计对象，用以构建应用运行时数据收集
  * @detail 创建方法：,```JavaScript,var util = require("util");,var stats = new util.Stats(["begin", "end", "error"]);,```,一些内部对象会提供预先定义的的统计对象
  */
@JSGlobal("Class_Stats")
@js.native
class ClassStats protected ()
  extends typingsSlinky.fibjs.ClassStats {
  /**
    * 
    * @brief 数据统计对象构造方法
    * @param keys 指定计数器的名称
    * 
    * 
    * 
    */
  def this(keys: js.Array[_]) = this()
  /**
    * 
    * @brief 数据统计对象构造方法
    * @param staticKeys 指定静态计数器的名称，静态计数器不会被 reset
    * @param keys 指定计数器的名称
    * 
    * 
    * 
    */
  def this(staticKeys: js.Array[_], keys: js.Array[_]) = this()
}
