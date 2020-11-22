package typingsSlinky.cadesplugin

import typingsSlinky.cadesplugin.CAPICOM.Store
import typingsSlinky.cadesplugin.CAdESCOM.About
import typingsSlinky.cadesplugin.CAdESCOM.CPAttribute
import typingsSlinky.cadesplugin.CAdESCOM.CPHashedData
import typingsSlinky.cadesplugin.CAdESCOM.CPSigner
import typingsSlinky.cadesplugin.CAdESCOM.CadesSignedData
import typingsSlinky.cadesplugin.CAdESCOM.RawSignature
import typingsSlinky.cadesplugin.CAdESCOM.SignedXML
import typingsSlinky.cadesplugin.cadespluginStrings.CAPICOMDotStore
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotAbout
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotCPAttribute
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotCPSigner
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotCadesSignedData
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotHashedData
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotRawSignature
import typingsSlinky.cadesplugin.cadespluginStrings.CAdESCOMDotSignedXML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginSync
  extends CADESPluginBase
     with CADESPlugin {
  
  @JSName("CreateObject")
  def CreateObject_CAPICOMStore(objName: CAPICOMDotStore): Store = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMAbout(objName: CAdESCOMDotAbout): About = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCPAttribute(objName: CAdESCOMDotCPAttribute): CPAttribute = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCPSigner(objName: CAdESCOMDotCPSigner): CPSigner = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCadesSignedData(objName: CAdESCOMDotCadesSignedData): CadesSignedData = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMHashedData(objName: CAdESCOMDotHashedData): CPHashedData = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMRawSignature(objName: CAdESCOMDotRawSignature): RawSignature = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMSignedXML(objName: CAdESCOMDotSignedXML): SignedXML = js.native
}
