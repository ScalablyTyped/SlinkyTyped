package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.Async
import typingsSlinky.devextreme.anon.ErrorDetails
import typingsSlinky.devextreme.devextremeStrings.Decimal
import typingsSlinky.devextreme.devextremeStrings.Int32
import typingsSlinky.devextreme.devextremeStrings.Int64
import typingsSlinky.devextreme.devextremeStrings.Single
import typingsSlinky.devextreme.devextremeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataStoreOptions extends StoreOptions[ODataStore] {
  
  /**
    * [descr:ODataStore.Options.beforeSend]
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, _]] = js.native
  
  /**
    * [descr:ODataStore.Options.deserializeDates]
    */
  var deserializeDates: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataStore.Options.errorHandler]
    */
  @JSName("errorHandler")
  var errorHandler_ODataStoreOptions: js.UndefOr[js.Function1[/* e */ ErrorDetails, _]] = js.native
  
  /**
    * [descr:ODataStore.Options.fieldTypes]
    */
  var fieldTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:ODataStore.Options.filterToLower]
    */
  var filterToLower: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataStore.Options.jsonp]
    */
  var jsonp: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ODataStore.Options.keyType]
    */
  var keyType: js.UndefOr[
    String | Int32 | Int64 | typingsSlinky.devextreme.devextremeStrings.Guid | typingsSlinky.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
  ] = js.native
  
  /**
    * [descr:ODataStore.Options.url]
    */
  var url: js.UndefOr[java.lang.String] = js.native
  
  /**
    * [descr:ODataStore.Options.version]
    */
  var version: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ODataStore.Options.withCredentials]
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object ODataStoreOptions {
  
  @scala.inline
  def apply(): ODataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataStoreOptions]
  }
  
  @scala.inline
  implicit class ODataStoreOptionsOps[Self <: ODataStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeSend(value: /* options */ Async => _): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setDeserializeDates(value: Boolean): Self = this.set("deserializeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeserializeDates: Self = this.set("deserializeDates", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* e */ ErrorDetails => _): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setFieldTypes(value: js.Any): Self = this.set("fieldTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTypes: Self = this.set("fieldTypes", js.undefined)
    
    @scala.inline
    def setFilterToLower(value: Boolean): Self = this.set("filterToLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterToLower: Self = this.set("filterToLower", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setKeyType(
      value: String | Int32 | Int64 | typingsSlinky.devextreme.devextremeStrings.Guid | typingsSlinky.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
    ): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
