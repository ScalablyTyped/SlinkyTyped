package typingsSlinky.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cadesplugin.CADESCommon.PromisifiedFunction
import typingsSlinky.cadesplugin.CADESCommon.Unpacked
import typingsSlinky.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.Version> */
@js.native
trait VersionAsync
  extends _Unpacked[js.Any] {
  
  val BuildVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val MajorVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val MinorVersion: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val toStringDefault: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  @JSName("toString")
  val toString_FVersionAsync: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[String]]]) | PromisifiedFunction[js.Function0[String]] = js.native
}
object VersionAsync {
  
  @scala.inline
  def apply(
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
  ): VersionAsync = {
    val __obj = js.Dynamic.literal(BuildVersion = BuildVersion.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], toStringDefault = toStringDefault.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionAsync]
  }
  
  @scala.inline
  implicit class VersionAsyncMutableBuilder[Self <: VersionAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "BuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "BuildVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMajorVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "MajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "MajorVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinorVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "MinorVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToStringDefault(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "toStringDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStringDefaultFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "toStringDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToString_(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[String]]]) | PromisifiedFunction[js.Function0[String]]
    ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_Function1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
