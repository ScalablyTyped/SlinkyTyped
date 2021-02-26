package typingsSlinky.expressFileupload

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-fileupload", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-fileupload", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("express-fileupload", "FileArray")
  @js.native
  class FileArray () extends /* index */ StringDictionary[UploadedFile]
  
  /**
    * @see {@link https://github.com/richardgirges/express-fileupload#available-options}
    */
  @js.native
  trait Options
    extends /* property */ StringDictionary[js.Any] {
    
    /**
      * Returns a HTTP 413 when the file is bigger than the size limit if `true`.
      * Otherwise, it will add a `truncated = true` to the resulting file structure.
      * @default false
      */
    var abortOnLimit: js.UndefOr[Boolean] = js.native
    
    /**
      * Automatically creates the directory path specified in `.mv(filePathName)`
      * @default false
      */
    var createParentPath: js.UndefOr[Boolean] = js.native
    
    /**
      * Turn on/off upload process logging.
      * Can be useful for troubleshooting.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * User defined limit handler which will be invoked if the file is bigger than configured limits.
      * @default false
      */
    var limitHandler: js.UndefOr[Boolean | (RequestHandler[ParamsDictionary, _, _, Query])] = js.native
    
    /**
      * By default, `req.body` and `req.files`
      * are flattened like this: `{'name': 'John', 'hobbies[0]': 'Cinema', 'hobbies[1]': 'Bike'}`
      *
      * When this option is enabled they are parsed in order to be nested like this:
      * `{'name': 'John', 'hobbies': ['Cinema', 'Bike']}`
      * @default false
      */
    var parseNested: js.UndefOr[Boolean] = js.native
    
    /**
      * Preserves filename extension when using safeFileNames option.
      * If set to `true`, will default to an extension length of 3.
      * If set to `Number`, this will be the max allowable extension length.
      * If an extension is smaller than the extension length, it remains untouched. If the extension is longer, it is shifted.
      * @default false
      */
    var preserveExtension: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * Response which will be send to client if file size limit exceeded when `abortOnLimit` set to `true`.
      * @default 'File size limit has been reached'
      */
    var responseOnLimit: js.UndefOr[String] = js.native
    
    /**
      * Strips characters from the upload's filename.
      * You can use custom regex to determine what to strip.
      * If set to true, non-alphanumeric characters except dashes and underscores will be stripped.
      * This option is off by default.
      * @default false
      */
    var safeFileNames: js.UndefOr[Boolean | js.RegExp] = js.native
    
    /**
      * Path to store temporary files.
      * Used along with the `useTempFiles` option.
      * By default this module uses 'tmp' folder in the current working directory.
      * You can use trailing slash, but it is not necessary.
      * @default '/tmp'
      */
    var tempFileDir: js.UndefOr[String] = js.native
    
    /**
      * @default 60000
      */
    var uploadTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Applies uri decoding to file names if set true.
      * @default false
      */
    var uriDecodeFileNames: js.UndefOr[Boolean] = js.native
    
    /**
      * By default this module uploads files into RAM.
      * Setting this option to True turns on using temporary files instead of utilising RAM. This avoids memory overflow issues when uploading large files
      * or in case of uploading lots of files at same time.
      * @default false
      */
    var useTempFiles: js.UndefOr[Boolean] = js.native
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
      def setAbortOnLimit(value: Boolean): Self = StObject.set(x, "abortOnLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortOnLimitUndefined: Self = StObject.set(x, "abortOnLimit", js.undefined)
      
      @scala.inline
      def setCreateParentPath(value: Boolean): Self = StObject.set(x, "createParentPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateParentPathUndefined: Self = StObject.set(x, "createParentPath", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setLimitHandler(value: Boolean | (RequestHandler[ParamsDictionary, _, _, Query])): Self = StObject.set(x, "limitHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitHandlerFunction3(
        value: (/* req */ Request[ParamsDictionary, _, _, Query], /* res */ Response[_, Double], /* next */ NextFunction) => js.Any
      ): Self = StObject.set(x, "limitHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLimitHandlerUndefined: Self = StObject.set(x, "limitHandler", js.undefined)
      
      @scala.inline
      def setParseNested(value: Boolean): Self = StObject.set(x, "parseNested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseNestedUndefined: Self = StObject.set(x, "parseNested", js.undefined)
      
      @scala.inline
      def setPreserveExtension(value: Boolean | Double): Self = StObject.set(x, "preserveExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveExtensionUndefined: Self = StObject.set(x, "preserveExtension", js.undefined)
      
      @scala.inline
      def setResponseOnLimit(value: String): Self = StObject.set(x, "responseOnLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseOnLimitUndefined: Self = StObject.set(x, "responseOnLimit", js.undefined)
      
      @scala.inline
      def setSafeFileNames(value: Boolean | js.RegExp): Self = StObject.set(x, "safeFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeFileNamesRegExp(value: js.RegExp): Self = StObject.set(x, "safeFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeFileNamesUndefined: Self = StObject.set(x, "safeFileNames", js.undefined)
      
      @scala.inline
      def setTempFileDir(value: String): Self = StObject.set(x, "tempFileDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempFileDirUndefined: Self = StObject.set(x, "tempFileDir", js.undefined)
      
      @scala.inline
      def setUploadTimeout(value: Double): Self = StObject.set(x, "uploadTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTimeoutUndefined: Self = StObject.set(x, "uploadTimeout", js.undefined)
      
      @scala.inline
      def setUriDecodeFileNames(value: Boolean): Self = StObject.set(x, "uriDecodeFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriDecodeFileNamesUndefined: Self = StObject.set(x, "uriDecodeFileNames", js.undefined)
      
      @scala.inline
      def setUseTempFiles(value: Boolean): Self = StObject.set(x, "useTempFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTempFilesUndefined: Self = StObject.set(x, "useTempFiles", js.undefined)
    }
  }
  
  @js.native
  trait UploadedFile extends StObject {
    
    /** A buffer representation of your file, returns empty buffer in case useTempFiles option was set to true. */
    var data: Buffer = js.native
    
    /** Encoding type of the file */
    var encoding: String = js.native
    
    /** MD5 checksum of the uploaded file */
    var md5: String = js.native
    
    /** The mimetype of your file */
    var mimetype: String = js.native
    
    def mv(path: String): js.Promise[Unit] = js.native
    /** A function to move the file elsewhere on your server */
    def mv(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /** file name */
    var name: String = js.native
    
    /** Uploaded size in bytes */
    var size: Double = js.native
    
    /** A path to the temporary file in case useTempFiles option was set to true. */
    var tempFilePath: String = js.native
    
    /** A boolean that represents if the file is over the size limit */
    var truncated: Boolean = js.native
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var files: js.UndefOr[FileArray] = js.native
      }
      object Request {
        
        @scala.inline
        def apply(): typingsSlinky.expressFileupload.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typingsSlinky.expressFileupload.mod.global.Express.Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: typingsSlinky.expressFileupload.mod.global.Express.Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFiles(value: FileArray): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        }
      }
    }
  }
}
