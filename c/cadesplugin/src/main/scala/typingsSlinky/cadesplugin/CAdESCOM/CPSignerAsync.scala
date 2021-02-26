package typingsSlinky.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cadesplugin.CADESCommon.PromisifiedFunction
import typingsSlinky.cadesplugin.CADESCommon.Unpacked
import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import typingsSlinky.cadesplugin.CADESCommon.VarDate
import typingsSlinky.cadesplugin.CADESCommon._Unpacked
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import typingsSlinky.cadesplugin.CAPICOM.Certificate
import typingsSlinky.cadesplugin.CAPICOM.CertificateAsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPSigner> */
@js.native
trait CPSignerAsync
  extends _Unpacked[js.Any] {
  
  val Certificate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typingsSlinky.cadesplugin.CAPICOM.Certificate]]) | PromisifiedFunction[typingsSlinky.cadesplugin.CAPICOM.Certificate] = js.native
  
  val CheckCertificate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Boolean]]) | PromisifiedFunction[Boolean] = js.native
  
  val Display: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
  ]) = js.native
  
  val KeyPin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val Load: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[js.Function2[/* fileName */ String, /* password */ js.UndefOr[String], Unit]]
  ]) | (PromisifiedFunction[js.Function2[/* fileName */ String, /* password */ js.UndefOr[String], Unit]]) = js.native
  
  val Options: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]] = js.native
  
  val SignatureTimeStampTime: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate] = js.native
  
  val SigningTime: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate] = js.native
  
  val TSAAddress: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  def propset_Certificate(certificate: CertificateAsync): js.Promise[Unit] = js.native
  
  def propset_CheckCertificate(checkCertificate: Boolean): js.Promise[Unit] = js.native
  
  def propset_KeyPin(keyPin: String): js.Promise[Unit] = js.native
  
  def propset_Options(options: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]): js.Promise[Unit] = js.native
  
  def propset_TSAAddress(TSAAddress: String): js.Promise[Unit] = js.native
}
object CPSignerAsync {
  
  @scala.inline
  def apply(
    Certificate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Certificate]]) | PromisifiedFunction[Certificate],
    CheckCertificate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Boolean]]) | PromisifiedFunction[Boolean],
    Display: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
      ]
    ]) | (PromisifiedFunction[
      js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
    ]),
    KeyPin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Load: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[js.Function2[/* fileName */ String, /* password */ js.UndefOr[String], Unit]]
    ]) | (PromisifiedFunction[js.Function2[/* fileName */ String, /* password */ js.UndefOr[String], Unit]]),
    Options: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]],
    SignatureTimeStampTime: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate],
    SigningTime: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate],
    TSAAddress: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    propset_Certificate: CertificateAsync => js.Promise[Unit],
    propset_CheckCertificate: Boolean => js.Promise[Unit],
    propset_KeyPin: String => js.Promise[Unit],
    propset_Options: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION] => js.Promise[Unit],
    propset_TSAAddress: String => js.Promise[Unit]
  ): CPSignerAsync = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CheckCertificate = CheckCertificate.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any], KeyPin = KeyPin.asInstanceOf[js.Any], Load = Load.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], SignatureTimeStampTime = SignatureTimeStampTime.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any], TSAAddress = TSAAddress.asInstanceOf[js.Any], propset_Certificate = js.Any.fromFunction1(propset_Certificate), propset_CheckCertificate = js.Any.fromFunction1(propset_CheckCertificate), propset_KeyPin = js.Any.fromFunction1(propset_KeyPin), propset_Options = js.Any.fromFunction1(propset_Options), propset_TSAAddress = js.Any.fromFunction1(propset_TSAAddress))
    __obj.asInstanceOf[CPSignerAsync]
  }
  
  @scala.inline
  implicit class CPSignerAsyncMutableBuilder[Self <: CPSignerAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Certificate]]) | PromisifiedFunction[Certificate]
    ): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Certificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckCertificate(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Boolean]]) | PromisifiedFunction[Boolean]
    ): Self = StObject.set(x, "CheckCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckCertificateFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "CheckCertificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
          ]
        ]) | (PromisifiedFunction[
          js.Function2[/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
        ])
    ): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayFunction2(value: (/* hwndParent */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "Display", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeyPin(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "KeyPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPinFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "KeyPin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoad(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function2[/* fileName */ String, /* password */ js.UndefOr[String], Unit]]
        ]) | (PromisifiedFunction[js.Function2[/* fileName */ String, /* password */ js.UndefOr[String], Unit]])
    ): Self = StObject.set(x, "Load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadFunction2(value: (/* fileName */ String, /* password */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "Load", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]]
    ): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_Certificate(value: CertificateAsync => js.Promise[Unit]): Self = StObject.set(x, "propset_Certificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_CheckCertificate(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "propset_CheckCertificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_KeyPin(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_KeyPin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_Options(value: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION] => js.Promise[Unit]): Self = StObject.set(x, "propset_Options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_TSAAddress(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_TSAAddress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureTimeStampTime(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
    ): Self = StObject.set(x, "SignatureTimeStampTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureTimeStampTimeFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "SignatureTimeStampTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSigningTime(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
    ): Self = StObject.set(x, "SigningTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningTimeFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "SigningTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTSAAddress(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "TSAAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSAAddressFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "TSAAddress", js.Any.fromFunction1(value))
  }
}
