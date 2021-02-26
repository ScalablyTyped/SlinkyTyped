package typingsSlinky.jsonSchemaRefParser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.jsonSchema.mod.JSONSchema4Type
import typingsSlinky.jsonSchemaRefParser.anon.Dereference
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This is the default export of JSON Schema $Ref Parser. You can creates instances of this class using new $RefParser(), or you can just call its static methods.
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md
    */
  @JSImport("json-schema-ref-parser", JSImport.Namespace)
  @js.native
  class ^ () extends RefParser
  
  @JSImport("json-schema-ref-parser", "$Refs")
  @js.native
  class Refs () extends StObject {
    
    /**
      * This property is true if the schema contains any circular references. You may want to check this property before serializing the dereferenced schema as JSON, since JSON.stringify() does not support circular references by default.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#circular
      */
    var circular: Boolean = js.native
    
    /**
      * Returns `true` if the given path exists in the schema; otherwise, returns `false`
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#existsref
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      */
    def exists($ref: String): Boolean = js.native
    
    /**
      * Gets the value at the given path in the schema. Throws an error if the path does not exist.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#getref
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      */
    def get($ref: String): JSONSchema4Type = js.native
    
    /**
      * Returns the paths/URLs of all the files in your schema (including the main schema file).
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#pathstypes
      *
      * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
      */
    def paths(types: String*): js.Array[String] = js.native
    
    /**
      * Sets the value at the given path in the schema. If the property, or any of its parents, don't exist, they will be created.
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      * @param value The value to assign. Can be anything (object, string, number, etc.)
      */
    def set($ref: String, value: JSONSchema4Type): Unit = js.native
    
    /**
      * Returns a map of paths/URLs and their correspond values.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#valuestypes
      *
      * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
      */
    def values(types: String*): StringDictionary[JSONSchema4] = js.native
  }
  
  @js.native
  trait FileInfo extends StObject {
    
    /**
      * The raw file contents, in whatever form they were returned by the resolver that read the file.
      */
    var data: String | Buffer = js.native
    
    /**
      * The lowercase file extension, such as ".json", ".yaml", ".txt", etc.
      */
    var extension: String = js.native
    
    /**
      * The full URL of the file. This could be any type of URL, including "http://", "https://", "file://", "ftp://", "mongodb://", or even a local filesystem path (when running in Node.js).
      */
    var url: String = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(data: String | Buffer, extension: String, url: String): FileInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HTTPResolverOptions extends ResolverOptions {
    
    /**
      * You can specify any HTTP headers that should be sent when downloading files. For example, some servers may require you to set the `Accept` or `Referrer` header.
      */
    var headers: js.UndefOr[js.Object] = js.native
    
    /**
      * The maximum number of HTTP redirects to follow per file. The default is 5. To disable automatic following of redirects, set this to zero.
      */
    var redirects: js.UndefOr[Double] = js.native
    
    /**
      * The amount of time (in milliseconds) to wait for a response from the server when downloading files. The default is 5 seconds.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Set this to `true` if you're downloading files from a CORS-enabled server that requires authentication
      */
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  
  type Options = js.Object with Dereference
  
  @js.native
  trait ParserOptions extends StObject {
    
    /**
      * All of the built-in parsers allow empty files by default. The JSON and YAML parsers will parse empty files as `undefined`. The text parser will parse empty files as an empty string. The binary parser will parse empty files as an empty byte array.
      *
      * You can set `allowEmpty: false` on any parser, which will cause an error to be thrown if a file empty.
      */
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines which parsers will be used for which files.
      *
      * A regular expression can be used to match files by their full path. A string (or array of strings) can be used to match files by their file extension. Or a function can be used to perform more complex matching logic. See the custom parser docs for details.
      */
    var canParse: js.UndefOr[
        Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.native
    
    /**
      * Parsers run in a specific order, relative to other parsers. For example, a parser with `order: 5` will run before a parser with `order: 10`. If a parser is unable to successfully parse a file, then the next parser is tried, until one succeeds or they all fail.
      *
      * You can change the order in which parsers run, which is useful if you know that most of your referenced files will be a certain type, or if you add your own custom parser that you want to run first.
      */
    var order: js.UndefOr[Double] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setCanParse(
        value: Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ): Self = StObject.set(x, "canParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanParseFunction1(value: /* file */ FileInfo => Boolean): Self = StObject.set(x, "canParse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanParseRegExp(value: js.RegExp): Self = StObject.set(x, "canParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanParseUndefined: Self = StObject.set(x, "canParse", js.undefined)
      
      @scala.inline
      def setCanParseVarargs(value: String*): Self = StObject.set(x, "canParse", js.Array(value :_*))
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /**
    * This is the default export of JSON Schema $Ref Parser. You can creates instances of this class using new $RefParser(), or you can just call its static methods.
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md
    */
  @js.native
  trait RefParser extends StObject {
    
    /**
      * The $refs property is a `$Refs` object, which lets you access all of the externally-referenced files in the schema, as well as easily get and set specific values in the schema using JSON pointers.
      *
      * This is the same value that is passed to the callback function (or Promise) when calling the `resolve` method.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#refs
      */
    @JSName("$refs")
    var $refs: Refs = js.native
    
    /**
      * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
      *
      * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
      *
      * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the bundled schema object
      */
    def bundle(schema: String): js.Promise[JSONSchema4] = js.native
    def bundle(
      schema: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def bundle(schema: String, options: Options): js.Promise[JSONSchema4] = js.native
    def bundle(
      schema: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def bundle(schema: JSONSchema4): js.Promise[JSONSchema4] = js.native
    def bundle(
      schema: JSONSchema4,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def bundle(schema: JSONSchema4, options: Options): js.Promise[JSONSchema4] = js.native
    def bundle(
      schema: JSONSchema4,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    
    def dereference(path: String): js.Promise[JSONSchema4] = js.native
    def dereference(
      path: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def dereference(path: String, options: Options): js.Promise[JSONSchema4] = js.native
    def dereference(
      path: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    /**
      * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
      *
      * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
      *
      * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the dereferenced schema object
      */
    def dereference(path: String, schema: String): js.Promise[JSONSchema4] = js.native
    def dereference(
      path: String,
      schema: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def dereference(path: String, schema: String, options: Options): js.Promise[JSONSchema4] = js.native
    def dereference(
      path: String,
      schema: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def dereference(path: String, schema: JSONSchema4): js.Promise[JSONSchema4] = js.native
    def dereference(
      path: String,
      schema: JSONSchema4,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def dereference(path: String, schema: JSONSchema4, options: Options): js.Promise[JSONSchema4] = js.native
    def dereference(
      path: String,
      schema: JSONSchema4,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def dereference(schema: JSONSchema4): js.Promise[JSONSchema4] = js.native
    def dereference(
      schema: JSONSchema4,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def dereference(schema: JSONSchema4, options: Options): js.Promise[JSONSchema4] = js.native
    def dereference(
      schema: JSONSchema4,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    
    /**
      * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
      *
      * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
      *
      * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the parsed schema object, or an error
      */
    def parse(schema: String): js.Promise[JSONSchema4] = js.native
    def parse(
      schema: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def parse(schema: String, options: Options): js.Promise[JSONSchema4] = js.native
    def parse(
      schema: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def parse(schema: JSONSchema4): js.Promise[JSONSchema4] = js.native
    def parse(
      schema: JSONSchema4,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    def parse(schema: JSONSchema4, options: Options): js.Promise[JSONSchema4] = js.native
    def parse(
      schema: JSONSchema4,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* schema */ JSONSchema4 | Null, _]
    ): js.Promise[JSONSchema4] = js.native
    
    /**
      * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
      *
      * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
      *
      * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive a `$Refs` object
      */
    def resolve(schema: String): js.Promise[Refs] = js.native
    def resolve(
      schema: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* $refs */ Refs | Null, _]
    ): js.Promise[Refs] = js.native
    def resolve(schema: String, options: Options): js.Promise[Refs] = js.native
    def resolve(
      schema: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* $refs */ Refs | Null, _]
    ): js.Promise[Refs] = js.native
    def resolve(schema: JSONSchema4): js.Promise[Refs] = js.native
    def resolve(
      schema: JSONSchema4,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* $refs */ Refs | Null, _]
    ): js.Promise[Refs] = js.native
    def resolve(schema: JSONSchema4, options: Options): js.Promise[Refs] = js.native
    def resolve(
      schema: JSONSchema4,
      options: Options,
      callback: js.Function2[/* err */ js.Error | Null, /* $refs */ Refs | Null, _]
    ): js.Promise[Refs] = js.native
    
    /**
      * The `schema` property is the parsed/bundled/dereferenced JSON Schema object. This is the same value that is passed to the callback function (or Promise) when calling the parse, bundle, or dereference methods.
      *
      * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#schema
      */
    var schema: JSONSchema4 = js.native
  }
  
  @js.native
  trait ResolverOptions extends StObject {
    
    /**
      * The `canRead` property tells JSON Schema `$Ref` Parser what kind of files your resolver can read. In this example, we've simply specified a regular expression that matches "mogodb://" URLs, but we could have used a simple boolean, or even a function with custom logic to determine which files to resolve. Here are examples of each approach:
      */
    var canRead: Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean]) = js.native
    
    /**
      * All resolvers have an order property, even the built-in resolvers. If you don't specify an order property, then your resolver will run last. Specifying `order: 1`, like we did in this example, will make your resolver run first. Or you can squeeze your resolver in-between some of the built-in resolvers. For example, `order: 101` would make it run after the file resolver, but before the HTTP resolver. You can see the order of all the built-in resolvers by looking at their source code.
      *
      * The order property and canRead property are related to each other. For each file that JSON Schema $Ref Parser needs to resolve, it first determines which resolvers can read that file by checking their canRead property. If only one resolver matches a file, then only that one resolver is called, regardless of its order. If multiple resolvers match a file, then those resolvers are tried in order until one of them successfully reads the file. Once a resolver successfully reads the file, the rest of the resolvers are skipped.
      */
    var order: js.UndefOr[Double] = js.native
    
    /**
      * This is where the real work of a resolver happens. The `read` method accepts the same file info object as the `canRead` function, but rather than returning a boolean value, the `read` method should return the contents of the file. The file contents should be returned in as raw a form as possible, such as a string or a byte array. Any further parsing or processing should be done by parsers.
      *
      * Unlike the `canRead` function, the `read` method can also be asynchronous. This might be important if your resolver needs to read data from a database or some other external source. You can return your asynchronous value using either an ES6 Promise or a Node.js-style error-first callback. Of course, if your resolver has the ability to return its data synchronously, then that's fine too. Here are examples of all three approaches:
      */
    def read(file: FileInfo): String | Buffer | (js.Promise[String | Buffer]) = js.native
    def read(file: FileInfo, callback: js.Function2[/* error */ js.Error | Null, /* data */ String | Null, _]): String | Buffer | (js.Promise[String | Buffer]) = js.native
  }
}
