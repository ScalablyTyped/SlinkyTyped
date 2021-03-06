package typingsSlinky.pizzip

import typingsSlinky.node.Buffer
import typingsSlinky.node.processMod.global.NodeJS.Platform
import typingsSlinky.pizzip.mod.Compression
import typingsSlinky.pizzip.pizzipNumbers.`1`
import typingsSlinky.pizzip.pizzipNumbers.`2`
import typingsSlinky.pizzip.pizzipNumbers.`3`
import typingsSlinky.pizzip.pizzipNumbers.`4`
import typingsSlinky.pizzip.pizzipNumbers.`5`
import typingsSlinky.pizzip.pizzipNumbers.`6`
import typingsSlinky.pizzip.pizzipNumbers.`7`
import typingsSlinky.pizzip.pizzipNumbers.`8`
import typingsSlinky.pizzip.pizzipNumbers.`9`
import typingsSlinky.pizzip.pizzipStrings.DOS
import typingsSlinky.pizzip.pizzipStrings.UNIX
import typingsSlinky.pizzip.pizzipStrings.arraybuffer
import typingsSlinky.pizzip.pizzipStrings.base64
import typingsSlinky.pizzip.pizzipStrings.blob
import typingsSlinky.pizzip.pizzipStrings.nodebuffer
import typingsSlinky.pizzip.pizzipStrings.string
import typingsSlinky.pizzip.pizzipStrings.uint8array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base64 extends StObject {
    
    /**
      * @deprecated
      */
    var base64: Boolean = js.native
    
    /**
      * @deprecated
      */
    var binary: Boolean = js.native
    
    var compression: Compression = js.native
    
    /**
      * @deprecated use File.date
      */
    var date: js.Date = js.native
    
    /**
      * @deprecated use File.dir
      */
    var dir: Boolean = js.native
  }
  object Base64 {
    
    @scala.inline
    def apply(base64: Boolean, binary: Boolean, compression: Compression, date: js.Date, dir: Boolean): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    @scala.inline
    implicit class Base64MutableBuilder[Self <: Base64] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'arraybuffer'} */
  @js.native
  trait GenerateOptionstypearrayb extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.native
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.native
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.native
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.native
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.native
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with arraybuffer = js.native
  }
  object GenerateOptionstypearrayb {
    
    @scala.inline
    def apply(
      `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with arraybuffer
    ): GenerateOptionstypearrayb = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypearrayb]
    }
    
    @scala.inline
    implicit class GenerateOptionstypearraybMutableBuilder[Self <: GenerateOptionstypearrayb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setType(
        value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with arraybuffer
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'blob'} */
  @js.native
  trait GenerateOptionstypeblob extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.native
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.native
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.native
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.native
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.native
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with blob = js.native
  }
  object GenerateOptionstypeblob {
    
    @scala.inline
    def apply(`type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with blob): GenerateOptionstypeblob = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypeblob]
    }
    
    @scala.inline
    implicit class GenerateOptionstypeblobMutableBuilder[Self <: GenerateOptionstypeblob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setType(value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'nodebuffer'} */
  @js.native
  trait GenerateOptionstypenodebu extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.native
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.native
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.native
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.native
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.native
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with nodebuffer = js.native
  }
  object GenerateOptionstypenodebu {
    
    @scala.inline
    def apply(
      `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with nodebuffer
    ): GenerateOptionstypenodebu = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypenodebu]
    }
    
    @scala.inline
    implicit class GenerateOptionstypenodebuMutableBuilder[Self <: GenerateOptionstypenodebu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setType(
        value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with nodebuffer
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'string' | 'base64' | undefined} */
  @js.native
  trait GenerateOptionstypestring extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.native
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.native
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.native
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.native
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.native
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with (js.UndefOr[string | base64]) = js.native
  }
  object GenerateOptionstypestring {
    
    @scala.inline
    def apply(
      `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with (js.UndefOr[string | base64])
    ): GenerateOptionstypestring = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypestring]
    }
    
    @scala.inline
    implicit class GenerateOptionstypestringMutableBuilder[Self <: GenerateOptionstypestring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setType(
        value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with (js.UndefOr[string | base64])
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'uint8array'} */
  @js.native
  trait GenerateOptionstypeuint8a extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.native
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.native
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.native
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.native
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.native
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.native
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with uint8array = js.native
  }
  object GenerateOptionstypeuint8a {
    
    @scala.inline
    def apply(
      `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with uint8array
    ): GenerateOptionstypeuint8a = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypeuint8a]
    }
    
    @scala.inline
    implicit class GenerateOptionstypeuint8aMutableBuilder[Self <: GenerateOptionstypeuint8a] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setType(
        value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) with uint8array
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    var level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
