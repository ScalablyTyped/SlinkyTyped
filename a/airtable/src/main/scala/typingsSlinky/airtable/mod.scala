package typingsSlinky.airtable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.airtable.airtableStrings.asc
import typingsSlinky.airtable.airtableStrings.desc
import typingsSlinky.airtable.airtableStrings.json
import typingsSlinky.airtable.airtableStrings.string
import typingsSlinky.airtable.anon.Full
import typingsSlinky.airtable.anon.Typecast
import typingsSlinky.airtable.mod.global.Airtable
import typingsSlinky.airtable.mod.global.Airtable.AirtableOptions
import typingsSlinky.airtable.mod.global.Airtable.Base_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("airtable", JSImport.Namespace)
  @js.native
  class ^ () extends Airtable {
    def this(options: AirtableOptions) = this()
  }
  
  /* static member */
  @JSImport("airtable", "base")
  @js.native
  def base(appId: String): Base_ = js.native
  
  /* static member */
  @JSImport("airtable", "configure")
  @js.native
  def configure(): Airtable = js.native
  @JSImport("airtable", "configure")
  @js.native
  def configure(options: AirtableOptions): Airtable = js.native
  
  object global {
    
    @JSGlobal("Airtable")
    @js.native
    class Airtable () extends StObject {
      def this(options: AirtableOptions) = this()
      
      def base(appId: String): Base_ = js.native
    }
    object Airtable {
      
      /* static member */
      @JSGlobal("Airtable.base")
      @js.native
      def base(appId: String): Base_ = js.native
      
      /* static member */
      @JSGlobal("Airtable.configure")
      @js.native
      def configure(): Airtable = js.native
      @JSGlobal("Airtable.configure")
      @js.native
      def configure(options: AirtableOptions): Airtable = js.native
      
      @js.native
      trait AirtableOptions extends StObject {
        
        var apiKey: js.UndefOr[String] = js.native
        
        var apiVersion: js.UndefOr[String] = js.native
        
        var endpointUrl: js.UndefOr[String] = js.native
        
        var noRetryIfRateLimited: js.UndefOr[Boolean] = js.native
        
        var requestTimeout: js.UndefOr[Double] = js.native
      }
      object AirtableOptions {
        
        @scala.inline
        def apply(): AirtableOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AirtableOptions]
        }
        
        @scala.inline
        implicit class AirtableOptionsMutableBuilder[Self <: AirtableOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
          
          @scala.inline
          def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
          
          @scala.inline
          def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEndpointUrlUndefined: Self = StObject.set(x, "endpointUrl", js.undefined)
          
          @scala.inline
          def setNoRetryIfRateLimited(value: Boolean): Self = StObject.set(x, "noRetryIfRateLimited", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoRetryIfRateLimitedUndefined: Self = StObject.set(x, "noRetryIfRateLimited", js.undefined)
          
          @scala.inline
          def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
        }
      }
      
      @js.native
      trait Attachment extends StObject {
        
        var filename: String = js.native
        
        var id: String = js.native
        
        var size: Double = js.native
        
        var thumbnails: js.UndefOr[Full] = js.native
        
        var `type`: String = js.native
        
        var url: String = js.native
      }
      object Attachment {
        
        @scala.inline
        def apply(filename: String, id: String, size: Double, `type`: String, url: String): Attachment = {
          val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[Attachment]
        }
        
        @scala.inline
        implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setThumbnails(value: Full): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      type Base_ = js.Function1[/* tableName */ String, Table[js.Object]]
      
      @js.native
      trait Collaborator extends StObject {
        
        var email: String = js.native
        
        var id: String = js.native
        
        var name: String = js.native
      }
      object Collaborator {
        
        @scala.inline
        def apply(email: String, id: String, name: String): Collaborator = {
          val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[Collaborator]
        }
        
        @scala.inline
        implicit class CollaboratorMutableBuilder[Self <: Collaborator] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        }
      }
      
      type FieldSet = StringDictionary[
            js.UndefOr[
              String | Double | Boolean | Collaborator | (js.Array[Attachment | Collaborator | String])
            ]
          ]
      
      @js.native
      trait Query[TFields /* <: js.Object */] extends StObject {
        
        def all(): js.Promise[Records[TFields]] = js.native
        
        def eachPage(pageCallback: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit]): js.Promise[Unit] = js.native
        
        def firstPage(): js.Promise[Records[TFields]] = js.native
      }
      object Query {
        
        @scala.inline
        def apply[TFields /* <: js.Object */](
          all: () => js.Promise[Records[TFields]],
          eachPage: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit],
          firstPage: () => js.Promise[Records[TFields]]
        ): Query[TFields] = {
          val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), eachPage = js.Any.fromFunction1(eachPage), firstPage = js.Any.fromFunction0(firstPage))
          __obj.asInstanceOf[Query[TFields]]
        }
        
        @scala.inline
        implicit class QueryMutableBuilder[Self <: Query[_], TFields /* <: js.Object */] (val x: Self with Query[TFields]) extends AnyVal {
          
          @scala.inline
          def setAll(value: () => js.Promise[Records[TFields]]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
          
          @scala.inline
          def setEachPage(
            value: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit]
          ): Self = StObject.set(x, "eachPage", js.Any.fromFunction1(value))
          
          @scala.inline
          def setFirstPage(value: () => js.Promise[Records[TFields]]): Self = StObject.set(x, "firstPage", js.Any.fromFunction0(value))
        }
      }
      
      @js.native
      trait Record[TFields] extends StObject {
        
        var fields: TFields = js.native
        
        var id: String = js.native
      }
      object Record {
        
        @scala.inline
        def apply[TFields](fields: TFields, id: String): Record[TFields] = {
          val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
          __obj.asInstanceOf[Record[TFields]]
        }
        
        @scala.inline
        implicit class RecordMutableBuilder[Self <: Record[_], TFields] (val x: Self with Record[TFields]) extends AnyVal {
          
          @scala.inline
          def setFields(value: TFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        }
      }
      
      type Records[TFields] = js.Array[Record[TFields]]
      
      @js.native
      trait SelectOptions extends StObject {
        
        var cellFormat: js.UndefOr[json | string] = js.native
        
        var fields: js.UndefOr[js.Array[String]] = js.native
        
        var filterByFormula: js.UndefOr[String] = js.native
        
        var maxRecords: js.UndefOr[Double] = js.native
        
        var pageSize: js.UndefOr[Double] = js.native
        
        var sort: js.UndefOr[js.Array[SortParameter]] = js.native
        
        var timeZone: js.UndefOr[String] = js.native
        
        var userLocale: js.UndefOr[String] = js.native
        
        var view: js.UndefOr[String] = js.native
      }
      object SelectOptions {
        
        @scala.inline
        def apply(): SelectOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SelectOptions]
        }
        
        @scala.inline
        implicit class SelectOptionsMutableBuilder[Self <: SelectOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCellFormat(value: json | string): Self = StObject.set(x, "cellFormat", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCellFormatUndefined: Self = StObject.set(x, "cellFormat", js.undefined)
          
          @scala.inline
          def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
          
          @scala.inline
          def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
          
          @scala.inline
          def setFilterByFormula(value: String): Self = StObject.set(x, "filterByFormula", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilterByFormulaUndefined: Self = StObject.set(x, "filterByFormula", js.undefined)
          
          @scala.inline
          def setMaxRecords(value: Double): Self = StObject.set(x, "maxRecords", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxRecordsUndefined: Self = StObject.set(x, "maxRecords", js.undefined)
          
          @scala.inline
          def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
          
          @scala.inline
          def setSort(value: js.Array[SortParameter]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
          
          @scala.inline
          def setSortVarargs(value: SortParameter*): Self = StObject.set(x, "sort", js.Array(value :_*))
          
          @scala.inline
          def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
          
          @scala.inline
          def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
          
          @scala.inline
          def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
        }
      }
      
      @js.native
      trait SortParameter extends StObject {
        
        var direction: js.UndefOr[asc | desc] = js.native
        
        var field: String = js.native
      }
      object SortParameter {
        
        @scala.inline
        def apply(field: String): SortParameter = {
          val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
          __obj.asInstanceOf[SortParameter]
        }
        
        @scala.inline
        implicit class SortParameterMutableBuilder[Self <: SortParameter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
          
          @scala.inline
          def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Table[TFields /* <: FieldSet */] extends StObject {
        
        def create(record: TFields): js.Promise[Record[TFields]] = js.native
        def create(record: TFields, opts: Typecast): js.Promise[Record[TFields]] = js.native
        def create(records: js.Array[TFields]): js.Promise[Records[TFields]] = js.native
        def create(records: js.Array[TFields], opts: Typecast): js.Promise[Records[TFields]] = js.native
        
        def destroy(args: js.Any*): js.Promise[_] = js.native
        
        def find(id: String): js.Promise[Record[TFields]] = js.native
        
        def replace(args: js.Any*): js.Promise[_] = js.native
        
        def select(): Query[TFields] = js.native
        def select(opt: SelectOptions): Query[TFields] = js.native
        
        def update(args: js.Any*): js.Promise[_] = js.native
      }
      
      @js.native
      trait Thumbnail extends StObject {
        
        var height: Double = js.native
        
        var url: String = js.native
        
        var width: Double = js.native
      }
      object Thumbnail {
        
        @scala.inline
        def apply(height: Double, url: String, width: Double): Thumbnail = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[Thumbnail]
        }
        
        @scala.inline
        implicit class ThumbnailMutableBuilder[Self <: Thumbnail] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
