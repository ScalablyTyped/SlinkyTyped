package typingsSlinky.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * initCloudOptions 的 env 参数，可以指定各个服务的默认环境
  */
@js.native
trait InitCloudEnvOptions extends StObject {
  
  /**
    * 数据库 API 默认环境配置
    * 默认值： default
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * 云函数 API 默认环境配置
    * 默认值： default
    */
  var functions: js.UndefOr[String] = js.native
  
  /**
    * 存储 API 默认环境配置
    * 默认值： default
    */
  var storage: js.UndefOr[String] = js.native
}
object InitCloudEnvOptions {
  
  @scala.inline
  def apply(): InitCloudEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitCloudEnvOptions]
  }
  
  @scala.inline
  implicit class InitCloudEnvOptionsMutableBuilder[Self <: InitCloudEnvOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setFunctions(value: String): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
