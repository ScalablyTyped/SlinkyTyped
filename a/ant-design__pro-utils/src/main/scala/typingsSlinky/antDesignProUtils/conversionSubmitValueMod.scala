package typingsSlinky.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignProUtils.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionSubmitValueMod {
  
  /**
    * 这里主要是来转化一下数据
    * 将 moment 转化为 string
    * 将 all 默认删除
    * @param value
    * @param dateFormatter
    * @param proColumnsMap
    */
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", JSImport.Default)
  @js.native
  def default[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any]): T = js.native
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", JSImport.Default)
  @js.native
  def default[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any], parentKey: String): T = js.native
  
  @JSImport("@ant-design/pro-utils/lib/conversionSubmitValue", "isPlainObject")
  @js.native
  def isPlainObject(o: Constructor): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antDesignProUtils.antDesignProUtilsBooleans.`false`
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.number
    - typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.string
  */
  trait DateFormatter extends StObject
  object DateFormatter {
    
    @scala.inline
    def `false`: typingsSlinky.antDesignProUtils.antDesignProUtilsBooleans.`false` = false.asInstanceOf[typingsSlinky.antDesignProUtils.antDesignProUtilsBooleans.`false`]
    
    @scala.inline
    def number: typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.number = "number".asInstanceOf[typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.number]
    
    @scala.inline
    def string: typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.string = "string".asInstanceOf[typingsSlinky.antDesignProUtils.antDesignProUtilsStrings.string]
  }
}
