package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object signerMod {
  
  type GetSignedUrlCallback = js.Function2[/* err */ js.Error | scala.Null, /* url */ js.UndefOr[java.lang.String], scala.Unit]
  
  type GetSignedUrlResponse = js.Array[typingsSlinky.googleCloudStorage.signerMod.SignerGetSignedUrlResponse]
  
  type Query = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type SignerGetSignedUrlResponse = java.lang.String
}
