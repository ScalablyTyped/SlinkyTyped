package typingsSlinky.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AmazonReceipt = js.Object | java.lang.String
  
  type AppleReceipt = java.lang.String
  
  type FacebookReceipt = java.lang.String
  
  type GoogleReceipt = typingsSlinky.inAppPurchase.anon.Data | java.lang.String
  
  type Receipt = typingsSlinky.inAppPurchase.mod.UnityReceipt | typingsSlinky.inAppPurchase.mod.AppleReceipt | typingsSlinky.inAppPurchase.mod.GoogleReceipt | typingsSlinky.inAppPurchase.mod.WindowsReceipt | typingsSlinky.inAppPurchase.mod.AmazonReceipt | typingsSlinky.inAppPurchase.mod.FacebookReceipt | typingsSlinky.inAppPurchase.mod.RokuReceipt
  
  type RokuReceipt = java.lang.String
  
  type Service = /* "unity" */ java.lang.String
  
  type UnityReceipt = js.Object | java.lang.String
  
  type WindowsReceipt = java.lang.String
}
