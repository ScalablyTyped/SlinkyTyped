package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.anon.Immutable
import typingsSlinky.devextreme.mod.DevExpress.data.ArrayStoreOptions
import typingsSlinky.devextreme.mod.DevExpress.data.CustomStoreOptions
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.DevExpress.data.LocalStoreOptions
import typingsSlinky.devextreme.mod.DevExpress.data.ODataContextOptions
import typingsSlinky.devextreme.mod.DevExpress.data.ODataStoreOptions
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceOptions
import typingsSlinky.devextreme.mod.DevExpress.data.Query
import typingsSlinky.devextreme.mod.DevExpress.data.StoreOptions
import typingsSlinky.devextreme.mod.DevExpress.data.XmlaStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSImport("devextreme", "default.data.ArrayStore")
  @js.native
  class ArrayStore ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.ArrayStore {
    def this(options: ArrayStoreOptions[typingsSlinky.devextreme.mod.DevExpress.data.ArrayStore]) = this()
  }
  
  @JSImport("devextreme", "default.data.CustomStore")
  @js.native
  class CustomStore ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.CustomStore {
    def this(options: CustomStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.DataSource")
  @js.native
  class DataSource protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.DataSource {
    def this(data: js.Array[_]) = this()
    def this(options: CustomStoreOptions) = this()
    def this(options: DataSourceOptions) = this()
    def this(store: typingsSlinky.devextreme.mod.DevExpress.data.Store) = this()
    def this(url: String) = this()
  }
  
  @JSImport("devextreme", "default.data.EdmLiteral")
  @js.native
  class EdmLiteral protected ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.EdmLiteral {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.Guid")
  @js.native
  class Guid ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.Guid {
    def this(value: String) = this()
  }
  
  @JSImport("devextreme", "default.data.LocalStore")
  @js.native
  class LocalStore ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.LocalStore {
    def this(options: LocalStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataContext")
  @js.native
  class ODataContext ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.ODataContext {
    def this(options: ODataContextOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.ODataStore")
  @js.native
  class ODataStore ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.ODataStore {
    def this(options: ODataStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.PivotGridDataSource")
  @js.native
  class PivotGridDataSource ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSource {
    def this(options: PivotGridDataSourceOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.Query")
  @js.native
  class Query_ () extends Query
  
  @JSImport("devextreme", "default.data.Store")
  @js.native
  class Store ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.Store {
    def this(options: StoreOptions[typingsSlinky.devextreme.mod.DevExpress.data.Store]) = this()
  }
  
  @JSImport("devextreme", "default.data.XmlaStore")
  @js.native
  class XmlaStore ()
    extends typingsSlinky.devextreme.mod.DevExpress.data.XmlaStore {
    def this(options: XmlaStoreOptions) = this()
  }
  
  @JSImport("devextreme", "default.data.applyChanges")
  @js.native
  def applyChanges(data: js.Array[_], changes: js.Array[_]): js.Array[_] = js.native
  @JSImport("devextreme", "default.data.applyChanges")
  @js.native
  def applyChanges(data: js.Array[_], changes: js.Array[_], options: Immutable): js.Array[_] = js.native
  
  @JSImport("devextreme", "default.data.base64_encode")
  @js.native
  def base64Encode(input: String): String = js.native
  @JSImport("devextreme", "default.data.base64_encode")
  @js.native
  def base64Encode(input: js.Array[Double]): String = js.native
  
  @JSImport("devextreme", "default.data.errorHandler")
  @js.native
  def errorHandler(e: js.Error): Unit = js.native
  
  @JSImport("devextreme", "default.data.query")
  @js.native
  def query(array: js.Array[_]): Query = js.native
  @JSImport("devextreme", "default.data.query")
  @js.native
  def query(url: String, queryOptions: js.Any): Query = js.native
  
  object utils {
    
    @JSImport("devextreme", "default.data.utils.compileGetter")
    @js.native
    def compileGetter(expr: String): js.Function = js.native
    @JSImport("devextreme", "default.data.utils.compileGetter")
    @js.native
    def compileGetter(expr: js.Array[String]): js.Function = js.native
    
    @JSImport("devextreme", "default.data.utils.compileSetter")
    @js.native
    def compileSetter(expr: String): js.Function = js.native
    @JSImport("devextreme", "default.data.utils.compileSetter")
    @js.native
    def compileSetter(expr: js.Array[String]): js.Function = js.native
    
    object odata {
      
      @JSImport("devextreme", "default.data.utils.odata")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("devextreme", "default.data.utils.odata.keyConverters")
      @js.native
      def keyConverters: js.Any = js.native
      @scala.inline
      def keyConverters_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyConverters")(x.asInstanceOf[js.Any])
    }
  }
}
