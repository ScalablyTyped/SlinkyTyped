package typingsSlinky.cadesplugin

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_FIND_TYPE
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERT_INFO_TYPE
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_OID
import typingsSlinky.cadesplugin.CAPICOM.Certificate
import typingsSlinky.cadesplugin.CAPICOM.CertificateAsync
import typingsSlinky.cadesplugin.CAPICOM.CertificateStatus
import typingsSlinky.cadesplugin.CAPICOM.Certificates
import typingsSlinky.cadesplugin.CAPICOM.EncodedData
import typingsSlinky.cadesplugin.CAPICOM.OID
import typingsSlinky.cadesplugin.CAPICOM.PublicKey
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CADESCommon {
  
  type Async[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends std.Function? cadesplugin.CADES_Common.PromisifiedFunction<T[K]> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<T[K]>>}
    */ typingsSlinky.cadesplugin.cadespluginStrings.Async with TopLevel[js.Any]
  
  type PromisifiedFunction[T /* <: js.Function */] = T | (js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
    */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any], 
    js.Promise[Unpacked[js.Any]]
  ])
  
  // Extracts the type if wrapped by a Promise
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsSlinky.cadesplugin.CAPICOM.PublicKeyAsync
    - typingsSlinky.cadesplugin.CAPICOM.EncodedDataAsync
    - typingsSlinky.cadesplugin.CAPICOM.OIDAsync
    - typingsSlinky.cadesplugin.CAdESCOM.VersionAsync
    - typingsSlinky.cadesplugin.CAdESCOM.CPHashedDataAsync
    - typingsSlinky.cadesplugin.CAdESCOM.CPSignerAsync
    - typingsSlinky.cadesplugin.CAPICOM.CertificatesAsync
    - typingsSlinky.cadesplugin.CAPICOM.CertificateAsync
  */
  type Unpacked[T] = _Unpacked[T] | T
  
  type ValuesOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type VarDate = js.Object
  
  trait _Unpacked[T] extends StObject
  object _Unpacked {
    
    @scala.inline
    def CPHashedDataAsync(
      Algorithm: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_HASH_ALGORITHM]]]) | PromisifiedFunction[ValuesOf[CAPICOM_HASH_ALGORITHM]],
      DataEncoding: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]],
      Hash: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]]),
      SetHashValue: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]]),
      Value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      propset_Algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM] => js.Promise[Unit],
      propset_DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]
    ): typingsSlinky.cadesplugin.CAdESCOM.CPHashedDataAsync = {
      val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], DataEncoding = DataEncoding.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], SetHashValue = SetHashValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], propset_Algorithm = js.Any.fromFunction1(propset_Algorithm), propset_DataEncoding = js.Any.fromFunction1(propset_DataEncoding))
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAdESCOM.CPHashedDataAsync]
    }
    
    @scala.inline
    def CPSignerAsync(
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
    ): typingsSlinky.cadesplugin.CAdESCOM.CPSignerAsync = {
      val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CheckCertificate = CheckCertificate.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any], KeyPin = KeyPin.asInstanceOf[js.Any], Load = Load.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], SignatureTimeStampTime = SignatureTimeStampTime.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any], TSAAddress = TSAAddress.asInstanceOf[js.Any], propset_Certificate = js.Any.fromFunction1(propset_Certificate), propset_CheckCertificate = js.Any.fromFunction1(propset_CheckCertificate), propset_KeyPin = js.Any.fromFunction1(propset_KeyPin), propset_Options = js.Any.fromFunction1(propset_Options), propset_TSAAddress = js.Any.fromFunction1(propset_TSAAddress))
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAdESCOM.CPSignerAsync]
    }
    
    @scala.inline
    def CertificateAsync(
      Display: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
      Export: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
        ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]),
      GetInfo: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]),
      HasPrivateKey: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
      IsValid: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]],
      IssuerName: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      PublicKey: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[PublicKey]]]) | PromisifiedFunction[js.Function0[PublicKey]],
      SerialNumber: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      SubjectName: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      Thumbprint: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      ValidFromDate: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate],
      ValidToDate: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate],
      Version: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): typingsSlinky.cadesplugin.CAPICOM.CertificateAsync = {
      val __obj = js.Dynamic.literal(Display = Display.asInstanceOf[js.Any], Export = Export.asInstanceOf[js.Any], GetInfo = GetInfo.asInstanceOf[js.Any], HasPrivateKey = HasPrivateKey.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], IssuerName = IssuerName.asInstanceOf[js.Any], PublicKey = PublicKey.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], Thumbprint = Thumbprint.asInstanceOf[js.Any], ValidFromDate = ValidFromDate.asInstanceOf[js.Any], ValidToDate = ValidToDate.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAPICOM.CertificateAsync]
    }
    
    @scala.inline
    def CertificatesAsync(
      Count: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
      Find: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
              /* varCriteria */ js.UndefOr[_], 
              /* bFindValidOnly */ js.UndefOr[Boolean], 
              Certificates
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* findType */ ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], 
            /* varCriteria */ js.UndefOr[_], 
            /* bFindValidOnly */ js.UndefOr[Boolean], 
            Certificates
          ]
        ]),
      Item: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* index */ Double, Certificate]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, Certificate]]),
      Select: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* title */ js.UndefOr[String], 
              /* displayString */ js.UndefOr[String], 
              /* bMultiSelect */ js.UndefOr[Boolean], 
              Certificates
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* title */ js.UndefOr[String], 
            /* displayString */ js.UndefOr[String], 
            /* bMultiSelect */ js.UndefOr[Boolean], 
            Certificates
          ]
        ])
    ): typingsSlinky.cadesplugin.CAPICOM.CertificatesAsync = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Find = Find.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAPICOM.CertificatesAsync]
    }
    
    @scala.inline
    def EncodedDataAsync(
      Format: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      Value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]
        ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]])
    ): typingsSlinky.cadesplugin.CAPICOM.EncodedDataAsync = {
      val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAPICOM.EncodedDataAsync]
    }
    
    @scala.inline
    def OIDAsync(
      FriendlyName: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      Name: (// tslint:disable-line ban-types
    js.Promise[Unpacked[CAPICOM_OID]]) | PromisifiedFunction[CAPICOM_OID],
      Value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): typingsSlinky.cadesplugin.CAPICOM.OIDAsync = {
      val __obj = js.Dynamic.literal(FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAPICOM.OIDAsync]
    }
    
    @scala.inline
    def PublicKeyAsync(
      Algorithm: (// tslint:disable-line ban-types
    js.Promise[Unpacked[OID]]) | PromisifiedFunction[OID],
      EncodedKey: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData],
      EncodedParameters: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData],
      Length: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): typingsSlinky.cadesplugin.CAPICOM.PublicKeyAsync = {
      val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], EncodedParameters = EncodedParameters.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAPICOM.PublicKeyAsync]
    }
    
    @scala.inline
    def VersionAsync(
      BuildVersion: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
      MajorVersion: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
      MinorVersion: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
      toStringDefault: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
      toString_ : (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[String]]]) | PromisifiedFunction[js.Function0[String]]
    ): typingsSlinky.cadesplugin.CAdESCOM.VersionAsync = {
      val __obj = js.Dynamic.literal(BuildVersion = BuildVersion.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], toStringDefault = toStringDefault.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.cadesplugin.CAdESCOM.VersionAsync]
    }
  }
}
