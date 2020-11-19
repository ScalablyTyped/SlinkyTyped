package typingsSlinky.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object my {
  
  type Color = java.lang.String | js.Array[scala.Double] | scala.Double | typingsSlinky.aliApp.my.CanvasAction
  
  type RemoveSavedFileOptions = typingsSlinky.aliApp.my.GetSavedFileInfoOptions
  
  //#region 网络 https://docs.alipay.com/mini/api/network
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  //#endregion
  //#region 文本风险识别 https://docs.alipay.com/mini/api/text-identification
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.aliApp.aliAppStrings.keyword
    - typingsSlinky.aliApp.aliAppStrings.`0`
    - typingsSlinky.aliApp.aliAppStrings.`1`
    - typingsSlinky.aliApp.aliAppStrings.`2`
    - typingsSlinky.aliApp.aliAppStrings.`3`
    - java.lang.String
  */
  type TextRiskIdentificationType = typingsSlinky.aliApp.my._TextRiskIdentificationType | java.lang.String
  
  type onMessageFun = js.Function1[/* p */ js.Any, scala.Unit]
}
