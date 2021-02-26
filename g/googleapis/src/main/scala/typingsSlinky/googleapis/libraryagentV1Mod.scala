package typingsSlinky.googleapis

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryagentV1Mod {
  
  object libraryagentV1 {
    
    /**
      * Library Agent API
      *
      * A simple Google Example Library API.
      *
      * @example
      * const {google} = require('googleapis');
      * const libraryagent = google.libraryagent('v1');
      *
      * @namespace libraryagent
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Libraryagent
      */
    @JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Libraryagent")
    @js.native
    class Libraryagent protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var shelves: ResourceShelves = js.native
    }
    
    @JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves")
    @js.native
    class ResourceShelves protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var books: ResourceShelvesBooks = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * libraryagent.shelves.get
        * @desc Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
        * @alias libraryagent.shelves.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the shelf to retrieve.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(params: ParamsResourceShelvesGet): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(
        params: ParamsResourceShelvesGet,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
      ): Unit = js.native
      def get(
        params: ParamsResourceShelvesGet,
        options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf],
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
      ): Unit = js.native
      def get(params: ParamsResourceShelvesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
      def get(
        params: ParamsResourceShelvesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
      ): Unit = js.native
      
      /**
        * libraryagent.shelves.list
        * @desc Lists shelves. The order is unspecified but deterministic. Newly
        * created shelves will not necessarily be added to the end of this list.
        * @alias libraryagent.shelves.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {integer=} params.pageSize Requested page size. Server may return fewer shelves than requested. If unspecified, server will pick an appropriate default.
        * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListShelvesResponse.next_page_token returned from the previous call to `ListShelves` method.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(params: ParamsResourceShelvesList): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(
        params: ParamsResourceShelvesList,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceShelvesList,
        options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse],
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      ): Unit = js.native
      def list(params: ParamsResourceShelvesList, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
      def list(
        params: ParamsResourceShelvesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves$Books")
    @js.native
    class ResourceShelvesBooks protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * libraryagent.shelves.books.borrow
        * @desc Borrow a book from the library. Returns the book if it is borrowed
        * successfully. Returns NOT_FOUND if the book does not exist in the
        * library. Returns quota exceeded error if the amount of books borrowed
        * exceeds allocation quota in any dimensions.
        * @alias libraryagent.shelves.books.borrow
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the book to borrow.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def borrow(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
      def borrow(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(params: ParamsResourceShelvesBooksBorrow): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book],
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def borrow(params: ParamsResourceShelvesBooksBorrow, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def borrow(
        params: ParamsResourceShelvesBooksBorrow,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * libraryagent.shelves.books.get
        * @desc Gets a book. Returns NOT_FOUND if the book does not exist.
        * @alias libraryagent.shelves.books.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the book to retrieve.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(params: ParamsResourceShelvesBooksGet): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book],
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def get(params: ParamsResourceShelvesBooksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def get(
        params: ParamsResourceShelvesBooksGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      
      /**
        * libraryagent.shelves.books.list
        * @desc Lists books in a shelf. The order is unspecified but deterministic.
        * Newly created books will not necessarily be added to the end of this
        * list. Returns NOT_FOUND if the shelf does not exist.
        * @alias libraryagent.shelves.books.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {integer=} params.pageSize Requested page size. Server may return fewer books than requested. If unspecified, server will pick an appropriate default.
        * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListBooksResponse.next_page_token. returned from the previous call to `ListBooks` method.
        * @param {string} params.parent The name of the shelf whose books we'd like to list.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(params: ParamsResourceShelvesBooksList): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse],
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      ): Unit = js.native
      def list(params: ParamsResourceShelvesBooksList, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
      def list(
        params: ParamsResourceShelvesBooksList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      ): Unit = js.native
      
      /**
        * libraryagent.shelves.books.return
        * @desc Return a book to the library. Returns the book if it is returned to
        * the library successfully. Returns error if the book does not belong to
        * the library or the users didn't borrow before.
        * @alias libraryagent.shelves.books.return
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.name The name of the book to return.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def `return`(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
      def `return`(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(params: ParamsResourceShelvesBooksReturn): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book],
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
      def `return`(params: ParamsResourceShelvesBooksReturn, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
      def `return`(
        params: ParamsResourceShelvesBooksReturn,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceShelvesBooksBorrow extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The name of the book to borrow.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceShelvesBooksBorrow {
      
      @scala.inline
      def apply(): ParamsResourceShelvesBooksBorrow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksBorrow]
      }
      
      @scala.inline
      implicit class ParamsResourceShelvesBooksBorrowMutableBuilder[Self <: ParamsResourceShelvesBooksBorrow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceShelvesBooksGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The name of the book to retrieve.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceShelvesBooksGet {
      
      @scala.inline
      def apply(): ParamsResourceShelvesBooksGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksGet]
      }
      
      @scala.inline
      implicit class ParamsResourceShelvesBooksGetMutableBuilder[Self <: ParamsResourceShelvesBooksGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceShelvesBooksList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Requested page size. Server may return fewer books than requested. If
        * unspecified, server will pick an appropriate default.
        */
      var pageSize: js.UndefOr[Double] = js.native
      
      /**
        * A token identifying a page of results the server should return.
        * Typically, this is the value of ListBooksResponse.next_page_token.
        * returned from the previous call to `ListBooks` method.
        */
      var pageToken: js.UndefOr[String] = js.native
      
      /**
        * The name of the shelf whose books we'd like to list.
        */
      var parent: js.UndefOr[String] = js.native
    }
    object ParamsResourceShelvesBooksList {
      
      @scala.inline
      def apply(): ParamsResourceShelvesBooksList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksList]
      }
      
      @scala.inline
      implicit class ParamsResourceShelvesBooksListMutableBuilder[Self <: ParamsResourceShelvesBooksList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceShelvesBooksReturn extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The name of the book to return.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceShelvesBooksReturn {
      
      @scala.inline
      def apply(): ParamsResourceShelvesBooksReturn = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesBooksReturn]
      }
      
      @scala.inline
      implicit class ParamsResourceShelvesBooksReturnMutableBuilder[Self <: ParamsResourceShelvesBooksReturn] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceShelvesGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The name of the shelf to retrieve.
        */
      var name: js.UndefOr[String] = js.native
    }
    object ParamsResourceShelvesGet {
      
      @scala.inline
      def apply(): ParamsResourceShelvesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesGet]
      }
      
      @scala.inline
      implicit class ParamsResourceShelvesGetMutableBuilder[Self <: ParamsResourceShelvesGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceShelvesList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Requested page size. Server may return fewer shelves than requested. If
        * unspecified, server will pick an appropriate default.
        */
      var pageSize: js.UndefOr[Double] = js.native
      
      /**
        * A token identifying a page of results the server should return.
        * Typically, this is the value of ListShelvesResponse.next_page_token
        * returned from the previous call to `ListShelves` method.
        */
      var pageToken: js.UndefOr[String] = js.native
    }
    object ParamsResourceShelvesList {
      
      @scala.inline
      def apply(): ParamsResourceShelvesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceShelvesList]
      }
      
      @scala.inline
      implicit class ParamsResourceShelvesListMutableBuilder[Self <: ParamsResourceShelvesList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    /**
      * A single book in the library.
      */
    @js.native
    trait SchemaGoogleExampleLibraryagentV1Book extends StObject {
      
      /**
        * The name of the book author.
        */
      var author: js.UndefOr[String] = js.native
      
      /**
        * The resource name of the book. Book names have the form
        * `shelves/{shelf_id}/books/{book_id}`. The name is ignored when creating a
        * book.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Value indicating whether the book has been read.
        */
      var read: js.UndefOr[Boolean] = js.native
      
      /**
        * The title of the book.
        */
      var title: js.UndefOr[String] = js.native
    }
    object SchemaGoogleExampleLibraryagentV1Book {
      
      @scala.inline
      def apply(): SchemaGoogleExampleLibraryagentV1Book = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Book]
      }
      
      @scala.inline
      implicit class SchemaGoogleExampleLibraryagentV1BookMutableBuilder[Self <: SchemaGoogleExampleLibraryagentV1Book] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /**
      * Response message for LibraryAgent.ListBooks.
      */
    @js.native
    trait SchemaGoogleExampleLibraryagentV1ListBooksResponse extends StObject {
      
      /**
        * The list of books.
        */
      var books: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Book]] = js.native
      
      /**
        * A token to retrieve next page of results. Pass this value in the
        * ListBooksRequest.page_token field in the subsequent call to `ListBooks`
        * method to retrieve the next page of results.
        */
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object SchemaGoogleExampleLibraryagentV1ListBooksResponse {
      
      @scala.inline
      def apply(): SchemaGoogleExampleLibraryagentV1ListBooksResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
      }
      
      @scala.inline
      implicit class SchemaGoogleExampleLibraryagentV1ListBooksResponseMutableBuilder[Self <: SchemaGoogleExampleLibraryagentV1ListBooksResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBooks(value: js.Array[SchemaGoogleExampleLibraryagentV1Book]): Self = StObject.set(x, "books", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBooksUndefined: Self = StObject.set(x, "books", js.undefined)
        
        @scala.inline
        def setBooksVarargs(value: SchemaGoogleExampleLibraryagentV1Book*): Self = StObject.set(x, "books", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    /**
      * Response message for LibraryAgent.ListShelves.
      */
    @js.native
    trait SchemaGoogleExampleLibraryagentV1ListShelvesResponse extends StObject {
      
      /**
        * A token to retrieve next page of results. Pass this value in the
        * ListShelvesRequest.page_token field in the subsequent call to
        * `ListShelves` method to retrieve the next page of results.
        */
      var nextPageToken: js.UndefOr[String] = js.native
      
      /**
        * The list of shelves.
        */
      var shelves: js.UndefOr[js.Array[SchemaGoogleExampleLibraryagentV1Shelf]] = js.native
    }
    object SchemaGoogleExampleLibraryagentV1ListShelvesResponse {
      
      @scala.inline
      def apply(): SchemaGoogleExampleLibraryagentV1ListShelvesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
      }
      
      @scala.inline
      implicit class SchemaGoogleExampleLibraryagentV1ListShelvesResponseMutableBuilder[Self <: SchemaGoogleExampleLibraryagentV1ListShelvesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setShelves(value: js.Array[SchemaGoogleExampleLibraryagentV1Shelf]): Self = StObject.set(x, "shelves", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShelvesUndefined: Self = StObject.set(x, "shelves", js.undefined)
        
        @scala.inline
        def setShelvesVarargs(value: SchemaGoogleExampleLibraryagentV1Shelf*): Self = StObject.set(x, "shelves", js.Array(value :_*))
      }
    }
    
    /**
      * A Shelf contains a collection of books with a theme.
      */
    @js.native
    trait SchemaGoogleExampleLibraryagentV1Shelf extends StObject {
      
      /**
        * Output only. The resource name of the shelf. Shelf names have the form
        * `shelves/{shelf_id}`. The name is ignored when creating a shelf.
        */
      var name: js.UndefOr[String] = js.native
      
      /**
        * The theme of the shelf
        */
      var theme: js.UndefOr[String] = js.native
    }
    object SchemaGoogleExampleLibraryagentV1Shelf {
      
      @scala.inline
      def apply(): SchemaGoogleExampleLibraryagentV1Shelf = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleExampleLibraryagentV1Shelf]
      }
      
      @scala.inline
      implicit class SchemaGoogleExampleLibraryagentV1ShelfMutableBuilder[Self <: SchemaGoogleExampleLibraryagentV1Shelf] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.native
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.native
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.native
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
