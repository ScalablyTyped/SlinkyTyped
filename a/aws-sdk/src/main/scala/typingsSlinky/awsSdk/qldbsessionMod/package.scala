package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object qldbsessionMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.qldbsessionMod.ClientApiVersions
  
  type CommitDigest = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.qldbsessionMod.Blob | java.lang.String
  
  type IonBinary = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.qldbsessionMod.Blob | java.lang.String
  
  type IonText = java.lang.String
  
  type LedgerName = java.lang.String
  
  type PageToken = java.lang.String
  
  type SessionToken = java.lang.String
  
  type Statement = java.lang.String
  
  type StatementParameters = js.Array[typingsSlinky.awsSdk.qldbsessionMod.ValueHolder]
  
  type TransactionId = java.lang.String
  
  type ValueHolders = js.Array[typingsSlinky.awsSdk.qldbsessionMod.ValueHolder]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-07-11`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.qldbsessionMod._apiVersion | java.lang.String
}
