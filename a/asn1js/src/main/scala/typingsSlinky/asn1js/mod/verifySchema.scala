package typingsSlinky.asn1js.mod

import typingsSlinky.asn1js.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "verifySchema")
@js.native
object verifySchema extends js.Object {
  
  /**
    * ASN.1 schema verification for ArrayBuffer data
    * 
    * @param {ArrayBuffer} inputBuffer Input BER-encoded ASN.1 data
    * @param {*} inputSchema Input ASN.1 schema to verify against to
    * @returns {{ verified: boolean, result?: any }}
    */
  def apply(inputBuffer: js.typedarray.ArrayBuffer, inputSchema: js.Any): Result = js.native
}
