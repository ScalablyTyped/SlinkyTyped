package typingsSlinky.sax

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.sax.anon.Body
import typingsSlinky.sax.anon.Name
import typingsSlinky.sax.anon.Prefix
import typingsSlinky.sax.saxStrings.attribute
import typingsSlinky.sax.saxStrings.cdata
import typingsSlinky.sax.saxStrings.close
import typingsSlinky.sax.saxStrings.closecdata
import typingsSlinky.sax.saxStrings.closenamespace
import typingsSlinky.sax.saxStrings.closetag
import typingsSlinky.sax.saxStrings.comment
import typingsSlinky.sax.saxStrings.data
import typingsSlinky.sax.saxStrings.doctype
import typingsSlinky.sax.saxStrings.drain
import typingsSlinky.sax.saxStrings.end
import typingsSlinky.sax.saxStrings.error
import typingsSlinky.sax.saxStrings.finish
import typingsSlinky.sax.saxStrings.opencdata
import typingsSlinky.sax.saxStrings.opennamespace
import typingsSlinky.sax.saxStrings.opentag
import typingsSlinky.sax.saxStrings.pipe
import typingsSlinky.sax.saxStrings.processinginstruction
import typingsSlinky.sax.saxStrings.readable
import typingsSlinky.sax.saxStrings.ready
import typingsSlinky.sax.saxStrings.script
import typingsSlinky.sax.saxStrings.text
import typingsSlinky.sax.saxStrings.unpipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sax", "EVENTS")
  @js.native
  val EVENTS: js.Array[String] = js.native
  
  @JSImport("sax", "SAXParser")
  @js.native
  class SAXParser () extends StObject {
    def this(strict: Boolean) = this()
    def this(strict: js.UndefOr[scala.Nothing], opt: SAXOptions) = this()
    def this(strict: Boolean, opt: SAXOptions) = this()
    
    var ENTITIES: StringDictionary[String] = js.native
    
    def close(): SAXParser = js.native
    
    var closed: Boolean = js.native
    
    var column: Double = js.native
    
    // Methods
    def end(): Unit = js.native
    
    var error: js.Error = js.native
    
    def flush(): Unit = js.native
    
    // Members
    var line: Double = js.native
    
    def onattribute(attr: Name): Unit = js.native
    
    def oncdata(cdata: String): Unit = js.native
    
    def onclosecdata(): Unit = js.native
    
    def onclosenamespace(ns: Prefix): Unit = js.native
    
    def onclosetag(tagName: String): Unit = js.native
    
    def oncomment(comment: String): Unit = js.native
    
    def ondoctype(doctype: String): Unit = js.native
    
    def onend(): Unit = js.native
    
    // Events
    def onerror(e: js.Error): Unit = js.native
    
    def onopencdata(): Unit = js.native
    
    def onopennamespace(ns: Prefix): Unit = js.native
    
    def onopentag(tag: QualifiedTag): Unit = js.native
    def onopentag(tag: Tag): Unit = js.native
    
    def onprocessinginstruction(node: Body): Unit = js.native
    
    def onready(): Unit = js.native
    
    def onscript(script: String): Unit = js.native
    
    def ontext(t: String): Unit = js.native
    
    var opt: SAXOptions = js.native
    
    var position: Double = js.native
    
    def resume(): SAXParser = js.native
    
    var startTagPosition: Double = js.native
    
    var strict: Boolean = js.native
    
    var tag: Tag = js.native
    
    def write(s: String): SAXParser = js.native
  }
  
  @JSImport("sax", "SAXStream")
  @js.native
  class SAXStream () extends Duplex {
    def this(strict: Boolean) = this()
    def this(strict: js.UndefOr[scala.Nothing], opt: SAXOptions) = this()
    def this(strict: Boolean, opt: SAXOptions) = this()
    
    var _parser: SAXParser = js.native
    
    def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_attribute(event: attribute, listener: js.ThisFunction1[/* this */ this.type, /* attr */ Name, Unit]): this.type = js.native
    @JSName("on")
    def on_cdata(event: cdata, listener: js.ThisFunction1[/* this */ this.type, /* cdata */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_closecdata(event: closecdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_closenamespace(event: closenamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ Prefix, Unit]): this.type = js.native
    @JSName("on")
    def on_closetag(event: closetag, listener: js.ThisFunction1[/* this */ this.type, /* tagName */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_comment(event: comment, listener: js.ThisFunction1[/* this */ this.type, /* comment */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.ThisFunction1[/* this */ this.type, /* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_doctype(event: doctype, listener: js.ThisFunction1[/* this */ this.type, /* doctype */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_opencdata(event: opencdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_opennamespace(event: opennamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ Prefix, Unit]): this.type = js.native
    @JSName("on")
    def on_opentag(
      event: opentag,
      listener: js.ThisFunction1[/* this */ this.type, /* tag */ Tag | QualifiedTag, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_processinginstruction(
      event: processinginstruction,
      listener: js.ThisFunction1[/* this */ this.type, /* node */ Body, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_script(event: script, listener: js.ThisFunction1[/* this */ this.type, /* script */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_text(event: text, listener: js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
  }
  
  @JSImport("sax", "createStream")
  @js.native
  def createStream(): SAXStream = js.native
  @JSImport("sax", "createStream")
  @js.native
  def createStream(strict: js.UndefOr[scala.Nothing], opt: SAXOptions): SAXStream = js.native
  @JSImport("sax", "createStream")
  @js.native
  def createStream(strict: Boolean): SAXStream = js.native
  @JSImport("sax", "createStream")
  @js.native
  def createStream(strict: Boolean, opt: SAXOptions): SAXStream = js.native
  
  @JSImport("sax", "parser")
  @js.native
  def parser(): SAXParser = js.native
  @JSImport("sax", "parser")
  @js.native
  def parser(strict: js.UndefOr[scala.Nothing], opt: SAXOptions): SAXParser = js.native
  @JSImport("sax", "parser")
  @js.native
  def parser(strict: Boolean): SAXParser = js.native
  @JSImport("sax", "parser")
  @js.native
  def parser(strict: Boolean, opt: SAXOptions): SAXParser = js.native
  
  @js.native
  trait BaseTag extends StObject {
    
    var isSelfClosing: Boolean = js.native
    
    var name: String = js.native
  }
  object BaseTag {
    
    @scala.inline
    def apply(isSelfClosing: Boolean, name: String): BaseTag = {
      val __obj = js.Dynamic.literal(isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTag]
    }
    
    @scala.inline
    implicit class BaseTagMutableBuilder[Self <: BaseTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QualifiedAttribute extends QualifiedName {
    
    var value: String = js.native
  }
  object QualifiedAttribute {
    
    @scala.inline
    def apply(local: String, name: String, prefix: String, uri: String, value: String): QualifiedAttribute = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedAttribute]
    }
    
    @scala.inline
    implicit class QualifiedAttributeMutableBuilder[Self <: QualifiedAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QualifiedName extends StObject {
    
    var local: String = js.native
    
    var name: String = js.native
    
    var prefix: String = js.native
    
    var uri: String = js.native
  }
  object QualifiedName {
    
    @scala.inline
    def apply(local: String, name: String, prefix: String, uri: String): QualifiedName = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedName]
    }
    
    @scala.inline
    implicit class QualifiedNameMutableBuilder[Self <: QualifiedName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.sax.mod.BaseTag because var conflicts: name. Inlined isSelfClosing */ @js.native
  trait QualifiedTag extends QualifiedName {
    
    var attributes: StringDictionary[QualifiedAttribute] = js.native
    
    var isSelfClosing: Boolean = js.native
    
    var ns: StringDictionary[String] = js.native
  }
  object QualifiedTag {
    
    @scala.inline
    def apply(
      attributes: StringDictionary[QualifiedAttribute],
      isSelfClosing: Boolean,
      local: String,
      name: String,
      ns: StringDictionary[String],
      prefix: String,
      uri: String
    ): QualifiedTag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedTag]
    }
    
    @scala.inline
    implicit class QualifiedTagMutableBuilder[Self <: QualifiedTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[QualifiedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNs(value: StringDictionary[String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SAXOptions extends StObject {
    
    var lowercase: js.UndefOr[Boolean] = js.native
    
    var normalize: js.UndefOr[Boolean] = js.native
    
    var noscript: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
    
    var xmlns: js.UndefOr[Boolean] = js.native
  }
  object SAXOptions {
    
    @scala.inline
    def apply(): SAXOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SAXOptions]
    }
    
    @scala.inline
    implicit class SAXOptionsMutableBuilder[Self <: SAXOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setNoscript(value: Boolean): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      @scala.inline
      def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
  
  @js.native
  trait Tag extends BaseTag {
    
    var attributes: StringDictionary[String] = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(attributes: StringDictionary[String], isSelfClosing: Boolean, name: String): Tag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    }
  }
}
