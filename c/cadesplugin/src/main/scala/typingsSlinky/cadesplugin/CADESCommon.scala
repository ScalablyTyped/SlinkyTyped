package typingsSlinky.cadesplugin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CADES_Common")
@js.native
object CADESCommon extends js.Object {
  
  trait _Unpacked[T] extends js.Object
  
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
}
