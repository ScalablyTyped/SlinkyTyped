package typingsSlinky.libxslt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.libxmljs.mod.Document
import typingsSlinky.libxmljs.mod.ParserOptions
import typingsSlinky.libxslt.anon.NoWrapParams
import typingsSlinky.libxslt.anon.OutputFormat
import typingsSlinky.libxslt.internalTypesMod.ApplyCallback
import typingsSlinky.libxslt.internalTypesMod.ApplyDocumentCallback
import typingsSlinky.libxslt.internalTypesMod.ApplyStringCallback
import typingsSlinky.libxslt.internalTypesMod.ParseCallback
import typingsSlinky.libxslt.libxsltStrings.document
import typingsSlinky.libxslt.libxsltStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object libxmljs {
    
    @JSImport("libxslt", "libxmljs")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Attribute")
    @js.native
    class Attribute ()
      extends typingsSlinky.libxmljs.mod.Attribute
    @JSImport("libxslt", "libxmljs.Attribute")
    @js.native
    def Attribute: Instantiable0[typingsSlinky.libxmljs.mod.Attribute] = js.native
    @scala.inline
    def Attribute_=(x: Instantiable0[typingsSlinky.libxmljs.mod.Attribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Document")
    @js.native
    /**
      * Create a new XML Document
      * @param version XML document version, defaults to 1.0
      * @param encoding Encoding, defaults to utf8
      */
    class Document ()
      extends typingsSlinky.libxmljs.mod.Document
    @JSImport("libxslt", "libxmljs.Document")
    @js.native
    def Document: Instantiable0[typingsSlinky.libxmljs.mod.Document] = js.native
    @scala.inline
    def Document_=(x: Instantiable0[typingsSlinky.libxmljs.mod.Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Document")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Element")
    @js.native
    class Element protected ()
      extends typingsSlinky.libxmljs.mod.Element {
      def this(doc: typingsSlinky.libxmljs.mod.Document, name: String) = this()
    }
    @JSImport("libxslt", "libxmljs.Element")
    @js.native
    def Element: Instantiable2[
        /* doc */ typingsSlinky.libxmljs.mod.Document, 
        /* name */ String, 
        typingsSlinky.libxmljs.mod.Element
      ] = js.native
    @scala.inline
    def Element_=(
      x: Instantiable2[
          /* doc */ typingsSlinky.libxmljs.mod.Document, 
          /* name */ String, 
          typingsSlinky.libxmljs.mod.Element
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Namespace")
    @js.native
    class Namespace ()
      extends typingsSlinky.libxmljs.mod.Namespace
    @JSImport("libxslt", "libxmljs.Namespace")
    @js.native
    def Namespace: Instantiable0[typingsSlinky.libxmljs.mod.Namespace] = js.native
    @scala.inline
    def Namespace_=(x: Instantiable0[typingsSlinky.libxmljs.mod.Namespace]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Node")
    @js.native
    class Node ()
      extends typingsSlinky.libxmljs.mod.Node
    @JSImport("libxslt", "libxmljs.Node")
    @js.native
    def Node: Instantiable0[typingsSlinky.libxmljs.mod.Node] = js.native
    @scala.inline
    def Node_=(x: Instantiable0[typingsSlinky.libxmljs.mod.Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.SaxParser")
    @js.native
    class SaxParser ()
      extends typingsSlinky.libxmljs.mod.SaxParser
    @JSImport("libxslt", "libxmljs.SaxParser")
    @js.native
    def SaxParser: Instantiable0[typingsSlinky.libxmljs.mod.SaxParser] = js.native
    @scala.inline
    def SaxParser_=(x: Instantiable0[typingsSlinky.libxmljs.mod.SaxParser]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaxParser")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.SaxPushParser")
    @js.native
    class SaxPushParser ()
      extends typingsSlinky.libxmljs.mod.SaxPushParser
    @JSImport("libxslt", "libxmljs.SaxPushParser")
    @js.native
    def SaxPushParser: Instantiable0[typingsSlinky.libxmljs.mod.SaxPushParser] = js.native
    @scala.inline
    def SaxPushParser_=(x: Instantiable0[typingsSlinky.libxmljs.mod.SaxPushParser]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaxPushParser")(x.asInstanceOf[js.Any])
    
    @JSImport("libxslt", "libxmljs.libxml_parser_version")
    @js.native
    val libxmlParserVersion: String = js.native
    
    @JSImport("libxslt", "libxmljs.libxml_version")
    @js.native
    val libxmlVersion: String = js.native
    
    @JSImport("libxslt", "libxmljs.memoryUsage")
    @js.native
    def memoryUsage(): Double = js.native
    
    @JSImport("libxslt", "libxmljs.nodeCount")
    @js.native
    def nodeCount(): Double = js.native
    
    @JSImport("libxslt", "libxmljs.parseHtml")
    @js.native
    def parseHtml(source: String): typingsSlinky.libxmljs.mod.Document = js.native
    @JSImport("libxslt", "libxmljs.parseHtml")
    @js.native
    def parseHtml(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
    
    @JSImport("libxslt", "libxmljs.parseHtmlFragment")
    @js.native
    def parseHtmlFragment(source: String): typingsSlinky.libxmljs.mod.Document = js.native
    @JSImport("libxslt", "libxmljs.parseHtmlFragment")
    @js.native
    def parseHtmlFragment(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
    
    @JSImport("libxslt", "libxmljs.parseHtmlString")
    @js.native
    def parseHtmlString(source: String): typingsSlinky.libxmljs.mod.Document = js.native
    @JSImport("libxslt", "libxmljs.parseHtmlString")
    @js.native
    def parseHtmlString(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
    
    @JSImport("libxslt", "libxmljs.parseXml")
    @js.native
    def parseXml(source: String): typingsSlinky.libxmljs.mod.Document = js.native
    @JSImport("libxslt", "libxmljs.parseXml")
    @js.native
    def parseXml(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
    
    @JSImport("libxslt", "libxmljs.parseXmlString")
    @js.native
    def parseXmlString(source: String): typingsSlinky.libxmljs.mod.Document = js.native
    @JSImport("libxslt", "libxmljs.parseXmlString")
    @js.native
    def parseXmlString(source: String, options: ParserOptions): typingsSlinky.libxmljs.mod.Document = js.native
    
    @JSImport("libxslt", "libxmljs.version")
    @js.native
    val version: String = js.native
  }
  
  @JSImport("libxslt", "parse")
  @js.native
  def parse(source: String): Stylesheet = js.native
  @JSImport("libxslt", "parse")
  @js.native
  def parse(source: String, callback: ParseCallback): Unit = js.native
  @JSImport("libxslt", "parse")
  @js.native
  def parse(source: Document): Stylesheet = js.native
  @JSImport("libxslt", "parse")
  @js.native
  def parse(source: Document, callback: ParseCallback): Unit = js.native
  
  @JSImport("libxslt", "parseFile")
  @js.native
  def parseFile(sourcePath: String, callback: ParseCallback): Unit = js.native
  
  @js.native
  trait ApplyOptions extends StObject {
    
    var noWrapParams: js.UndefOr[Boolean] = js.native
    
    var outputFormat: string | document = js.native
  }
  object ApplyOptions {
    
    @scala.inline
    def apply(outputFormat: string | document): ApplyOptions = {
      val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyOptions]
    }
    
    @scala.inline
    implicit class ApplyOptionsMutableBuilder[Self <: ApplyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoWrapParams(value: Boolean): Self = StObject.set(x, "noWrapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapParamsUndefined: Self = StObject.set(x, "noWrapParams", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: string | document): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stylesheet extends StObject {
    
    @JSName("apply")
    def apply(source: String): String = js.native
    @JSName("apply")
    def apply(source: String, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.UndefOr[scala.Nothing], options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object): String = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: NoWrapParams): String = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: NoWrapParams, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: OutputFormat): Document = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: OutputFormat, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document): String | Document = js.native
    @JSName("apply")
    def apply(source: Document, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.UndefOr[scala.Nothing], options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object): String | Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: NoWrapParams): String = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: NoWrapParams, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: OutputFormat): Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: OutputFormat, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
    
    def applyToFile(sourcePath: String, callback: ApplyStringCallback): Unit = js.native
    def applyToFile(sourcePath: String, params: js.Object, callback: ApplyStringCallback): Unit = js.native
    def applyToFile(sourcePath: String, params: js.Object, options: ApplyOptions, callback: ApplyStringCallback): Unit = js.native
    
    @JSName("apply")
    def apply_Document(source: Document): Document = js.native
    @JSName("apply")
    def apply_Document(source: Document, params: js.Object): Document = js.native
    @JSName("apply")
    def apply_Union(source: String): String | Document = js.native
    @JSName("apply")
    def apply_Union(source: String, params: js.Object): String | Document = js.native
  }
}
