package typingsSlinky.cadesplugin

import typingsSlinky.cadesplugin.CAPICOM.StoreAsync
import typingsSlinky.cadesplugin.CAdESCOM.AboutAsync
import typingsSlinky.cadesplugin.CAdESCOM.CPAttributeAsync
import typingsSlinky.cadesplugin.CAdESCOM.CPHashedDataAsync
import typingsSlinky.cadesplugin.CAdESCOM.CPSignerAsync
import typingsSlinky.cadesplugin.CAdESCOM.CadesSignedDataAsync
import typingsSlinky.cadesplugin.CAdESCOM.RawSignatureAsync
import typingsSlinky.cadesplugin.CAdESCOM.SignedXMLAsync
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotAbout
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotCPAttribute
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotCPSigner
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotCadesSignedData
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotHashedData
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotRawSignature
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotSignedXML
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginAsync
  extends CADESPluginBase
     with CADESPlugin {
  
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMAbout(objName: CAdESCOMDotAbout): js.Promise[AboutAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCPAttribute(objName: CAdESCOMDotCPAttribute): js.Promise[CPAttributeAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCPSigner(objName: CAdESCOMDotCPSigner): js.Promise[CPSignerAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCadesSignedData(objName: CAdESCOMDotCadesSignedData): js.Promise[CadesSignedDataAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMHashedData(objName: CAdESCOMDotHashedData): js.Promise[CPHashedDataAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMRawSignature(objName: CAdESCOMDotRawSignature): js.Promise[RawSignatureAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMSignedXML(objName: CAdESCOMDotSignedXML): js.Promise[SignedXMLAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMStore(objName: CAdESCOMDotStore): js.Promise[StoreAsync] = js.native
  
  def ReleasePluginObjects(): js.Promise[Boolean] = js.native
}
