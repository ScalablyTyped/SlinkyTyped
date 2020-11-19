package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 事件信息对象，用于在事件中传递信息
  * @detail 
  */
@js.native
trait ClassEventInfo extends ClassObject {
  
  /**
    * class prop 
    *
    * 
    * 查询事件错误编码
    * 
    * @readonly
    * @type Integer
    */
  var code: Double = js.native
  
  /**
    * class prop 
    *
    * 
    * 查询事件错误信息
    * 
    * @readonly
    * @type String
    */
  var reason: String = js.native
  
  /**
    * class prop 
    *
    * 
    * 查询触发事件的对象
    * 
    * @readonly
    * @type Object
    */
  var target: js.Object = js.native
  
  /**
    * class prop 
    *
    * 
    * 查询事件类型
    * 
    * @readonly
    * @type String
    */
  var `type`: String = js.native
}
