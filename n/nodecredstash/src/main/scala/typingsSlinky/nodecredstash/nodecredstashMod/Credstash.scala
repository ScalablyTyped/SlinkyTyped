package typingsSlinky.nodecredstash.nodecredstashMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsDashSdk.clientsDynamodbMod.AttributeMap
import typingsSlinky.awsDashSdk.clientsKmsMod.DecryptResponse
import typingsSlinky.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.DeleteItemOutput
import typingsSlinky.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.PutItemOutput
import typingsSlinky.nodecredstash.Anon_Context
import typingsSlinky.nodecredstash.Anon_ContextName
import typingsSlinky.nodecredstash.Anon_ContextStartsWith
import typingsSlinky.nodecredstash.Anon_Key
import typingsSlinky.nodecredstash.Anon_Name
import typingsSlinky.nodecredstash.Anon_NameVersion
import typingsSlinky.nodecredstash.Anon_Secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): js.Promise[Unit] = js.native
  def decryptStash(stash: Anon_Key): js.Promise[DecryptResponse] = js.native
  def decryptStash(stash: Anon_Key, context: CredstashContext): js.Promise[DecryptResponse] = js.native
  def deleteSecret(options: Anon_NameVersion): js.Promise[DeleteItemOutput] = js.native
  def deleteSecrets(options: Anon_Name): js.Promise[js.Array[DeleteItemOutput]] = js.native
  def getAllSecrets(options: Anon_ContextStartsWith): js.Promise[StringDictionary[String]] = js.native
  def getAllVersions(options: Anon_Context): js.Promise[js.Array[Anon_Secret]] = js.native
  def getHighestVersion(options: Anon_Name): js.Promise[AttributeMap] = js.native
  def getSecret(options: Anon_ContextName): js.Promise[String] = js.native
  def incrementVersion(options: Anon_Name): js.Promise[String] = js.native
  def listSecrets(): js.Promise[js.Array[String]] = js.native
  def putSecret(options: PutSecretOptions): js.Promise[PutItemOutput] = js.native
}

