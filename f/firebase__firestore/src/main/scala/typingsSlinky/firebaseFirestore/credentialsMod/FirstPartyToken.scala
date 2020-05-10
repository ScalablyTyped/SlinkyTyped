package typingsSlinky.firebaseFirestore.credentialsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/credentials", "FirstPartyToken")
@js.native
class FirstPartyToken protected () extends Token {
  def this(gapi: Gapi, sessionIndex: String) = this()
  var gapi: js.Any = js.native
  var sessionIndex: js.Any = js.native
  @JSName("authHeaders")
  def authHeaders_MFirstPartyToken: StringDictionary[String] = js.native
}

