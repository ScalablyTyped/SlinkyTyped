package typingsSlinky.multer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.multer.anon.FieldNameSize
import typingsSlinky.multer.anon.PartialFile
import typingsSlinky.multer.mod.global.Express.Multer.File
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a Multer instance that provides several methods for generating
    * middleware that process files uploaded in `multipart/form-data` format.
    *
    * The `StorageEngine` specified in `storage` will be used to store files. If
    * `storage` is not set and `dest` is, files will be stored in `dest` on the
    * local file system with random names. If neither are set, files will be stored
    * in memory.
    *
    * In addition to files, all generated middleware process all text fields in
    * the request. For each non-file field, the `Request.body` object will be
    * populated with an entry mapping the field name to its string value, or array
    * of string values if multiple fields share the same name.
    */
  @JSImport("multer", JSImport.Namespace)
  @js.native
  def apply(): Multer = js.native
  @JSImport("multer", JSImport.Namespace)
  @js.native
  def apply(options: Options): Multer = js.native
  
  @JSImport("multer", "MulterError")
  @js.native
  class MulterError protected () extends Error {
    def this(code: ErrorCode) = this()
    def this(code: ErrorCode, field: String) = this()
    
    /** Identifying error code. */
    var code: ErrorCode = js.native
    
    /** Name of the multipart form field associated with this error. */
    var field: js.UndefOr[String] = js.native
  }
  
  /**
    * Returns a `StorageEngine` implementation configured to store files on
    * the local file system.
    *
    * A string or function may be specified to determine the destination
    * directory, and a function to determine filenames. If no options are set,
    * files will be stored in the system's temporary directory with random 32
    * character filenames.
    */
  @JSImport("multer", "diskStorage")
  @js.native
  def diskStorage(options: DiskStorageOptions): StorageEngine = js.native
  
  /**
    * Returns a `StorageEngine` implementation configured to store files in
    * memory as `Buffer` objects.
    */
  @JSImport("multer", "memoryStorage")
  @js.native
  def memoryStorage(): StorageEngine = js.native
  
  @js.native
  trait DiskStorageOptions extends StObject {
    
    /**
      * A string or function that determines the destination path for uploaded
      * files. If a string is passed and the directory does not exist, Multer
      * attempts to create it recursively. If neither a string or a function
      * is passed, the destination defaults to `os.tmpdir()`.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback Callback to determine the destination path.
      */
    var destination: js.UndefOr[
        String | (js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
          Unit
        ])
      ] = js.native
    
    /**
      * A function that determines the name of the uploaded file. If nothing
      * is passed, Multer will generate a 32 character pseudorandom hex string
      * with no extension.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback Callback to determine the name of the uploaded file.
      */
    var filename: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit], 
          Unit
        ]
      ] = js.native
  }
  object DiskStorageOptions {
    
    @scala.inline
    def apply(): DiskStorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiskStorageOptions]
    }
    
    @scala.inline
    implicit class DiskStorageOptionsMutableBuilder[Self <: DiskStorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(
        value: String | (js.Function3[
              /* req */ Request_[ParamsDictionary, _, _, Query], 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationFunction3(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit]) => Unit
      ): Self = StObject.set(x, "destination", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setFilename(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Unit
      ): Self = StObject.set(x, "filename", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.multer.multerStrings.LIMIT_PART_COUNT
    - typingsSlinky.multer.multerStrings.LIMIT_FILE_SIZE
    - typingsSlinky.multer.multerStrings.LIMIT_FILE_COUNT
    - typingsSlinky.multer.multerStrings.LIMIT_FIELD_KEY
    - typingsSlinky.multer.multerStrings.LIMIT_FIELD_VALUE
    - typingsSlinky.multer.multerStrings.LIMIT_FIELD_COUNT
    - typingsSlinky.multer.multerStrings.LIMIT_UNEXPECTED_FILE
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    @scala.inline
    def LIMIT_FIELD_COUNT: typingsSlinky.multer.multerStrings.LIMIT_FIELD_COUNT = "LIMIT_FIELD_COUNT".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_FIELD_COUNT]
    
    @scala.inline
    def LIMIT_FIELD_KEY: typingsSlinky.multer.multerStrings.LIMIT_FIELD_KEY = "LIMIT_FIELD_KEY".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_FIELD_KEY]
    
    @scala.inline
    def LIMIT_FIELD_VALUE: typingsSlinky.multer.multerStrings.LIMIT_FIELD_VALUE = "LIMIT_FIELD_VALUE".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_FIELD_VALUE]
    
    @scala.inline
    def LIMIT_FILE_COUNT: typingsSlinky.multer.multerStrings.LIMIT_FILE_COUNT = "LIMIT_FILE_COUNT".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_FILE_COUNT]
    
    @scala.inline
    def LIMIT_FILE_SIZE: typingsSlinky.multer.multerStrings.LIMIT_FILE_SIZE = "LIMIT_FILE_SIZE".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_FILE_SIZE]
    
    @scala.inline
    def LIMIT_PART_COUNT: typingsSlinky.multer.multerStrings.LIMIT_PART_COUNT = "LIMIT_PART_COUNT".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_PART_COUNT]
    
    @scala.inline
    def LIMIT_UNEXPECTED_FILE: typingsSlinky.multer.multerStrings.LIMIT_UNEXPECTED_FILE = "LIMIT_UNEXPECTED_FILE".asInstanceOf[typingsSlinky.multer.multerStrings.LIMIT_UNEXPECTED_FILE]
  }
  
  /**
    * An object describing a field name and the maximum number of files with
    * that field name to accept.
    */
  @js.native
  trait Field extends StObject {
    
    /** Optional maximum number of files per field to accept. (Default: Infinity) */
    var maxCount: js.UndefOr[Double] = js.native
    
    /** The field name. */
    var name: String = js.native
  }
  object Field {
    
    @scala.inline
    def apply(name: String): Field = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * a function to control which files should be uploaded and which should be skipped
    * pass a boolean to indicate if the file should be accepted
    * pass an error if something goes wrong
    */
  @js.native
  trait FileFilterCallback extends StObject {
    
    def apply(error: js.Error): Unit = js.native
    def apply(error: Null, acceptFile: Boolean): Unit = js.native
  }
  
  /**
    * @see {@link https://github.com/expressjs/multer#api}
    */
  @js.native
  trait Multer extends StObject {
    
    /**
      * Returns middleware that processes all files contained in the multipart
      * request.
      *
      * The `Request` object will be populated with a `files` array containing
      * an information object for each processed file.
      */
    def any(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    /**
      * Returns middleware that processes multiple files sharing the same field
      * name.
      *
      * The `Request` object will be populated with a `files` array containing
      * an information object for each processed file.
      *
      * @param fieldName Shared name of the multipart form fields to process.
      * @param maxCount Optional. Maximum number of files to process. (default: Infinity)
      * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if more than `maxCount` files are associated with `fieldName`
      */
    def array(fieldName: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def array(fieldName: String, maxCount: Double): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    /**
      * Returns middleware that processes multiple files associated with the
      * given form fields.
      *
      * The `Request` object will be populated with a `files` object which
      * maps each field name to an array of the associated file information
      * objects.
      *
      * @param fields Array of `Field` objects describing multipart form fields to process.
      * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if more than `maxCount` files are associated with `fieldName` for any field.
      */
    def fields(fields: js.Array[Field]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    /**
      * Returns middleware that accepts only non-file multipart form fields.
      *
      * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if any file is encountered.
      */
    def none(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    /**
      * Returns middleware that processes a single file associated with the
      * given form field.
      *
      * The `Request` object will be populated with a `file` object containing
      * information about the processed file.
      *
      * @param fieldName Name of the multipart form field to process.
      */
    def single(fieldName: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  /** Options for initializing a Multer instance. */
  @js.native
  trait Options extends StObject {
    
    /**
      * The destination directory for uploaded files. If `storage` is not set
      * and `dest` is, Multer will create a `DiskStorage` instance configured
      * to store files at `dest` with random filenames.
      *
      * Ignored if `storage` is set.
      */
    var dest: js.UndefOr[String] = js.native
    
    /**
      * Optional function to control which files are uploaded. This is called
      * for every file that is processed.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback  a function to control which files should be uploaded and which should be skipped.
      */
    var fileFilter: js.UndefOr[
        js.Function3[
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* file */ File, 
          /* callback */ FileFilterCallback, 
          Unit
        ]
      ] = js.native
    
    /**
      * An object specifying various limits on incoming data. This object is
      * passed to Busboy directly, and the details of properties can be found
      * at https://github.com/mscdex/busboy#busboy-methods.
      */
    var limits: js.UndefOr[FieldNameSize] = js.native
    
    /** Preserve the full path of the original filename rather than the basename. (Default: false) */
    var preservePath: js.UndefOr[Boolean] = js.native
    
    /**
      * A `StorageEngine` responsible for processing files uploaded via Multer.
      * Takes precedence over `dest`.
      */
    var storage: js.UndefOr[StorageEngine] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setFileFilter(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ FileFilterCallback) => Unit
      ): Self = StObject.set(x, "fileFilter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
      
      @scala.inline
      def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      @scala.inline
      def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
      
      @scala.inline
      def setStorage(value: StorageEngine): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  /**
    * Implementations of this interface are responsible for storing files
    * encountered by Multer and returning information on how to access them
    * once stored. Implementations must also provide a method for removing
    * files in the event that an error occurs.
    */
  @js.native
  trait StorageEngine extends StObject {
    
    /**
      * Store the file described by `file`, then invoke the callback with
      * information about the stored file.
      *
      * File contents are available as a stream via `file.stream`. Information
      * passed to the callback will be merged with `file` for subsequent
      * middleware.
      *
      * @param req The Express `Request` object.
      * @param file Object with `stream`, `fieldname`, `originalname`, `encoding`, and `mimetype` defined.
      * @param callback Callback to specify file information.
      */
    def _handleFile(
      req: Request_[ParamsDictionary, _, _, Query],
      file: File,
      callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[PartialFile], Unit]
    ): Unit = js.native
    
    /**
      * Remove the file described by `file`, then invoke the callback with.
      *
      * `file` contains all the properties available to `_handleFile`, as
      * well as those returned by `_handleFile`.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback Callback to indicate completion.
      */
    def _removeFile(
      req: Request_[ParamsDictionary, _, _, Query],
      file: File,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Unit = js.native
  }
  object StorageEngine {
    
    @scala.inline
    def apply(
      _handleFile: (Request_[ParamsDictionary, _, _, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[PartialFile], Unit]) => Unit,
      _removeFile: (Request_[ParamsDictionary, _, _, Query], File, js.Function1[/* error */ js.Error, Unit]) => Unit
    ): StorageEngine = {
      val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
      __obj.asInstanceOf[StorageEngine]
    }
    
    @scala.inline
    implicit class StorageEngineMutableBuilder[Self <: StorageEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_handleFile(
        value: (Request_[ParamsDictionary, _, _, Query], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[PartialFile], Unit]) => Unit
      ): Self = StObject.set(x, "_handleFile", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_removeFile(
        value: (Request_[ParamsDictionary, _, _, Query], File, js.Function1[/* error */ js.Error, Unit]) => Unit
      ): Self = StObject.set(x, "_removeFile", js.Any.fromFunction3(value))
    }
  }
  
  object global {
    
    object Express {
      
      object Multer {
        
        /** Object containing file metadata and access information. */
        @js.native
        trait File extends StObject {
          
          /** `MemoryStorage` only: A Buffer containing the entire file. */
          var buffer: Buffer = js.native
          
          /** `DiskStorage` only: Directory to which this file has been uploaded. */
          var destination: String = js.native
          
          /**
            * Value of the `Content-Transfer-Encoding` header for this file.
            * @deprecated since July 2015
            * @see RFC 7578, Section 4.7
            */
          var encoding: String = js.native
          
          /** Name of the form field associated with this file. */
          var fieldname: String = js.native
          
          /** `DiskStorage` only: Name of this file within `destination`. */
          var filename: String = js.native
          
          /** Value of the `Content-Type` header for this file. */
          var mimetype: String = js.native
          
          /** Name of the file on the uploader's computer. */
          var originalname: String = js.native
          
          /** `DiskStorage` only: Full path to the uploaded file. */
          var path: String = js.native
          
          /** Size of the file in bytes. */
          var size: Double = js.native
          
          /**
            * A readable stream of this file. Only available to the `_handleFile`
            * callback for custom `StorageEngine`s.
            */
          var stream: Readable = js.native
        }
        object File {
          
          @scala.inline
          def apply(
            buffer: Buffer,
            destination: String,
            encoding: String,
            fieldname: String,
            filename: String,
            mimetype: String,
            originalname: String,
            path: String,
            size: Double,
            stream: Readable
          ): File = {
            val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
            __obj.asInstanceOf[File]
          }
          
          @scala.inline
          implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setFieldname(value: String): Self = StObject.set(x, "fieldname", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setOriginalname(value: String): Self = StObject.set(x, "originalname", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
          }
        }
      }
      
      @js.native
      trait Request extends StObject {
        
        /** `Multer.File` object populated by `single()` middleware. */
        var file: File = js.native
        
        /**
          * Array or dictionary of `Multer.File` object populated by `array()`,
          * `fields()`, and `any()` middleware.
          */
        var files: StringDictionary[js.Array[File]] | js.Array[File] = js.native
      }
      object Request {
        
        @scala.inline
        def apply(file: File, files: StringDictionary[js.Array[File]] | js.Array[File]): Request = {
          val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFiles(value: StringDictionary[js.Array[File]] | js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
        }
      }
    }
  }
}
