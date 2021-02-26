package typingsSlinky.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.cadesplugin.CADESCommon.PromisifiedFunction
import typingsSlinky.cadesplugin.CADESCommon.Unpacked
import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.Store> */
@js.native
trait StoreAsync extends StObject {
  
  val Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typingsSlinky.cadesplugin.CAPICOM.Certificates]]) | PromisifiedFunction[typingsSlinky.cadesplugin.CAPICOM.Certificates] = js.native
  
  val Close: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]] = js.native
  
  val Delete: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]] = js.native
  
  val Import: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]]) = js.native
  
  val Location: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]] = js.native
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val Open: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[
        /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
        /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
        /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
        Unit
      ]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[
      /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
      /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
      /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
      Unit
    ]
  ]) = js.native
}
object StoreAsync {
  
  @scala.inline
  def apply(
    Certificates: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates],
    Close: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    Delete: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
    Import: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]]),
    Location: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]],
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Open: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[
          /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
          /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
          /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
          Unit
        ]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[
        /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
        /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
        /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
        Unit
      ]
    ])
  ): StoreAsync = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], Close = Close.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAsync]
  }
  
  @scala.inline
  implicit class StoreAsyncMutableBuilder[Self <: StoreAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Certificates]]) | PromisifiedFunction[Certificates]
    ): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Certificates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseFunction0(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFunction0(value: () => Boolean): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImport(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* encodedStore */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* encodedStore */ String, Unit]])
    ): Self = StObject.set(x, "Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* encodedStore */ String) => js.Promise[Unpacked[js.Any]] | Unit
    ): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocation(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_STORE_LOCATION]]]) | PromisifiedFunction[ValuesOf[CAPICOM_STORE_LOCATION]]
    ): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Location", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[
              /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
              /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
              /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
              Unit
            ]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[
            /* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], 
            /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], 
            /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]], 
            Unit
          ]
        ])
    ): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typingsSlinky.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenFunction3(
      value: (/* location */ js.UndefOr[ValuesOf[CAPICOM_STORE_LOCATION]], /* name */ js.UndefOr[ValuesOf[CAPICOM_STORE_NAME]], /* openMode */ js.UndefOr[ValuesOf[CAPICOM_STORE_OPEN_MODE]]) => Unit
    ): Self = StObject.set(x, "Open", js.Any.fromFunction3(value))
  }
}
