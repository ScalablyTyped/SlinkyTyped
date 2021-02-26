package typingsSlinky.jsonSchemaRefParser

import typingsSlinky.jsonSchemaRefParser.jsonSchemaRefParserStrings.ignore
import typingsSlinky.jsonSchemaRefParser.mod.FileInfo
import typingsSlinky.jsonSchemaRefParser.mod.HTTPResolverOptions
import typingsSlinky.jsonSchemaRefParser.mod.ParserOptions
import typingsSlinky.jsonSchemaRefParser.mod.ResolverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Circular extends StObject {
    
    /**
      * Determines whether circular `$ref` pointers are handled.
      *
      * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
      *
      * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
      */
    var circular: js.UndefOr[Boolean | ignore] = js.native
  }
  object Circular {
    
    @scala.inline
    def apply(): Circular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Circular]
    }
    
    @scala.inline
    implicit class CircularMutableBuilder[Self <: Circular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircular(value: Boolean | ignore): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    }
  }
  
  @js.native
  trait Dereference extends StObject {
    
    /**
      * The `dereference` options control how JSON Schema `$Ref` Parser will dereference `$ref` pointers within the JSON schema.
      */
    var dereference: js.UndefOr[Circular] = js.native
    
    /**
      * The `parse` options determine how different types of files will be parsed.
      *
      * JSON Schema `$Ref` Parser comes with built-in JSON, YAML, plain-text, and binary parsers, any of which you can configure or disable. You can also add your own custom parsers if you want.
      */
    var parse: js.UndefOr[Json] = js.native
    
    /**
      * The `resolve` options control how JSON Schema $Ref Parser will resolve file paths and URLs, and how those files will be read/downloaded.
      *
      * JSON Schema `$Ref` Parser comes with built-in support for HTTP and HTTPS, as well as support for local files (when running in Node.js). You can configure or disable either of these built-in resolvers. You can also add your own custom resolvers if you want.
      */
    var resolve: js.UndefOr[External] = js.native
  }
  object Dereference {
    
    @scala.inline
    def apply(): Dereference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dereference]
    }
    
    @scala.inline
    implicit class DereferenceMutableBuilder[Self <: Dereference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDereference(value: Circular): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setParse(value: Json): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setResolve(value: External): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  @js.native
  trait External extends StObject {
    
    /**
      * Determines whether external $ref pointers will be resolved. If this option is disabled, then external `$ref` pointers will simply be ignored.
      */
    var external: js.UndefOr[Boolean] = js.native
    
    var file: js.UndefOr[ResolverOptions | Boolean] = js.native
    
    var http: js.UndefOr[HTTPResolverOptions | Boolean] = js.native
  }
  object External {
    
    @scala.inline
    def apply(): External = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit class ExternalMutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      @scala.inline
      def setFile(value: ResolverOptions | Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHttp(value: HTTPResolverOptions | Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    }
  }
  
  @js.native
  trait Json extends StObject {
    
    var json: js.UndefOr[ParserOptions | Boolean] = js.native
    
    var text: js.UndefOr[ParserOptionsencodingstri | Boolean] = js.native
    
    var yaml: js.UndefOr[ParserOptions | Boolean] = js.native
  }
  object Json {
    
    @scala.inline
    def apply(): Json = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Json]
    }
    
    @scala.inline
    implicit class JsonMutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: ParserOptions | Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setText(value: ParserOptionsencodingstri | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setYaml(value: ParserOptions | Boolean): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYamlUndefined: Self = StObject.set(x, "yaml", js.undefined)
    }
  }
  
  /* Inlined json-schema-ref-parser.json-schema-ref-parser.ParserOptions & {  encoding :string | undefined} */
  @js.native
  trait ParserOptionsencodingstri extends StObject {
    
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
    
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * Parsers run in a specific order, relative to other parsers. For example, a parser with `order: 5` will run before a parser with `order: 10`. If a parser is unable to successfully parse a file, then the next parser is tried, until one succeeds or they all fail.
      *
      * You can change the order in which parsers run, which is useful if you know that most of your referenced files will be a certain type, or if you add your own custom parser that you want to run first.
      */
    var order: js.UndefOr[Double] = js.native
  }
  object ParserOptionsencodingstri {
    
    @scala.inline
    def apply(): ParserOptionsencodingstri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptionsencodingstri]
    }
    
    @scala.inline
    implicit class ParserOptionsencodingstriMutableBuilder[Self <: ParserOptionsencodingstri] (val x: Self) extends AnyVal {
      
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
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
}
