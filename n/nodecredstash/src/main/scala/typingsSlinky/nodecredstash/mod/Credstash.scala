package typingsSlinky.nodecredstash.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.documentClientMod.DocumentClient.DeleteItemOutput
import typingsSlinky.awsSdk.documentClientMod.DocumentClient.PutItemOutput
import typingsSlinky.awsSdk.dynamodbMod.AttributeMap
import typingsSlinky.awsSdk.kmsMod.DecryptResponse
import typingsSlinky.nodecredstash.anon.Context
import typingsSlinky.nodecredstash.anon.Key
import typingsSlinky.nodecredstash.anon.Name
import typingsSlinky.nodecredstash.anon.NameVersion
import typingsSlinky.nodecredstash.anon.Secret
import typingsSlinky.nodecredstash.anon.StartsWith
import typingsSlinky.nodecredstash.anon.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credstash extends js.Object {
  
  def createDdbTable(): js.Promise[Unit] = js.native
  
  def decryptStash(stash: Key): js.Promise[DecryptResponse] = js.native
  def decryptStash(stash: Key, context: CredstashContext): js.Promise[DecryptResponse] = js.native
  
  def deleteSecret(options: NameVersion): js.Promise[DeleteItemOutput] = js.native
  
  def deleteSecrets(options: Name): js.Promise[js.Array[DeleteItemOutput]] = js.native
  
  def getAllSecrets(options: StartsWith): js.Promise[StringDictionary[String]] = js.native
  
  def getAllVersions(options: Context): js.Promise[js.Array[Secret]] = js.native
  
  def getHighestVersion(options: Name): js.Promise[AttributeMap] = js.native
  
  def getSecret(options: Version): js.Promise[String] = js.native
  
  def incrementVersion(options: Name): js.Promise[String] = js.native
  
  def listSecrets(): js.Promise[js.Array[String]] = js.native
  
  def putSecret(options: PutSecretOptions): js.Promise[PutItemOutput] = js.native
}
