package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief HeapGraphEdge表示两个HeapGraphNode节点间的关联，从上游节点到下游节点
  * @detail 
  */
@js.native
trait ClassHeapGraphEdge extends ClassObject {
  
  /**
    * class prop 
    *
    * 
    * @brief 链接的描述
    * 
    * @readonly
    * @type String
    */
  var description: String = js.native
  
  /**
    * 
    * @brief 获取HeapGraphEdge的上游HeapGraphNode节点
    * @return 返回源HeapGraphNode节点
    * 
    * 
    * 
    */
  def getFromNode(): ClassHeapGraphNode = js.native
  
  /**
    * 
    * @brief 获取HeapGraphEdge的下游HeapGraphNode节点
    * @return 返回目的HeapGraphNode节点
    * 
    * 
    * 
    */
  def getToNode(): ClassHeapGraphNode = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 链接名称
    * 
    * @readonly
    * @type String
    */
  var name: String = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 下游节点的链接方式，可能的值：
    * - profiler.Edge_ContextVariable,  函数中的变量
    * - profiler.Edge_Element,          数组中的元素
    * - profiler.Edge_Property,         有名对象的属性
    * - profiler.Edge_Internal,         JS无法进入的链接
    * - profiler.Edge_Hidden,           指向需要事先计算出空间大小的节点
    * - profiler.Edge_Shortcut,         指向无法事先计算出空间大小的节点
    * - profiler.Edge_Weak,             一个弱引用（被GC忽视）
    * 
    * 
    * @readonly
    * @type Integer
    */
  var `type`: Double = js.native
}
