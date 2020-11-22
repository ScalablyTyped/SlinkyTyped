package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.ethers.mod.ethers.utils.TypedDataEncoder
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataField
import typingsSlinky.ethersprojectHash.anon.Domain
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTypedDataEncoder
  extends Instantiable1[/* types */ Record[String, js.Array[TypedDataField]], TypedDataEncoder] {
  
  def encode(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
  
  def from(types: Record[String, js.Array[TypedDataField]]): typingsSlinky.ethersprojectHash.typedDataMod.TypedDataEncoder = js.native
  
  def getPayload(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): js.Any = js.native
  
  def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = js.native
  
  def hash(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
  
  def hashDomain(domain: TypedDataDomain): String = js.native
  
  def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): String = js.native
  
  def resolveNames(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, _],
    resolveName: js.Function1[/* name */ String, js.Promise[String]]
  ): js.Promise[Domain] = js.native
}
